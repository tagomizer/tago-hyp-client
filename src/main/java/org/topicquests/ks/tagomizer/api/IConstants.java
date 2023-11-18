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
public interface IConstants {
	//fields are defined in tqks-elastic6-provider config/mappings.json
	public static final String
		ID			= "lox",
		TITLE		= "title",
		ANNOTATION	= "annotation",
		TEXT		= "text",
		USER		= "user",
		CREATED		= "created",
		URI			= "uri",
		TAGS		= "tags";

}
