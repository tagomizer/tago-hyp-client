/*
 * Copyright 2023 TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.ks.tagomizer.api;

import java.util.Set;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

/**
 * @author jackpark
 *
 */
public interface IAnalyzerListener {

	/**
	 * An <code>annotation</code> is a container of all properties found
	 * in a harvested annotation.
	 * @param annotation
	 */
	void acceptAnalyzedAnnotation(JSONObject annotation);
	
	JSONArray getData();
}
