package com.buffalo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "heart")
public class Heart {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
	 @Column(name="ERR2352817")
	 private double ERR2352817;
	 
	@Column(name="ERR2352973")
	 private double ERR2352973;
	
	@Column(name="ERR2352974")
	 private double ERR2352974;
	
	@Column(name="ERR2352975")
	 private double ERR2352975;
	
	@Column(name="ERR2352976")
	 private double ERR2352976;
	
	@Column(name="ERR2352977")
	 private double ERR2352977;
	
	@Column(name="ERR2352978")
	 private double ERR2352978;
	
	@Column(name="ERR2352979")
	 private double ERR2352979;
	
	@Column(name="ERR2353310")
	 private double ERR2353310;
	
	@Column(name="ERR2353311")
	 private double ERR2353311;
	
	@Column(name="ERR2353312")
	 private double ERR2353312;
	
	@Column(name="ERR2353313")
	 private double ERR2353313;
	
	@Column(name="ERR2353314")
	 private double ERR2353314;
	
	@Column(name="ERR2353315")
	 private double ERR2353315;
	
	@Column(name="ERR2353316")
	 private double ERR2353316;
	
	@Column(name="ERR2353317")
	 private double ERR2353317;
	
	@Column(name="ERR2353318")
	 private double ERR2353318;
	
	@Column(name="ERR2353319")
	 private double ERR2353319;
	
	@Column(name="ERR2353320")
	 private double ERR2353320;
	
	@Column(name="ERR2353321")
	 private double ERR2353321;
	
	@Column(name="ERR2353322")
	 private double ERR2353322;
	
	@Column(name="ERR2353323")
	 private double ERR2353323;
	
	@Column(name="ERR2353324")
	 private double ERR2353324;
	
	@Column(name="ERR2353325")
	 private double ERR2353325;
	
	@Column(name="ERR2353326")
	 private double ERR2353326;
	
	@Column(name="ERR2353327")
	 private double ERR2353327;
	
	@Column(name="ERR2353328")
	 private double ERR2353328;
	
	@Column(name="ERR2353329")
	 private double ERR2353329;
	
	@Column(name="ERR2353330")
	 private double ERR2353330;
	
	@Column(name="ERR2353331")
	 private double ERR2353331;
	
	@Column(name="ERR2353332")
	 private double ERR2353332;
	
	@Column(name="ERR2353510")
	 private double ERR2353510;
	
	@Column(name="ERR2353511")
	 private double ERR2353511;
	
	@Column(name="ERR2353512")
	 private double ERR2353512;
	
	@Column(name="ERR2353513")
	 private double ERR2353513;
	
	@Column(name="ERR2353514")
	 private double ERR2353514;
	
	@Column(name="ERR2353515")
	 private double ERR2353515;
	
	@Column(name="ERR2353516")
	 private double ERR2353516;
	
	@Column(name="ERR2353517")
	 private double ERR2353517;
	
	@Column(name="ERR2353518")
	 private double ERR2353518;
	
	@Column(name="ERR2353652")
	 private double ERR2353652;
	
	@Column(name="ERR2353653")
	 private double ERR2353653;
	
	@Column(name="ERR2353654")
	 private double ERR2353654;
	
	@Column(name="ERR2353655")
	 private double ERR2353655;
	
	@Column(name="ERR2353656")
	 private double ERR2353656;
	
	@Column(name="ERR2353657")
	 private double ERR2353657;
	
	@Column(name="ERR2353658")
	 private double ERR2353658;
	
	@Column(name="ERR2353659")
	 private double ERR2353659;
	
	@Column(name="ERR2353660")
	 private double ERR2353660;
	
	@Column(name="ERR2353815")
	 private double ERR2353815;
	
	@Column(name="ERR2353816")
	 private double ERR2353816;
	
	@Column(name="ERR2353817")
	 private double ERR2353817;
	
	@Column(name="ERR2353818")
	 private double ERR2353818;
	
	@Column(name="ERR2353819")
	 private double ERR2353819;
	
	@Column(name="ERR2353820")
	 private double ERR2353820;
	
	@Column(name="ERR2353821")
	 private double ERR2353821;
	
	@Column(name="ERR2354170")
	 private double ERR2354170;
	
	@Column(name="ERR2354171")
	 private double ERR2354171;
	
	@Column(name="ERR2354172")
	 private double ERR2354172;
	
	@Column(name="ERR2354173")
	 private double ERR2354173;
	
	@Column(name="ERR2354174")
	 private double ERR2354174;
	
	@Column(name="ERR2354175")
	 private double ERR2354175;
	
	@Column(name="ERR2354176")
	 private double ERR2354176;
	
	@Column(name="ERR2354177")
	 private double ERR2354177;
	
	@Column(name="ERR2354178")
	 private double ERR2354178;
	
	@Column(name="ERR2354179")
	 private double ERR2354179;
	
	@Column(name="ERR2354180")
	 private double ERR2354180;
	
	@Column(name="ERR2354181")
	 private double ERR2354181;
	
	@Column(name="ERR2354182")
	 private double ERR2354182;
	
	@Column(name="ERR2354183")
	 private double ERR2354183;
	
	@Column(name="ERR2354184")
	 private double ERR2354184;
	
	@Column(name="ERR2354185")
	 private double ERR2354185;
	
	@Column(name="ERR2354186")
	 private double ERR2354186;
	
	@Column(name="ERR2354187")
	 private double ERR2354187;
	
	@Column(name="ERR2354188")
	 private double ERR2354188;
	
