/*
 * Copyright 2023 TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.ks.tagomizer.api;

/**
 * @author jackpark
 *
 */
public interface ISQL {

	///////////////////////////
	// These are for used in PivotModel
	///////////////////////////

	// ### public.tag_ref
	public static final String INSERT_DOC_TAG_REF =
			"INSERT  into public.doc_tag_ref (tag_id, document_id) VALUES ( ?, ? ) ON CONFLICT DO NOTHING";

	public static final String INSERT_USER_TAG_REF =
			"INSERT  into public.user_tag_ref (tag_id, user_id) VALUES ( ?, ? ) ON CONFLICT DO NOTHING";

	//public.user_doc_ref
	public static final String INSERT_USER_DOC_REF =
			"INSERT  into public.user_doc_ref (document_id, user_id) VALUES ( ?, ? ) ON CONFLICT DO NOTHING";

	public static final String INSERT_GROUP_TAG_REF =
			"INSERT  into public.group_tag_ref (tag_id, group_id) VALUES ( ?, ? ) ON CONFLICT DO NOTHING";

	//public.group_user_ref
	public static final String INSERT_GROUP_USER_REF =
			"INSERT  into public.group_user_ref (group_id, user_id) VALUES ( ?, ? ) ON CONFLICT DO NOTHING";
	
	//public.group_doc_ref
	public static final String INSERT_GROUP_DOC_REF =
			"INSERT  into public.group_doc_ref (group_id, document_id) VALUES ( ?, ? ) ON CONFLICT DO NOTHING";
	
	public static final String SELECT_DOC_ID_BY_URL_GROUP =
			"SELECT document_id FROM public.document WHERE url=? AND group_id=?";

	//check before inserting
	public static final String INSERT_DOCUMENT =
			"INSERT  into public.document (document_id, url, title, created) VALUES ( ?, ?, ?, ? ) ON CONFLICT DO NOTHING";
	
	public static final String INSERT_GROUP =
			"INSERT  into public.group (id, name) VALUES ( ?, ? ) ON CONFLICT DO NOTHING";

	public static final String INSERT_USER =
			"INSERT  into public.user (id) VALUES ( ? ) ON CONFLICT DO NOTHING";
	
	public static final String INSERT_TAG =
			"INSERT  into public.tag VALUES ( ?, ? ) ON CONFLICT DO NOTHING";

	public static final String INSERT_ANNOTATION =
			"INSERT  into public.annotations VALUES ( ?, ?, ? ) ON CONFLICT DO NOTHING";
//			"INSERT  into public.annotations VALUES ( ?, ?, to_tsvector( ? )  ) ON CONFLICT DO NOTHING";

	//public static final String INSERT_TEXT =
	//		"INSERT  into public.texts VALUES ( ?, ?, (to_tsvector( ? ) ) ON CONFLICT DO NOTHING";


	///////////////////////////
	// These are for testing code for the backside server
	///////////////////////////
	/**
	 * Gather Annotations by URL
	 */
//	public static final String GATHER_RESOURCE_BY_URL = 
//			"SELECT text from public.annotations where document_id IN "+
//			"( SELECT document_id from public.documents where url=?)";
	
	/**
	 * Gather Resources (documents) by Tag
	 * ### public.tag_ref
	 */
//	public static final String GATHER_RESOURCES_BY_TAG =
//			"SELECT DISTINCT title, document_id from public.document where document_id IN "+
//			"( SELECT document_id from public.tag_ref where tag_id=?)";
	// from JavalinHypothesis HypothesisDao
	
	/* fixed */
	public static final String GET_RESOURCES_BY_USER =
			"SELECT DISTINCT public.document.title, public.document.document_id, url, text FROM public.document "+
					"JOIN public.annotations ON public.document.document_id = public.annotations.document_id "+
					"JOIN public.user_doc_ref ON public.document.document_id = public.user_doc_ref.document_id "+
					"WHERE public.user_doc_ref.user_id = ? " +
					"ORDER BY public.document.title ASC LIMIT ? OFFSET ?";

	public static final String GET_RESOURCES_BY_TAG =
			"SELECT DISTINCT public.document.title, public.document.document_id, url, text FROM public.document "+
					"JOIN public.doc_tag_ref ON public.document.document_id = public.doc_tag_ref.document_id "+
					"JOIN public.annotations ON public.document.document_id = public.annotations.document_id "+
					"WHERE public.doc_tag_ref.tag_id  = ? " +
					"ORDER BY public.document.title ASC LIMIT ? OFFSET ?";

	
	/**
	 * Given a url, find all the users from all the documents
	 * ### public.reference huser
	 */
	public static final String GET_USERS_BY_RESOURCE =
			"SELECT DISTINCT user_id FROM public.user_doc_ref "+
					"WHERE public.user_doc_ref.document_id = ? ";
	
