/*
 * Copyright 2023 TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.ks.tagomizer;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.topicquests.support.api.IResult;

/**
 * @author jackpark
 *
 */
public class BaseHttpClient {
	protected TagomizerClientEnvironment environment;
	protected CloseableHttpClient client;

	/**
	 * 
	 */
	public BaseHttpClient(TagomizerClientEnvironment env) {
		environment = env;
		client = HttpClients.createDefault();
	}
	

}
