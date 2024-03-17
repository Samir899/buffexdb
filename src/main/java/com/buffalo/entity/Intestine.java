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
@Table(name = "intestine")
public class Intestine {
	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
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

	public double getERR315620() {
		return ERR315620;
	}

	public void setERR315620(double eRR315620) {
		ERR315620 = eRR315620;
	}

	@Override
	public String toString() {
		return "Intestine [id=" + id + ", gene=" + gene + ", ERR315620=" + ERR315620 + "]";
	}

	public Intestine(int id, Genes gene, double eRR315620) {
		super();
		this.id = id;
		this.gene = gene;
		ERR315620 = eRR315620;
	}

	@ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
	 @Column(name="ERR315620")
	 private double ERR315620;

	public Intestine() {
		super();
		// TODO Auto-generated constructor stub
	}
}
