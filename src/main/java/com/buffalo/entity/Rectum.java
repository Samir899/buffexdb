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
@Table(name = "rectum")
public class Rectum {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
	 @Column(name="ERR2352950")
	 private double ERR2352950;

	 @Column(name="ERR2352951")
	 private double ERR2352951;

	 @Column(name="ERR2352952")
	 private double ERR2352952;

	 @Column(name="ERR2352953")
	 private double ERR2352953;

	 @Column(name="ERR2352954")
	 private double ERR2352954;

	 @Column(name="ERR2352955")
	 private double ERR2352955;

	 @Column(name="ERR2352956")
	 private double ERR2352956;

	 @Column(name="ERR2353469")
	 private double ERR2353469;

	 @Column(name="ERR2353470")
	 private double ERR2353470;

	 @Column(name="ERR2353471")
	 private double ERR2353471;

	 @Column(name="ERR2353472")
	 private double ERR2353472;

	 @Column(name="ERR2353473")
	 private double ERR2353473;

	 @Column(name="ERR2353474")
	 private double ERR2353474;

	 @Column(name="ERR2353475")
	 private double ERR2353475;

	 @Column(name="ERR2353476")
	 private double ERR2353476;

	 @Column(name="ERR2353477")
	 private double ERR2353477;

	 @Column(name="ERR2353792")
	 private double ERR2353792;

	 @Column(name="ERR2353793")
	 private double ERR2353793;

	 @Column(name="ERR2353794")
	 private double ERR2353794;

	 @Column(name="ERR2353795")
	 private double ERR2353795;

	 @Column(name="ERR2353796")
	 private double ERR2353796;

	 @Column(name="ERR2353797")
	 private double ERR2353797;

	 @Column(name="ERR2353798")
	 private double ERR2353798;

	 @Column(name="ERR2354288")
	 private double ERR2354288;

	 @Column(name="ERR2354289")
	 private double ERR2354289;

	 @Column(name="ERR2354290")
	 private double ERR2354290;

	 @Column(name="ERR2354291")
	 private double ERR2354291;

	 @Column(name="ERR2354292")
	 private double ERR2354292;

	 @Column(name="ERR2354293")
	 private double ERR2354293;

	 @Column(name="ERR2354294")
	 private double ERR2354294;

	 @Column(name="ERR2354295")
	 private double ERR2354295;

	 @Column(name="ERR2354296")
	 private double ERR2354296;

	 @Column(name="ERR2354657")
	 private double ERR2354657;

	 @Column(name="ERR2354658")
	 private double ERR2354658;

	 @Column(name="ERR2354659")
	 private double ERR2354659;

	 @Column(name="ERR2354660")
	 private double ERR2354660;

	 @Column(name="ERR2354661")
	 private double ERR2354661;

	 @Column(name="ERR2354662")
	 private double ERR2354662;

	 @Column(name="ERR2354663")
	 private double ERR2354663;

	 @Column(name="ERR2354664")
	 private double ERR2354664;

	 @Column(name="ERR2354665")
	 private double ERR2354665;

	 @Column(name="ERR2354880")
	 private double ERR2354880;

	 @Column(name="ERR2354881")
	 private double ERR2354881;

	 @Column(name="ERR2354882")
	 private double ERR2354882;

	 @Column(name="ERR2354883")
	 private double ERR2354883;

	 @Column(name="ERR2354884")
	 private double ERR2354884;

	 @Column(name="ERR2354885")
	 private double ERR2354885;

	 @Column(name="ERR2354886")
	 private double ERR2354886;

	 @Column(name="ERR2354887")
	 private double ERR2354887;

	 @Column(name="ERR2354888")
	 private double ERR2354888;

	 @Column(name="ERR2355017")
	 private double ERR2355017;

	 @Column(name="ERR2355018")
	 private double ERR2355018;

	 @Column(name="ERR2355019")
	 private double ERR2355019;

	 @Column(name="ERR2355020")
	 private double ERR2355020;

	 @Column(name="ERR2355021")
	 private double ERR2355021;

	 @Column(name="ERR2355022")
	 private double ERR2355022;

	 @Column(name="ERR2355023")
	 private double ERR2355023;

