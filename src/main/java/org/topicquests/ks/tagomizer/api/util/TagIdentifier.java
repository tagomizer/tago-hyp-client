/**
 * 
 */
package org.topicquests.ks.tagomizer.api.util;

/**
 * @author jackpark
 *
 */
public class TagIdentifier {

	/**
	 * Convert a Tag Name to an identifier string
	 * @param tagName
	 * @return
	 */
	public static String tagToId(String tagName) {
		String result = tagName.trim();
		result = result.replaceAll(" ", "_");
		result = result.replaceAll("!", "x");
		result = result.replaceAll("'", "t");
		result = result.replaceAll(",", "c");
		result = result.replaceAll("\\?", "q");
		result = result.toLowerCase();
		return result;
	}

}