	@Column(name="ERR2354189")
	 private double ERR2354189;
	
	@Column(name="ERR2354190")
	 private double ERR2354190;
	
	@Column(name="ERR2354191")
	 private double ERR2354191;
	
	@Column(name="ERR2354192")
	 private double ERR2354192;
	
	@Column(name="ERR2354329")
	 private double ERR2354329;
	
	@Column(name="ERR2354330")
	 private double ERR2354330;
	
	@Column(name="ERR2354331")
	 private double ERR2354331;
	
	@Column(name="ERR2354332")
	 private double ERR2354332;
	
	@Column(name="ERR2354333")
	 private double ERR2354333;
	
	@Column(name="ERR2354334")
	 private double ERR2354334;
	
	@Column(name="ERR2354335")
	 private double ERR2354335;
	
	@Column(name="ERR2354336")
	 private double ERR2354336;
	
	@Column(name="ERR2354337")
	 private double ERR2354337;
	
	@Column(name="ERR2354566")
	 private double ERR2354566;
	
	@Column(name="ERR2354567")
	 private double ERR2354567;
	
	@Column(name="ERR2354568")
	 private double ERR2354568;
	
	@Column(name="ERR2354569")
	 private double ERR2354569;
	
	@Column(name="ERR2354570")
	 private double ERR2354570;
	
	@Column(name="ERR2354571")
	 private double ERR2354571;
	
	@Column(name="ERR2354572")
	 private double ERR2354572;
	
	@Column(name="ERR2354573")
	 private double ERR2354573;
	
	@Column(name="ERR2354574")
	 private double ERR2354574;
	
	@Column(name="ERR2354575")
	 private double ERR2354575;
	
	@Column(name="ERR2354576")
	 private double ERR2354576;
	
	@Column(name="ERR2354577")
	 private double ERR2354577;
	
	@Column(name="ERR2354578")
	 private double ERR2354578;
	
	@Column(name="ERR2354579")
	 private double ERR2354579;
	
	@Column(name="ERR2354580")
	 private double ERR2354580;
	
	@Column(name="ERR2354581")
	 private double ERR2354581;
	
	@Column(name="ERR2354582")
	 private double ERR2354582;
	
	@Column(name="ERR2354583")
	 private double ERR2354583;
	
	@Column(name="ERR2354584")
	 private double ERR2354584;
	
	@Column(name="ERR2354585")
	 private double ERR2354585;
	
	@Column(name="ERR2354586")
	 private double ERR2354586;
	
	@Column(name="ERR2354587")
	 private double ERR2354587;
	
	@Column(name="ERR2354588")
	 private double ERR2354588;
	
	@Column(name="ERR2354698")
	 private double ERR2354698;
	
	@Column(name="ERR2354699")
	 private double ERR2354699;
	
	@Column(name="ERR2354700")
	 private double ERR2354700;
	
	@Column(name="ERR2354701")
	 private double ERR2354701;
	
	@Column(name="ERR2354702")
	 private double ERR2354702;
	
	@Column(name="ERR2354703")
	 private double ERR2354703;
	
	@Column(name="ERR2354704")
	 private double ERR2354704;
	
	@Column(name="ERR2354705")
	 private double ERR2354705;
	
	@Column(name="ERR2354706")
	 private double ERR2354706;
	
	@Column(name="ERR315631")
	 private double ERR315631;
	
	@Column(name="SRR15721745")
	 private double SRR15721745;
	
	@Column(name="SRR24057939")
	 private double SRR24057939;
	
	@Column(name="SRR24057940")
	 private double SRR24057940;
	
	@Column(name="SRR24057942")
	 private double SRR24057942;
	
	@Column(name="SRR24057943")
	 private double SRR24057943;

