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
@Table(name = "pituitary")
public class Pituitary {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
	 @Column(name="ERR2352922")
	 private double ERR2352922;

	@Column(name="ERR2352923")
	 private double ERR2352923;

	@Column(name="ERR2352924")
	 private double ERR2352924;

	@Column(name="ERR2352925")
	 private double ERR2352925;

	@Column(name="ERR2352926")
	 private double ERR2352926;

	@Column(name="ERR2352927")
	 private double ERR2352927;

	@Column(name="ERR2352928")
	 private double ERR2352928;

	@Column(name="ERR2353764")
	 private double ERR2353764;

	@Column(name="ERR2353765")
	 private double ERR2353765;

	@Column(name="ERR2353766")
	 private double ERR2353766;

	@Column(name="ERR2353767")
	 private double ERR2353767;

	@Column(name="ERR2353768")
	 private double ERR2353768;

	@Column(name="ERR2353769")
	 private double ERR2353769;

	@Column(name="ERR2353770")
	 private double ERR2353770;

	@Column(name="SRR24057909")
	 private double SRR24057909;

	@Column(name="SRR24057910")
	 private double SRR24057910;

	@Column(name="SRR24057911")
	 private double SRR24057911;

	@Column(name="SRR24057912")
	 private double SRR24057912;

	public Pituitary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pituitary(int id, Genes gene, double eRR2352922, double eRR2352923, double eRR2352924, double eRR2352925,
			double eRR2352926, double eRR2352927, double eRR2352928, double eRR2353764, double eRR2353765,
			double eRR2353766, double eRR2353767, double eRR2353768, double eRR2353769, double eRR2353770,
			double sRR24057909, double sRR24057910, double sRR24057911, double sRR24057912) {
		super();
		this.id = id;
		this.gene = gene;
		ERR2352922 = eRR2352922;
		ERR2352923 = eRR2352923;
		ERR2352924 = eRR2352924;
		ERR2352925 = eRR2352925;
		ERR2352926 = eRR2352926;
		ERR2352927 = eRR2352927;
		ERR2352928 = eRR2352928;
		ERR2353764 = eRR2353764;
		ERR2353765 = eRR2353765;
		ERR2353766 = eRR2353766;
		ERR2353767 = eRR2353767;
		ERR2353768 = eRR2353768;
		ERR2353769 = eRR2353769;
		ERR2353770 = eRR2353770;
		SRR24057909 = sRR24057909;
		SRR24057910 = sRR24057910;
		SRR24057911 = sRR24057911;
		SRR24057912 = sRR24057912;
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

	public double getERR2352922() {
		return ERR2352922;
	}

	public void setERR2352922(double eRR2352922) {
		ERR2352922 = eRR2352922;
	}

	public double getERR2352923() {
		return ERR2352923;
	}

	public void setERR2352923(double eRR2352923) {
		ERR2352923 = eRR2352923;
	}

	public double getERR2352924() {
		return ERR2352924;
	}

	public void setERR2352924(double eRR2352924) {
		ERR2352924 = eRR2352924;
	}

	public double getERR2352925() {
		return ERR2352925;
	}

	public void setERR2352925(double eRR2352925) {
		ERR2352925 = eRR2352925;
	}

	public double getERR2352926() {
		return ERR2352926;
	}

	public void setERR2352926(double eRR2352926) {
		ERR2352926 = eRR2352926;
	}

	public double getERR2352927() {
		return ERR2352927;
	}

	public void setERR2352927(double eRR2352927) {
		ERR2352927 = eRR2352927;
	}

	public double getERR2352928() {
		return ERR2352928;
	}

	public void setERR2352928(double eRR2352928) {
		ERR2352928 = eRR2352928;
	}

	public double getERR2353764() {
		return ERR2353764;
	}

	public void setERR2353764(double eRR2353764) {
		ERR2353764 = eRR2353764;
	}

	public double getERR2353765() {
		return ERR2353765;
	}

	public void setERR2353765(double eRR2353765) {
		ERR2353765 = eRR2353765;
	}

	public double getERR2353766() {
		return ERR2353766;
	}

	public void setERR2353766(double eRR2353766) {
		ERR2353766 = eRR2353766;
	}

	public double getERR2353767() {
		return ERR2353767;
	}

	public void setERR2353767(double eRR2353767) {
		ERR2353767 = eRR2353767;
	}

	public double getERR2353768() {
		return ERR2353768;
	}

	public void setERR2353768(double eRR2353768) {
		ERR2353768 = eRR2353768;
	}

	public double getERR2353769() {
		return ERR2353769;
	}

	public void setERR2353769(double eRR2353769) {
		ERR2353769 = eRR2353769;
	}

	public double getERR2353770() {
		return ERR2353770;
	}

	public void setERR2353770(double eRR2353770) {
		ERR2353770 = eRR2353770;
	}

	public double getSRR24057909() {
		return SRR24057909;
	}

	public void setSRR24057909(double sRR24057909) {
		SRR24057909 = sRR24057909;
	}

	public double getSRR24057910() {
		return SRR24057910;
	}

	public void setSRR24057910(double sRR24057910) {
		SRR24057910 = sRR24057910;
	}

	public double getSRR24057911() {
		return SRR24057911;
	}

	public void setSRR24057911(double sRR24057911) {
		SRR24057911 = sRR24057911;
	}

	public double getSRR24057912() {
		return SRR24057912;
	}

	public void setSRR24057912(double sRR24057912) {
		SRR24057912 = sRR24057912;
	}

	@Override
	public String toString() {
		return "Pituitary [id=" + id + ", gene=" + gene + ", ERR2352922=" + ERR2352922 + ", ERR2352923=" + ERR2352923
				+ ", ERR2352924=" + ERR2352924 + ", ERR2352925=" + ERR2352925 + ", ERR2352926=" + ERR2352926
				+ ", ERR2352927=" + ERR2352927 + ", ERR2352928=" + ERR2352928 + ", ERR2353764=" + ERR2353764
				+ ", ERR2353765=" + ERR2353765 + ", ERR2353766=" + ERR2353766 + ", ERR2353767=" + ERR2353767
				+ ", ERR2353768=" + ERR2353768 + ", ERR2353769=" + ERR2353769 + ", ERR2353770=" + ERR2353770
				+ ", SRR24057909=" + SRR24057909 + ", SRR24057910=" + SRR24057910 + ", SRR24057911=" + SRR24057911
				+ ", SRR24057912=" + SRR24057912 + "]";
	}
}
