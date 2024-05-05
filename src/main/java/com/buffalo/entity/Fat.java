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
@Table(name = "fat")
public class Fat {

	 @Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
	 @Column(name="SRR15721746")
	 private double SRR15721746;

	public Fat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fat(int id, Genes gene, double sRR15721746) {
		super();
		this.id = id;
		this.gene = gene;
		SRR15721746 = sRR15721746;
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

	public double getSRR15721746() {
		return SRR15721746;
	}

	public void setSRR15721746(double sRR15721746) {
		SRR15721746 = sRR15721746;
	}

	@Override
	public String toString() {
		return "Fat [id=" + id + ", gene=" + gene + ", SRR15721746=" + SRR15721746 + "]";
	}
	 
}
