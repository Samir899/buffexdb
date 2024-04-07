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
@Table(name = "fallopian_tube")

public class Fallopian_tube {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;

	 @Column(name="ERR2352810")
	 private double ERR2352810;
	 
	@Column(name="ERR2352811")
	 private double ERR2352811;
	
	@Column(name="ERR2352812")
	 private double ERR2352812;
	
	@Column(name="ERR2352813")
	 private double ERR2352813;
	
	@Column(name="ERR2352814")
	 private double ERR2352814;
	
	@Column(name="ERR2352815")
	 private double ERR2352815;
	
	@Column(name="ERR2352816")
	 private double ERR2352816;
	
	@Column(name="ERR2353168")
	 private double ERR2353168;
	
	@Column(name="ERR2353169")
	 private double ERR2353169;
	
	@Column(name="ERR2353170")
	 private double ERR2353170;
	
	@Column(name="ERR2353171")
	 private double ERR2353171;
	
	@Column(name="ERR2353172")
	 private double ERR2353172;
	
	@Column(name="ERR2353173")
	 private double ERR2353173;
	
	@Column(name="ERR2353174")
	 private double ERR2353174;
	
	@Column(name="ERR2353175")
	 private double ERR2353175;
	
	@Column(name="ERR2353176")
	 private double ERR2353176;
	
	@Column(name="ERR2354465")
	 private double ERR2354465;
	
	@Column(name="ERR2354466")
	 private double ERR2354466;
	
	@Column(name="ERR2354467")
	 private double ERR2354467;
	
	@Column(name="ERR2354468")
	 private double ERR2354468;
	
	@Column(name="ERR2354469")
	 private double ERR2354469;
	
	@Column(name="ERR2354470")
	 private double ERR2354470;
	
	@Column(name="ERR2354471")
	 private double ERR2354471;
	
	@Column(name="ERR2354472")
	 private double ERR2354472;
	
	@Column(name="ERR2354473")
	 private double ERR2354473;