	 @Column(name="ERR2355024")
	 private double ERR2355024;

	 @Column(name="ERR2355025")
	 private double ERR2355025;

	public Rectum() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectum(int id, Genes gene, double eRR2352950, double eRR2352951, double eRR2352952, double eRR2352953,
			double eRR2352954, double eRR2352955, double eRR2352956, double eRR2353469, double eRR2353470,
			double eRR2353471, double eRR2353472, double eRR2353473, double eRR2353474, double eRR2353475,
			double eRR2353476, double eRR2353477, double eRR2353792, double eRR2353793, double eRR2353794,
			double eRR2353795, double eRR2353796, double eRR2353797, double eRR2353798, double eRR2354288,
			double eRR2354289, double eRR2354290, double eRR2354291, double eRR2354292, double eRR2354293,
			double eRR2354294, double eRR2354295, double eRR2354296, double eRR2354657, double eRR2354658,
			double eRR2354659, double eRR2354660, double eRR2354661, double eRR2354662, double eRR2354663,
			double eRR2354664, double eRR2354665, double eRR2354880, double eRR2354881, double eRR2354882,
			double eRR2354883, double eRR2354884, double eRR2354885, double eRR2354886, double eRR2354887,
			double eRR2354888, double eRR2355017, double eRR2355018, double eRR2355019, double eRR2355020,
			double eRR2355021, double eRR2355022, double eRR2355023, double eRR2355024, double eRR2355025) {
		super();
		this.id = id;
		this.gene = gene;
		ERR2352950 = eRR2352950;
		ERR2352951 = eRR2352951;
		ERR2352952 = eRR2352952;
		ERR2352953 = eRR2352953;
		ERR2352954 = eRR2352954;
		ERR2352955 = eRR2352955;
		ERR2352956 = eRR2352956;
		ERR2353469 = eRR2353469;
		ERR2353470 = eRR2353470;
		ERR2353471 = eRR2353471;
		ERR2353472 = eRR2353472;
		ERR2353473 = eRR2353473;
		ERR2353474 = eRR2353474;
		ERR2353475 = eRR2353475;
		ERR2353476 = eRR2353476;
		ERR2353477 = eRR2353477;
		ERR2353792 = eRR2353792;
		ERR2353793 = eRR2353793;
		ERR2353794 = eRR2353794;
		ERR2353795 = eRR2353795;
		ERR2353796 = eRR2353796;
		ERR2353797 = eRR2353797;
		ERR2353798 = eRR2353798;
		ERR2354288 = eRR2354288;
		ERR2354289 = eRR2354289;
		ERR2354290 = eRR2354290;
		ERR2354291 = eRR2354291;
		ERR2354292 = eRR2354292;
		ERR2354293 = eRR2354293;
		ERR2354294 = eRR2354294;
		ERR2354295 = eRR2354295;
		ERR2354296 = eRR2354296;
		ERR2354657 = eRR2354657;
		ERR2354658 = eRR2354658;
		ERR2354659 = eRR2354659;
		ERR2354660 = eRR2354660;
		ERR2354661 = eRR2354661;
		ERR2354662 = eRR2354662;
		ERR2354663 = eRR2354663;
		ERR2354664 = eRR2354664;
		ERR2354665 = eRR2354665;
		ERR2354880 = eRR2354880;
		ERR2354881 = eRR2354881;
		ERR2354882 = eRR2354882;
		ERR2354883 = eRR2354883;
		ERR2354884 = eRR2354884;
		ERR2354885 = eRR2354885;
		ERR2354886 = eRR2354886;
		ERR2354887 = eRR2354887;
		ERR2354888 = eRR2354888;
		ERR2355017 = eRR2355017;
		ERR2355018 = eRR2355018;
		ERR2355019 = eRR2355019;
		ERR2355020 = eRR2355020;
		ERR2355021 = eRR2355021;
		ERR2355022 = eRR2355022;
		ERR2355023 = eRR2355023;
		ERR2355024 = eRR2355024;
		ERR2355025 = eRR2355025;
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

	public double getERR2352950() {
		return ERR2352950;
	}

	public void setERR2352950(double eRR2352950) {
		ERR2352950 = eRR2352950;
	}

	public double getERR2352951() {
		return ERR2352951;
	}

	public void setERR2352951(double eRR2352951) {
		ERR2352951 = eRR2352951;
	}

	public double getERR2352952() {
		return ERR2352952;
	}

	public void setERR2352952(double eRR2352952) {
		ERR2352952 = eRR2352952;
	}

	public double getERR2352953() {
		return ERR2352953;
	}

	public void setERR2352953(double eRR2352953) {
		ERR2352953 = eRR2352953;
	}

	public double getERR2352954() {
		return ERR2352954;
	}

	public void setERR2352954(double eRR2352954) {
		ERR2352954 = eRR2352954;
	}

	public double getERR2352955() {
		return ERR2352955;
	}

	public void setERR2352955(double eRR2352955) {
		ERR2352955 = eRR2352955;
	}

	public double getERR2352956() {
		return ERR2352956;
	}

	public void setERR2352956(double eRR2352956) {
		ERR2352956 = eRR2352956;
	}

	public double getERR2353469() {
		return ERR2353469;
	}

	public void setERR2353469(double eRR2353469) {
		ERR2353469 = eRR2353469;
	}

	public double getERR2353470() {
		return ERR2353470;
	}

	public void setERR2353470(double eRR2353470) {
		ERR2353470 = eRR2353470;
	}

	public double getERR2353471() {
		return ERR2353471;
	}

	public void setERR2353471(double eRR2353471) {
		ERR2353471 = eRR2353471;
	}

	public double getERR2353472() {
		return ERR2353472;
	}

	public void setERR2353472(double eRR2353472) {
		ERR2353472 = eRR2353472;
	}

	public double getERR2353473() {
		return ERR2353473;
	}

	public void setERR2353473(double eRR2353473) {
		ERR2353473 = eRR2353473;
	}

	public double getERR2353474() {
		return ERR2353474;
	}

	public void setERR2353474(double eRR2353474) {
		ERR2353474 = eRR2353474;
	}

	public double getERR2353475() {
		return ERR2353475;
	}

	public void setERR2353475(double eRR2353475) {
		ERR2353475 = eRR2353475;
	}

	public double getERR2353476() {
		return ERR2353476;
	}

	public void setERR2353476(double eRR2353476) {
		ERR2353476 = eRR2353476;
	}

	public double getERR2353477() {
		return ERR2353477;
	}

	public void setERR2353477(double eRR2353477) {
		ERR2353477 = eRR2353477;
	}

	public double getERR2353792() {
		return ERR2353792;
	}

	public void setERR2353792(double eRR2353792) {
		ERR2353792 = eRR2353792;
	}

	public double getERR2353793() {
		return ERR2353793;
	}

	public void setERR2353793(double eRR2353793) {
		ERR2353793 = eRR2353793;
	}

	public double getERR2353794() {
		return ERR2353794;
	}

	public void setERR2353794(double eRR2353794) {
		ERR2353794 = eRR2353794;
	}

	public double getERR2353795() {
		return ERR2353795;
	}

	public void setERR2353795(double eRR2353795) {
		ERR2353795 = eRR2353795;
	}

	public double getERR2353796() {
		return ERR2353796;
	}

	public void setERR2353796(double eRR2353796) {
		ERR2353796 = eRR2353796;
	}

	public double getERR2353797() {
		return ERR2353797;
	}

	public void setERR2353797(double eRR2353797) {
		ERR2353797 = eRR2353797;
	}

	public double getERR2353798() {
		return ERR2353798;
	}

	public void setERR2353798(double eRR2353798) {
		ERR2353798 = eRR2353798;
	}

	public double getERR2354288() {
		return ERR2354288;
	}

	public void setERR2354288(double eRR2354288) {
		ERR2354288 = eRR2354288;
	}

	public double getERR2354289() {
		return ERR2354289;
	}

	public void setERR2354289(double eRR2354289) {
		ERR2354289 = eRR2354289;
	}

	public double getERR2354290() {
		return ERR2354290;
	}

	public void setERR2354290(double eRR2354290) {
		ERR2354290 = eRR2354290;
	}

	public double getERR2354291() {
		return ERR2354291;
	}

	public void setERR2354291(double eRR2354291) {
		ERR2354291 = eRR2354291;
	}

	public double getERR2354292() {
		return ERR2354292;
	}

	public void setERR2354292(double eRR2354292) {
		ERR2354292 = eRR2354292;
	}

	public double getERR2354293() {
		return ERR2354293;
	}

	public void setERR2354293(double eRR2354293) {
		ERR2354293 = eRR2354293;
	}

	public double getERR2354294() {
		return ERR2354294;
	}

	public void setERR2354294(double eRR2354294) {
		ERR2354294 = eRR2354294;
	}

	public double getERR2354295() {
		return ERR2354295;
	}

	public void setERR2354295(double eRR2354295) {
		ERR2354295 = eRR2354295;
	}

	public double getERR2354296() {
		return ERR2354296;
	}

	public void setERR2354296(double eRR2354296) {
		ERR2354296 = eRR2354296;
	}

	public double getERR2354657() {
		return ERR2354657;
	}

	public void setERR2354657(double eRR2354657) {
		ERR2354657 = eRR2354657;
	}

	public double getERR2354658() {
		return ERR2354658;
	}

	public void setERR2354658(double eRR2354658) {
		ERR2354658 = eRR2354658;
	}

	public double getERR2354659() {
		return ERR2354659;
	}

	public void setERR2354659(double eRR2354659) {
		ERR2354659 = eRR2354659;
	}

	public double getERR2354660() {
		return ERR2354660;
	}

	public void setERR2354660(double eRR2354660) {
		ERR2354660 = eRR2354660;
	}

	public double getERR2354661() {
		return ERR2354661;
	}

	public void setERR2354661(double eRR2354661) {
		ERR2354661 = eRR2354661;
	}

	public double getERR2354662() {
		return ERR2354662;
	}

	public void setERR2354662(double eRR2354662) {
		ERR2354662 = eRR2354662;
	}

	public double getERR2354663() {
		return ERR2354663;
	}

	public void setERR2354663(double eRR2354663) {
		ERR2354663 = eRR2354663;
	}

	public double getERR2354664() {
		return ERR2354664;
	}

	public void setERR2354664(double eRR2354664) {
		ERR2354664 = eRR2354664;
	}

	public double getERR2354665() {
		return ERR2354665;
	}

	public void setERR2354665(double eRR2354665) {
		ERR2354665 = eRR2354665;
	}

	public double getERR2354880() {
		return ERR2354880;
	}

	public void setERR2354880(double eRR2354880) {
		ERR2354880 = eRR2354880;
	}

	public double getERR2354881() {
		return ERR2354881;
	}

	public void setERR2354881(double eRR2354881) {
		ERR2354881 = eRR2354881;
	}

	public double getERR2354882() {
		return ERR2354882;
	}

	public void setERR2354882(double eRR2354882) {
		ERR2354882 = eRR2354882;
	}

	public double getERR2354883() {
		return ERR2354883;
	}

	public void setERR2354883(double eRR2354883) {
		ERR2354883 = eRR2354883;
	}

	public double getERR2354884() {
		return ERR2354884;
	}

	public void setERR2354884(double eRR2354884) {
		ERR2354884 = eRR2354884;
	}

	public double getERR2354885() {
		return ERR2354885;
	}

	public void setERR2354885(double eRR2354885) {
		ERR2354885 = eRR2354885;
	}

	public double getERR2354886() {
		return ERR2354886;
	}

	public void setERR2354886(double eRR2354886) {
		ERR2354886 = eRR2354886;
	}

	public double getERR2354887() {
		return ERR2354887;
	}

	public void setERR2354887(double eRR2354887) {
		ERR2354887 = eRR2354887;
	}

	public double getERR2354888() {
		return ERR2354888;
	}

	public void setERR2354888(double eRR2354888) {
		ERR2354888 = eRR2354888;
	}

	public double getERR2355017() {
		return ERR2355017;
	}

	public void setERR2355017(double eRR2355017) {
		ERR2355017 = eRR2355017;
	}

	public double getERR2355018() {
		return ERR2355018;
	}

	public void setERR2355018(double eRR2355018) {
		ERR2355018 = eRR2355018;
	}

	public double getERR2355019() {
		return ERR2355019;
	}

	public void setERR2355019(double eRR2355019) {
		ERR2355019 = eRR2355019;
	}

	public double getERR2355020() {
		return ERR2355020;
	}

	public void setERR2355020(double eRR2355020) {
		ERR2355020 = eRR2355020;
	}

	public double getERR2355021() {
		return ERR2355021;
	}

	public void setERR2355021(double eRR2355021) {
		ERR2355021 = eRR2355021;
	}

	public double getERR2355022() {
		return ERR2355022;
	}

	public void setERR2355022(double eRR2355022) {
		ERR2355022 = eRR2355022;
	}

	public double getERR2355023() {
		return ERR2355023;
	}

	public void setERR2355023(double eRR2355023) {
		ERR2355023 = eRR2355023;
	}

	public double getERR2355024() {
		return ERR2355024;
	}

	public void setERR2355024(double eRR2355024) {
		ERR2355024 = eRR2355024;
	}

	public double getERR2355025() {
		return ERR2355025;
	}

	public void setERR2355025(double eRR2355025) {
		ERR2355025 = eRR2355025;
	}

	@Override
	public String toString() {
		return "Rectum [id=" + id + ", gene=" + gene + ", ERR2352950=" + ERR2352950 + ", ERR2352951=" + ERR2352951
				+ ", ERR2352952=" + ERR2352952 + ", ERR2352953=" + ERR2352953 + ", ERR2352954=" + ERR2352954
				+ ", ERR2352955=" + ERR2352955 + ", ERR2352956=" + ERR2352956 + ", ERR2353469=" + ERR2353469
				+ ", ERR2353470=" + ERR2353470 + ", ERR2353471=" + ERR2353471 + ", ERR2353472=" + ERR2353472
				+ ", ERR2353473=" + ERR2353473 + ", ERR2353474=" + ERR2353474 + ", ERR2353475=" + ERR2353475
				+ ", ERR2353476=" + ERR2353476 + ", ERR2353477=" + ERR2353477 + ", ERR2353792=" + ERR2353792
				+ ", ERR2353793=" + ERR2353793 + ", ERR2353794=" + ERR2353794 + ", ERR2353795=" + ERR2353795
				+ ", ERR2353796=" + ERR2353796 + ", ERR2353797=" + ERR2353797 + ", ERR2353798=" + ERR2353798
				+ ", ERR2354288=" + ERR2354288 + ", ERR2354289=" + ERR2354289 + ", ERR2354290=" + ERR2354290
				+ ", ERR2354291=" + ERR2354291 + ", ERR2354292=" + ERR2354292 + ", ERR2354293=" + ERR2354293
				+ ", ERR2354294=" + ERR2354294 + ", ERR2354295=" + ERR2354295 + ", ERR2354296=" + ERR2354296
				+ ", ERR2354657=" + ERR2354657 + ", ERR2354658=" + ERR2354658 + ", ERR2354659=" + ERR2354659
				+ ", ERR2354660=" + ERR2354660 + ", ERR2354661=" + ERR2354661 + ", ERR2354662=" + ERR2354662
				+ ", ERR2354663=" + ERR2354663 + ", ERR2354664=" + ERR2354664 + ", ERR2354665=" + ERR2354665
				+ ", ERR2354880=" + ERR2354880 + ", ERR2354881=" + ERR2354881 + ", ERR2354882=" + ERR2354882
				+ ", ERR2354883=" + ERR2354883 + ", ERR2354884=" + ERR2354884 + ", ERR2354885=" + ERR2354885
				+ ", ERR2354886=" + ERR2354886 + ", ERR2354887=" + ERR2354887 + ", ERR2354888=" + ERR2354888
				+ ", ERR2355017=" + ERR2355017 + ", ERR2355018=" + ERR2355018 + ", ERR2355019=" + ERR2355019
				+ ", ERR2355020=" + ERR2355020 + ", ERR2355021=" + ERR2355021 + ", ERR2355022=" + ERR2355022
				+ ", ERR2355023=" + ERR2355023 + ", ERR2355024=" + ERR2355024 + ", ERR2355025=" + ERR2355025 + "]";
	}
}
