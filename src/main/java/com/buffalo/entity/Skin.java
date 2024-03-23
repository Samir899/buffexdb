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
@Table(name = "skin")
public class Skin {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
	 @Column(name="SRR24057905")
	 private double SRR24057905;

	 @Column(name="SRR24057906")
	 private double SRR24057906;

	 @Column(name="SRR24057907")
	 private double SRR24057907;

	public Skin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Skin(int id, Genes gene, double sRR24057905, double sRR24057906, double sRR24057907) {
		super();
		this.id = id;
		this.gene = gene;
		SRR24057905 = sRR24057905;
		SRR24057906 = sRR24057906;
		SRR24057907 = sRR24057907;
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

	public double getSRR24057905() {
		return SRR24057905;
	}

	public void setSRR24057905(double sRR24057905) {
		SRR24057905 = sRR24057905;
	}

	public double getSRR24057906() {
		return SRR24057906;
	}

	public void setSRR24057906(double sRR24057906) {
		SRR24057906 = sRR24057906;
	}

	public double getSRR24057907() {
		return SRR24057907;
	}

	public void setSRR24057907(double sRR24057907) {
		SRR24057907 = sRR24057907;
	}

	@Override
	public String toString() {
		return "Skin [id=" + id + ", gene=" + gene + ", SRR24057905=" + SRR24057905 + ", SRR24057906=" + SRR24057906
				+ ", SRR24057907=" + SRR24057907 + "]";
	}

}