	public Fallopian_tube() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fallopian_tube(int id, Genes gene, double eRR2352810, double eRR2352811, double eRR2352812,
			double eRR2352813, double eRR2352814, double eRR2352815, double eRR2352816, double eRR2353168,
			double eRR2353169, double eRR2353170, double eRR2353171, double eRR2353172, double eRR2353173,
			double eRR2353174, double eRR2353175, double eRR2353176, double eRR2354465, double eRR2354466,
			double eRR2354467, double eRR2354468, double eRR2354469, double eRR2354470, double eRR2354471,
			double eRR2354472, double eRR2354473) {
		super();
		this.id = id;
		this.gene = gene;
		ERR2352810 = eRR2352810;
		ERR2352811 = eRR2352811;
		ERR2352812 = eRR2352812;
		ERR2352813 = eRR2352813;
		ERR2352814 = eRR2352814;
		ERR2352815 = eRR2352815;
		ERR2352816 = eRR2352816;
		ERR2353168 = eRR2353168;
		ERR2353169 = eRR2353169;
		ERR2353170 = eRR2353170;
		ERR2353171 = eRR2353171;
		ERR2353172 = eRR2353172;
		ERR2353173 = eRR2353173;
		ERR2353174 = eRR2353174;
		ERR2353175 = eRR2353175;
		ERR2353176 = eRR2353176;
		ERR2354465 = eRR2354465;
		ERR2354466 = eRR2354466;
		ERR2354467 = eRR2354467;
		ERR2354468 = eRR2354468;
		ERR2354469 = eRR2354469;
		ERR2354470 = eRR2354470;
		ERR2354471 = eRR2354471;
		ERR2354472 = eRR2354472;
		ERR2354473 = eRR2354473;
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

	public double getERR2352810() {
		return ERR2352810;
	}

	public void setERR2352810(double eRR2352810) {
		ERR2352810 = eRR2352810;
	}

	public double getERR2352811() {
		return ERR2352811;
	}

	public void setERR2352811(double eRR2352811) {
		ERR2352811 = eRR2352811;
	}

	public double getERR2352812() {
		return ERR2352812;
	}

	public void setERR2352812(double eRR2352812) {
		ERR2352812 = eRR2352812;
	}

	public double getERR2352813() {
		return ERR2352813;
	}

	public void setERR2352813(double eRR2352813) {
		ERR2352813 = eRR2352813;
	}

	public double getERR2352814() {
		return ERR2352814;
	}

	public void setERR2352814(double eRR2352814) {
		ERR2352814 = eRR2352814;
	}

	public double getERR2352815() {
		return ERR2352815;
	}

	public void setERR2352815(double eRR2352815) {
		ERR2352815 = eRR2352815;
	}

	public double getERR2352816() {
		return ERR2352816;
	}

	public void setERR2352816(double eRR2352816) {
		ERR2352816 = eRR2352816;
	}

	public double getERR2353168() {
		return ERR2353168;
	}

	public void setERR2353168(double eRR2353168) {
		ERR2353168 = eRR2353168;
	}

	public double getERR2353169() {
		return ERR2353169;
	}

	public void setERR2353169(double eRR2353169) {
		ERR2353169 = eRR2353169;
	}

	public double getERR2353170() {
		return ERR2353170;
	}

	public void setERR2353170(double eRR2353170) {
		ERR2353170 = eRR2353170;
	}

	public double getERR2353171() {
		return ERR2353171;
	}

	public void setERR2353171(double eRR2353171) {
		ERR2353171 = eRR2353171;
	}

	public double getERR2353172() {
		return ERR2353172;
	}

	public void setERR2353172(double eRR2353172) {
		ERR2353172 = eRR2353172;
	}

	public double getERR2353173() {
		return ERR2353173;
	}

	public void setERR2353173(double eRR2353173) {
		ERR2353173 = eRR2353173;
	}

	public double getERR2353174() {
		return ERR2353174;
	}

	public void setERR2353174(double eRR2353174) {
		ERR2353174 = eRR2353174;
	}

	public double getERR2353175() {
		return ERR2353175;
	}

	public void setERR2353175(double eRR2353175) {
		ERR2353175 = eRR2353175;
	}

	public double getERR2353176() {
		return ERR2353176;
	}

	public void setERR2353176(double eRR2353176) {
		ERR2353176 = eRR2353176;
	}

	public double getERR2354465() {
		return ERR2354465;
	}

	public void setERR2354465(double eRR2354465) {
		ERR2354465 = eRR2354465;
	}

	public double getERR2354466() {
		return ERR2354466;
	}

	public void setERR2354466(double eRR2354466) {
		ERR2354466 = eRR2354466;
	}

	public double getERR2354467() {
		return ERR2354467;
	}

	public void setERR2354467(double eRR2354467) {
		ERR2354467 = eRR2354467;
	}

	public double getERR2354468() {
		return ERR2354468;
	}

	public void setERR2354468(double eRR2354468) {
		ERR2354468 = eRR2354468;
	}

	public double getERR2354469() {
		return ERR2354469;
	}

	public void setERR2354469(double eRR2354469) {
		ERR2354469 = eRR2354469;
	}

	public double getERR2354470() {
		return ERR2354470;
	}

	public void setERR2354470(double eRR2354470) {
		ERR2354470 = eRR2354470;
	}

	public double getERR2354471() {
		return ERR2354471;
	}

	public void setERR2354471(double eRR2354471) {
		ERR2354471 = eRR2354471;
	}

	public double getERR2354472() {
		return ERR2354472;
	}

	public void setERR2354472(double eRR2354472) {
		ERR2354472 = eRR2354472;
	}

	public double getERR2354473() {
		return ERR2354473;
	}

	public void setERR2354473(double eRR2354473) {
		ERR2354473 = eRR2354473;
	}

	@Override
	public String toString() {
		return "Fallopian_tube [id=" + id + ", gene=" + gene + ", ERR2352810=" + ERR2352810 + ", ERR2352811="
				+ ERR2352811 + ", ERR2352812=" + ERR2352812 + ", ERR2352813=" + ERR2352813 + ", ERR2352814="
				+ ERR2352814 + ", ERR2352815=" + ERR2352815 + ", ERR2352816=" + ERR2352816 + ", ERR2353168="
				+ ERR2353168 + ", ERR2353169=" + ERR2353169 + ", ERR2353170=" + ERR2353170 + ", ERR2353171="
				+ ERR2353171 + ", ERR2353172=" + ERR2353172 + ", ERR2353173=" + ERR2353173 + ", ERR2353174="
				+ ERR2353174 + ", ERR2353175=" + ERR2353175 + ", ERR2353176=" + ERR2353176 + ", ERR2354465="
				+ ERR2354465 + ", ERR2354466=" + ERR2354466 + ", ERR2354467=" + ERR2354467 + ", ERR2354468="
				+ ERR2354468 + ", ERR2354469=" + ERR2354469 + ", ERR2354470=" + ERR2354470 + ", ERR2354471="
				+ ERR2354471 + ", ERR2354472=" + ERR2354472 + ", ERR2354473=" + ERR2354473 + "]";
	}
	
	
}
