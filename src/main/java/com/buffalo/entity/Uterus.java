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
@Table(name = "uterus")
public class Uterus {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
	 @Column(name="SRR15721749") 
	 private double SRR15721749;

	public Uterus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Uterus(int id, Genes gene, double sRR15721749) {
		super();
		this.id = id;
		this.gene = gene;
		SRR15721749 = sRR15721749;
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

	public double getSRR15721749() {
		return SRR15721749;
	}

	public void setSRR15721749(double sRR15721749) {
		SRR15721749 = sRR15721749;
	}

	@Override
	public String toString() {
		return "Uterus [id=" + id + ", gene=" + gene + ", SRR15721749=" + SRR15721749 + "]";
	}
	 
	 
}
