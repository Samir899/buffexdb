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
@Table(name = "hypothalamus")
public class Hypothalamus {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
	 @Column(name="SRR15721742")
	 private double SRR15721742;
	 
	 @Column(name="SRR24057944")
	 private double SRR24057944;
	 
	 @Column(name="SRR24057945")
	 private double SRR24057945;
	 
	 @Column(name="SRR24057946")
	 private double SRR24057946;
	 
	 @Column(name="SRR24057947")
	 private double SRR24057947;

	public Hypothalamus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hypothalamus(int id, Genes gene, double sRR15721742, double sRR24057944, double sRR24057945,
			double sRR24057946, double sRR24057947) {
		super();
		this.id = id;
		this.gene = gene;
		SRR15721742 = sRR15721742;
		SRR24057944 = sRR24057944;
		SRR24057945 = sRR24057945;
		SRR24057946 = sRR24057946;
		SRR24057947 = sRR24057947;
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

	public double getSRR15721742() {
		return SRR15721742;
	}

	public void setSRR15721742(double sRR15721742) {
		SRR15721742 = sRR15721742;
	}

	public double getSRR24057944() {
		return SRR24057944;
	}

	public void setSRR24057944(double sRR24057944) {
		SRR24057944 = sRR24057944;
	}

	public double getSRR24057945() {
		return SRR24057945;
	}

	public void setSRR24057945(double sRR24057945) {
		SRR24057945 = sRR24057945;
	}

	public double getSRR24057946() {
		return SRR24057946;
	}

	public void setSRR24057946(double sRR24057946) {
		SRR24057946 = sRR24057946;
	}

	public double getSRR24057947() {
		return SRR24057947;
	}

	public void setSRR24057947(double sRR24057947) {
		SRR24057947 = sRR24057947;
	}

	@Override
	public String toString() {
		return "Hypothalamus [id=" + id + ", gene=" + gene + ", SRR15721742=" + SRR15721742 + ", SRR24057944="
				+ SRR24057944 + ", SRR24057945=" + SRR24057945 + ", SRR24057946=" + SRR24057946 + ", SRR24057947="
				+ SRR24057947 + "]";
	}
}
