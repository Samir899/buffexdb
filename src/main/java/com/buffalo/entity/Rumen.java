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
@Table(name = "rumen")
public class Rumen {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
	 @Column(name="ERR2352966")
	 private double ERR2352966;

	 @Column(name="ERR2352967")
	 private double ERR2352967;

	 @Column(name="ERR2352968")
	 private double ERR2352968;

	 @Column(name="ERR2352969")
	 private double ERR2352969;

	 @Column(name="ERR2352970")
	 private double ERR2352970;

	 @Column(name="ERR2352971")
	 private double ERR2352971;

	 @Column(name="ERR2352972")
	 private double ERR2352972;

	 @Column(name="ERR2353501")
	 private double ERR2353501;

	 @Column(name="ERR2353502")
	 private double ERR2353502;

	 @Column(name="ERR2353503")
	 private double ERR2353503;

	 @Column(name="ERR2353504")
	 private double ERR2353504;

	 @Column(name="ERR2353505")
	 private double ERR2353505;

	 @Column(name="ERR2353506")
	 private double ERR2353506;

	 @Column(name="ERR2353507")
	 private double ERR2353507;

	 @Column(name="ERR2353508")
	 private double ERR2353508;

	 @Column(name="ERR2353509")
	 private double ERR2353509;

	 @Column(name="ERR2353808")
	 private double ERR2353808;

	 @Column(name="ERR2353809")
	 private double ERR2353809;

	 @Column(name="ERR2353810")
	 private double ERR2353810;

	 @Column(name="ERR2353811")
	 private double ERR2353811;

	 @Column(name="ERR2353812")
	 private double ERR2353812;

	 @Column(name="ERR2353813")
	 private double ERR2353813;

	 @Column(name="ERR2353814")
	 private double ERR2353814;

	 @Column(name="ERR2354320")
	 private double ERR2354320;

	 @Column(name="ERR2354321")
	 private double ERR2354321;

	 @Column(name="ERR2354322")
	 private double ERR2354322;

	 @Column(name="ERR2354323")
	 private double ERR2354323;

	 @Column(name="ERR2354324")
	 private double ERR2354324;

	 @Column(name="ERR2354325")
	 private double ERR2354325;

	 @Column(name="ERR2354326")
	 private double ERR2354326;

	 @Column(name="ERR2354327")
	 private double ERR2354327;

	 @Column(name="ERR2354328")
	 private double ERR2354328;

	 @Column(name="ERR2354689")
	 private double ERR2354689;

	 @Column(name="ERR2354690")
	 private double ERR2354690;

	 @Column(name="ERR2354691")
	 private double ERR2354691;

	 @Column(name="ERR2354692")
	 private double ERR2354692;

	 @Column(name="ERR2354693")
	 private double ERR2354693;

	 @Column(name="ERR2354694")
	 private double ERR2354694;

	 @Column(name="ERR2354695")
	 private double ERR2354695;

	 @Column(name="ERR2354696")
	 private double ERR2354696;

	 @Column(name="ERR2354697")
	 private double ERR2354697;

	 @Column(name="ERR2355049")
	 private double ERR2355049;

	 @Column(name="ERR2355050")
	 private double ERR2355050;

	 @Column(name="ERR2355051")
	 private double ERR2355051;

	 @Column(name="ERR2355052")
	 private double ERR2355052;

	 @Column(name="ERR2355053")
	 private double ERR2355053;

	 @Column(name="ERR2355054")
	 private double ERR2355054;

	 @Column(name="ERR2355055")
	 private double ERR2355055;

	 @Column(name="ERR2355056")
	 private double ERR2355056;

	 @Column(name="ERR2355057")
	 private double ERR2355057;

	 @Column(name="SRR24057894")
	 private double SRR24057894;

	 @Column(name="SRR24057895")
	 private double SRR24057895;

	 @Column(name="SRR24057896")
	 private double SRR24057896;

	 @Column(name="SRR24057898")
	 private double SRR24057898;