	public Heart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Heart(int id, Genes gene, double eRR2352817, double eRR2352973, double eRR2352974, double eRR2352975,
			double eRR2352976, double eRR2352977, double eRR2352978, double eRR2352979, double eRR2353310,
			double eRR2353311, double eRR2353312, double eRR2353313, double eRR2353314, double eRR2353315,
			double eRR2353316, double eRR2353317, double eRR2353318, double eRR2353319, double eRR2353320,
			double eRR2353321, double eRR2353322, double eRR2353323, double eRR2353324, double eRR2353325,
			double eRR2353326, double eRR2353327, double eRR2353328, double eRR2353329, double eRR2353330,
			double eRR2353331, double eRR2353332, double eRR2353510, double eRR2353511, double eRR2353512,
			double eRR2353513, double eRR2353514, double eRR2353515, double eRR2353516, double eRR2353517,
			double eRR2353518, double eRR2353652, double eRR2353653, double eRR2353654, double eRR2353655,
			double eRR2353656, double eRR2353657, double eRR2353658, double eRR2353659, double eRR2353660,
			double eRR2353815, double eRR2353816, double eRR2353817, double eRR2353818, double eRR2353819,
			double eRR2353820, double eRR2353821, double eRR2354170, double eRR2354171, double eRR2354172,
			double eRR2354173, double eRR2354174, double eRR2354175, double eRR2354176, double eRR2354177,
			double eRR2354178, double eRR2354179, double eRR2354180, double eRR2354181, double eRR2354182,
			double eRR2354183, double eRR2354184, double eRR2354185, double eRR2354186, double eRR2354187,
			double eRR2354188, double eRR2354189, double eRR2354190, double eRR2354191, double eRR2354192,
			double eRR2354329, double eRR2354330, double eRR2354331, double eRR2354332, double eRR2354333,
			double eRR2354334, double eRR2354335, double eRR2354336, double eRR2354337, double eRR2354566,
			double eRR2354567, double eRR2354568, double eRR2354569, double eRR2354570, double eRR2354571,
			double eRR2354572, double eRR2354573, double eRR2354574, double eRR2354575, double eRR2354576,
			double eRR2354577, double eRR2354578, double eRR2354579, double eRR2354580, double eRR2354581,
			double eRR2354582, double eRR2354583, double eRR2354584, double eRR2354585, double eRR2354586,
			double eRR2354587, double eRR2354588, double eRR2354698, double eRR2354699, double eRR2354700,
			double eRR2354701, double eRR2354702, double eRR2354703, double eRR2354704, double eRR2354705,
			double eRR2354706, double eRR315631, double sRR15721745, double sRR24057939, double sRR24057940,
			double sRR24057942, double sRR24057943) {
		super();
		this.id = id;
		this.gene = gene;
		ERR2352817 = eRR2352817;
		ERR2352973 = eRR2352973;
		ERR2352974 = eRR2352974;
		ERR2352975 = eRR2352975;
		ERR2352976 = eRR2352976;
		ERR2352977 = eRR2352977;
		ERR2352978 = eRR2352978;
		ERR2352979 = eRR2352979;
		ERR2353310 = eRR2353310;
		ERR2353311 = eRR2353311;
		ERR2353312 = eRR2353312;
		ERR2353313 = eRR2353313;
		ERR2353314 = eRR2353314;
		ERR2353315 = eRR2353315;
		ERR2353316 = eRR2353316;
		ERR2353317 = eRR2353317;
		ERR2353318 = eRR2353318;
		ERR2353319 = eRR2353319;
		ERR2353320 = eRR2353320;
		ERR2353321 = eRR2353321;
		ERR2353322 = eRR2353322;
		ERR2353323 = eRR2353323;
		ERR2353324 = eRR2353324;
		ERR2353325 = eRR2353325;
		ERR2353326 = eRR2353326;
		ERR2353327 = eRR2353327;
		ERR2353328 = eRR2353328;
		ERR2353329 = eRR2353329;
		ERR2353330 = eRR2353330;
		ERR2353331 = eRR2353331;
		ERR2353332 = eRR2353332;
		ERR2353510 = eRR2353510;
		ERR2353511 = eRR2353511;
		ERR2353512 = eRR2353512;
		ERR2353513 = eRR2353513;
		ERR2353514 = eRR2353514;
		ERR2353515 = eRR2353515;
		ERR2353516 = eRR2353516;
		ERR2353517 = eRR2353517;
		ERR2353518 = eRR2353518;
		ERR2353652 = eRR2353652;
		ERR2353653 = eRR2353653;
		ERR2353654 = eRR2353654;
		ERR2353655 = eRR2353655;
		ERR2353656 = eRR2353656;
		ERR2353657 = eRR2353657;
		ERR2353658 = eRR2353658;
		ERR2353659 = eRR2353659;
		ERR2353660 = eRR2353660;
		ERR2353815 = eRR2353815;
		ERR2353816 = eRR2353816;
		ERR2353817 = eRR2353817;
		ERR2353818 = eRR2353818;
		ERR2353819 = eRR2353819;
		ERR2353820 = eRR2353820;
		ERR2353821 = eRR2353821;
		ERR2354170 = eRR2354170;
		ERR2354171 = eRR2354171;
		ERR2354172 = eRR2354172;
		ERR2354173 = eRR2354173;
		ERR2354174 = eRR2354174;
		ERR2354175 = eRR2354175;
		ERR2354176 = eRR2354176;
		ERR2354177 = eRR2354177;
		ERR2354178 = eRR2354178;
		ERR2354179 = eRR2354179;
		ERR2354180 = eRR2354180;
		ERR2354181 = eRR2354181;
		ERR2354182 = eRR2354182;
		ERR2354183 = eRR2354183;
		ERR2354184 = eRR2354184;
		ERR2354185 = eRR2354185;
		ERR2354186 = eRR2354186;
		ERR2354187 = eRR2354187;
		ERR2354188 = eRR2354188;
		ERR2354189 = eRR2354189;
		ERR2354190 = eRR2354190;
		ERR2354191 = eRR2354191;
		ERR2354192 = eRR2354192;
		ERR2354329 = eRR2354329;
		ERR2354330 = eRR2354330;
		ERR2354331 = eRR2354331;
		ERR2354332 = eRR2354332;
		ERR2354333 = eRR2354333;
		ERR2354334 = eRR2354334;
		ERR2354335 = eRR2354335;
		ERR2354336 = eRR2354336;
		ERR2354337 = eRR2354337;
		ERR2354566 = eRR2354566;
		ERR2354567 = eRR2354567;
		ERR2354568 = eRR2354568;
		ERR2354569 = eRR2354569;
		ERR2354570 = eRR2354570;
		ERR2354571 = eRR2354571;
		ERR2354572 = eRR2354572;
		ERR2354573 = eRR2354573;
		ERR2354574 = eRR2354574;
		ERR2354575 = eRR2354575;
		ERR2354576 = eRR2354576;
		ERR2354577 = eRR2354577;
		ERR2354578 = eRR2354578;
		ERR2354579 = eRR2354579;
		ERR2354580 = eRR2354580;
		ERR2354581 = eRR2354581;
		ERR2354582 = eRR2354582;
		ERR2354583 = eRR2354583;
		ERR2354584 = eRR2354584;
		ERR2354585 = eRR2354585;
		ERR2354586 = eRR2354586;
		ERR2354587 = eRR2354587;
		ERR2354588 = eRR2354588;
		ERR2354698 = eRR2354698;
		ERR2354699 = eRR2354699;
		ERR2354700 = eRR2354700;
		ERR2354701 = eRR2354701;
		ERR2354702 = eRR2354702;
		ERR2354703 = eRR2354703;
		ERR2354704 = eRR2354704;
		ERR2354705 = eRR2354705;
		ERR2354706 = eRR2354706;
		ERR315631 = eRR315631;
		SRR15721745 = sRR15721745;
		SRR24057939 = sRR24057939;
		SRR24057940 = sRR24057940;
		SRR24057942 = sRR24057942;
		SRR24057943 = sRR24057943;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Genes getGene() {
		return gene;
	}

	public void setGene(Genes gene) {
		this.gene = gene;
	}

	public double getERR2352817() {
		return ERR2352817;
	}

	public void setERR2352817(double eRR2352817) {
		ERR2352817 = eRR2352817;
	}

	public double getERR2352973() {
		return ERR2352973;
	}

	public void setERR2352973(double eRR2352973) {
		ERR2352973 = eRR2352973;
	}

	public double getERR2352974() {
		return ERR2352974;
	}

	public void setERR2352974(double eRR2352974) {
		ERR2352974 = eRR2352974;
	}

	public double getERR2352975() {
		return ERR2352975;
	}

	public void setERR2352975(double eRR2352975) {
		ERR2352975 = eRR2352975;
	}

	public double getERR2352976() {
		return ERR2352976;
	}

	public void setERR2352976(double eRR2352976) {
		ERR2352976 = eRR2352976;
	}

	public double getERR2352977() {
		return ERR2352977;
	}

	public void setERR2352977(double eRR2352977) {
		ERR2352977 = eRR2352977;
	}

	public double getERR2352978() {
		return ERR2352978;
	}

	public void setERR2352978(double eRR2352978) {
		ERR2352978 = eRR2352978;
	}

	public double getERR2352979() {
		return ERR2352979;
	}

	public void setERR2352979(double eRR2352979) {
		ERR2352979 = eRR2352979;
	}

	public double getERR2353310() {
		return ERR2353310;
	}

	public void setERR2353310(double eRR2353310) {
		ERR2353310 = eRR2353310;
	}

	public double getERR2353311() {
		return ERR2353311;
	}

	public void setERR2353311(double eRR2353311) {
		ERR2353311 = eRR2353311;
	}

	public double getERR2353312() {
		return ERR2353312;
	}

	public void setERR2353312(double eRR2353312) {
		ERR2353312 = eRR2353312;
	}

	public double getERR2353313() {
		return ERR2353313;
	}

	public void setERR2353313(double eRR2353313) {
		ERR2353313 = eRR2353313;
	}

	public double getERR2353314() {
		return ERR2353314;
	}

	public void setERR2353314(double eRR2353314) {
		ERR2353314 = eRR2353314;
	}

	public double getERR2353315() {
		return ERR2353315;
	}

	public void setERR2353315(double eRR2353315) {
		ERR2353315 = eRR2353315;
	}

	public double getERR2353316() {
		return ERR2353316;
	}

	public void setERR2353316(double eRR2353316) {
		ERR2353316 = eRR2353316;
	}

	public double getERR2353317() {
		return ERR2353317;
	}

	public void setERR2353317(double eRR2353317) {
		ERR2353317 = eRR2353317;
	}

	public double getERR2353318() {
		return ERR2353318;
	}

	public void setERR2353318(double eRR2353318) {
		ERR2353318 = eRR2353318;
	}

	public double getERR2353319() {
		return ERR2353319;
	}

	public void setERR2353319(double eRR2353319) {
		ERR2353319 = eRR2353319;
	}

	public double getERR2353320() {
		return ERR2353320;
	}

	public void setERR2353320(double eRR2353320) {
		ERR2353320 = eRR2353320;
	}

	public double getERR2353321() {
		return ERR2353321;
	}

	public void setERR2353321(double eRR2353321) {
		ERR2353321 = eRR2353321;
	}

	public double getERR2353322() {
		return ERR2353322;
	}

	public void setERR2353322(double eRR2353322) {
		ERR2353322 = eRR2353322;
	}

	public double getERR2353323() {
		return ERR2353323;
	}

	public void setERR2353323(double eRR2353323) {
		ERR2353323 = eRR2353323;
	}

	public double getERR2353324() {
		return ERR2353324;
	}

	public void setERR2353324(double eRR2353324) {
		ERR2353324 = eRR2353324;
	}

	public double getERR2353325() {
		return ERR2353325;
	}

	public void setERR2353325(double eRR2353325) {
		ERR2353325 = eRR2353325;
	}

	public double getERR2353326() {
		return ERR2353326;
	}

	public void setERR2353326(double eRR2353326) {
		ERR2353326 = eRR2353326;
	}

	public double getERR2353327() {
		return ERR2353327;
	}

	public void setERR2353327(double eRR2353327) {
		ERR2353327 = eRR2353327;
	}

	public double getERR2353328() {
		return ERR2353328;
	}

	public void setERR2353328(double eRR2353328) {
		ERR2353328 = eRR2353328;
	}

	public double getERR2353329() {
		return ERR2353329;
	}

	public void setERR2353329(double eRR2353329) {
		ERR2353329 = eRR2353329;
	}

	public double getERR2353330() {
		return ERR2353330;
	}

	public void setERR2353330(double eRR2353330) {
		ERR2353330 = eRR2353330;
	}

	public double getERR2353331() {
		return ERR2353331;
	}

	public void setERR2353331(double eRR2353331) {
		ERR2353331 = eRR2353331;
	}

	public double getERR2353332() {
		return ERR2353332;
	}

	public void setERR2353332(double eRR2353332) {
		ERR2353332 = eRR2353332;
	}

	public double getERR2353510() {
		return ERR2353510;
	}

	public void setERR2353510(double eRR2353510) {
		ERR2353510 = eRR2353510;
	}

	public double getERR2353511() {
		return ERR2353511;
	}

	public void setERR2353511(double eRR2353511) {
		ERR2353511 = eRR2353511;
	}

	public double getERR2353512() {
		return ERR2353512;
	}

	public void setERR2353512(double eRR2353512) {
		ERR2353512 = eRR2353512;
	}

	public double getERR2353513() {
		return ERR2353513;
	}

	public void setERR2353513(double eRR2353513) {
		ERR2353513 = eRR2353513;
	}

	public double getERR2353514() {
		return ERR2353514;
	}

	public void setERR2353514(double eRR2353514) {
		ERR2353514 = eRR2353514;
	}

	public double getERR2353515() {
		return ERR2353515;
	}

	public void setERR2353515(double eRR2353515) {
		ERR2353515 = eRR2353515;
	}

	public double getERR2353516() {
		return ERR2353516;
	}

	public void setERR2353516(double eRR2353516) {
		ERR2353516 = eRR2353516;
	}

	public double getERR2353517() {
		return ERR2353517;
	}

	public void setERR2353517(double eRR2353517) {
		ERR2353517 = eRR2353517;
	}

	public double getERR2353518() {
		return ERR2353518;
	}

	public void setERR2353518(double eRR2353518) {
		ERR2353518 = eRR2353518;
	}

	public double getERR2353652() {
		return ERR2353652;
	}

	public void setERR2353652(double eRR2353652) {
		ERR2353652 = eRR2353652;
	}

	public double getERR2353653() {
		return ERR2353653;
	}

	public void setERR2353653(double eRR2353653) {
		ERR2353653 = eRR2353653;
	}

	public double getERR2353654() {
		return ERR2353654;
	}

	public void setERR2353654(double eRR2353654) {
		ERR2353654 = eRR2353654;
	}

	public double getERR2353655() {
		return ERR2353655;
	}

	public void setERR2353655(double eRR2353655) {
		ERR2353655 = eRR2353655;
	}

	public double getERR2353656() {
		return ERR2353656;
	}

	public void setERR2353656(double eRR2353656) {
		ERR2353656 = eRR2353656;
	}

	public double getERR2353657() {
		return ERR2353657;
	}

	public void setERR2353657(double eRR2353657) {
		ERR2353657 = eRR2353657;
	}

	public double getERR2353658() {
		return ERR2353658;
	}

	public void setERR2353658(double eRR2353658) {
		ERR2353658 = eRR2353658;
	}

	public double getERR2353659() {
		return ERR2353659;
	}

	public void setERR2353659(double eRR2353659) {
		ERR2353659 = eRR2353659;
	}

	public double getERR2353660() {
		return ERR2353660;
	}

	public void setERR2353660(double eRR2353660) {
		ERR2353660 = eRR2353660;
	}

	public double getERR2353815() {
		return ERR2353815;
	}

	public void setERR2353815(double eRR2353815) {
		ERR2353815 = eRR2353815;
	}

	public double getERR2353816() {
		return ERR2353816;
	}

	public void setERR2353816(double eRR2353816) {
		ERR2353816 = eRR2353816;
	}

	public double getERR2353817() {
		return ERR2353817;
	}

	public void setERR2353817(double eRR2353817) {
		ERR2353817 = eRR2353817;
	}

	public double getERR2353818() {
		return ERR2353818;
	}

	public void setERR2353818(double eRR2353818) {
		ERR2353818 = eRR2353818;
	}

	public double getERR2353819() {
		return ERR2353819;
	}

	public void setERR2353819(double eRR2353819) {
		ERR2353819 = eRR2353819;
	}

	public double getERR2353820() {
		return ERR2353820;
	}

	public void setERR2353820(double eRR2353820) {
		ERR2353820 = eRR2353820;
	}

	public double getERR2353821() {
		return ERR2353821;
	}

	public void setERR2353821(double eRR2353821) {
		ERR2353821 = eRR2353821;
	}

	public double getERR2354170() {
		return ERR2354170;
	}

	public void setERR2354170(double eRR2354170) {
		ERR2354170 = eRR2354170;
	}

	public double getERR2354171() {
		return ERR2354171;
	}

	public void setERR2354171(double eRR2354171) {
		ERR2354171 = eRR2354171;
	}

	public double getERR2354172() {
		return ERR2354172;
	}

	public void setERR2354172(double eRR2354172) {
		ERR2354172 = eRR2354172;
	}

	public double getERR2354173() {
		return ERR2354173;
	}

	public void setERR2354173(double eRR2354173) {
		ERR2354173 = eRR2354173;
	}

	public double getERR2354174() {
		return ERR2354174;
	}

	public void setERR2354174(double eRR2354174) {
		ERR2354174 = eRR2354174;
	}

	public double getERR2354175() {
		return ERR2354175;
	}

	public void setERR2354175(double eRR2354175) {
		ERR2354175 = eRR2354175;
	}

	public double getERR2354176() {
		return ERR2354176;
	}

	public void setERR2354176(double eRR2354176) {
		ERR2354176 = eRR2354176;
	}

	public double getERR2354177() {
		return ERR2354177;
	}

	public void setERR2354177(double eRR2354177) {
		ERR2354177 = eRR2354177;
	}

	public double getERR2354178() {
		return ERR2354178;
	}

	public void setERR2354178(double eRR2354178) {
		ERR2354178 = eRR2354178;
	}

	public double getERR2354179() {
		return ERR2354179;
	}

	public void setERR2354179(double eRR2354179) {
		ERR2354179 = eRR2354179;
	}

	public double getERR2354180() {
		return ERR2354180;
	}

	public void setERR2354180(double eRR2354180) {
		ERR2354180 = eRR2354180;
	}

	public double getERR2354181() {
		return ERR2354181;
	}

	public void setERR2354181(double eRR2354181) {
		ERR2354181 = eRR2354181;
	}

	public double getERR2354182() {
		return ERR2354182;
	}

	public void setERR2354182(double eRR2354182) {
		ERR2354182 = eRR2354182;
	}

	public double getERR2354183() {
		return ERR2354183;
	}

	public void setERR2354183(double eRR2354183) {
		ERR2354183 = eRR2354183;
	}

	public double getERR2354184() {
		return ERR2354184;
	}

	public void setERR2354184(double eRR2354184) {
		ERR2354184 = eRR2354184;
	}

	public double getERR2354185() {
		return ERR2354185;
	}

	public void setERR2354185(double eRR2354185) {
		ERR2354185 = eRR2354185;
	}

	public double getERR2354186() {
		return ERR2354186;
	}

	public void setERR2354186(double eRR2354186) {
		ERR2354186 = eRR2354186;
	}

	public double getERR2354187() {
		return ERR2354187;
	}

	public void setERR2354187(double eRR2354187) {
		ERR2354187 = eRR2354187;
	}

	public double getERR2354188() {
		return ERR2354188;
	}

	public void setERR2354188(double eRR2354188) {
		ERR2354188 = eRR2354188;
	}

	public double getERR2354189() {
		return ERR2354189;
	}

	public void setERR2354189(double eRR2354189) {
		ERR2354189 = eRR2354189;
	}

	public double getERR2354190() {
		return ERR2354190;
	}

	public void setERR2354190(double eRR2354190) {
		ERR2354190 = eRR2354190;
	}

	public double getERR2354191() {
		return ERR2354191;
	}

	public void setERR2354191(double eRR2354191) {
		ERR2354191 = eRR2354191;
	}

	public double getERR2354192() {
		return ERR2354192;
	}

	public void setERR2354192(double eRR2354192) {
		ERR2354192 = eRR2354192;
	}

	public double getERR2354329() {
		return ERR2354329;
	}

	public void setERR2354329(double eRR2354329) {
		ERR2354329 = eRR2354329;
	}

	public double getERR2354330() {
		return ERR2354330;
	}

	public void setERR2354330(double eRR2354330) {
		ERR2354330 = eRR2354330;
	}

	public double getERR2354331() {
		return ERR2354331;
	}

	public void setERR2354331(double eRR2354331) {
		ERR2354331 = eRR2354331;
	}

	public double getERR2354332() {
		return ERR2354332;
	}

	public void setERR2354332(double eRR2354332) {
		ERR2354332 = eRR2354332;
	}

	public double getERR2354333() {
		return ERR2354333;
	}

	public void setERR2354333(double eRR2354333) {
		ERR2354333 = eRR2354333;
	}

	public double getERR2354334() {
		return ERR2354334;
	}

	public void setERR2354334(double eRR2354334) {
		ERR2354334 = eRR2354334;
	}

	public double getERR2354335() {
		return ERR2354335;
	}

	public void setERR2354335(double eRR2354335) {
		ERR2354335 = eRR2354335;
	}

	public double getERR2354336() {
		return ERR2354336;
	}

	public void setERR2354336(double eRR2354336) {
		ERR2354336 = eRR2354336;
	}

	public double getERR2354337() {
		return ERR2354337;
	}

	public void setERR2354337(double eRR2354337) {
		ERR2354337 = eRR2354337;
	}

	public double getERR2354566() {
		return ERR2354566;
	}

	public void setERR2354566(double eRR2354566) {
		ERR2354566 = eRR2354566;
	}

	public double getERR2354567() {
		return ERR2354567;
	}

	public void setERR2354567(double eRR2354567) {
		ERR2354567 = eRR2354567;
	}

	public double getERR2354568() {
		return ERR2354568;
	}

	public void setERR2354568(double eRR2354568) {
		ERR2354568 = eRR2354568;
	}

	public double getERR2354569() {
		return ERR2354569;
	}

	public void setERR2354569(double eRR2354569) {
		ERR2354569 = eRR2354569;
	}

	public double getERR2354570() {
		return ERR2354570;
	}

	public void setERR2354570(double eRR2354570) {
		ERR2354570 = eRR2354570;
	}

	public double getERR2354571() {
		return ERR2354571;
	}

	public void setERR2354571(double eRR2354571) {
		ERR2354571 = eRR2354571;
	}

	public double getERR2354572() {
		return ERR2354572;
	}

	public void setERR2354572(double eRR2354572) {
		ERR2354572 = eRR2354572;
	}

	public double getERR2354573() {
		return ERR2354573;
	}

	public void setERR2354573(double eRR2354573) {
		ERR2354573 = eRR2354573;
	}

	public double getERR2354574() {
		return ERR2354574;
	}

	public void setERR2354574(double eRR2354574) {
		ERR2354574 = eRR2354574;
	}

	public double getERR2354575() {
		return ERR2354575;
	}

	public void setERR2354575(double eRR2354575) {
		ERR2354575 = eRR2354575;
	}

	public double getERR2354576() {
		return ERR2354576;
	}

	public void setERR2354576(double eRR2354576) {
		ERR2354576 = eRR2354576;
	}

	public double getERR2354577() {
		return ERR2354577;
	}

	public void setERR2354577(double eRR2354577) {
		ERR2354577 = eRR2354577;
	}

	public double getERR2354578() {
		return ERR2354578;
	}

	public void setERR2354578(double eRR2354578) {
		ERR2354578 = eRR2354578;
	}

	public double getERR2354579() {
		return ERR2354579;
	}

	public void setERR2354579(double eRR2354579) {
		ERR2354579 = eRR2354579;
	}

	public double getERR2354580() {
		return ERR2354580;
	}

	public void setERR2354580(double eRR2354580) {
		ERR2354580 = eRR2354580;
	}

	public double getERR2354581() {
		return ERR2354581;
	}

	public void setERR2354581(double eRR2354581) {
		ERR2354581 = eRR2354581;
	}

	public double getERR2354582() {
		return ERR2354582;
	}

	public void setERR2354582(double eRR2354582) {
		ERR2354582 = eRR2354582;
	}

	public double getERR2354583() {
		return ERR2354583;
	}

	public void setERR2354583(double eRR2354583) {
		ERR2354583 = eRR2354583;
	}

	public double getERR2354584() {
		return ERR2354584;
	}

	public void setERR2354584(double eRR2354584) {
		ERR2354584 = eRR2354584;
	}

	public double getERR2354585() {
		return ERR2354585;
	}

	public void setERR2354585(double eRR2354585) {
		ERR2354585 = eRR2354585;
	}

	public double getERR2354586() {
		return ERR2354586;
	}

	public void setERR2354586(double eRR2354586) {
		ERR2354586 = eRR2354586;
	}

	public double getERR2354587() {
		return ERR2354587;
	}

	public void setERR2354587(double eRR2354587) {
		ERR2354587 = eRR2354587;
	}

	public double getERR2354588() {
		return ERR2354588;
	}

	public void setERR2354588(double eRR2354588) {
		ERR2354588 = eRR2354588;
	}

	public double getERR2354698() {
		return ERR2354698;
	}

	public void setERR2354698(double eRR2354698) {
		ERR2354698 = eRR2354698;
	}

	public double getERR2354699() {
		return ERR2354699;
	}

	public void setERR2354699(double eRR2354699) {
		ERR2354699 = eRR2354699;
	}

	public double getERR2354700() {
		return ERR2354700;
	}

	public void setERR2354700(double eRR2354700) {
		ERR2354700 = eRR2354700;
	}

	public double getERR2354701() {
		return ERR2354701;
	}

	public void setERR2354701(double eRR2354701) {
		ERR2354701 = eRR2354701;
	}

	public double getERR2354702() {
		return ERR2354702;
	}

	public void setERR2354702(double eRR2354702) {
		ERR2354702 = eRR2354702;
	}

	public double getERR2354703() {
		return ERR2354703;
	}

	public void setERR2354703(double eRR2354703) {
		ERR2354703 = eRR2354703;
	}

	public double getERR2354704() {
		return ERR2354704;
	}

	public void setERR2354704(double eRR2354704) {
		ERR2354704 = eRR2354704;
	}

	public double getERR2354705() {
		return ERR2354705;
	}

	public void setERR2354705(double eRR2354705) {
		ERR2354705 = eRR2354705;
	}

	public double getERR2354706() {
		return ERR2354706;
	}

	public void setERR2354706(double eRR2354706) {
		ERR2354706 = eRR2354706;
	}

	public double getERR315631() {
		return ERR315631;
	}

	public void setERR315631(double eRR315631) {
		ERR315631 = eRR315631;
	}

	public double getSRR15721745() {
		return SRR15721745;
	}

	public void setSRR15721745(double sRR15721745) {
		SRR15721745 = sRR15721745;
	}

	public double getSRR24057939() {
		return SRR24057939;
	}

	public void setSRR24057939(double sRR24057939) {
		SRR24057939 = sRR24057939;
	}

	public double getSRR24057940() {
		return SRR24057940;
	}

	public void setSRR24057940(double sRR24057940) {
		SRR24057940 = sRR24057940;
	}

	public double getSRR24057942() {
		return SRR24057942;
	}

	public void setSRR24057942(double sRR24057942) {
		SRR24057942 = sRR24057942;
	}

	public double getSRR24057943() {
		return SRR24057943;
	}

	public void setSRR24057943(double sRR24057943) {
		SRR24057943 = sRR24057943;
	}

	@Override
	public String toString() {
		return "Heart [id=" + id + ", gene=" + gene + ", ERR2352817=" + ERR2352817 + ", ERR2352973=" + ERR2352973
				+ ", ERR2352974=" + ERR2352974 + ", ERR2352975=" + ERR2352975 + ", ERR2352976=" + ERR2352976
				+ ", ERR2352977=" + ERR2352977 + ", ERR2352978=" + ERR2352978 + ", ERR2352979=" + ERR2352979
				+ ", ERR2353310=" + ERR2353310 + ", ERR2353311=" + ERR2353311 + ", ERR2353312=" + ERR2353312
				+ ", ERR2353313=" + ERR2353313 + ", ERR2353314=" + ERR2353314 + ", ERR2353315=" + ERR2353315
				+ ", ERR2353316=" + ERR2353316 + ", ERR2353317=" + ERR2353317 + ", ERR2353318=" + ERR2353318
				+ ", ERR2353319=" + ERR2353319 + ", ERR2353320=" + ERR2353320 + ", ERR2353321=" + ERR2353321
				+ ", ERR2353322=" + ERR2353322 + ", ERR2353323=" + ERR2353323 + ", ERR2353324=" + ERR2353324
				+ ", ERR2353325=" + ERR2353325 + ", ERR2353326=" + ERR2353326 + ", ERR2353327=" + ERR2353327
				+ ", ERR2353328=" + ERR2353328 + ", ERR2353329=" + ERR2353329 + ", ERR2353330=" + ERR2353330
				+ ", ERR2353331=" + ERR2353331 + ", ERR2353332=" + ERR2353332 + ", ERR2353510=" + ERR2353510
				+ ", ERR2353511=" + ERR2353511 + ", ERR2353512=" + ERR2353512 + ", ERR2353513=" + ERR2353513
				+ ", ERR2353514=" + ERR2353514 + ", ERR2353515=" + ERR2353515 + ", ERR2353516=" + ERR2353516
				+ ", ERR2353517=" + ERR2353517 + ", ERR2353518=" + ERR2353518 + ", ERR2353652=" + ERR2353652
				+ ", ERR2353653=" + ERR2353653 + ", ERR2353654=" + ERR2353654 + ", ERR2353655=" + ERR2353655
				+ ", ERR2353656=" + ERR2353656 + ", ERR2353657=" + ERR2353657 + ", ERR2353658=" + ERR2353658
				+ ", ERR2353659=" + ERR2353659 + ", ERR2353660=" + ERR2353660 + ", ERR2353815=" + ERR2353815
				+ ", ERR2353816=" + ERR2353816 + ", ERR2353817=" + ERR2353817 + ", ERR2353818=" + ERR2353818
				+ ", ERR2353819=" + ERR2353819 + ", ERR2353820=" + ERR2353820 + ", ERR2353821=" + ERR2353821
				+ ", ERR2354170=" + ERR2354170 + ", ERR2354171=" + ERR2354171 + ", ERR2354172=" + ERR2354172
				+ ", ERR2354173=" + ERR2354173 + ", ERR2354174=" + ERR2354174 + ", ERR2354175=" + ERR2354175
				+ ", ERR2354176=" + ERR2354176 + ", ERR2354177=" + ERR2354177 + ", ERR2354178=" + ERR2354178
				+ ", ERR2354179=" + ERR2354179 + ", ERR2354180=" + ERR2354180 + ", ERR2354181=" + ERR2354181
				+ ", ERR2354182=" + ERR2354182 + ", ERR2354183=" + ERR2354183 + ", ERR2354184=" + ERR2354184
				+ ", ERR2354185=" + ERR2354185 + ", ERR2354186=" + ERR2354186 + ", ERR2354187=" + ERR2354187
				+ ", ERR2354188=" + ERR2354188 + ", ERR2354189=" + ERR2354189 + ", ERR2354190=" + ERR2354190
				+ ", ERR2354191=" + ERR2354191 + ", ERR2354192=" + ERR2354192 + ", ERR2354329=" + ERR2354329
				+ ", ERR2354330=" + ERR2354330 + ", ERR2354331=" + ERR2354331 + ", ERR2354332=" + ERR2354332
				+ ", ERR2354333=" + ERR2354333 + ", ERR2354334=" + ERR2354334 + ", ERR2354335=" + ERR2354335
				+ ", ERR2354336=" + ERR2354336 + ", ERR2354337=" + ERR2354337 + ", ERR2354566=" + ERR2354566
				+ ", ERR2354567=" + ERR2354567 + ", ERR2354568=" + ERR2354568 + ", ERR2354569=" + ERR2354569
				+ ", ERR2354570=" + ERR2354570 + ", ERR2354571=" + ERR2354571 + ", ERR2354572=" + ERR2354572
				+ ", ERR2354573=" + ERR2354573 + ", ERR2354574=" + ERR2354574 + ", ERR2354575=" + ERR2354575
				+ ", ERR2354576=" + ERR2354576 + ", ERR2354577=" + ERR2354577 + ", ERR2354578=" + ERR2354578
				+ ", ERR2354579=" + ERR2354579 + ", ERR2354580=" + ERR2354580 + ", ERR2354581=" + ERR2354581
				+ ", ERR2354582=" + ERR2354582 + ", ERR2354583=" + ERR2354583 + ", ERR2354584=" + ERR2354584
				+ ", ERR2354585=" + ERR2354585 + ", ERR2354586=" + ERR2354586 + ", ERR2354587=" + ERR2354587
				+ ", ERR2354588=" + ERR2354588 + ", ERR2354698=" + ERR2354698 + ", ERR2354699=" + ERR2354699
				+ ", ERR2354700=" + ERR2354700 + ", ERR2354701=" + ERR2354701 + ", ERR2354702=" + ERR2354702
				+ ", ERR2354703=" + ERR2354703 + ", ERR2354704=" + ERR2354704 + ", ERR2354705=" + ERR2354705
				+ ", ERR2354706=" + ERR2354706 + ", ERR315631=" + ERR315631 + ", SRR15721745=" + SRR15721745
				+ ", SRR24057939=" + SRR24057939 + ", SRR24057940=" + SRR24057940 + ", SRR24057942=" + SRR24057942
				+ ", SRR24057943=" + SRR24057943 + "]";
	}
}
