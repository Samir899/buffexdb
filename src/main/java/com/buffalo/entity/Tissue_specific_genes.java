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
@Table(name = "tissue_specifc_genes")
public class Tissue_specific_genes {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	@ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	
	@Column(length = 60)
	private String geneName;
	
//	 @Column(name="Tau_score")
//	 private double Tau_score;
//	 
	 @Column(length = 60)
	 private double tau_score;
	 
	 @Column(length = 60)
	 private String tissue_name;
	 
	 @Column(length = 60)
	 private String tissue_specifity;

	public Tissue_specific_genes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tissue_specific_genes(int id, Genes gene, String geneName, double tau_score, String tissue_name,
			String tissue_specifity) {
		super();
		this.id = id;
		this.gene = gene;
		this.geneName = geneName;
		this.tau_score = tau_score;
		this.tissue_name = tissue_name;
		this.tissue_specifity = tissue_specifity;
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

	public String getGeneName() {
		return geneName;
	}

	public void setGeneName(String geneName) {
		this.geneName = geneName;
	}

	public double getTau_score() {
		return tau_score;
	}

	public void setTau_score(double tau_score) {
		this.tau_score = tau_score;
	}

	public String getTissue_name() {
		return tissue_name;
	}

	public void setTissue_name(String tissue_name) {
		this.tissue_name = tissue_name;
	}

	public String getTissue_specifity() {
		return tissue_specifity;
	}

	public void setTissue_specifity(String tissue_specifity) {
		this.tissue_specifity = tissue_specifity;
	}

	@Override
	public String toString() {
		return "Tissue_specific_genes [id=" + id + ", gene=" + gene + ", geneName=" + geneName + ", tau_score="
				+ tau_score + ", tissue_name=" + tissue_name + ", tissue_specifity=" + tissue_specifity + "]";
	}
	 
	 
}
