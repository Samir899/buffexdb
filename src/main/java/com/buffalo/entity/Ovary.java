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
@Table(name = "ovary")
public class Ovary {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
	 @Column(name="SRR13931407")
	 private double SRR13931407;

	 @Column(name="SRR13931408")
	 private double SRR13931408;

	 @Column(name="SRR13931409")
	 private double SRR13931409;

	 @Column(name="SRR13931410")
	 private double SRR13931410;

	 @Column(name="SRR13931411")
	 private double SRR13931411;

	 @Column(name="SRR13931412")
	 private double SRR13931412;

	 @Column(name="SRR13931413")
	 private double SRR13931413;

	 @Column(name="SRR13931414")
	 private double SRR13931414;

	 @Column(name="SRR13931415")
	 private double SRR13931415;

	 @Column(name="SRR15721744")
	 private double SRR15721744;

	 @Column(name="SRR24057913")
	 private double SRR24057913;

	 @Column(name="SRR24057914")
	 private double SRR24057914;

	 @Column(name="SRR24057915")
	 private double SRR24057915;

	 @Column(name="SRR18933388")
	 private double SRR18933388;

	public Ovary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ovary(int id, Genes gene, double sRR13931407, double sRR13931408, double sRR13931409, double sRR13931410,
			double sRR13931411, double sRR13931412, double sRR13931413, double sRR13931414, double sRR13931415,
			double sRR15721744, double sRR24057913, double sRR24057914, double sRR24057915, double sRR18933388) {
		super();
		this.id = id;
		this.gene = gene;
		SRR13931407 = sRR13931407;
		SRR13931408 = sRR13931408;
		SRR13931409 = sRR13931409;
		SRR13931410 = sRR13931410;
		SRR13931411 = sRR13931411;
		SRR13931412 = sRR13931412;
		SRR13931413 = sRR13931413;
		SRR13931414 = sRR13931414;
		SRR13931415 = sRR13931415;
		SRR15721744 = sRR15721744;
		SRR24057913 = sRR24057913;
		SRR24057914 = sRR24057914;
		SRR24057915 = sRR24057915;
		SRR18933388 = sRR18933388;
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

	public double getSRR13931407() {
		return SRR13931407;
	}

	public void setSRR13931407(double sRR13931407) {
		SRR13931407 = sRR13931407;
	}

	public double getSRR13931408() {
		return SRR13931408;
	}

	public void setSRR13931408(double sRR13931408) {
		SRR13931408 = sRR13931408;
	}

	public double getSRR13931409() {
		return SRR13931409;
	}

	public void setSRR13931409(double sRR13931409) {
		SRR13931409 = sRR13931409;
	}

	public double getSRR13931410() {
		return SRR13931410;
	}

	public void setSRR13931410(double sRR13931410) {
		SRR13931410 = sRR13931410;
	}

	public double getSRR13931411() {
		return SRR13931411;
	}

	public void setSRR13931411(double sRR13931411) {
		SRR13931411 = sRR13931411;
	}

	public double getSRR13931412() {
		return SRR13931412;
	}

	public void setSRR13931412(double sRR13931412) {
		SRR13931412 = sRR13931412;
	}

	public double getSRR13931413() {
		return SRR13931413;
	}

	public void setSRR13931413(double sRR13931413) {
		SRR13931413 = sRR13931413;
	}

	public double getSRR13931414() {
		return SRR13931414;
	}

	public void setSRR13931414(double sRR13931414) {
		SRR13931414 = sRR13931414;
	}

	public double getSRR13931415() {
		return SRR13931415;
	}

	public void setSRR13931415(double sRR13931415) {
		SRR13931415 = sRR13931415;
	}

	public double getSRR15721744() {
		return SRR15721744;
	}

	public void setSRR15721744(double sRR15721744) {
		SRR15721744 = sRR15721744;
	}

	public double getSRR24057913() {
		return SRR24057913;
	}

	public void setSRR24057913(double sRR24057913) {
		SRR24057913 = sRR24057913;
	}

	public double getSRR24057914() {
		return SRR24057914;
	}

	public void setSRR24057914(double sRR24057914) {
		SRR24057914 = sRR24057914;
	}

	public double getSRR24057915() {
		return SRR24057915;
	}

	public void setSRR24057915(double sRR24057915) {
		SRR24057915 = sRR24057915;
	}

	public double getSRR18933388() {
		return SRR18933388;
	}

	public void setSRR18933388(double sRR18933388) {
		SRR18933388 = sRR18933388;
	}

	@Override
	public String toString() {
		return "Ovary [id=" + id + ", gene=" + gene + ", SRR13931407=" + SRR13931407 + ", SRR13931408=" + SRR13931408
				+ ", SRR13931409=" + SRR13931409 + ", SRR13931410=" + SRR13931410 + ", SRR13931411=" + SRR13931411
				+ ", SRR13931412=" + SRR13931412 + ", SRR13931413=" + SRR13931413 + ", SRR13931414=" + SRR13931414
				+ ", SRR13931415=" + SRR13931415 + ", SRR15721744=" + SRR15721744 + ", SRR24057913=" + SRR24057913
				+ ", SRR24057914=" + SRR24057914 + ", SRR24057915=" + SRR24057915 + ", SRR18933388=" + SRR18933388
				+ "]";
	}
	 
	 
}
