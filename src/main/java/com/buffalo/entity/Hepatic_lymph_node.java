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
@Table(name = "hepatic_lymph_node")
public class Hepatic_lymph_node {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;

	 @Column(name="SRR7540873")
	 private double SRR7540873;

	@Column(name="SRR7540874")
	 private double SRR7540874;

	@Column(name="SRR7540875")
	 private double SRR7540875;

	@Column(name="SRR7540876")
	 private double SRR7540876;

	@Column(name="SRR7540877")
	 private double SRR7540877;

	@Column(name="SRR7540878")
	 private double SRR7540878;

	@Column(name="SRR7540879")
	 private double SRR7540879;

	@Column(name="SRR7540880")
	 private double SRR7540880;

	@Column(name="SRR7540881")
	 private double SRR7540881;

	@Column(name="SRR7540882")
	 private double SRR7540882;

	@Column(name="SRR7540883")
	 private double SRR7540883;

	@Column(name="SRR7540884")
	 private double SRR7540884;

	@Column(name="SRR7540885")
	 private double SRR7540885;

	@Column(name="SRR7540886")
	 private double SRR7540886;

	@Column(name="SRR7540887")
	 private double SRR7540887;

	@Column(name="SRR7540888")
	 private double SRR7540888;

	@Column(name="SRR7540889")
	 private double SRR7540889;

	@Column(name="SRR7540890")
	 private double SRR7540890;

	public Hepatic_lymph_node() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hepatic_lymph_node(int id, Genes gene, double sRR7540873, double sRR7540874, double sRR7540875,
			double sRR7540876, double sRR7540877, double sRR7540878, double sRR7540879, double sRR7540880,
			double sRR7540881, double sRR7540882, double sRR7540883, double sRR7540884, double sRR7540885,
			double sRR7540886, double sRR7540887, double sRR7540888, double sRR7540889, double sRR7540890) {
		super();
		this.id = id;
		this.gene = gene;
		SRR7540873 = sRR7540873;
		SRR7540874 = sRR7540874;
		SRR7540875 = sRR7540875;
		SRR7540876 = sRR7540876;
		SRR7540877 = sRR7540877;
		SRR7540878 = sRR7540878;
		SRR7540879 = sRR7540879;
		SRR7540880 = sRR7540880;
		SRR7540881 = sRR7540881;
		SRR7540882 = sRR7540882;
		SRR7540883 = sRR7540883;
		SRR7540884 = sRR7540884;
		SRR7540885 = sRR7540885;
		SRR7540886 = sRR7540886;
		SRR7540887 = sRR7540887;
		SRR7540888 = sRR7540888;
		SRR7540889 = sRR7540889;
		SRR7540890 = sRR7540890;
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

	public double getSRR7540873() {
		return SRR7540873;
	}

	public void setSRR7540873(double sRR7540873) {
		SRR7540873 = sRR7540873;
	}

	public double getSRR7540874() {
		return SRR7540874;
	}

	public void setSRR7540874(double sRR7540874) {
		SRR7540874 = sRR7540874;
	}

	public double getSRR7540875() {
		return SRR7540875;
	}

	public void setSRR7540875(double sRR7540875) {
		SRR7540875 = sRR7540875;
	}

	public double getSRR7540876() {
		return SRR7540876;
	}

	public void setSRR7540876(double sRR7540876) {
		SRR7540876 = sRR7540876;
	}

	public double getSRR7540877() {
		return SRR7540877;
	}

	public void setSRR7540877(double sRR7540877) {
		SRR7540877 = sRR7540877;
	}

	public double getSRR7540878() {
		return SRR7540878;
	}

	public void setSRR7540878(double sRR7540878) {
		SRR7540878 = sRR7540878;
	}

	public double getSRR7540879() {
		return SRR7540879;
	}

	public void setSRR7540879(double sRR7540879) {
		SRR7540879 = sRR7540879;
	}

	public double getSRR7540880() {
		return SRR7540880;
	}

	public void setSRR7540880(double sRR7540880) {
		SRR7540880 = sRR7540880;
	}

	public double getSRR7540881() {
		return SRR7540881;
	}

	public void setSRR7540881(double sRR7540881) {
		SRR7540881 = sRR7540881;
	}

	public double getSRR7540882() {
		return SRR7540882;
	}

	public void setSRR7540882(double sRR7540882) {
		SRR7540882 = sRR7540882;
	}

	public double getSRR7540883() {
		return SRR7540883;
	}

	public void setSRR7540883(double sRR7540883) {
		SRR7540883 = sRR7540883;
	}

	public double getSRR7540884() {
		return SRR7540884;
	}

	public void setSRR7540884(double sRR7540884) {
		SRR7540884 = sRR7540884;
	}

	public double getSRR7540885() {
		return SRR7540885;
	}

	public void setSRR7540885(double sRR7540885) {
		SRR7540885 = sRR7540885;
	}

	public double getSRR7540886() {
		return SRR7540886;
	}

	public void setSRR7540886(double sRR7540886) {
		SRR7540886 = sRR7540886;
	}

	public double getSRR7540887() {
		return SRR7540887;
	}

	public void setSRR7540887(double sRR7540887) {
		SRR7540887 = sRR7540887;
	}

	public double getSRR7540888() {
		return SRR7540888;
	}

	public void setSRR7540888(double sRR7540888) {
		SRR7540888 = sRR7540888;
	}

	public double getSRR7540889() {
		return SRR7540889;
	}

	public void setSRR7540889(double sRR7540889) {
		SRR7540889 = sRR7540889;
	}

	public double getSRR7540890() {
		return SRR7540890;
	}

	public void setSRR7540890(double sRR7540890) {
		SRR7540890 = sRR7540890;
	}

	@Override
	public String toString() {
		return "Hepatic_lymph_node [id=" + id + ", gene=" + gene + ", SRR7540873=" + SRR7540873 + ", SRR7540874="
				+ SRR7540874 + ", SRR7540875=" + SRR7540875 + ", SRR7540876=" + SRR7540876 + ", SRR7540877="
				+ SRR7540877 + ", SRR7540878=" + SRR7540878 + ", SRR7540879=" + SRR7540879 + ", SRR7540880="
				+ SRR7540880 + ", SRR7540881=" + SRR7540881 + ", SRR7540882=" + SRR7540882 + ", SRR7540883="
				+ SRR7540883 + ", SRR7540884=" + SRR7540884 + ", SRR7540885=" + SRR7540885 + ", SRR7540886="
				+ SRR7540886 + ", SRR7540887=" + SRR7540887 + ", SRR7540888=" + SRR7540888 + ", SRR7540889="
				+ SRR7540889 + ", SRR7540890=" + SRR7540890 + "]";
	}
}
