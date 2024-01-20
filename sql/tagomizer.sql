DO
$do$
BEGIN
   IF NOT EXISTS (
      SELECT
      FROM   pg_catalog.pg_roles
      WHERE  rolname = 'tq_proxy') THEN

      CREATE ROLE tq_proxy INHERIT;
   END IF;
END
$do$;
CREATE SEQUENCE IF NOT EXISTS public.doc_id_seq
    AS bigint
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
--
-- Create a schema to hide the proxy tables from public view.
--
CREATE SCHEMA IF NOT EXISTS public;
GRANT ALL ON SCHEMA paradedb TO PUBLIC;
GRANT ALL ON schema public TO tq_proxy;
GRANT USAGE, SELECT ON ALL SEQUENCES IN SCHEMA public TO tq_proxy;
ALTER DEFAULT PRIVILEGES IN SCHEMA public
    GRANT USAGE, SELECT ON SEQUENCES TO tq_proxy;

create table if not exists public.group  (
   id text UNIQUE,
   name text not null,
   PRIMARY KEY (id)
);

create index if not exists group_idx on public.group (id);
GRANT ALL PRIVILEGES ON public.group TO tq_proxy;

create table if not exists public.user  (
   id text UNIQUE,
   PRIMARY KEY (id)
);

create index if not exists user_idx on public.user (id);
GRANT ALL PRIVILEGES ON public.user TO tq_proxy;


--
--	A document exists for each Hypothes.is URL within the context of a Group, and
--		Users in that Group. The document  row comes into being on the first user event.
--		Subsequent annotations can be with other users.
--	We pivot on URLs (resources)
--	document_id is the id given in a hypothesis document
-- 
-- OK
create table if not exists public.document  (
	bm25_id BIGINT UNIQUE NOT NULL DEFAULT nextval('public.doc_id_seq'::regclass),
    document_id text UNIQUE,
   	url text not null,
   	title text not null,
   	created text not null,
   	PRIMARY KEY (document_id)
);

GRANT ALL PRIVILEGES ON public.document TO tq_proxy;

CALL paradedb.create_bm25(
        index_name => 'label_idx',
        schema_name => 'public',
        table_name => 'document',
        key_field => 'bm25_id',
        text_fields => '{title: {tokenizer: {type: "en_stem"}}, category: {}}'
);

--
--	Annotations are text objects, abstracts. They go with URLs - specific documents.
--	We do not pivot on Annotations; they are the content of a URL (resource) view
--  Both text and annnotations go into this table
--
create table if not exists public.annotations  (
   bm25_id BIGINT not null REFERENCES  public.document (bm25_id),
   document_id TEXT not null REFERENCES public.document(document_id),
   text text not null,
   language varchar (3)
);


GRANT ALL PRIVILEGES ON public.annotations TO tq_proxy;
create index if not exists anno_idx on public.annotations (document_id);

CALL paradedb.create_bm25(
        index_name => 'text_idx',
        schema_name => 'public',
        table_name => 'annotations',
        key_field => 'bm25_id',
        text_fields => '{text: {tokenizer: {type: "en_stem"}}, category: {}}'
);
--	A tag exists within the context of one or more documents.
--	We pivot on tags.
--
-- ok
create table if not exists public.tag  (
   id text UNIQUE,
   name text not null,
   PRIMARY KEY (id)
);

create index if not exists tag_name on public.tag (name);
create index if not exists tag_idx on public.tag (id);
GRANT ALL PRIVILEGES ON public.tag TO tq_proxy;


-- ok
create table if not exists public.doc_tag_ref  (
   tag_id text not null REFERENCES  public.tag (id),
   document_id text not null REFERENCES  public.document (document_id)
);

GRANT ALL PRIVILEGES ON public.doc_tag_ref TO tq_proxy;
create index if not exists dtr_tid on public.doc_tag_ref (tag_id);
create index if not exists dtr_did on public.doc_tag_ref (document_id);

-- ok
create table if not exists public.user_tag_ref  (
   tag_id text not null REFERENCES  public.tag (id),
   user_id text not null REFERENCES  public.user (id)
);

GRANT ALL PRIVILEGES ON public.user_tag_ref TO tq_proxy;
create index if not exists utr_tid on public.user_tag_ref (tag_id);
create index if not exists utr_uid on public.user_tag_ref (user_id);

create table if not exists public.user_doc_ref  (
   document_id text not null REFERENCES  public.document (document_id),
   user_id text not null REFERENCES  public.user (id)
);

GRANT ALL PRIVILEGES ON public.user_doc_ref TO tq_proxy;
create index if not exists udr_did on public.user_doc_ref (document_id);
create index if not exists udr_uid on public.user_doc_ref (user_id);

create table if not exists public.group_doc_ref  (
   group_id text not null REFERENCES  public.group (id),
   document_id text not null REFERENCES public.document (document_id)
);

GRANT ALL PRIVILEGES ON public.group_doc_ref TO tq_proxy;
create index if not exists gtr_did on public.group_doc_ref (document_id);
create index if not exists gtr_uid on public.group_doc_ref (group_id);

create table if not exists public.group_user_ref  (
   group_id text not null REFERENCES  public.group (id),
   user_id text not null REFERENCES public.user (id)
);

GRANT ALL PRIVILEGES ON public.group_user_ref TO tq_proxy;
create index if not exists gur_did on public.group_user_ref (user_id);
create index if not exists gur_uid on public.group_user_ref (group_id);


create table if not exists public.group_tag_ref  (
   tag_id text not null REFERENCES  public.tag (id),
   group_id text not null REFERENCES  public.group (id)
);

GRANT ALL PRIVILEGES ON public.group_tag_ref TO tq_proxy;
create index if not exists gttr_tid on public.group_tag_ref (tag_id);
create index if not exists gttr_uid on public.group_tag_ref (group_id);



create table if not exists public.triples  (
    document_id text not null REFERENCES  public.document (document_id),
   	subject text not null,
   	predicate text not null,
   	object text not null
);

GRANT ALL PRIVILEGES ON public.triples TO tq_proxy;
