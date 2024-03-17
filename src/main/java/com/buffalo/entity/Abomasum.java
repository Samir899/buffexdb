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
@Table(name = "abomasum")
public class Abomasum {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
	 @Column(name="ERR2352761")
	 private double ERR2352761;
	 
	@Column(name="ERR2352762")
	 private double ERR2352762;
	
	@Column(name="ERR2352763")
	 private double ERR2352763;
	
	@Column(name="ERR2352764")
	 private double ERR2352764;
	
	@Column(name="ERR2352765")
	 private double ERR2352765;
	
	@Column(name="ERR2352766")
	 private double ERR2352766;
	
	@Column(name="ERR2352767")
	 private double ERR2352767;
	
	@Column(name="ERR2353041")
	 private double ERR2353041;
	
	@Column(name="ERR2353042")
	 private double ERR2353042;
	
	@Column(name="ERR2353043")
	 private double ERR2353043;
	
	@Column(name="ERR2353044")
	 private double ERR2353044;
	
	@Column(name="ERR2353045")
	 private double ERR2353045;
	
	@Column(name="ERR2353046")
	 private double ERR2353046;
	
	@Column(name="ERR2353047")
	 private double ERR2353047;
	
	@Column(name="ERR2353048")
	 private double ERR2353048;
	
	@Column(name="ERR2353049")
	 private double ERR2353049;
	
	@Column(name="ERR2353596")
	 private double ERR2353596;
	
	@Column(name="ERR2353597")
	 private double ERR2353597;
	
	@Column(name="ERR2353598")
	 private double ERR2353598;
	
	@Column(name="ERR2353599")
	 private double ERR2353599;
	
	@Column(name="ERR2353600")
	 private double ERR2353600;
	
	@Column(name="ERR2353601")
	 private double ERR2353601;
	
	@Column(name="ERR2353602")
	 private double ERR2353602;
	
	@Column(name="ERR2353910")
	 private double ERR2353910;
	
	@Column(name="ERR2353911")
	 private double ERR2353911;
	
	@Column(name="ERR2353912")
	 private double ERR2353912;
	
	@Column(name="ERR2353913")
	 private double ERR2353913;
	
	@Column(name="ERR2353914")
	 private double ERR2353914;
	
	@Column(name="ERR2353915")
	 private double ERR2353915;
	
	@Column(name="ERR2353916")
	 private double ERR2353916;
	
	@Column(name="ERR2353917")
	 private double ERR2353917;
	
	@Column(name="ERR2353918")
	 private double ERR2353918;
	
	@Column(name="ERR2354429")
	 private double ERR2354429;
	
	@Column(name="ERR2354430")
	 private double ERR2354430;
	
	@Column(name="ERR2354431")
	 private double ERR2354431;
	
	@Column(name="ERR2354432")
	 private double ERR2354432;
	
	@Column(name="ERR2354433")
	 private double ERR2354433;
	
	@Column(name="ERR2354434")
	 private double ERR2354434;
	
	@Column(name="ERR2354435")
	 private double ERR2354435;
	
	@Column(name="ERR2354436")
	 private double ERR2354436;
	
	@Column(name="ERR2354437")
	 private double ERR2354437;
	
	@Column(name="ERR2354716")
	 private double ERR2354716;
	
	@Column(name="ERR2354717")
	 private double ERR2354717;
	
	@Column(name="ERR2354718")
	 private double ERR2354718;
	
	@Column(name="ERR2354719")
	 private double ERR2354719;
	
	@Column(name="ERR2354720")
	 private double ERR2354720;
	
	@Column(name="ERR2354721")
	 private double ERR2354721;
	
	@Column(name="ERR2354722")
	 private double ERR2354722;
	
	@Column(name="ERR2354723")
	 private double ERR2354723;
	
	@Column(name="ERR2354724")
	 private double ERR2354724;
	
	@Column(name="ERR2354921")
	 private double ERR2354921;
	
	@Column(name="ERR2354922")
	 private double ERR2354922;
	
	@Column(name="ERR2354923")
	 private double ERR2354923;
	
	@Column(name="ERR2354924")
	 private double ERR2354924;
	
	@Column(name="ERR2354925")
	 private double ERR2354925;
	
	@Column(name="ERR2354926")
	 private double ERR2354926;
	
