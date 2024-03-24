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
@Table(name = "adrenal_gland")
public class Adrenal_gland {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
	 @Column(name="ERR2352768")
	 private double ERR2352768;

	 @Column(name="ERR2352769")
	 private double ERR2352769;

	 @Column(name="ERR2352770")
	 private double ERR2352770;

	 @Column(name="ERR2352771")
	 private double ERR2352771;

	 @Column(name="ERR2352772")
	 private double ERR2352772;

	 @Column(name="ERR2352773")
	 private double ERR2352773;

	 @Column(name="ERR2352774")
	 private double ERR2352774;

	 @Column(name="ERR2353050")
	 private double ERR2353050;

	 @Column(name="ERR2353051")
	 private double ERR2353051;

	 @Column(name="ERR2353052")
	 private double ERR2353052;

	 @Column(name="ERR2353053")
	 private double ERR2353053;

	 @Column(name="ERR2353054")
	 private double ERR2353054;

	 @Column(name="ERR2353055")
	 private double ERR2353055;

	 @Column(name="ERR2353056")
	 private double ERR2353056;

	 @Column(name="ERR2353058")
	 private double ERR2353058;

	 @Column(name="ERR2353603")
	 private double ERR2353603;

	 @Column(name="ERR2353604")
	 private double ERR2353604;

	 @Column(name="ERR2353605")
	 private double ERR2353605;

	 @Column(name="ERR2353606")
	 private double ERR2353606;

	 @Column(name="ERR2353607")
	 private double ERR2353607;

	 @Column(name="ERR2353608")
	 private double ERR2353608;

	 @Column(name="ERR2353609")
	 private double ERR2353609;

	 @Column(name="ERR2353919")
	 private double ERR2353919;

	 @Column(name="ERR2353920")
	 private double ERR2353920;

	 @Column(name="ERR2353921")
	 private double ERR2353921;

	 @Column(name="ERR2353922")
	 private double ERR2353922;

	 @Column(name="ERR2353923")
	 private double ERR2353923;

	 @Column(name="ERR2353924")
	 private double ERR2353924;

	 @Column(name="ERR2353925")
	 private double ERR2353925;

	 @Column(name="ERR2353926")
	 private double ERR2353926;

	 @Column(name="ERR2353927")
	 private double ERR2353927;

	 @Column(name="ERR2354438")
	 private double ERR2354438;

	 @Column(name="ERR2354439")
	 private double ERR2354439;

	 @Column(name="ERR2354440")
	 private double ERR2354440;

	 @Column(name="ERR2354441")
	 private double ERR2354441;

	 @Column(name="ERR2354442")
	 private double ERR2354442;

	 @Column(name="ERR2354443")
	 private double ERR2354443;

	 @Column(name="ERR2354444")
	 private double ERR2354444;

	 @Column(name="ERR2354445")
	 private double ERR2354445;

	 @Column(name="ERR2354446")
	 private double ERR2354446;

	 @Column(name="ERR2354725")
	 private double ERR2354725;

	 @Column(name="ERR2354726")
	 private double ERR2354726;

	 @Column(name="ERR2354727")
	 private double ERR2354727;

	 @Column(name="ERR2354728")
	 private double ERR2354728;

	 @Column(name="ERR2354729")
	 private double ERR2354729;

	 @Column(name="ERR2354730")
	 private double ERR2354730;

	 @Column(name="ERR2354731")
	 private double ERR2354731;

	 @Column(name="ERR2354732")
	 private double ERR2354732;

	 @Column(name="ERR2354733")
	 private double ERR2354733;

	 @Column(name="SRR24057897")
	 private double SRR24057897;

	 @Column(name="SRR24057908")
	 private double SRR24057908;

	 @Column(name="SRR24057919")
	 private double SRR24057919;

	 @Column(name="SRR24057930")
	 private double SRR24057930;

