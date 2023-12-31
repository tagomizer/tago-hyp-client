/*
 * Copyright 2023 TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package tests;

import org.topicquests.ks.tagomizer.TagomizerClientEnvironment;
import org.topicquests.ks.tagomizer.hypothesis.HypothesisClient;
import org.topicquests.ks.tagomizer.hypothesis.JSONProcessor;
import org.topicquests.ks.tagomizer.hypothesis.PivotSuite;
import org.topicquests.pg.PostgresConnectionFactory;

/**
 * @author jackpark
 * Extend this class for tests
 */
public class TestRoot {
	protected TagomizerClientEnvironment environment;
	protected HypothesisClient client;
	protected JSONProcessor processor;
	protected PivotSuite pivotSuite;
	protected PostgresConnectionFactory provider;

	/**
	 * 
	 */
	public TestRoot() {
		environment = new TagomizerClientEnvironment();
		client = environment.getClient();
		processor = environment.getProcessor();
		pivotSuite = environment.getPivotSuite();
		provider = environment.getProvider();
	}

}
