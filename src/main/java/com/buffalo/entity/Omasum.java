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
@Table(name = "omasum")
public class Omasum {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
	 @Column(name="ERR2352711")
	 private double ERR2352711;

	@Column(name="ERR2352712")
	 private double ERR2352712;

	@Column(name="ERR2352713")
	 private double ERR2352713;

	@Column(name="ERR2352714")
	 private double ERR2352714;

	@Column(name="ERR2352715")
	 private double ERR2352715;

	@Column(name="ERR2352716")
	 private double ERR2352716;

	@Column(name="ERR2352717")
	 private double ERR2352717;

	@Column(name="ERR2352718")
	 private double ERR2352718;

	@Column(name="ERR2352719")
	 private double ERR2352719;

	@Column(name="ERR2352892")
	 private double ERR2352892;

	@Column(name="ERR2352893")
	 private double ERR2352893;

	@Column(name="ERR2352894")
	 private double ERR2352894;

	@Column(name="ERR2352895")
	 private double ERR2352895;

	@Column(name="ERR2352896")
	 private double ERR2352896;

	@Column(name="ERR2352897")
	 private double ERR2352897;

	@Column(name="ERR2352898")
	 private double ERR2352898;

	@Column(name="ERR2353374")
	 private double ERR2353374;

	@Column(name="ERR2353375")
	 private double ERR2353375;

	@Column(name="ERR2353376")
	 private double ERR2353376;

	@Column(name="ERR2353377")
	 private double ERR2353377;

	@Column(name="ERR2353379")
	 private double ERR2353379;

	@Column(name="ERR2353380")
	 private double ERR2353380;

	@Column(name="ERR2353381")
	 private double ERR2353381;

	@Column(name="ERR2353382")
	 private double ERR2353382;

	@Column(name="ERR2353743")
	 private double ERR2353743;

	@Column(name="ERR2353744")
	 private double ERR2353744;

	@Column(name="ERR2353745")
	 private double ERR2353745;

	@Column(name="ERR2353746")
	 private double ERR2353746;

	@Column(name="ERR2353747")
	 private double ERR2353747;

	@Column(name="ERR2353748")
	 private double ERR2353748;

	@Column(name="ERR2353749")
	 private double ERR2353749;

	@Column(name="ERR2354225")
	 private double ERR2354225;

	@Column(name="ERR2354226")
	 private double ERR2354226;

	@Column(name="ERR2354227")
	 private double ERR2354227;

	@Column(name="ERR2354228")
	 private double ERR2354228;

	@Column(name="ERR2354229")
	 private double ERR2354229;

	@Column(name="ERR2354230")
	 private double ERR2354230;

	@Column(name="ERR2354231")
	 private double ERR2354231;

	@Column(name="ERR2354232")
	 private double ERR2354232;

	@Column(name="ERR2354233")
	 private double ERR2354233;

	@Column(name="ERR2354598")
	 private double ERR2354598;

	@Column(name="ERR2354599")
	 private double ERR2354599;

	@Column(name="ERR2354600")
	 private double ERR2354600;

	@Column(name="ERR2354601")
	 private double ERR2354601;

	@Column(name="ERR2354602")
	 private double ERR2354602;

	@Column(name="ERR2354603")
	 private double ERR2354603;

	@Column(name="ERR2354604")
	 private double ERR2354604;

	@Column(name="ERR2354605")
	 private double ERR2354605;

	@Column(name="ERR2354606")
	 private double ERR2354606;

	@Column(name="ERR2354839")
	 private double ERR2354839;

	@Column(name="ERR2354840")
	 private double ERR2354840;

	@Column(name="ERR2354841")
	 private double ERR2354841;

	@Column(name="ERR2354842")
	 private double ERR2354842;

	@Column(name="ERR2354843")
	 private double ERR2354843;

	@Column(name="ERR2354844")
	 private double ERR2354844;

	@Column(name="ERR2354845")
	 private double ERR2354845;

	@Column(name="ERR2354846")
	 private double ERR2354846;

	@Column(name="ERR2354847")
	 private double ERR2354847;

