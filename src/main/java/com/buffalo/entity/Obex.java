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
@Table(name = "obex")
public class Obex {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
	 @Column(name="ERR315621")
	 private double ERR315621;

	public Obex() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Obex(int id, Genes gene, double eRR315621) {
		super();
		this.id = id;
		this.gene = gene;
		ERR315621 = eRR315621;
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

	public double getERR315621() {
		return ERR315621;
	}

	public void setERR315621(double eRR315621) {
		ERR315621 = eRR315621;
	}

	@Override
	public String toString() {
		return "Obex [id=" + id + ", gene=" + gene + ", ERR315621=" + ERR315621 + "]";
	}
	 
	 
}
