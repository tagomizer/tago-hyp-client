/*
 * Copyright 2023 TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.ks.tagomizer.hypothesis;


import org.topicquests.ks.tagomizer.TagomizerClientEnvironment;
import org.topicquests.ks.tagomizer.api.IAnalyzerListener;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

/**
 * @author jackpark
 *
 */
public class AnalyzerListener implements IAnalyzerListener {
	private TagomizerClientEnvironment environment;
	private JSONArray anas;
	private PivotModel pivotModel;
	
	/**
	 * 
	 */
	public AnalyzerListener(TagomizerClientEnvironment env) {
		environment = env;
		pivotModel = environment.getPivotModel();
		anas = new JSONArray();
	}

	public JSONArray getData() {
		return anas;
	}
	
	/* (non-Javadoc)
	 * @see org.topicquests.ks.tagomizer.api.IAnalyzerListener#acceptAnalyzedAnnotation(net.minidev.json.JSONObject)
	 */
	@Override
	public void acceptAnalyzedAnnotation(JSONObject annotation) {
		pivotModel.processDocument(annotation);
		anas.add(annotation);
		environment.logDebug("ANA\n"+annotation);
		//environment.logDebug("Annotations "+anas.size());
	}

	
}