	public Omasum() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Omasum(int id, Genes gene, double eRR2352711, double eRR2352712, double eRR2352713, double eRR2352714,
			double eRR2352715, double eRR2352716, double eRR2352717, double eRR2352718, double eRR2352719,
			double eRR2352892, double eRR2352893, double eRR2352894, double eRR2352895, double eRR2352896,
			double eRR2352897, double eRR2352898, double eRR2353374, double eRR2353375, double eRR2353376,
			double eRR2353377, double eRR2353379, double eRR2353380, double eRR2353381, double eRR2353382,
			double eRR2353743, double eRR2353744, double eRR2353745, double eRR2353746, double eRR2353747,
			double eRR2353748, double eRR2353749, double eRR2354225, double eRR2354226, double eRR2354227,
			double eRR2354228, double eRR2354229, double eRR2354230, double eRR2354231, double eRR2354232,
			double eRR2354233, double eRR2354598, double eRR2354599, double eRR2354600, double eRR2354601,
			double eRR2354602, double eRR2354603, double eRR2354604, double eRR2354605, double eRR2354606,
			double eRR2354839, double eRR2354840, double eRR2354841, double eRR2354842, double eRR2354843,
			double eRR2354844, double eRR2354845, double eRR2354846, double eRR2354847) {
		super();
		this.id = id;
		this.gene = gene;
		ERR2352711 = eRR2352711;
		ERR2352712 = eRR2352712;
		ERR2352713 = eRR2352713;
		ERR2352714 = eRR2352714;
		ERR2352715 = eRR2352715;
		ERR2352716 = eRR2352716;
		ERR2352717 = eRR2352717;
		ERR2352718 = eRR2352718;
		ERR2352719 = eRR2352719;
		ERR2352892 = eRR2352892;
		ERR2352893 = eRR2352893;
		ERR2352894 = eRR2352894;
		ERR2352895 = eRR2352895;
		ERR2352896 = eRR2352896;
		ERR2352897 = eRR2352897;
		ERR2352898 = eRR2352898;
		ERR2353374 = eRR2353374;
		ERR2353375 = eRR2353375;
		ERR2353376 = eRR2353376;
		ERR2353377 = eRR2353377;
		ERR2353379 = eRR2353379;
		ERR2353380 = eRR2353380;
		ERR2353381 = eRR2353381;
		ERR2353382 = eRR2353382;
		ERR2353743 = eRR2353743;
		ERR2353744 = eRR2353744;
		ERR2353745 = eRR2353745;
		ERR2353746 = eRR2353746;
		ERR2353747 = eRR2353747;
		ERR2353748 = eRR2353748;
		ERR2353749 = eRR2353749;
		ERR2354225 = eRR2354225;
		ERR2354226 = eRR2354226;
		ERR2354227 = eRR2354227;
		ERR2354228 = eRR2354228;
		ERR2354229 = eRR2354229;
		ERR2354230 = eRR2354230;
		ERR2354231 = eRR2354231;
		ERR2354232 = eRR2354232;
		ERR2354233 = eRR2354233;
		ERR2354598 = eRR2354598;
		ERR2354599 = eRR2354599;
		ERR2354600 = eRR2354600;
		ERR2354601 = eRR2354601;
		ERR2354602 = eRR2354602;
		ERR2354603 = eRR2354603;
		ERR2354604 = eRR2354604;
		ERR2354605 = eRR2354605;
		ERR2354606 = eRR2354606;
		ERR2354839 = eRR2354839;
		ERR2354840 = eRR2354840;
		ERR2354841 = eRR2354841;
		ERR2354842 = eRR2354842;
		ERR2354843 = eRR2354843;
		ERR2354844 = eRR2354844;
		ERR2354845 = eRR2354845;
		ERR2354846 = eRR2354846;
		ERR2354847 = eRR2354847;
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

	public double getERR2352711() {
		return ERR2352711;
	}

	public void setERR2352711(double eRR2352711) {
		ERR2352711 = eRR2352711;
	}

	public double getERR2352712() {
		return ERR2352712;
	}

	public void setERR2352712(double eRR2352712) {
		ERR2352712 = eRR2352712;
	}

	public double getERR2352713() {
		return ERR2352713;
	}

	public void setERR2352713(double eRR2352713) {
		ERR2352713 = eRR2352713;
	}

	public double getERR2352714() {
		return ERR2352714;
	}

	public void setERR2352714(double eRR2352714) {
		ERR2352714 = eRR2352714;
	}

	public double getERR2352715() {
		return ERR2352715;
	}

	public void setERR2352715(double eRR2352715) {
		ERR2352715 = eRR2352715;
	}

	public double getERR2352716() {
		return ERR2352716;
	}

	public void setERR2352716(double eRR2352716) {
		ERR2352716 = eRR2352716;
	}

	public double getERR2352717() {
		return ERR2352717;
	}

	public void setERR2352717(double eRR2352717) {
		ERR2352717 = eRR2352717;
	}

	public double getERR2352718() {
		return ERR2352718;
	}

	public void setERR2352718(double eRR2352718) {
		ERR2352718 = eRR2352718;
	}

	public double getERR2352719() {
		return ERR2352719;
	}

	public void setERR2352719(double eRR2352719) {
		ERR2352719 = eRR2352719;
	}

	public double getERR2352892() {
		return ERR2352892;
	}

	public void setERR2352892(double eRR2352892) {
		ERR2352892 = eRR2352892;
	}

	public double getERR2352893() {
		return ERR2352893;
	}

	public void setERR2352893(double eRR2352893) {
		ERR2352893 = eRR2352893;
	}

	public double getERR2352894() {
		return ERR2352894;
	}

	public void setERR2352894(double eRR2352894) {
		ERR2352894 = eRR2352894;
	}

	public double getERR2352895() {
		return ERR2352895;
	}

	public void setERR2352895(double eRR2352895) {
		ERR2352895 = eRR2352895;
	}

	public double getERR2352896() {
		return ERR2352896;
	}

	public void setERR2352896(double eRR2352896) {
		ERR2352896 = eRR2352896;
	}

	public double getERR2352897() {
		return ERR2352897;
	}

	public void setERR2352897(double eRR2352897) {
		ERR2352897 = eRR2352897;
	}

	public double getERR2352898() {
		return ERR2352898;
	}

	public void setERR2352898(double eRR2352898) {
		ERR2352898 = eRR2352898;
	}

	public double getERR2353374() {
		return ERR2353374;
	}

	public void setERR2353374(double eRR2353374) {
		ERR2353374 = eRR2353374;
	}

	public double getERR2353375() {
		return ERR2353375;
	}

	public void setERR2353375(double eRR2353375) {
		ERR2353375 = eRR2353375;
	}

	public double getERR2353376() {
		return ERR2353376;
	}

	public void setERR2353376(double eRR2353376) {
		ERR2353376 = eRR2353376;
	}

	public double getERR2353377() {
		return ERR2353377;
	}

	public void setERR2353377(double eRR2353377) {
		ERR2353377 = eRR2353377;
	}

	public double getERR2353379() {
		return ERR2353379;
	}

	public void setERR2353379(double eRR2353379) {
		ERR2353379 = eRR2353379;
	}

	public double getERR2353380() {
		return ERR2353380;
	}

	public void setERR2353380(double eRR2353380) {
		ERR2353380 = eRR2353380;
	}

	public double getERR2353381() {
		return ERR2353381;
	}

	public void setERR2353381(double eRR2353381) {
		ERR2353381 = eRR2353381;
	}

	public double getERR2353382() {
		return ERR2353382;
	}

	public void setERR2353382(double eRR2353382) {
		ERR2353382 = eRR2353382;
	}

	public double getERR2353743() {
		return ERR2353743;
	}

	public void setERR2353743(double eRR2353743) {
		ERR2353743 = eRR2353743;
	}

	public double getERR2353744() {
		return ERR2353744;
	}

	public void setERR2353744(double eRR2353744) {
		ERR2353744 = eRR2353744;
	}

	public double getERR2353745() {
		return ERR2353745;
	}

	public void setERR2353745(double eRR2353745) {
		ERR2353745 = eRR2353745;
	}

	public double getERR2353746() {
		return ERR2353746;
	}

	public void setERR2353746(double eRR2353746) {
		ERR2353746 = eRR2353746;
	}

	public double getERR2353747() {
		return ERR2353747;
	}

	public void setERR2353747(double eRR2353747) {
		ERR2353747 = eRR2353747;
	}

	public double getERR2353748() {
		return ERR2353748;
	}

	public void setERR2353748(double eRR2353748) {
		ERR2353748 = eRR2353748;
	}

	public double getERR2353749() {
		return ERR2353749;
	}

	public void setERR2353749(double eRR2353749) {
		ERR2353749 = eRR2353749;
	}

	public double getERR2354225() {
		return ERR2354225;
	}

	public void setERR2354225(double eRR2354225) {
		ERR2354225 = eRR2354225;
	}

	public double getERR2354226() {
		return ERR2354226;
	}

	public void setERR2354226(double eRR2354226) {
		ERR2354226 = eRR2354226;
	}

	public double getERR2354227() {
		return ERR2354227;
	}

	public void setERR2354227(double eRR2354227) {
		ERR2354227 = eRR2354227;
	}

	public double getERR2354228() {
		return ERR2354228;
	}

	public void setERR2354228(double eRR2354228) {
		ERR2354228 = eRR2354228;
	}

	public double getERR2354229() {
		return ERR2354229;
	}

	public void setERR2354229(double eRR2354229) {
		ERR2354229 = eRR2354229;
	}

	public double getERR2354230() {
		return ERR2354230;
	}

	public void setERR2354230(double eRR2354230) {
		ERR2354230 = eRR2354230;
	}

	public double getERR2354231() {
		return ERR2354231;
	}

	public void setERR2354231(double eRR2354231) {
		ERR2354231 = eRR2354231;
	}

	public double getERR2354232() {
		return ERR2354232;
	}

	public void setERR2354232(double eRR2354232) {
		ERR2354232 = eRR2354232;
	}

	public double getERR2354233() {
		return ERR2354233;
	}

	public void setERR2354233(double eRR2354233) {
		ERR2354233 = eRR2354233;
	}

	public double getERR2354598() {
		return ERR2354598;
	}

	public void setERR2354598(double eRR2354598) {
		ERR2354598 = eRR2354598;
	}

	public double getERR2354599() {
		return ERR2354599;
	}

	public void setERR2354599(double eRR2354599) {
		ERR2354599 = eRR2354599;
	}

	public double getERR2354600() {
		return ERR2354600;
	}

	public void setERR2354600(double eRR2354600) {
		ERR2354600 = eRR2354600;
	}

	public double getERR2354601() {
		return ERR2354601;
	}

	public void setERR2354601(double eRR2354601) {
		ERR2354601 = eRR2354601;
	}

	public double getERR2354602() {
		return ERR2354602;
	}

	public void setERR2354602(double eRR2354602) {
		ERR2354602 = eRR2354602;
	}

	public double getERR2354603() {
		return ERR2354603;
	}

	public void setERR2354603(double eRR2354603) {
		ERR2354603 = eRR2354603;
	}

	public double getERR2354604() {
		return ERR2354604;
	}

	public void setERR2354604(double eRR2354604) {
		ERR2354604 = eRR2354604;
	}

	public double getERR2354605() {
		return ERR2354605;
	}

	public void setERR2354605(double eRR2354605) {
		ERR2354605 = eRR2354605;
	}

	public double getERR2354606() {
		return ERR2354606;
	}

	public void setERR2354606(double eRR2354606) {
		ERR2354606 = eRR2354606;
	}

	public double getERR2354839() {
		return ERR2354839;
	}

	public void setERR2354839(double eRR2354839) {
		ERR2354839 = eRR2354839;
	}

	public double getERR2354840() {
		return ERR2354840;
	}

	public void setERR2354840(double eRR2354840) {
		ERR2354840 = eRR2354840;
	}

	public double getERR2354841() {
		return ERR2354841;
	}

	public void setERR2354841(double eRR2354841) {
		ERR2354841 = eRR2354841;
	}

	public double getERR2354842() {
		return ERR2354842;
	}

	public void setERR2354842(double eRR2354842) {
		ERR2354842 = eRR2354842;
	}

	public double getERR2354843() {
		return ERR2354843;
	}

	public void setERR2354843(double eRR2354843) {
		ERR2354843 = eRR2354843;
	}

	public double getERR2354844() {
		return ERR2354844;
	}

	public void setERR2354844(double eRR2354844) {
		ERR2354844 = eRR2354844;
	}

	public double getERR2354845() {
		return ERR2354845;
	}

	public void setERR2354845(double eRR2354845) {
		ERR2354845 = eRR2354845;
	}

	public double getERR2354846() {
		return ERR2354846;
	}

	public void setERR2354846(double eRR2354846) {
		ERR2354846 = eRR2354846;
	}

	public double getERR2354847() {
		return ERR2354847;
	}

	public void setERR2354847(double eRR2354847) {
		ERR2354847 = eRR2354847;
	}

	@Override
	public String toString() {
		return "Omasum [id=" + id + ", gene=" + gene + ", ERR2352711=" + ERR2352711 + ", ERR2352712=" + ERR2352712
				+ ", ERR2352713=" + ERR2352713 + ", ERR2352714=" + ERR2352714 + ", ERR2352715=" + ERR2352715
				+ ", ERR2352716=" + ERR2352716 + ", ERR2352717=" + ERR2352717 + ", ERR2352718=" + ERR2352718
				+ ", ERR2352719=" + ERR2352719 + ", ERR2352892=" + ERR2352892 + ", ERR2352893=" + ERR2352893
				+ ", ERR2352894=" + ERR2352894 + ", ERR2352895=" + ERR2352895 + ", ERR2352896=" + ERR2352896
				+ ", ERR2352897=" + ERR2352897 + ", ERR2352898=" + ERR2352898 + ", ERR2353374=" + ERR2353374
				+ ", ERR2353375=" + ERR2353375 + ", ERR2353376=" + ERR2353376 + ", ERR2353377=" + ERR2353377
				+ ", ERR2353379=" + ERR2353379 + ", ERR2353380=" + ERR2353380 + ", ERR2353381=" + ERR2353381
				+ ", ERR2353382=" + ERR2353382 + ", ERR2353743=" + ERR2353743 + ", ERR2353744=" + ERR2353744
				+ ", ERR2353745=" + ERR2353745 + ", ERR2353746=" + ERR2353746 + ", ERR2353747=" + ERR2353747
				+ ", ERR2353748=" + ERR2353748 + ", ERR2353749=" + ERR2353749 + ", ERR2354225=" + ERR2354225
				+ ", ERR2354226=" + ERR2354226 + ", ERR2354227=" + ERR2354227 + ", ERR2354228=" + ERR2354228
				+ ", ERR2354229=" + ERR2354229 + ", ERR2354230=" + ERR2354230 + ", ERR2354231=" + ERR2354231
				+ ", ERR2354232=" + ERR2354232 + ", ERR2354233=" + ERR2354233 + ", ERR2354598=" + ERR2354598
				+ ", ERR2354599=" + ERR2354599 + ", ERR2354600=" + ERR2354600 + ", ERR2354601=" + ERR2354601
				+ ", ERR2354602=" + ERR2354602 + ", ERR2354603=" + ERR2354603 + ", ERR2354604=" + ERR2354604
				+ ", ERR2354605=" + ERR2354605 + ", ERR2354606=" + ERR2354606 + ", ERR2354839=" + ERR2354839
				+ ", ERR2354840=" + ERR2354840 + ", ERR2354841=" + ERR2354841 + ", ERR2354842=" + ERR2354842
				+ ", ERR2354843=" + ERR2354843 + ", ERR2354844=" + ERR2354844 + ", ERR2354845=" + ERR2354845
				+ ", ERR2354846=" + ERR2354846 + ", ERR2354847=" + ERR2354847 + "]";
	}
}
