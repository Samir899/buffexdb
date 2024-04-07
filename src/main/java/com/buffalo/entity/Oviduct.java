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
@Table(name = "oviduct")
public class Oviduct {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
	 @Column(name="ERR315634")
	 private double ERR315634;

	public Oviduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Oviduct(int id, Genes gene, double eRR315634) {
		super();
		this.id = id;
		this.gene = gene;
		ERR315634 = eRR315634;
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

	public double getERR315634() {
		return ERR315634;
	}

	public void setERR315634(double eRR315634) {
		ERR315634 = eRR315634;
	}

	@Override
	public String toString() {
		return "Oviduct [id=" + id + ", gene=" + gene + ", ERR315634=" + ERR315634 + "]";
	}
	 
	 
}