	public Rumen() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rumen(int id, Genes gene, double eRR2352966, double eRR2352967, double eRR2352968, double eRR2352969,
			double eRR2352970, double eRR2352971, double eRR2352972, double eRR2353501, double eRR2353502,
			double eRR2353503, double eRR2353504, double eRR2353505, double eRR2353506, double eRR2353507,
			double eRR2353508, double eRR2353509, double eRR2353808, double eRR2353809, double eRR2353810,
			double eRR2353811, double eRR2353812, double eRR2353813, double eRR2353814, double eRR2354320,
			double eRR2354321, double eRR2354322, double eRR2354323, double eRR2354324, double eRR2354325,
			double eRR2354326, double eRR2354327, double eRR2354328, double eRR2354689, double eRR2354690,
			double eRR2354691, double eRR2354692, double eRR2354693, double eRR2354694, double eRR2354695,
			double eRR2354696, double eRR2354697, double eRR2355049, double eRR2355050, double eRR2355051,
			double eRR2355052, double eRR2355053, double eRR2355054, double eRR2355055, double eRR2355056,
			double eRR2355057, double sRR24057894, double sRR24057895, double sRR24057896, double sRR24057898) {
		super();
		this.id = id;
		this.gene = gene;
		ERR2352966 = eRR2352966;
		ERR2352967 = eRR2352967;
		ERR2352968 = eRR2352968;
		ERR2352969 = eRR2352969;
		ERR2352970 = eRR2352970;
		ERR2352971 = eRR2352971;
		ERR2352972 = eRR2352972;
		ERR2353501 = eRR2353501;
		ERR2353502 = eRR2353502;
		ERR2353503 = eRR2353503;
		ERR2353504 = eRR2353504;
		ERR2353505 = eRR2353505;
		ERR2353506 = eRR2353506;
		ERR2353507 = eRR2353507;
		ERR2353508 = eRR2353508;
		ERR2353509 = eRR2353509;
		ERR2353808 = eRR2353808;
		ERR2353809 = eRR2353809;
		ERR2353810 = eRR2353810;
		ERR2353811 = eRR2353811;
		ERR2353812 = eRR2353812;
		ERR2353813 = eRR2353813;
		ERR2353814 = eRR2353814;
		ERR2354320 = eRR2354320;
		ERR2354321 = eRR2354321;
		ERR2354322 = eRR2354322;
		ERR2354323 = eRR2354323;
		ERR2354324 = eRR2354324;
		ERR2354325 = eRR2354325;
		ERR2354326 = eRR2354326;
		ERR2354327 = eRR2354327;
		ERR2354328 = eRR2354328;
		ERR2354689 = eRR2354689;
		ERR2354690 = eRR2354690;
		ERR2354691 = eRR2354691;
		ERR2354692 = eRR2354692;
		ERR2354693 = eRR2354693;
		ERR2354694 = eRR2354694;
		ERR2354695 = eRR2354695;
		ERR2354696 = eRR2354696;
		ERR2354697 = eRR2354697;
		ERR2355049 = eRR2355049;
		ERR2355050 = eRR2355050;
		ERR2355051 = eRR2355051;
		ERR2355052 = eRR2355052;
		ERR2355053 = eRR2355053;
		ERR2355054 = eRR2355054;
		ERR2355055 = eRR2355055;
		ERR2355056 = eRR2355056;
		ERR2355057 = eRR2355057;
		SRR24057894 = sRR24057894;
		SRR24057895 = sRR24057895;
		SRR24057896 = sRR24057896;
		SRR24057898 = sRR24057898;
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

	public double getERR2352966() {
		return ERR2352966;
	}

	public void setERR2352966(double eRR2352966) {
		ERR2352966 = eRR2352966;
	}

	public double getERR2352967() {
		return ERR2352967;
	}

	public void setERR2352967(double eRR2352967) {
		ERR2352967 = eRR2352967;
	}

	public double getERR2352968() {
		return ERR2352968;
	}

	public void setERR2352968(double eRR2352968) {
		ERR2352968 = eRR2352968;
	}

	public double getERR2352969() {
		return ERR2352969;
	}

	public void setERR2352969(double eRR2352969) {
		ERR2352969 = eRR2352969;
	}

	public double getERR2352970() {
		return ERR2352970;
	}

	public void setERR2352970(double eRR2352970) {
		ERR2352970 = eRR2352970;
	}

	public double getERR2352971() {
		return ERR2352971;
	}

	public void setERR2352971(double eRR2352971) {
		ERR2352971 = eRR2352971;
	}

	public double getERR2352972() {
		return ERR2352972;
	}

	public void setERR2352972(double eRR2352972) {
		ERR2352972 = eRR2352972;
	}

	public double getERR2353501() {
		return ERR2353501;
	}

	public void setERR2353501(double eRR2353501) {
		ERR2353501 = eRR2353501;
	}

	public double getERR2353502() {
		return ERR2353502;
	}

	public void setERR2353502(double eRR2353502) {
		ERR2353502 = eRR2353502;
	}

	public double getERR2353503() {
		return ERR2353503;
	}

	public void setERR2353503(double eRR2353503) {
		ERR2353503 = eRR2353503;
	}

	public double getERR2353504() {
		return ERR2353504;
	}

	public void setERR2353504(double eRR2353504) {
		ERR2353504 = eRR2353504;
	}

	public double getERR2353505() {
		return ERR2353505;
	}

	public void setERR2353505(double eRR2353505) {
		ERR2353505 = eRR2353505;
	}

	public double getERR2353506() {
		return ERR2353506;
	}

	public void setERR2353506(double eRR2353506) {
		ERR2353506 = eRR2353506;
	}

	public double getERR2353507() {
		return ERR2353507;
	}

	public void setERR2353507(double eRR2353507) {
		ERR2353507 = eRR2353507;
	}

	public double getERR2353508() {
		return ERR2353508;
	}

	public void setERR2353508(double eRR2353508) {
		ERR2353508 = eRR2353508;
	}

	public double getERR2353509() {
		return ERR2353509;
	}

	public void setERR2353509(double eRR2353509) {
		ERR2353509 = eRR2353509;
	}

	public double getERR2353808() {
		return ERR2353808;
	}

	public void setERR2353808(double eRR2353808) {
		ERR2353808 = eRR2353808;
	}

	public double getERR2353809() {
		return ERR2353809;
	}

	public void setERR2353809(double eRR2353809) {
		ERR2353809 = eRR2353809;
	}

	public double getERR2353810() {
		return ERR2353810;
	}

	public void setERR2353810(double eRR2353810) {
		ERR2353810 = eRR2353810;
	}

	public double getERR2353811() {
		return ERR2353811;
	}

	public void setERR2353811(double eRR2353811) {
		ERR2353811 = eRR2353811;
	}

	public double getERR2353812() {
		return ERR2353812;
	}

	public void setERR2353812(double eRR2353812) {
		ERR2353812 = eRR2353812;
	}

	public double getERR2353813() {
		return ERR2353813;
	}

	public void setERR2353813(double eRR2353813) {
		ERR2353813 = eRR2353813;
	}

	public double getERR2353814() {
		return ERR2353814;
	}

	public void setERR2353814(double eRR2353814) {
		ERR2353814 = eRR2353814;
	}

	public double getERR2354320() {
		return ERR2354320;
	}

	public void setERR2354320(double eRR2354320) {
		ERR2354320 = eRR2354320;
	}

	public double getERR2354321() {
		return ERR2354321;
	}

	public void setERR2354321(double eRR2354321) {
		ERR2354321 = eRR2354321;
	}

	public double getERR2354322() {
		return ERR2354322;
	}

	public void setERR2354322(double eRR2354322) {
		ERR2354322 = eRR2354322;
	}

	public double getERR2354323() {
		return ERR2354323;
	}

	public void setERR2354323(double eRR2354323) {
		ERR2354323 = eRR2354323;
	}

	public double getERR2354324() {
		return ERR2354324;
	}

	public void setERR2354324(double eRR2354324) {
		ERR2354324 = eRR2354324;
	}

	public double getERR2354325() {
		return ERR2354325;
	}

	public void setERR2354325(double eRR2354325) {
		ERR2354325 = eRR2354325;
	}

	public double getERR2354326() {
		return ERR2354326;
	}

	public void setERR2354326(double eRR2354326) {
		ERR2354326 = eRR2354326;
	}

	public double getERR2354327() {
		return ERR2354327;
	}

	public void setERR2354327(double eRR2354327) {
		ERR2354327 = eRR2354327;
	}

	public double getERR2354328() {
		return ERR2354328;
	}

	public void setERR2354328(double eRR2354328) {
		ERR2354328 = eRR2354328;
	}

	public double getERR2354689() {
		return ERR2354689;
	}

	public void setERR2354689(double eRR2354689) {
		ERR2354689 = eRR2354689;
	}

	public double getERR2354690() {
		return ERR2354690;
	}

	public void setERR2354690(double eRR2354690) {
		ERR2354690 = eRR2354690;
	}

	public double getERR2354691() {
		return ERR2354691;
	}

	public void setERR2354691(double eRR2354691) {
		ERR2354691 = eRR2354691;
	}

	public double getERR2354692() {
		return ERR2354692;
	}

	public void setERR2354692(double eRR2354692) {
		ERR2354692 = eRR2354692;
	}

	public double getERR2354693() {
		return ERR2354693;
	}

	public void setERR2354693(double eRR2354693) {
		ERR2354693 = eRR2354693;
	}

	public double getERR2354694() {
		return ERR2354694;
	}

	public void setERR2354694(double eRR2354694) {
		ERR2354694 = eRR2354694;
	}

	public double getERR2354695() {
		return ERR2354695;
	}

	public void setERR2354695(double eRR2354695) {
		ERR2354695 = eRR2354695;
	}

	public double getERR2354696() {
		return ERR2354696;
	}

	public void setERR2354696(double eRR2354696) {
		ERR2354696 = eRR2354696;
	}

	public double getERR2354697() {
		return ERR2354697;
	}

	public void setERR2354697(double eRR2354697) {
		ERR2354697 = eRR2354697;
	}

	public double getERR2355049() {
		return ERR2355049;
	}

	public void setERR2355049(double eRR2355049) {
		ERR2355049 = eRR2355049;
	}

	public double getERR2355050() {
		return ERR2355050;
	}

	public void setERR2355050(double eRR2355050) {
		ERR2355050 = eRR2355050;
	}

	public double getERR2355051() {
		return ERR2355051;
	}

	public void setERR2355051(double eRR2355051) {
		ERR2355051 = eRR2355051;
	}

	public double getERR2355052() {
		return ERR2355052;
	}

	public void setERR2355052(double eRR2355052) {
		ERR2355052 = eRR2355052;
	}

	public double getERR2355053() {
		return ERR2355053;
	}

	public void setERR2355053(double eRR2355053) {
		ERR2355053 = eRR2355053;
	}

	public double getERR2355054() {
		return ERR2355054;
	}

	public void setERR2355054(double eRR2355054) {
		ERR2355054 = eRR2355054;
	}

	public double getERR2355055() {
		return ERR2355055;
	}

	public void setERR2355055(double eRR2355055) {
		ERR2355055 = eRR2355055;
	}

	public double getERR2355056() {
		return ERR2355056;
	}

	public void setERR2355056(double eRR2355056) {
		ERR2355056 = eRR2355056;
	}

	public double getERR2355057() {
		return ERR2355057;
	}

	public void setERR2355057(double eRR2355057) {
		ERR2355057 = eRR2355057;
	}

	public double getSRR24057894() {
		return SRR24057894;
	}

	public void setSRR24057894(double sRR24057894) {
		SRR24057894 = sRR24057894;
	}

	public double getSRR24057895() {
		return SRR24057895;
	}

	public void setSRR24057895(double sRR24057895) {
		SRR24057895 = sRR24057895;
	}

	public double getSRR24057896() {
		return SRR24057896;
	}

	public void setSRR24057896(double sRR24057896) {
		SRR24057896 = sRR24057896;
	}

	public double getSRR24057898() {
		return SRR24057898;
	}

	public void setSRR24057898(double sRR24057898) {
		SRR24057898 = sRR24057898;
	}

	@Override
	public String toString() {
		return "Rumen [id=" + id + ", gene=" + gene + ", ERR2352966=" + ERR2352966 + ", ERR2352967=" + ERR2352967
				+ ", ERR2352968=" + ERR2352968 + ", ERR2352969=" + ERR2352969 + ", ERR2352970=" + ERR2352970
				+ ", ERR2352971=" + ERR2352971 + ", ERR2352972=" + ERR2352972 + ", ERR2353501=" + ERR2353501
				+ ", ERR2353502=" + ERR2353502 + ", ERR2353503=" + ERR2353503 + ", ERR2353504=" + ERR2353504
				+ ", ERR2353505=" + ERR2353505 + ", ERR2353506=" + ERR2353506 + ", ERR2353507=" + ERR2353507
				+ ", ERR2353508=" + ERR2353508 + ", ERR2353509=" + ERR2353509 + ", ERR2353808=" + ERR2353808
				+ ", ERR2353809=" + ERR2353809 + ", ERR2353810=" + ERR2353810 + ", ERR2353811=" + ERR2353811
				+ ", ERR2353812=" + ERR2353812 + ", ERR2353813=" + ERR2353813 + ", ERR2353814=" + ERR2353814
				+ ", ERR2354320=" + ERR2354320 + ", ERR2354321=" + ERR2354321 + ", ERR2354322=" + ERR2354322
				+ ", ERR2354323=" + ERR2354323 + ", ERR2354324=" + ERR2354324 + ", ERR2354325=" + ERR2354325
				+ ", ERR2354326=" + ERR2354326 + ", ERR2354327=" + ERR2354327 + ", ERR2354328=" + ERR2354328
				+ ", ERR2354689=" + ERR2354689 + ", ERR2354690=" + ERR2354690 + ", ERR2354691=" + ERR2354691
				+ ", ERR2354692=" + ERR2354692 + ", ERR2354693=" + ERR2354693 + ", ERR2354694=" + ERR2354694
				+ ", ERR2354695=" + ERR2354695 + ", ERR2354696=" + ERR2354696 + ", ERR2354697=" + ERR2354697
				+ ", ERR2355049=" + ERR2355049 + ", ERR2355050=" + ERR2355050 + ", ERR2355051=" + ERR2355051
				+ ", ERR2355052=" + ERR2355052 + ", ERR2355053=" + ERR2355053 + ", ERR2355054=" + ERR2355054
				+ ", ERR2355055=" + ERR2355055 + ", ERR2355056=" + ERR2355056 + ", ERR2355057=" + ERR2355057
				+ ", SRR24057894=" + SRR24057894 + ", SRR24057895=" + SRR24057895 + ", SRR24057896=" + SRR24057896
				+ ", SRR24057898=" + SRR24057898 + "]";
	}

	 
}
