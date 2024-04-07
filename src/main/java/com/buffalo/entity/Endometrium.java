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
@Table(name = "endometrium")
public class Endometrium {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
	 @Column(name="ERR315635")
	 private double ERR315635;

	public Endometrium() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Endometrium(int id, Genes gene, double eRR315635) {
		super();
		this.id = id;
		this.gene = gene;
		ERR315635 = eRR315635;
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

	public double getERR315635() {
		return ERR315635;
	}

	public void setERR315635(double eRR315635) {
		ERR315635 = eRR315635;
	}

	@Override
	public String toString() {
		return "Endometrium [id=" + id + ", gene=" + gene + ", ERR315635=" + ERR315635 + "]";
	}
	 
}
