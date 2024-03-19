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
@Table(name = "oocyte")
public class Oocyte {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
	 @Column(name="SRR10863202")
	 private double SRR10863202;

	@Column(name="SRR10863203")
	 private double SRR10863203;

	@Column(name="SRR10863204")
	 private double SRR10863204;

	@Column(name="SRR10863205")
	 private double SRR10863205;

	@Column(name="SRR10863206")
	 private double SRR10863206;

	@Column(name="SRR10863207")
	 private double SRR10863207;

	@Column(name="SRR10863208")
	 private double SRR10863208;

	@Column(name="SRR10863209")
	 private double SRR10863209;

	@Column(name="SRR10863220")
	 private double SRR10863220;

	@Column(name="SRR10863221")
	 private double SRR10863221;

	@Column(name="SRR6425308")
	 private double SRR6425308;

	@Column(name="SRR6425309")
	 private double SRR6425309;

	public Oocyte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Oocyte(int id, Genes gene, double sRR10863202, double sRR10863203, double sRR10863204, double sRR10863205,
			double sRR10863206, double sRR10863207, double sRR10863208, double sRR10863209, double sRR10863220,
			double sRR10863221, double sRR6425308, double sRR6425309) {
		super();
		this.id = id;
		this.gene = gene;
		SRR10863202 = sRR10863202;
		SRR10863203 = sRR10863203;
		SRR10863204 = sRR10863204;
		SRR10863205 = sRR10863205;
		SRR10863206 = sRR10863206;
		SRR10863207 = sRR10863207;
		SRR10863208 = sRR10863208;
		SRR10863209 = sRR10863209;
		SRR10863220 = sRR10863220;
		SRR10863221 = sRR10863221;
		SRR6425308 = sRR6425308;
		SRR6425309 = sRR6425309;
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

	public double getSRR10863202() {
		return SRR10863202;
	}

	public void setSRR10863202(double sRR10863202) {
		SRR10863202 = sRR10863202;
	}

	public double getSRR10863203() {
		return SRR10863203;
	}

	public void setSRR10863203(double sRR10863203) {
		SRR10863203 = sRR10863203;
	}

	public double getSRR10863204() {
		return SRR10863204;
	}

	public void setSRR10863204(double sRR10863204) {
		SRR10863204 = sRR10863204;
	}

	public double getSRR10863205() {
		return SRR10863205;
	}

	public void setSRR10863205(double sRR10863205) {
		SRR10863205 = sRR10863205;
	}

	public double getSRR10863206() {
		return SRR10863206;
	}

	public void setSRR10863206(double sRR10863206) {
		SRR10863206 = sRR10863206;
	}

	public double getSRR10863207() {
		return SRR10863207;
	}

	public void setSRR10863207(double sRR10863207) {
		SRR10863207 = sRR10863207;
	}

	public double getSRR10863208() {
		return SRR10863208;
	}

	public void setSRR10863208(double sRR10863208) {
		SRR10863208 = sRR10863208;
	}

	public double getSRR10863209() {
		return SRR10863209;
	}

	public void setSRR10863209(double sRR10863209) {
		SRR10863209 = sRR10863209;
	}

	public double getSRR10863220() {
		return SRR10863220;
	}

	public void setSRR10863220(double sRR10863220) {
		SRR10863220 = sRR10863220;
	}

	public double getSRR10863221() {
		return SRR10863221;
	}

	public void setSRR10863221(double sRR10863221) {
		SRR10863221 = sRR10863221;
	}

	public double getSRR6425308() {
		return SRR6425308;
	}

	public void setSRR6425308(double sRR6425308) {
		SRR6425308 = sRR6425308;
	}

	public double getSRR6425309() {
		return SRR6425309;
	}

	public void setSRR6425309(double sRR6425309) {
		SRR6425309 = sRR6425309;
	}

	@Override
	public String toString() {
		return "Oocyte [id=" + id + ", gene=" + gene + ", SRR10863202=" + SRR10863202 + ", SRR10863203=" + SRR10863203
				+ ", SRR10863204=" + SRR10863204 + ", SRR10863205=" + SRR10863205 + ", SRR10863206=" + SRR10863206
				+ ", SRR10863207=" + SRR10863207 + ", SRR10863208=" + SRR10863208 + ", SRR10863209=" + SRR10863209
				+ ", SRR10863220=" + SRR10863220 + ", SRR10863221=" + SRR10863221 + ", SRR6425308=" + SRR6425308
				+ ", SRR6425309=" + SRR6425309 + "]";
	}
}
