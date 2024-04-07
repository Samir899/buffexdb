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
@Table(name = "ovary_follicle")
public class Ovary_follicle {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
	 @Column(name="ERR315633")
	 private double ERR315633;

	public Ovary_follicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ovary_follicle(int id, Genes gene, double eRR315633) {
		super();
		this.id = id;
		this.gene = gene;
		ERR315633 = eRR315633;
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

	public double getERR315633() {
		return ERR315633;
	}

	public void setERR315633(double eRR315633) {
		ERR315633 = eRR315633;
	}

	@Override
	public String toString() {
		return "Ovary_follicle [id=" + id + ", gene=" + gene + ", ERR315633=" + ERR315633 + "]";
	}
	 
	 
}
