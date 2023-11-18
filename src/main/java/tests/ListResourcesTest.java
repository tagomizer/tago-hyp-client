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
public class ListResourcesTest extends TestRoot {

	/**
	 * 
	 */
	public ListResourcesTest() {
		super();
		IResult r = pivotSuite.listAllResources(0, 30);
	    System.out.println("A "+r.getResultObject());
		environment.shutDown();
		System.exit(0);

	}

}

/*
[{
	"docId": "klZsGCGVEemSQq-EVLvgXA",
	"text": ["Brown fat keeps blood sugar in check", "Paul Lee in the youtube https:\/\/www.youtube.com\/watch?v=GCBL2N2pmeY search results on this page"],
	"title": "%%title%% | Garvan Institute of Medical Research",
	"url": "https:\/\/www.garvan.org.au\/"
}, {
	"docId": "m9OHuEgOEemXlounhz5Phw",
	"text": ["A growing body of evidence supports the concept that Alzheimer\u2019s Disease (AD) is a metabolic disease that results from impaired insulin signaling, insulin resistance, and low levels of insulin in the brain.  Because the molecular and biochemical consequences of impaired insulin signaling are shared with Type I and Type 2 diabetes, the term \u201CType 3 diabetes\u201D has been suggested for AD.  There is also evidence that people who have Type 2 diabetes have a heightened risk of developing AD.  Understanding the possible associations between Type 2 diabetes and AD may lead to effective early diagnosis and treatment of AD.  It may also help to identify patients with Type 2 diabetes who are at high risk for developing AD.  In this article, we examine the possible associations between Type 2 diabetes and AD. ", "The information contained in this article will enhance student comprehension of the neuroendocrine system and their appreciation for the current research associated with a possible link between Alzheimer\u2019s Disease and Diabetes, associated with the pedagogy of courses in Human Anatomy and Physiology, Human Physiology, Advanced Physiology and Neurobiology. IntroductionThe first indication that patients with Type 2 diabetes mellitus (T2DM) have an increased risk of developing Alzheimer\u2019s Disease (AD) appeared in the Rotterdam study (Dar et al. 2014), a prospective study that has been ongoing since 1990 in Rotterdam, The Netherlands (Ikram et al. 2017).  Participants in the Rotterdam study, who currently number 14,926 individuals over the age of 40, are monitored for a variety of diseases that are known to affect the elderly, among them: heart disease, stroke, AD, Parkinson\u2019s disease, diabetes, and osteoporosis.  The Honolulu-Asia Aging Study, initiated in 1990 to study abnormalities associated with dementia in 3734 Japanese-American men and closed in 2012 (Gelber etal. 2012), similarly found a strong association between T2DM and AD (Peila et al.2002).  The number of people who suffer from these diseases is staggering. Conservative estimates put the number of people with AD at 36 million worldwide and that number is expected to double every twenty years until 2040 (Narasimhan 2014).  The number of people who suffer from diabetes may exceed 347 million worldwide (Yang and Song 2013).  Diabetes mellitus is associated with the subsequent development of AD in the aging population (Dar et al. 2014) and people with T2DM are believed to be 50-65% more likely to develop AD as they age compared to people who are not diabetic (Dar et al. 2014, http:\/\/dlife.com\/type-3-diabetes, www.diabetes.co.uk\/type3-diabetes.html).  There is currently a debate about the degree to which T2DM and perhaps T1DM contribute to the pathogenesis of AD that centers on the rising prevalence of obesity, T2DM and AD over the past 20 years.  Some degree of association between diabetes and AD is suggested by the following (de la Monte and Wands 2008):1.  An increased risk for developing mild cognitiveimpairment (MCI), dementia, or AD in patients who havebeen diagnosed with T2DM.2.  The presence of progressive insulin resistance (IR) andinsulin deficiency that has been observed in the brain ofAlzheimer\u2019s patients.3.  Observations of cognitive impairment in animal modelsof T2DM and obesity.4.  Neurodegeneration and cognitive impairment in animalmodels where IR or insulin deficiency have been induced.5.  Observations of improved cognitive performance inexperimental animals who have received intranasalinsulin treatment for cognitive impairment.6.  The presence of several biochemical and molecularabnormalities that are shared in T2DM and AD.(de la Monte and Wands 2008)continued on next page\n"],
	"title": "(18) (PDF) The Case for Alzheimer\u2019s Disease as Type 3 Diabetes",
	"url": "https:\/\/www.researchgate.net\/publication\/326699884_The_Case_for_Alzheimer's_Disease_as_Type_3_Diabetes"
}, {
	"docId": "_MCe2h88EemfxyMDElTjmw",
	"text": ["This paper explores the underlying information system of Chinese Feng Shui, translated literally as \"wind and water,\" and compares and contrasts it with theories of complexity science, quantum mechanics, and systems science.", "Traditional Chinese Medicine -- an important thread"],
	"title": "(21) (PDF) Wind and water: Feng Shui as complexity science",
	"url": "https:\/\/www.researchgate.net\/publication\/330554330_Wind_and_water_Feng_Shui_as_complexity_science"
}, {
	"docId": "QrqcPCSsEemgH6MwvwvvSA",
	"text": ["Studying the IoF framework. Relation to nutrition K-Hub.", "To\t\r  construct\t\r  a\t\r  framework\t\r  to\t\r  be\t\r  used\t\r  for\t\r  structuring\t\r  the\t\r  discussion\t\r  around\t\r  Internet\t\r  and\t\r  food,\t\r  thereby\t\r  furthering\t\r  the\t\r  discussion\t\r  around\t\r  how\t\r  to\t\r  facilitate\t\r  openness\t\r  and\t\r  innovaLon\t\r  in\t\r  the\t\r  field\t\r  of\t\r  food\t\r  with\t\r  the\t\r  goal\t\r  to\t\r  feed\t\r  the\t\r  planet\t\r  in\t\r  a\t\r  healthy\t\r  and\t\r  sustainable\t\r  way\t\r "],
	"title": "20150425-IoF_Framework-Basic.pdf",
	"url": "http:\/\/internet-of-food.org\/files\/2015\/08\/20150425-IoF_Framework-Basic.pdf"
}, {
	"docId": "5vtTSFlHEemxDcNPX_Fqmg",
	"text": ["Pharmacological agents that raise cAMP and activate protein kinase A (PKA) stimulate 26S proteasome activity, phosphorylation of subunit Rpn6, and intracellular degradation of misfolded proteins. We investigated whether a similar proteasome activation occurs in response to hormones and under various physiological conditions that raise cAMP. Treatment of mouse hepatocytes with glucagon, epinephrine, or forskolin stimulated Rpn6 phosphorylation and the 26S proteasomes\u2019 capacity to degrade ubiquitinated proteins and peptides. These agents promoted the selective degradation of short-lived proteins, which are misfolded and regulatory proteins, but not the bulk of cell proteins or lysosomal proteolysis. Proteasome activities and Rpn6 phosphorylation increased similarly in working hearts upon epinephrine treatment, in skeletal muscles of exercising humans, and in electrically stimulated rat muscles. In WT mouse kidney cells, but not in cells lacking PKA, treatment with antidiuretic hormone (vasopressin) stimulated within 5-minutes proteasomal activity, Rpn6 phosphorylation, and the selective degradation of short-lived cell proteins. In livers and muscles of mice fasted for 12\u201348 hours cAMP levels, Rpn6 phosphorylation, and proteasomal activities increased without any change in proteasomal content. Thus, in vivo cAMP-PKA\u2013mediated proteasome activation is a common cellular response to diverse endocrine stimuli and rapidly enhances the capacity of target tissues to degrade regulatory and misfolded proteins (e.g., proteins damaged upon exercise). The increased destruction of preexistent regulatory proteins may help cells adapt their protein composition to new physiological conditions."],
	"title": "26S Proteasomes are rapidly activated by diverse hormones and physiological states that raise cAMP and cause Rpn6 phosphorylation",
	"url": "https:\/\/www.pnas.org\/content\/116\/10\/4228"
}, {
	"docId": "lMxucllHEemP7gfh2WbSSQ",
	"text": ["Most studies of proteolysis by the ubiquitin-proteasome pathway have focused on the regulation by ubiquitination. However, we showed that pharmacological agents that raise cAMP and activate protein kinase A by phosphorylating a proteasome subunit enhance proteasome activity and the cell\u2019s capacity to selectively degrade misfolded and regulatory proteins. We investigated whether similar adaptations occur in physiological conditions where cAMP rises. Proteasome activity increases by this mechanism in human muscles following intense exercise, in mouse muscles and liver after a brief fast, in hepatocytes after epinephrine or glucagon, and renal collecting duct cells within 5 minutes of antidiuretic hormone. Thus, hormones and conditions that raise cAMP rapidly enhance proteasome activity and the cells\u2019 capacity to eliminate damaged and preexistent regulatory proteins."],
	"title": "26S Proteasomes are rapidly activated by diverse hormones and physiological states that raise cAMP and cause Rpn6 phosphorylation",
	"url": "https:\/\/www.pnas.org\/content\/116\/10\/4228"
}, {
	"docId": "3I6nsBzkEemiSxfO-VkrMg",
	"text": ["Apple  cider  vinegar  has  been  traditionally  used  since  many  years  ago  to  treat  a  certain number of diseases including hyperlipidemia  which is known as a  risk factor for atherosclerosis.  Early prevention  and  treatment  of  atherosclerosis  can  prevent  complications  of  cardiovascular  diseases. Hence,  the  present  study  aimed  to  review  the  influence  of  apple  cider  vinegar  consumption  on reducing  blood  lipid  levels.This  quasi-experiment  study(time  series  design)  was  carried  out  on 19patients  with  hyperlipidemia.  The  subjects  had  been  referred  to  a  cardiologist  and  agreed  to  consumeapple  cider  vinegar.  At  baseline,  blood  samples  were  obtained  to  measure  cholesterol,  triglyceride, low  density  lipoprotein  (LDL),  and  high  density  lipoprotein  (HDL).  The  tests  were  repeated  at  two, four,  and  eight  weeks  of  vinegar  consumption.  The  results  were  analyzed  using  repeated  measurement analysis.There  were  significant  reduction  in  the  serum  levels  of  total  cholesterol  (p  < 0.001), triglyceride (p = 0.020), and LDL  (p = 0.001)  after eight weeks  of consuming apple  cider vinegar  and with  an  increased  HDL  levels  but  the  trend  was  not  statistically  significant  (p  = 0.200).Consumption of apple cider  vinegar over  a 8 week  period had  a beneficial effect  in significant  reductions in  harmful blood lipids and is recommended  as a simple and cost-effective  treatment  for hyperlipidemia.[Zahra  Beheshti  ,Yiong  Huak  Chan,Hamid  Sharif  Nia,  Fatemeh  Hajihosseini,  Rogheyeh  Nazari, Mohammad  shaabani,  Mohammad  Taghi  Salehi  Omran.Influence  of  apple  cider  vinegar  on  blood lipids.Life SciJ2012;9(4):2431-2440]. (ISSN: 1097-8135). http:\/\/www.lifesciencesite.com. ", "Here from nutritionfacts on vinegar."],
	"title": "360_10755life0904_2431_2440.pdf",
	"url": "http:\/\/www.lifesciencesite.com\/lsj\/life0904\/360_10755life0904_2431_2440.pdf"
}, {
	"docId": "JS3IxCGbEemtnt9yySHcpg",
	"text": ["The  objective  is  to  present  a  brief  overview  of  peptide  and  non-peptide  factors  secreted  from  adipocytes  and  todescribe some studies on the postulated role of the locally active triad angiotensinogen=angiotensin II=prostacyclin inthe development=enlargment of adipose tissue mass and increased blood pressure. In addition to the role of adiposetissue as an endocrine organ, the results emphasize the autocrine=paracrine mechanisms which are postulated to playa role in adipose tissue development and enlargment"],
	"title": "801267 1..3",
	"url": "https:\/\/www.nature.com\/articles\/0801267.pd"
}, {
	"docId": "7_ZJNL4fEemlSz9pCN6Zxg",
	"text": ["The cells that make up all living things, despite their endless variations, contain three fundamental elements. There are molecules that encode information and can be copied\u2014DNA and its simpler relative, RNA. There are proteins\u2014workhorse molecules that perform important tasks. And encapsulating them all, there\u2019s a membrane made from fatty acids. Go back far enough in time, before animals and plants and even bacteria existed, and you\u2019d find that the precursor of all life\u2014what scientists call a \u201Cprotocell\u201D\u2014likely had this same trinity of parts: RNA and proteins, in a membrane. As the physicist Freeman Dyson once said, \u201CLife began with little bags of garbage.\u201DThe bags\u2014the membranes\u2014were crucial. Without something to corral the other molecules, they would all just float away, diffusing into the world and achieving nothing. By concentrating them, membranes transformed an inanimate world of disordered chemicals into one teeming with redwoods and redstarts, elephants and E. coli, humans and hagfish. Life, at its core, is about creating compartments. And that\u2019s much easier and much harder than it might seem."],
	"title": "A New Clue to How Life Originated",
	"url": "https:\/\/www.theatlantic.com\/science\/archive\/2019\/08\/interlocking-puzzle-allowed-life-emerge\/595945\/"
}, {
	"docId": "Lb6OmL4gEem3nydb3bCZwg",
	"text": ["Life first arose in salty oceans, and salt catastrophically destabilizes the fatty-acid spheres. Also, certain ions, including magnesium and iron, cause the spheres to collapse, which is problematic since RNA\u2014another key component of early protocells\u2014requires these ions. How, then, could life possibly have arisen, when the compartments it needs are destroyed by the conditions in which it first emerged, and by the very ingredients it needs to thrive?Caitlin Cornell and Sarah Keller have an answer to this paradox. They\u2019ve shown that the spheres can withstand both salt and magnesium ions, as long as they\u2019re in the presence of amino acids\u2014the simple molecules that are the building blocks of proteins. "],
	"title": "A New Clue to How Life Originated",
	"url": "https:\/\/www.theatlantic.com\/science\/archive\/2019\/08\/interlocking-puzzle-allowed-life-emerge\/595945\/"
}, {
	"docId": "cYPJ2izvEemJIO88nb1Lmg",
	"text": ["Article on Fitbit data and better sleep"],
	"title": "A Quest for Better Sleep with Fitbit Data Analysis \u2013 5agado \u2013 Medium",
	"url": "https:\/\/medium.com\/@5agado\/a-quest-for-better-sleep-with-fitbit-data-analysis-5f10b3f548a"
}, {
	"docId": "JUF7bMqXEemhGRsMV0GMDQ",
	"text": ["An understanding of the regulatory mechanism for sleep lays at the foundation for healthy living and aging. Sleep behavior has long been thought to be regulated by the interactions of circadian clock and sleep homeostasis pathways (Borbély, 1982Borbély A.A. A two process model of sleep regulation.Hum. Neurobiol. 1982; 1: 195-204PubMed\nGoogle Scholar, Borbély et al., 2016Borbély A.A. Daan S. Wirz-Justice A. Deboer T. The two-process model of sleep regulation: a reappraisal.J. Sleep Res. 2016; 25: 131-143Crossref\nPubMed\nScopus (182)\nGoogle Scholar, Daan et al., 1984Daan S. Beersma D.G. Borbély A.A. Timing of human sleep: recovery process gated by a circadian pacemaker.Am. J. Physiol. 1984; 246: R161-R183PubMed\nGoogle Scholar). In humans, variations of genetically inherited sleep features in the population have been recognized for a long time (Sehgal and Mignot, 2011Sehgal A. Mignot E. Genetics of sleep and sleep disorders.Cell. 2011; 146: 194-207Abstract\nFull Text\nFull Text PDF\nPubMed\nScopus (179)\nGoogle Scholar, Shi et al., 2017Shi G. Wu D. Ptáček L.J. Fu Y.-H. Human genetics and sleep behavior.Curr. Opin. Neurobiol. 2017; 44: 43-49Crossref\nPubMed\nScopus (3)\nGoogle Scholar). Importantly, human sleep has unique features that are different from that of animal models. For example, human sleep is usually consolidated, whereas mice sleep throughout the 24-h day (though more in the light phase than in the dark phase). Drosophila sleep-like behavior is consolidated into one long period, but the level of similarity between the Drosophila and human molecular regulatory mechanisms remains unclear. Previously, we identified a series of genetic variations that influence the timing of sleep in humans, and mouse models of these mutations mostly recapitulate the phenotypes (Shi et al., 2017Shi G. Wu D. Ptáček L.J. Fu Y.-H. Human genetics and sleep behavior.Curr. Opin. Neurobiol. 2017; 44: 43-49Crossref\nPubMed\nScopus (3)\nGoogle Scholar). Timing of sleep is heavily influenced by the circadian clock, which has been intensely studied, and we now have a large and growing body of knowledge on how the clock is regulated at the molecular level. On the other hand, our understanding of sleep homeostasis regulation for human lags behind. We reported a mutation in the human DEC2 gene that causes mutation carriers to sleep 6 h nightly for their entire lives without apparent negative effects (He et al., 2009He Y. Jones C.R. Fujiki N. Xu Y. Guo B. Holder J.L. Rossner M.J. Nishino S. Fu Y.H. The transcriptional repressor DEC2 regulates sleep length in mammals.Science. 2009; 325: 866-870Crossref\nPubMed\nScopus (171)\nGoogle Scholar). Another mutation in DEC2 was later reported in a single individual who is a short sleeper and resistant to sleep deprivation (Pellegrino et al., 2014Pellegrino R. Kavakli I.H. Goel N. Cardinale C.J. Dinges D.F. Kuna S.T. Maislin G. Van Dongen H.P. Tufik S. Hogenesch J.B. et al.A novel BHLHE41 variant is associated with short sleep and resistance to sleep deprivation in humans.Sleep (Basel). 2014; 37: 1327-1336Crossref\nPubMed\nScopus (0)\nGoogle Scholar). Identification of additional genes participating in modulation of human sleep duration provides a unique way to expand our knowledge of genes and pathways critical for human sleep homeostasis regulation.Noradrenergic signaling in the CNS has long been known to regulate sleep (Berridge, 2008Berridge C.W. Noradrenergic modulation of arousal.Brain Res. Brain Res. Rev. 2008; 58: 1-17Crossref\nPubMed\nScopus (0)\nGoogle Scholar, Berridge et al., 2012Berridge C.W. Schmeichel B.E. España R.A. Noradrenergic modulation of wakefulness\/arousal.Sleep Med. Rev. 2012; 16: 187-197Crossref\nPubMed\nScopus (121)\nGoogle Scholar, Szabadi, 2013Szabadi E. Functional neuroanatomy of the central noradrenergic system.J. Psychopharmacol. (Oxford). 2013; 27: 659-693Crossref\nPubMed\nScopus (104)\nGoogle Scholar). The network involving the noradrenergic neurons has been extensively studied, and most of the receptor subtypes have been genetically defined. In contrast to α1 and α2 adrenergic receptors (ARs), relatively little is known about the function of β receptors in the CNS (Berridge et al., 2012Berridge C.W. Schmeichel B.E. España R.A. Noradrenergic modulation of wakefulness\/arousal.Sleep Med. Rev. 2012; 16: 187-197Crossref\nPubMed\nScopus (121)\nGoogle Scholar, Szabadi, 2013Szabadi E. Functional neuroanatomy of the central noradrenergic system.J. Psychopharmacol. (Oxford). 2013; 27: 659-693Crossref\nPubMed\nScopus (104)\nGoogle Scholar). βARs within the brain were previously suggested to mediate the effect of norepinephrine (NE) for alert waking and rapid eye movement (REM) sleep (Berridge et al., 2012Berridge C.W. Schmeichel B.E. España R.A. Noradrenergic modulation of wakefulness\/arousal.Sleep Med. Rev. 2012; 16: 187-197Crossref\nPubMed\nScopus (121)\nGoogle Scholar). Clinically, β-blockers are widely used and can be associated with difficulty falling asleep and staying asleep, possibly due to reduced production and release of melatonin (Helfand et al., 2009Helfand M. Peterson K. Christensen V. Dana T. Thakurata S. Drug Class Review: Beta Adrenergic Blockers. Oregon Health & Science University,\n        ; 2009: 1-616Google Scholar, Scheer et al., 2012Scheer F.A.J.L. Morris C.J. Garcia J.I. Smales C. Kelly E.E. Marks J. Malhotra A. Shea S.A. Repeated melatonin supplementation improves sleep in hypertensive patients treated with beta-blockers: a randomized controlled trial.Sleep (Basel). 2012; 35: 1395-1402Crossref\nPubMed\nScopus (0)\nGoogle Scholar, Stoschitzky et al., 1999Stoschitzky K. Sakotnik A. Lercher P. Zweiker R. Maier R. Liebmann P. Lindner W. Influence of beta-blockers on melatonin release.Eur. J. Clin. Pharmacol. 1999; 55: 111-115Crossref\nPubMed\nScopus (126)\nGoogle Scholar, Yilmaz et al., 2008Yilmaz M.B. Erdem A. Yalta K. Turgut O.O. Yilmaz A. Tandogan I. Impact of beta-blockers on sleep in patients with mild hypertension: a randomized trial between nebivolol and metoprolol.Adv. Ther. 2008; 25: 871-883Crossref\nPubMed\nScopus (0)\nGoogle Scholar). We report here a rare mutation in the β1AR gene (ADRB1) found in humans with natural short sleep. Engineering the human mutation into mice resulted in a sleep phenotype similar to that seen in familial natural short sleepers. We show that β1AR is expressed at high levels in the dorsal pons (DP). Neuronal activity measured by calcium imaging in this region demonstrated that ADRB1+ neurons in DP are wake and REM sleep active. Manipulating the activity of these ADRB1+ neurons changes sleep\/wake patterns. Also, the activity of these neurons was altered in mice harboring the mutation. Together, these results not only support the causative role of this ADRB1 mutation in the human subjects but also provide a mechanism for investigating noradrenaline and β1AR in sleep regulation at the circuit level."],
	"title": "A Rare Mutation of β1-Adrenergic Receptor Affects Sleep\/Wake Behaviors",
	"url": "https:\/\/www.cell.com\/neuron\/fulltext\/S0896-6273(19)30652-"
}, {
	"docId": "HaPbZgoWEeqy3D-V53kVag",
	"text": ["Hyperinflammatory syndromes are life-threatening disorders caused by overzealous immune cell activation and cytokine release, often resulting from defects in negative feedback mechanisms. In the quintessential hyperinflammatory syndrome familial hemophagocytic lymphohistiocytosis (HLH), inborn errors of cytotoxicity result in effector cell accumulation, immune dysregulation and, if untreated, tissue damage and death. Here, we describe a human case with a homozygous nonsense R688* RC3H1 mutation suffering from hyperinflammation, presenting as relapsing HLH. RC3H1 encodes Roquin-1, a posttranscriptional repressor of immune-regulatory proteins such as ICOS, OX40 and TNF. Comparing the R688* variant with the murine M199R variant reveals a phenotypic resemblance, both in immune cell activation, hypercytokinemia and disease development. Mechanistically, R688* Roquin-1 fails to localize to P-bodies and interact with the CCR4-NOT deadenylation complex, impeding mRNA decay and dysregulating cytokine production. The results from this unique case suggest that impaired Roquin-1 function provokes hyperinflammation by a failure to quench immune activation."],
	"title": "A human immune dysregulation syndrome characterized by severe hyperinflammation with a homozygous nonsense Roquin-1 mutation",
	"url": "https:\/\/www.nature.com\/articles\/s41467-019-12704-6"
}, {
	"docId": "9nnhdCSsEemsyN-ly3D22A",
	"text": ["Global increases in metabolic diseases that can be influenced by diet have re\u2010emphasized the importance of considering how different foods can improve human health. The entire agricultural enterprise has an unprecedented opportunity to increase its value by producing foods that improve the health of consumers. Research efforts in agriculture\/food science\/nutrition are endeavoring to do so, although little tangible success has been achieved. At the core of the problem is a failure to define the goal itself: health. Health, as a scientifically measurable concept, is poorly defined relative to disease, and yet consensus\u2010based, curated vocabularies that describe the multiple variations in human health in useful terms are critical to unifying the scientific fields related to agriculture and nutrition. Each of the life\u2010science disciplines relating to health has developed databases, thesauri, and\/or ontologies to capture such knowledge. High\u2010throughput and \u2010omic technologies are expanding both the amount and heterogeneity of available information. Unfortunately, the language used to describe substantially similar (even logically equivalent) concepts is often different between information systems. Increasing the future value of agriculture, therefore, will depend on creating a process for generating common ontologies of the concept of health, and guiding the development of a common language. This paper illustrates a framework for integrating heterogeneous ontologies into interdisciplinary, foods\u2010for\u2010health knowledge systems. A common system of language that describes health and is shared by all the life\u2010science disciplines will provide immediate benefits in terms of increased health\u2010claim regulatory efficiencies and predictive functions for individualized diets. Ultimately, these vocabularies will guide agriculture to its next goal of producing health\u2010enhancing foods.", "This is important to a nutrition k-hub"],
	"title": "A multi\u2010ontology framework to guide agriculture and food towards diet and health",
	"url": "https:\/\/onlinelibrary.wiley.com\/doi\/full\/10.1002\/jsfa.2832"
}, {
	"docId": "SYXyPgEYEeqs0q9Y4Y1IkQ",
	"text": ["UK National Amyloidosis Centre", "Weight loss is common in systemic immunoglobulin light chain amyloidosis but there are limited data on the impact of nutritional status on outcome. Using the Patient-Generated Subjective Global Assessment (PG-SGA) score, we prospectively examined nutritional status in 110 consecutive newly-diagnosed, treatment-naïve patients with immunoglobulin light chain amyloidosis attending the UK National Amyloidosis Centre. At study entry, 72 of 110 (66%) patients had a PG-SGA score of 4 or over, indicating malnutrition requiring specialist nutritional intervention. Number of amyloidotic organs, elevated alkaline phosphatase, presence of autonomic neuropathy and advanced Mayo disease stage were independently associated with poor nutritional status (P<0.05). Quality of life was substantially poorer among those with higher PG-SGA scores (P<0.001). Furthermore, PG-SGA score was a powerful independent predictor of patient survival (P=0.02). Malnutrition is prevalent and is associated with poor quality of life and reduced survival among patients with systemic immunoglobulin light chain amyloidosis. The PG-SGA score would be an appropriate tool to evaluate whether nutritional intervention could improve patient outcomes."],
	"title": "A prospective study of nutritional status in immunoglobulin light chain amyloidosis",
	"url": "https:\/\/www.ncbi.nlm.nih.gov\/pmc\/articles\/PMC3533675\/"
}, {
	"docId": "AKszlC1gEemx9avNBF4GPA",
	"text": ["The potential acute genoprotective effect of orange juice supplementation was investigated. Six healthy subjects (aged 33 to 60 years; 3 women and 3 men) were asked to drink 400 mL of commercial orange juice, which contained 100 mg vitamin C and 40.8 g sugar. Venous blood (2 mL) was taken before and 2 h after ingestion (test trial). A week later, the subjects were asked to repeat the trial by drinking 400 mL water with 100 mg vitamin C and 40.8 g glucose (control trial). Lymphocytes isolated from blood samples underwent comet assay on the day of collection. Pre- and postingestion DNA damage scores were measured in both the test and control trials. Results showed that there was a significant decrease in DNA damage induced by hydrogen peroxide after 2 h of supplementation with orange juice, and no change in baseline DNA damage. There was no significant decrease in the DNA damage in lymphocytes in the control trial."],
	"title": "A study of DNA protective effect of orange juice supplementation. - PubMed - NCBI",
	"url": "https:\/\/www.ncbi.nlm.nih.gov\/pubmed\/23668761"
}, {
	"docId": "9E71kmwyEemIKkcQDyOAwA",
	"text": ["Natural selection shapes bacterial evolution in all environments. However, the extent to which commensal bacteria diversify and adapt within the human gut remains unclear. Here, we combine culture-based population genomics and metagenomics to investigate the within-microbiome evolution of Bacteroides fragilis. We find that intra-individual B. fragilis populations contain substantial de novo nucleotide and mobile element diversity, preserving years of within-person history. This history reveals multiple signatures of within-person adaptation, including parallel evolution in sixteen genes. Many of these genes are implicated in cell-envelope biosynthesis and polysaccharide utilization. Tracking evolutionary trajectories using near-daily metagenomic sampling, we find evidence for years-long coexistence in one subject despite adaptive dynamics. We used public metagenomes to investigate one adaptive mutation common in our cohort and found that it emerges frequently in Western, but not Chinese, microbiomes. Collectively, these results demonstrate that B. fragilis adapts within individual microbiomes, pointing to factors that promote long-term gut colonization."],
	"title": "Adaptive Evolution within Gut Microbiomes of Healthy People",
	"url": "https:\/\/www.cell.com\/cell-host-microbe\/fulltext\/S1931-3128(19)30159-3"
}, {
	"docId": "4UAnciGcEem40FOZ-gE_qg",
	"text": ["Adipose tissue is a complex, essential, and highly active metabolic and endocrine organ. Besides adipocytes, adipose tissue contains connective tissue matrix, nerve tissue, stromovascular cells, and immune cells. Together these components function as an integrated unit. Adipose tissue not only responds to afferent signals from traditional hormone systems and the central nervous system but also expresses and secretes factors with important endocrine functions. These factors include leptin, other cytokines, adiponectin, complement components, plasminogen activator inhibitor-1, proteins of the renin-angiotensin system, and resistin. Adipose tissue is also a major site for metabolism of sex steroids and glucocorticoids. The important endocrine function of adipose tissue is emphasized by the adverse metabolic consequences of both adipose tissue excess and deficiency. A better understanding of the endocrine function of adipose tissue will likely lead to more rational therapy for these increasingly prevalent disorders. This review presents an overview of the endocrine functions of adipose tissue."],
	"title": "Adipose Tissue as an Endocrine Organ",
	"url": "https:\/\/academic.oup.com\/jcem\/article\/89\/6\/2548\/2870285"
}, {
	"docId": "DCbeCiGcEem8xhsL7eKaGQ",
	"text": ["The discovery of leptin in the mid-1990s has focused attention on the role of proteins secreted by adipose tissue. Leptin has profound effects on appetite and energy balance, and is also involved in the regulation of neuroendocrine and immune function. Sex steroid and glucocorticoid metabolism in adipose tissue has been implicated as a determinant of body fat distribution and cardiovascular risk. Other adipose products, for example, proinflammatory cytokines, complement factors and components of the coagulation\/fibrinolytic cascade, may mediate the metabolic and cardiovascular complications associated with obesity."],
	"title": "Adipose Tissue as an Endocrine Organ",
	"url": "https:\/\/www.cell.com\/trends\/endocrinology-metabolism\/fulltext\/S1043-2760(00)00301-"
}, {
	"docId": "tZyLwCGbEemST2fN1NhtiA",
	"text": ["Obesity is characterized by increased storage of fatty acids in an expanded adipose tissue mass and is closely associated with the development of insulin resistance in peripheral tissues such as skeletal muscle and the liver. In addition to being the largest source of fuel in the body, adipose tissue and resident macrophages are also the source of a number of secreted proteins. Cloning of the obese gene and the identification of its product, leptin, was one of the first discoveries of an adipocyte-derived signaling molecule and established an important role for adipose tissue as an endocrine organ. Since then, leptin has been found to have a profound role in the regulation of whole-body metabolism by stimulating energy expenditure, inhibiting food intake and restoring euglycemia, however, in most cases of obesity leptin resistance limits its biological efficacy. In contrast to leptin, adiponectin secretion is often diminished in obesity. Adiponectin acts to increase insulin sensitivity, fatty acid oxidation, as well as energy expenditure and reduces the production of glucose by the liver. Resistin and retinol binding protein-4 are less well described. Their expression levels are positively correlated with adiposity and they are both implicated in the development of insulin resistance. More recently it has been acknowledged that macrophages are an important part of the secretory function of adipose tissue and the main source of inflammatory cyokines, such as TNFα and IL-6. An increase in circulating levels of these macrophage-derived factors in obesity leads to a chronic low-grade inflammatory state that has been linked to the development of insulin resistance and diabetes. These proteins commonly known as adipokines are central to the dynamic control of energy metabolism, communicating the nutrient status of the organism with the tissues responsible for controlling both energy intake and expenditure as well as insulin sensitivity."],
	"title": "Adipose tissue as an endocrine organ",
	"url": "https:\/\/www.sciencedirect.com\/science\/article\/pii\/S0303720709004389"
}, {
	"docId": "epJOfBzkEem9G9c4W2oLXw",
	"text": ["Here from nutritionfacts on vinegar. This covers 28 foods separated into six food categories, then measured insulin response", "The aim of this study was to systematically compare postprandial insulin responses to isoenergetic 1000-kJ (240-kcal) portions of several common foods. Correlations with nutrient content were determined. Thirty-eight foods separated into six food categories (fruit, bakery products, snacks, carbohydrate-rich foods, protein-rich foods, and breakfast cereals) were fed to groups of 11-13 healthy subjects. Finger-prick blood samples were obtained every 15 min over 120 min. An insulin score was calculated from the area under the insulin response curve for each food with use of white bread as the reference food (score = 100%). Significant differences in insulin score were found both within and among the food categories and also among foods containing a similar amount of carbohydrate. Overall, glucose and insulin scores were highly correlated (r = 0.70, P < 0.001, n = 38). However, protein-rich foods and bakery products (rich in fat and refined carbohydrate) elicited insulin responses that were disproportionately higher than their glycemic responses. Total carbohydrate (r = 0.39, P < 0.05, n = 36) and sugar (r = 0.36, P < 0.05, n = 36) contents were positively related to the mean insulin scores, whereas fat (r = -0.27, NS, n = 36) and protein (r = -0.24, NS, n = 38) contents were negatively related. Consideration of insulin scores may be relevant to the dietary management and pathogenesis of non-insulin-dependent diabetes mellitus and hyperlipidemia and may help increase the accuracy of estimating preprandial insulin requirements."],
	"title": "An insulin index of foods: the insulin demand generated by 1000-kJ portions of common foods. - PubMed - NCBI",
	"url": "https:\/\/www.ncbi.nlm.nih.gov\/pubmed\/9356547"
}, {
	"docId": "wxA28KAVEemi1t8D1bXIBA",
	"text": ["Lemon balm (Melissa officinalis) has been used historically and contemporarily as a modulator of mood and cognitive function, with anxiolytic effects following administration of capsules, coated tablets and topical application. Following a pilot study with lemon balm extract administered as a water based drink, which confirmed absorption of rosmarinic acid effects on mood and cognitive function, we conducted two similar double-blind, placebo-controlled, crossover studies. These evaluated the mood and cognitive effects of a standardised M. officinalis preparation administered in palatable forms in a beverage and in yoghurt. In each study a cohort of healthy young adults\u2019 self-rated aspects of mood were measured before and after a multi-tasking framework (MTF) administered one hour and three hours following one of four treatments. Both active lemon balm treatments were generally associated with improvements in mood and\/or cognitive performance, though there were some behavioral \u201Ccosts\u201D at other doses and these effects depended to some degree on the delivery matrix."],
	"title": "Anti-Stress Effects of Lemon Balm-Containing Foods",
	"url": "https:\/\/www.ncbi.nlm.nih.gov\/pmc\/articles\/PMC4245564\/"
}]
*/