	@Column(name="ERR2354927")
	 private double ERR2354927;
	
	@Column(name="ERR2354928")
	 private double ERR2354928;
	
	@Column(name="ERR2354929")
	 private double ERR2354929;
	
	@Column(name="ERR315618")
	 private double ERR315618;
	
	public Abomasum() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Abomasum(int id, Genes gene, double eRR2352761, double eRR2352762, double eRR2352763, double eRR2352764,
			double eRR2352765, double eRR2352766, double eRR2352767, double eRR2353041, double eRR2353042,
			double eRR2353043, double eRR2353044, double eRR2353045, double eRR2353046, double eRR2353047,
			double eRR2353048, double eRR2353049, double eRR2353596, double eRR2353597, double eRR2353598,
			double eRR2353599, double eRR2353600, double eRR2353601, double eRR2353602, double eRR2353910,
			double eRR2353911, double eRR2353912, double eRR2353913, double eRR2353914, double eRR2353915,
			double eRR2353916, double eRR2353917, double eRR2353918, double eRR2354429, double eRR2354430,
			double eRR2354431, double eRR2354432, double eRR2354433, double eRR2354434, double eRR2354435,
			double eRR2354436, double eRR2354437, double eRR2354716, double eRR2354717, double eRR2354718,
			double eRR2354719, double eRR2354720, double eRR2354721, double eRR2354722, double eRR2354723,
			double eRR2354724, double eRR2354921, double eRR2354922, double eRR2354923, double eRR2354924,
			double eRR2354925, double eRR2354926, double eRR2354927, double eRR2354928, double eRR2354929,
			double eRR315618) {
		super();
		this.id = id;
		this.gene = gene;
		ERR2352761 = eRR2352761;
		ERR2352762 = eRR2352762;
		ERR2352763 = eRR2352763;
		ERR2352764 = eRR2352764;
		ERR2352765 = eRR2352765;
		ERR2352766 = eRR2352766;
		ERR2352767 = eRR2352767;
		ERR2353041 = eRR2353041;
		ERR2353042 = eRR2353042;
		ERR2353043 = eRR2353043;
		ERR2353044 = eRR2353044;
		ERR2353045 = eRR2353045;
		ERR2353046 = eRR2353046;
		ERR2353047 = eRR2353047;
		ERR2353048 = eRR2353048;
		ERR2353049 = eRR2353049;
		ERR2353596 = eRR2353596;
		ERR2353597 = eRR2353597;
		ERR2353598 = eRR2353598;
		ERR2353599 = eRR2353599;
		ERR2353600 = eRR2353600;
		ERR2353601 = eRR2353601;
		ERR2353602 = eRR2353602;
		ERR2353910 = eRR2353910;
		ERR2353911 = eRR2353911;
		ERR2353912 = eRR2353912;
		ERR2353913 = eRR2353913;
		ERR2353914 = eRR2353914;
		ERR2353915 = eRR2353915;
		ERR2353916 = eRR2353916;
		ERR2353917 = eRR2353917;
		ERR2353918 = eRR2353918;
		ERR2354429 = eRR2354429;
		ERR2354430 = eRR2354430;
		ERR2354431 = eRR2354431;
		ERR2354432 = eRR2354432;
		ERR2354433 = eRR2354433;
		ERR2354434 = eRR2354434;
		ERR2354435 = eRR2354435;
		ERR2354436 = eRR2354436;
		ERR2354437 = eRR2354437;
		ERR2354716 = eRR2354716;
		ERR2354717 = eRR2354717;
		ERR2354718 = eRR2354718;
		ERR2354719 = eRR2354719;
		ERR2354720 = eRR2354720;
		ERR2354721 = eRR2354721;
		ERR2354722 = eRR2354722;
		ERR2354723 = eRR2354723;
		ERR2354724 = eRR2354724;
		ERR2354921 = eRR2354921;
		ERR2354922 = eRR2354922;
		ERR2354923 = eRR2354923;
		ERR2354924 = eRR2354924;
		ERR2354925 = eRR2354925;
		ERR2354926 = eRR2354926;
		ERR2354927 = eRR2354927;
		ERR2354928 = eRR2354928;
		ERR2354929 = eRR2354929;
		ERR315618 = eRR315618;
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

	public double getERR2352761() {
		return ERR2352761;
	}

	public void setERR2352761(double eRR2352761) {
		ERR2352761 = eRR2352761;
	}

	public double getERR2352762() {
		return ERR2352762;
	}

	public void setERR2352762(double eRR2352762) {
		ERR2352762 = eRR2352762;
	}

	public double getERR2352763() {
		return ERR2352763;
	}

	public void setERR2352763(double eRR2352763) {
		ERR2352763 = eRR2352763;
	}

	public double getERR2352764() {
		return ERR2352764;
	}

	public void setERR2352764(double eRR2352764) {
		ERR2352764 = eRR2352764;
	}

	public double getERR2352765() {
		return ERR2352765;
	}

	public void setERR2352765(double eRR2352765) {
		ERR2352765 = eRR2352765;
	}

	public double getERR2352766() {
		return ERR2352766;
	}

	public void setERR2352766(double eRR2352766) {
		ERR2352766 = eRR2352766;
	}

	public double getERR2352767() {
		return ERR2352767;
	}

	public void setERR2352767(double eRR2352767) {
		ERR2352767 = eRR2352767;
	}

	public double getERR2353041() {
		return ERR2353041;
	}

	public void setERR2353041(double eRR2353041) {
		ERR2353041 = eRR2353041;
	}

	public double getERR2353042() {
		return ERR2353042;
	}

	public void setERR2353042(double eRR2353042) {
		ERR2353042 = eRR2353042;
	}

	public double getERR2353043() {
		return ERR2353043;
	}

	public void setERR2353043(double eRR2353043) {
		ERR2353043 = eRR2353043;
	}

	public double getERR2353044() {
		return ERR2353044;
	}

	public void setERR2353044(double eRR2353044) {
		ERR2353044 = eRR2353044;
	}

	public double getERR2353045() {
		return ERR2353045;
	}

	public void setERR2353045(double eRR2353045) {
		ERR2353045 = eRR2353045;
	}

	public double getERR2353046() {
		return ERR2353046;
	}

	public void setERR2353046(double eRR2353046) {
		ERR2353046 = eRR2353046;
	}

	public double getERR2353047() {
		return ERR2353047;
	}

	public void setERR2353047(double eRR2353047) {
		ERR2353047 = eRR2353047;
	}

	public double getERR2353048() {
		return ERR2353048;
	}

	public void setERR2353048(double eRR2353048) {
		ERR2353048 = eRR2353048;
	}

	public double getERR2353049() {
		return ERR2353049;
	}

	public void setERR2353049(double eRR2353049) {
		ERR2353049 = eRR2353049;
	}

	public double getERR2353596() {
		return ERR2353596;
	}

	public void setERR2353596(double eRR2353596) {
		ERR2353596 = eRR2353596;
	}

	public double getERR2353597() {
		return ERR2353597;
	}

	public void setERR2353597(double eRR2353597) {
		ERR2353597 = eRR2353597;
	}

	public double getERR2353598() {
		return ERR2353598;
	}

	public void setERR2353598(double eRR2353598) {
		ERR2353598 = eRR2353598;
	}

	public double getERR2353599() {
		return ERR2353599;
	}

	public void setERR2353599(double eRR2353599) {
		ERR2353599 = eRR2353599;
	}

	public double getERR2353600() {
		return ERR2353600;
	}

	public void setERR2353600(double eRR2353600) {
		ERR2353600 = eRR2353600;
	}

	public double getERR2353601() {
		return ERR2353601;
	}

	public void setERR2353601(double eRR2353601) {
		ERR2353601 = eRR2353601;
	}

	public double getERR2353602() {
		return ERR2353602;
	}

	public void setERR2353602(double eRR2353602) {
		ERR2353602 = eRR2353602;
	}

	public double getERR2353910() {
		return ERR2353910;
	}

	public void setERR2353910(double eRR2353910) {
		ERR2353910 = eRR2353910;
	}

	public double getERR2353911() {
		return ERR2353911;
	}

	public void setERR2353911(double eRR2353911) {
		ERR2353911 = eRR2353911;
	}

	public double getERR2353912() {
		return ERR2353912;
	}

	public void setERR2353912(double eRR2353912) {
		ERR2353912 = eRR2353912;
	}

	public double getERR2353913() {
		return ERR2353913;
	}

	public void setERR2353913(double eRR2353913) {
		ERR2353913 = eRR2353913;
	}

	public double getERR2353914() {
		return ERR2353914;
	}

	public void setERR2353914(double eRR2353914) {
		ERR2353914 = eRR2353914;
	}

	public double getERR2353915() {
		return ERR2353915;
	}

	public void setERR2353915(double eRR2353915) {
		ERR2353915 = eRR2353915;
	}

	public double getERR2353916() {
		return ERR2353916;
	}

	public void setERR2353916(double eRR2353916) {
		ERR2353916 = eRR2353916;
	}

	public double getERR2353917() {
		return ERR2353917;
	}

	public void setERR2353917(double eRR2353917) {
		ERR2353917 = eRR2353917;
	}

	public double getERR2353918() {
		return ERR2353918;
	}

	public void setERR2353918(double eRR2353918) {
		ERR2353918 = eRR2353918;
	}

	public double getERR2354429() {
		return ERR2354429;
	}

	public void setERR2354429(double eRR2354429) {
		ERR2354429 = eRR2354429;
	}

	public double getERR2354430() {
		return ERR2354430;
	}

	public void setERR2354430(double eRR2354430) {
		ERR2354430 = eRR2354430;
	}

	public double getERR2354431() {
		return ERR2354431;
	}

	public void setERR2354431(double eRR2354431) {
		ERR2354431 = eRR2354431;
	}

	public double getERR2354432() {
		return ERR2354432;
	}

	public void setERR2354432(double eRR2354432) {
		ERR2354432 = eRR2354432;
	}

	public double getERR2354433() {
		return ERR2354433;
	}

	public void setERR2354433(double eRR2354433) {
		ERR2354433 = eRR2354433;
	}

	public double getERR2354434() {
		return ERR2354434;
	}

	public void setERR2354434(double eRR2354434) {
		ERR2354434 = eRR2354434;
	}

	public double getERR2354435() {
		return ERR2354435;
	}

	public void setERR2354435(double eRR2354435) {
		ERR2354435 = eRR2354435;
	}

	public double getERR2354436() {
		return ERR2354436;
	}

	public void setERR2354436(double eRR2354436) {
		ERR2354436 = eRR2354436;
	}

	public double getERR2354437() {
		return ERR2354437;
	}

	public void setERR2354437(double eRR2354437) {
		ERR2354437 = eRR2354437;
	}

	public double getERR2354716() {
		return ERR2354716;
	}

	public void setERR2354716(double eRR2354716) {
		ERR2354716 = eRR2354716;
	}

	public double getERR2354717() {
		return ERR2354717;
	}

	public void setERR2354717(double eRR2354717) {
		ERR2354717 = eRR2354717;
	}

	public double getERR2354718() {
		return ERR2354718;
	}

	public void setERR2354718(double eRR2354718) {
		ERR2354718 = eRR2354718;
	}

	public double getERR2354719() {
		return ERR2354719;
	}

	public void setERR2354719(double eRR2354719) {
		ERR2354719 = eRR2354719;
	}

	public double getERR2354720() {
		return ERR2354720;
	}

	public void setERR2354720(double eRR2354720) {
		ERR2354720 = eRR2354720;
	}

	public double getERR2354721() {
		return ERR2354721;
	}

	public void setERR2354721(double eRR2354721) {
		ERR2354721 = eRR2354721;
	}

	public double getERR2354722() {
		return ERR2354722;
	}

	public void setERR2354722(double eRR2354722) {
		ERR2354722 = eRR2354722;
	}

	public double getERR2354723() {
		return ERR2354723;
	}

	public void setERR2354723(double eRR2354723) {
		ERR2354723 = eRR2354723;
	}

	public double getERR2354724() {
		return ERR2354724;
	}

	public void setERR2354724(double eRR2354724) {
		ERR2354724 = eRR2354724;
	}

	public double getERR2354921() {
		return ERR2354921;
	}

	public void setERR2354921(double eRR2354921) {
		ERR2354921 = eRR2354921;
	}

	public double getERR2354922() {
		return ERR2354922;
	}

	public void setERR2354922(double eRR2354922) {
		ERR2354922 = eRR2354922;
	}

	public double getERR2354923() {
		return ERR2354923;
	}

	public void setERR2354923(double eRR2354923) {
		ERR2354923 = eRR2354923;
	}

	public double getERR2354924() {
		return ERR2354924;
	}

	public void setERR2354924(double eRR2354924) {
		ERR2354924 = eRR2354924;
	}

	public double getERR2354925() {
		return ERR2354925;
	}

	public void setERR2354925(double eRR2354925) {
		ERR2354925 = eRR2354925;
	}

	public double getERR2354926() {
		return ERR2354926;
	}

	public void setERR2354926(double eRR2354926) {
		ERR2354926 = eRR2354926;
	}

	public double getERR2354927() {
		return ERR2354927;
	}

	public void setERR2354927(double eRR2354927) {
		ERR2354927 = eRR2354927;
	}

	public double getERR2354928() {
		return ERR2354928;
	}

	public void setERR2354928(double eRR2354928) {
		ERR2354928 = eRR2354928;
	}

	public double getERR2354929() {
		return ERR2354929;
	}

	public void setERR2354929(double eRR2354929) {
		ERR2354929 = eRR2354929;
	}

	public double getERR315618() {
		return ERR315618;
	}

	public void setERR315618(double eRR315618) {
		ERR315618 = eRR315618;
	}

	@Override
	public String toString() {
		return "Abomasum [id=" + id + ", gene=" + gene + ", ERR2352761=" + ERR2352761 + ", ERR2352762=" + ERR2352762
				+ ", ERR2352763=" + ERR2352763 + ", ERR2352764=" + ERR2352764 + ", ERR2352765=" + ERR2352765
				+ ", ERR2352766=" + ERR2352766 + ", ERR2352767=" + ERR2352767 + ", ERR2353041=" + ERR2353041
				+ ", ERR2353042=" + ERR2353042 + ", ERR2353043=" + ERR2353043 + ", ERR2353044=" + ERR2353044
				+ ", ERR2353045=" + ERR2353045 + ", ERR2353046=" + ERR2353046 + ", ERR2353047=" + ERR2353047
				+ ", ERR2353048=" + ERR2353048 + ", ERR2353049=" + ERR2353049 + ", ERR2353596=" + ERR2353596
				+ ", ERR2353597=" + ERR2353597 + ", ERR2353598=" + ERR2353598 + ", ERR2353599=" + ERR2353599
				+ ", ERR2353600=" + ERR2353600 + ", ERR2353601=" + ERR2353601 + ", ERR2353602=" + ERR2353602
				+ ", ERR2353910=" + ERR2353910 + ", ERR2353911=" + ERR2353911 + ", ERR2353912=" + ERR2353912
				+ ", ERR2353913=" + ERR2353913 + ", ERR2353914=" + ERR2353914 + ", ERR2353915=" + ERR2353915
				+ ", ERR2353916=" + ERR2353916 + ", ERR2353917=" + ERR2353917 + ", ERR2353918=" + ERR2353918
				+ ", ERR2354429=" + ERR2354429 + ", ERR2354430=" + ERR2354430 + ", ERR2354431=" + ERR2354431
				+ ", ERR2354432=" + ERR2354432 + ", ERR2354433=" + ERR2354433 + ", ERR2354434=" + ERR2354434
				+ ", ERR2354435=" + ERR2354435 + ", ERR2354436=" + ERR2354436 + ", ERR2354437=" + ERR2354437
				+ ", ERR2354716=" + ERR2354716 + ", ERR2354717=" + ERR2354717 + ", ERR2354718=" + ERR2354718
				+ ", ERR2354719=" + ERR2354719 + ", ERR2354720=" + ERR2354720 + ", ERR2354721=" + ERR2354721
				+ ", ERR2354722=" + ERR2354722 + ", ERR2354723=" + ERR2354723 + ", ERR2354724=" + ERR2354724
				+ ", ERR2354921=" + ERR2354921 + ", ERR2354922=" + ERR2354922 + ", ERR2354923=" + ERR2354923
				+ ", ERR2354924=" + ERR2354924 + ", ERR2354925=" + ERR2354925 + ", ERR2354926=" + ERR2354926
				+ ", ERR2354927=" + ERR2354927 + ", ERR2354928=" + ERR2354928 + ", ERR2354929=" + ERR2354929
				+ ", ERR315618=" + ERR315618 + "]";
	}

	
}
