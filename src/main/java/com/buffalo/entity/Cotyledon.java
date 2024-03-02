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
@Table(name = "Cotyledon")
public class Cotyledon {

	 @Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
	 @Column(name="SRR4119663_fpkm")
	 private double SRR4119663_fpkm;
	 
	 @Column(name="SRR4119663_tpm")
	 private double SRR4119663_tpm;
	 
	public Cotyledon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cotyledon(int id, Genes gene, double sRR4119663_fpkm, double sRR4119663_tpm) {
		super();
		this.id = id;
		this.gene = gene;
		SRR4119663_fpkm = sRR4119663_fpkm;
		SRR4119663_tpm = sRR4119663_tpm;
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

	public double getSRR4119663_fpkm() {
		return SRR4119663_fpkm;
	}

	public void setSRR4119663(double sRR4119663_fpkm) {
		SRR4119663_fpkm = sRR4119663_fpkm;
	}
	
	public double getSRR4119663_tpm() {
		return SRR4119663_tpm;
	}

	public void setSRR4119663_tpm(double sRR4119663_tpm) {
		SRR4119663_fpkm = sRR4119663_tpm;
	}
	 
	 
	
}