	public static final String GET_USERS_BY_TAG =
			"SELECT DISTINCT user_id FROM public.user_tag_ref "+
					"WHERE tag_id = ? ";
	

	public static final String GET_TAGS_BY_USER =
			"SELECT DISTINCT public.tag.name, public.tag.id FROM public.tag "+
					"JOIN public.user_tag_ref ON public.tag.id = public.user_tag_ref.tag_id "+
					"WHERE public.user_tag_ref.user_id = ? "+
					"ORDER BY public.tag.name ASC LIMIT ? OFFSET ?";

	public static final String GET_TAGS_BY_RESOURCE =
			"SELECT DISTINCT public.tag.name, public.tag.id FROM public.tag "+
					"JOIN public.doc_tag_ref ON public.tag.id = public.doc_tag_ref.tag_id "+
					"WHERE public.doc_tag_ref.document_id = ? "+
					"ORDER BY public.tag.name ASC LIMIT ? OFFSET ?";
	
	public static final String GET_TEXT_BY_RESOURCE =
			"SELECT text FROM public.annotations WHERE language=? AND document_id=?";

	// ### public.reference
//	public static final String GET_RESOURCE_PIVOT =
//			"SELECT public.reference.hyp_id from public.reference "+
//		    		"JOIN public.document ON public.reference.document_id = public.document.id "+
//		    		"WHERE public.document.url = ?";

	// using public.document to cluser user_id and group_id
	public static final String GET_USERS_BY_GROUP =
			"SELECT DISTINCT user_id from public.group_user_ref where group_id=?";

	public static final String GET_GROUPS_BY_USER =
			"SELECT DISTINCT id, name from public.group " +
		    "JOIN public.group_user_ref ON public.group.id = public.group_user_ref.group_id "+
		    "where public.group_user_ref.user_id=?";

	public static final String GET_GROUPS_BY_TAG =
			"SELECT DISTINCT id, name from public.group " +
		    "JOIN public.group_tag_ref ON public.group.id = public.group_tag_ref.group_id "+
		    "where public.group_tag_ref.tag_id=?";

	public static final String LIST_RESOURCES =
			"SELECT DISTINCT public.document.title, public.document.document_id, url, text FROM public.document "+
					"JOIN public.annotations ON public.document.document_id = public.annotations.document_id "+
					"ORDER BY public.document.title ASC LIMIT ? OFFSET ?";

	public static final String LIST_TAGS =
			"SELECT DISTINCT id, name FROM public.tag "+
					"ORDER BY name ASC LIMIT ? OFFSET ?";

	public static final String LIST_GROUPS =
			"SELECT DISTINCT id, name from public.group";

	public static final String LIST_USERS =
			"SELECT DISTINCT id from public.user";

	public static final String GET_DOC_HEADER =
			"SELECT title, url FROM public.document WHERE document_id=?";

	public static final String GET_TAG_HEADER =
			"SELECT name FROM public.tag WHERE id=?";

	public static final String GET_GROUP_HEADER =
			"SELECT name FROM public.group WHERE id=?";

	//////////
	// Groups and text search

	public static final String GET_TAGS_BY_GROUP =
			"SELECT DISTINCT public.tag.name, public.tag.id FROM public.tag "+
					"JOIN public.group_tag_ref ON public.tag.id = group_tag_ref.tag_id "+
					"WHERE public.group_tag_ref.group_id = ? "+
					"ORDER BY public.tag.name ASC LIMIT ? OFFSET ?";

	public static final String GET_RESOURCES_BY_GROUP =
			"SELECT DISTINCT public.document.title, public.document.document_id, url, text FROM public.document "+
					"JOIN public.annotations ON public.document.document_id = public.annotations.document_id "+
				    "JOIN public.group_doc_ref ON public.document.document_id = public.group_doc_ref.document_id "+
					"WHERE public.group_doc_ref.group_id = ? " +
					"ORDER BY public.document.title ASC LIMIT ? OFFSET ?";

	public static final String GET_GROUPS_BY_RESOURCE =
			"SELECT DISTINCT id, name  FROM public.group "+
				    "JOIN public.group_doc_ref ON public.group.id = public.group_doc_ref.group_id "+
					"WHERE public.group_doc_ref.document_id = ? ";
	
	// should return a List<String>
	public static final String GET_TEXT_BY_QUERY = 
			"select public.annotations.document_id, public.document.title from public.annotations  "+
			"JOIN public.document ON public.annotations.document_id = public.document.document_id " +
			"where public.annotations.language = 'en' AND to_tsvector('english', public.annotations.text) @@ phraseto_tsquery('english', ?) "+
			"ORDER BY public.document.title ASC LIMIT ? OFFSET ?";


	////////////////////////
	// Triples
	////////////////////////
	public static final String LIST_TRIPLES =
			"SELECT  document_id, subject, predicate,object from public.triples " +
					"ORDER BY public.triples.document_id ASC LIMIT ? OFFSET ?";


}
