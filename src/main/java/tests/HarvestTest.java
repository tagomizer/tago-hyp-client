/*
 * Copyright 2023 TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package tests;

import org.topicquests.ks.tagomizer.api.IAnalyzerListener;
import org.topicquests.support.api.IResult;
import org.topicquests.support.util.TextFileHandler;
import java.io.*;
import net.minidev.json.JSONArray;

/**
 * @author jackpark
 *
 */
public class HarvestTest extends TestRoot {

	/**
	 * 
	 */
	public HarvestTest() {
		IResult r = client.harvest();
		
		//saveResults(environment.getListener().getData());
	}
	
	void saveResults(JSONArray ja) {
		if (ja == null) return;
		String path = "test/"+System.currentTimeMillis()+".json";
		try {
			File f = new File(path);
			//FileOutputStream fos = new FileOutputStream(f);
			PrintWriter pw = new PrintWriter(f,"UTF-8");
			ja.writeJSONString(pw);
			pw.flush();
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
			environment.logError(e.getMessage(), e);
		}
		
	}

}
