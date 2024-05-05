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
@Table(name = "white_blood_cell")
public class White_blood_cell {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
	 @Column(name="ERR315624") 
	 private double ERR315624;

	public White_blood_cell() {
		super();
		// TODO Auto-generated constructor stub
	}

	public White_blood_cell(int id, Genes gene, double eRR315624) {
		super();
		this.id = id;
		this.gene = gene;
		ERR315624 = eRR315624;
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

	public double getERR315624() {
		return ERR315624;
	}

	public void setERR315624(double eRR315624) {
		ERR315624 = eRR315624;
	}

	@Override
	public String toString() {
		return "White_blood_cell [id=" + id + ", gene=" + gene + ", ERR315624=" + ERR315624 + "]";
	}
	 
	 
}
