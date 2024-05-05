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
@Table(name = "medulla_oblongata")
public class Medulla_oblongata {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
	 @Column(name="SRR15721743")
	 private double SRR15721743;

	public Medulla_oblongata() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medulla_oblongata(int id, Genes gene, double sRR15721743) {
		super();
		this.id = id;
		this.gene = gene;
		SRR15721743 = sRR15721743;
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

	public double getSRR15721743() {
		return SRR15721743;
	}

	public void setSRR15721743(double sRR15721743) {
		SRR15721743 = sRR15721743;
	}

	@Override
	public String toString() {
		return "Medulla_oblongata [id=" + id + ", gene=" + gene + ", SRR15721743=" + SRR15721743 + "]";
	}
	 
	 
}
