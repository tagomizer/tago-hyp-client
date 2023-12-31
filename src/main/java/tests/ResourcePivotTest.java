/*
 * Copyright 2023 TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package tests;

import org.topicquests.support.api.IResult;

/**
 * @author jackpark
 *
 */
public class ResourcePivotTest extends TestRoot {
	private final String DID = "u-_FIq2rEembBhsSDPirhg"; //"epJOfBzkEem9G9c4W2oLXw";
	/**
	 * 
	 */
	public ResourcePivotTest() {
		IResult r = pivotSuite.listPivotsByResource(DID, 0, 20);
	    System.out.println("A "+r.getResultObject());
		environment.shutDown();
		System.exit(0);
	}

}
/*
{
	"groups": [{
		"groupId": "6xkx19i3",
		"name": "biomed"
	}],
	"text": ["The aim of this study was to systematically compare postprandial insulin responses to isoenergetic 1000-kJ (240-kcal) portions of several common foods. Correlations with nutrient content were determined. Thirty-eight foods separated into six food categories (fruit, bakery products, snacks, carbohydrate-rich foods, protein-rich foods, and breakfast cereals) were fed to groups of 11-13 healthy subjects. Finger-prick blood samples were obtained every 15 min over 120 min. An insulin score was calculated from the area under the insulin response curve for each food with use of white bread as the reference food (score = 100%). Significant differences in insulin score were found both within and among the food categories and also among foods containing a similar amount of carbohydrate. Overall, glucose and insulin scores were highly correlated (r = 0.70, P < 0.001, n = 38). However, protein-rich foods and bakery products (rich in fat and refined carbohydrate) elicited insulin responses that were disproportionately higher than their glycemic responses. Total carbohydrate (r = 0.39, P < 0.05, n = 36) and sugar (r = 0.36, P < 0.05, n = 36) contents were positively related to the mean insulin scores, whereas fat (r = -0.27, NS, n = 36) and protein (r = -0.24, NS, n = 38) contents were negatively related. Consideration of insulin scores may be relevant to the dietary management and pathogenesis of non-insulin-dependent diabetes mellitus and hyperlipidemia and may help increase the accuracy of estimating preprandial insulin requirements."],
	"title": "An insulin index of foods: the insulin demand generated by 1000-kJ portions of common foods. - PubMed - NCBI",
	"users": ["Gardener@hypothes.is"],
	"url": "https:\/\/www.ncbi.nlm.nih.gov\/pubmed\/9356547",
	"tags": [{
		"label": "Insulin Response",
		"id": "insulin_response"
	}, {
		"label": "Postprandial Insulin Response",
		"id": "postprandial_insulin_response"
	}, {
		"label": "Protein-rich Foods",
		"id": "protein-rich_foods"
	}]
}
*/