	public Adrenal_gland() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Adrenal_gland(int id, Genes gene, double eRR2352768, double eRR2352769, double eRR2352770, double eRR2352771,
			double eRR2352772, double eRR2352773, double eRR2352774, double eRR2353050, double eRR2353051,
			double eRR2353052, double eRR2353053, double eRR2353054, double eRR2353055, double eRR2353056,
			double eRR2353058, double eRR2353603, double eRR2353604, double eRR2353605, double eRR2353606,
			double eRR2353607, double eRR2353608, double eRR2353609, double eRR2353919, double eRR2353920,
			double eRR2353921, double eRR2353922, double eRR2353923, double eRR2353924, double eRR2353925,
			double eRR2353926, double eRR2353927, double eRR2354438, double eRR2354439, double eRR2354440,
			double eRR2354441, double eRR2354442, double eRR2354443, double eRR2354444, double eRR2354445,
			double eRR2354446, double eRR2354725, double eRR2354726, double eRR2354727, double eRR2354728,
			double eRR2354729, double eRR2354730, double eRR2354731, double eRR2354732, double eRR2354733,
			double sRR24057897, double sRR24057908, double sRR24057919, double sRR24057930) {
		super();
		this.id = id;
		this.gene = gene;
		ERR2352768 = eRR2352768;
		ERR2352769 = eRR2352769;
		ERR2352770 = eRR2352770;
		ERR2352771 = eRR2352771;
		ERR2352772 = eRR2352772;
		ERR2352773 = eRR2352773;
		ERR2352774 = eRR2352774;
		ERR2353050 = eRR2353050;
		ERR2353051 = eRR2353051;
		ERR2353052 = eRR2353052;
		ERR2353053 = eRR2353053;
		ERR2353054 = eRR2353054;
		ERR2353055 = eRR2353055;
		ERR2353056 = eRR2353056;
		ERR2353058 = eRR2353058;
		ERR2353603 = eRR2353603;
		ERR2353604 = eRR2353604;
		ERR2353605 = eRR2353605;
		ERR2353606 = eRR2353606;
		ERR2353607 = eRR2353607;
		ERR2353608 = eRR2353608;
		ERR2353609 = eRR2353609;
		ERR2353919 = eRR2353919;
		ERR2353920 = eRR2353920;
		ERR2353921 = eRR2353921;
		ERR2353922 = eRR2353922;
		ERR2353923 = eRR2353923;
		ERR2353924 = eRR2353924;
		ERR2353925 = eRR2353925;
		ERR2353926 = eRR2353926;
		ERR2353927 = eRR2353927;
		ERR2354438 = eRR2354438;
		ERR2354439 = eRR2354439;
		ERR2354440 = eRR2354440;
		ERR2354441 = eRR2354441;
		ERR2354442 = eRR2354442;
		ERR2354443 = eRR2354443;
		ERR2354444 = eRR2354444;
		ERR2354445 = eRR2354445;
		ERR2354446 = eRR2354446;
		ERR2354725 = eRR2354725;
		ERR2354726 = eRR2354726;
		ERR2354727 = eRR2354727;
		ERR2354728 = eRR2354728;
		ERR2354729 = eRR2354729;
		ERR2354730 = eRR2354730;
		ERR2354731 = eRR2354731;
		ERR2354732 = eRR2354732;
		ERR2354733 = eRR2354733;
		SRR24057897 = sRR24057897;
		SRR24057908 = sRR24057908;
		SRR24057919 = sRR24057919;
		SRR24057930 = sRR24057930;
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

	public double getERR2352768() {
		return ERR2352768;
	}

	public void setERR2352768(double eRR2352768) {
		ERR2352768 = eRR2352768;
	}

	public double getERR2352769() {
		return ERR2352769;
	}

	public void setERR2352769(double eRR2352769) {
		ERR2352769 = eRR2352769;
	}

	public double getERR2352770() {
		return ERR2352770;
	}

	public void setERR2352770(double eRR2352770) {
		ERR2352770 = eRR2352770;
	}

	public double getERR2352771() {
		return ERR2352771;
	}

	public void setERR2352771(double eRR2352771) {
		ERR2352771 = eRR2352771;
	}

	public double getERR2352772() {
		return ERR2352772;
	}

	public void setERR2352772(double eRR2352772) {
		ERR2352772 = eRR2352772;
	}

	public double getERR2352773() {
		return ERR2352773;
	}

	public void setERR2352773(double eRR2352773) {
		ERR2352773 = eRR2352773;
	}

	public double getERR2352774() {
		return ERR2352774;
	}

	public void setERR2352774(double eRR2352774) {
		ERR2352774 = eRR2352774;
	}

	public double getERR2353050() {
		return ERR2353050;
	}

	public void setERR2353050(double eRR2353050) {
		ERR2353050 = eRR2353050;
	}

	public double getERR2353051() {
		return ERR2353051;
	}

	public void setERR2353051(double eRR2353051) {
		ERR2353051 = eRR2353051;
	}

	public double getERR2353052() {
		return ERR2353052;
	}

	public void setERR2353052(double eRR2353052) {
		ERR2353052 = eRR2353052;
	}

	public double getERR2353053() {
		return ERR2353053;
	}

	public void setERR2353053(double eRR2353053) {
		ERR2353053 = eRR2353053;
	}

	public double getERR2353054() {
		return ERR2353054;
	}

	public void setERR2353054(double eRR2353054) {
		ERR2353054 = eRR2353054;
	}

	public double getERR2353055() {
		return ERR2353055;
	}

	public void setERR2353055(double eRR2353055) {
		ERR2353055 = eRR2353055;
	}

	public double getERR2353056() {
		return ERR2353056;
	}

	public void setERR2353056(double eRR2353056) {
		ERR2353056 = eRR2353056;
	}

	public double getERR2353058() {
		return ERR2353058;
	}

	public void setERR2353058(double eRR2353058) {
		ERR2353058 = eRR2353058;
	}

	public double getERR2353603() {
		return ERR2353603;
	}

	public void setERR2353603(double eRR2353603) {
		ERR2353603 = eRR2353603;
	}

	public double getERR2353604() {
		return ERR2353604;
	}

	public void setERR2353604(double eRR2353604) {
		ERR2353604 = eRR2353604;
	}

	public double getERR2353605() {
		return ERR2353605;
	}

	public void setERR2353605(double eRR2353605) {
		ERR2353605 = eRR2353605;
	}

	public double getERR2353606() {
		return ERR2353606;
	}

	public void setERR2353606(double eRR2353606) {
		ERR2353606 = eRR2353606;
	}

	public double getERR2353607() {
		return ERR2353607;
	}

	public void setERR2353607(double eRR2353607) {
		ERR2353607 = eRR2353607;
	}

	public double getERR2353608() {
		return ERR2353608;
	}

	public void setERR2353608(double eRR2353608) {
		ERR2353608 = eRR2353608;
	}

	public double getERR2353609() {
		return ERR2353609;
	}

	public void setERR2353609(double eRR2353609) {
		ERR2353609 = eRR2353609;
	}

	public double getERR2353919() {
		return ERR2353919;
	}

	public void setERR2353919(double eRR2353919) {
		ERR2353919 = eRR2353919;
	}

	public double getERR2353920() {
		return ERR2353920;
	}

	public void setERR2353920(double eRR2353920) {
		ERR2353920 = eRR2353920;
	}

	public double getERR2353921() {
		return ERR2353921;
	}

	public void setERR2353921(double eRR2353921) {
		ERR2353921 = eRR2353921;
	}

	public double getERR2353922() {
		return ERR2353922;
	}

	public void setERR2353922(double eRR2353922) {
		ERR2353922 = eRR2353922;
	}

	public double getERR2353923() {
		return ERR2353923;
	}

	public void setERR2353923(double eRR2353923) {
		ERR2353923 = eRR2353923;
	}

	public double getERR2353924() {
		return ERR2353924;
	}

	public void setERR2353924(double eRR2353924) {
		ERR2353924 = eRR2353924;
	}

	public double getERR2353925() {
		return ERR2353925;
	}

	public void setERR2353925(double eRR2353925) {
		ERR2353925 = eRR2353925;
	}

	public double getERR2353926() {
		return ERR2353926;
	}

	public void setERR2353926(double eRR2353926) {
		ERR2353926 = eRR2353926;
	}

	public double getERR2353927() {
		return ERR2353927;
	}

	public void setERR2353927(double eRR2353927) {
		ERR2353927 = eRR2353927;
	}

	public double getERR2354438() {
		return ERR2354438;
	}

	public void setERR2354438(double eRR2354438) {
		ERR2354438 = eRR2354438;
	}

	public double getERR2354439() {
		return ERR2354439;
	}

	public void setERR2354439(double eRR2354439) {
		ERR2354439 = eRR2354439;
	}

	public double getERR2354440() {
		return ERR2354440;
	}

	public void setERR2354440(double eRR2354440) {
		ERR2354440 = eRR2354440;
	}

	public double getERR2354441() {
		return ERR2354441;
	}

	public void setERR2354441(double eRR2354441) {
		ERR2354441 = eRR2354441;
	}

	public double getERR2354442() {
		return ERR2354442;
	}

	public void setERR2354442(double eRR2354442) {
		ERR2354442 = eRR2354442;
	}

	public double getERR2354443() {
		return ERR2354443;
	}

	public void setERR2354443(double eRR2354443) {
		ERR2354443 = eRR2354443;
	}

	public double getERR2354444() {
		return ERR2354444;
	}

	public void setERR2354444(double eRR2354444) {
		ERR2354444 = eRR2354444;
	}

	public double getERR2354445() {
		return ERR2354445;
	}

	public void setERR2354445(double eRR2354445) {
		ERR2354445 = eRR2354445;
	}

	public double getERR2354446() {
		return ERR2354446;
	}

	public void setERR2354446(double eRR2354446) {
		ERR2354446 = eRR2354446;
	}

	public double getERR2354725() {
		return ERR2354725;
	}

	public void setERR2354725(double eRR2354725) {
		ERR2354725 = eRR2354725;
	}

	public double getERR2354726() {
		return ERR2354726;
	}

	public void setERR2354726(double eRR2354726) {
		ERR2354726 = eRR2354726;
	}

	public double getERR2354727() {
		return ERR2354727;
	}

	public void setERR2354727(double eRR2354727) {
		ERR2354727 = eRR2354727;
	}

	public double getERR2354728() {
		return ERR2354728;
	}

	public void setERR2354728(double eRR2354728) {
		ERR2354728 = eRR2354728;
	}

	public double getERR2354729() {
		return ERR2354729;
	}

	public void setERR2354729(double eRR2354729) {
		ERR2354729 = eRR2354729;
	}

	public double getERR2354730() {
		return ERR2354730;
	}

	public void setERR2354730(double eRR2354730) {
		ERR2354730 = eRR2354730;
	}

	public double getERR2354731() {
		return ERR2354731;
	}

	public void setERR2354731(double eRR2354731) {
		ERR2354731 = eRR2354731;
	}

	public double getERR2354732() {
		return ERR2354732;
	}

	public void setERR2354732(double eRR2354732) {
		ERR2354732 = eRR2354732;
	}

	public double getERR2354733() {
		return ERR2354733;
	}

	public void setERR2354733(double eRR2354733) {
		ERR2354733 = eRR2354733;
	}

	public double getSRR24057897() {
		return SRR24057897;
	}

	public void setSRR24057897(double sRR24057897) {
		SRR24057897 = sRR24057897;
	}

	public double getSRR24057908() {
		return SRR24057908;
	}

	public void setSRR24057908(double sRR24057908) {
		SRR24057908 = sRR24057908;
	}

	public double getSRR24057919() {
		return SRR24057919;
	}

	public void setSRR24057919(double sRR24057919) {
		SRR24057919 = sRR24057919;
	}

	public double getSRR24057930() {
		return SRR24057930;
	}

	public void setSRR24057930(double sRR24057930) {
		SRR24057930 = sRR24057930;
	}

	@Override
	public String toString() {
		return "Adrenal_gland [id=" + id + ", gene=" + gene + ", ERR2352768=" + ERR2352768 + ", ERR2352769="
				+ ERR2352769 + ", ERR2352770=" + ERR2352770 + ", ERR2352771=" + ERR2352771 + ", ERR2352772="
				+ ERR2352772 + ", ERR2352773=" + ERR2352773 + ", ERR2352774=" + ERR2352774 + ", ERR2353050="
				+ ERR2353050 + ", ERR2353051=" + ERR2353051 + ", ERR2353052=" + ERR2353052 + ", ERR2353053="
				+ ERR2353053 + ", ERR2353054=" + ERR2353054 + ", ERR2353055=" + ERR2353055 + ", ERR2353056="
				+ ERR2353056 + ", ERR2353058=" + ERR2353058 + ", ERR2353603=" + ERR2353603 + ", ERR2353604="
				+ ERR2353604 + ", ERR2353605=" + ERR2353605 + ", ERR2353606=" + ERR2353606 + ", ERR2353607="
				+ ERR2353607 + ", ERR2353608=" + ERR2353608 + ", ERR2353609=" + ERR2353609 + ", ERR2353919="
				+ ERR2353919 + ", ERR2353920=" + ERR2353920 + ", ERR2353921=" + ERR2353921 + ", ERR2353922="
				+ ERR2353922 + ", ERR2353923=" + ERR2353923 + ", ERR2353924=" + ERR2353924 + ", ERR2353925="
				+ ERR2353925 + ", ERR2353926=" + ERR2353926 + ", ERR2353927=" + ERR2353927 + ", ERR2354438="
				+ ERR2354438 + ", ERR2354439=" + ERR2354439 + ", ERR2354440=" + ERR2354440 + ", ERR2354441="
				+ ERR2354441 + ", ERR2354442=" + ERR2354442 + ", ERR2354443=" + ERR2354443 + ", ERR2354444="
				+ ERR2354444 + ", ERR2354445=" + ERR2354445 + ", ERR2354446=" + ERR2354446 + ", ERR2354725="
				+ ERR2354725 + ", ERR2354726=" + ERR2354726 + ", ERR2354727=" + ERR2354727 + ", ERR2354728="
				+ ERR2354728 + ", ERR2354729=" + ERR2354729 + ", ERR2354730=" + ERR2354730 + ", ERR2354731="
				+ ERR2354731 + ", ERR2354732=" + ERR2354732 + ", ERR2354733=" + ERR2354733 + ", SRR24057897="
				+ SRR24057897 + ", SRR24057908=" + SRR24057908 + ", SRR24057919=" + SRR24057919 + ", SRR24057930="
				+ SRR24057930 + "]";
	}
}
