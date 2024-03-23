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
@Table(name = "skeletal_muscle")
public class Skeletal_muscle {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
	 @Column(name="SRR24057916")
	 private double SRR24057916;

	 @Column(name="SRR24057917")
	 private double SRR24057917;

	 @Column(name="SRR24057918")
	 private double SRR24057918;

	 @Column(name="SRR24057920")
	 private double SRR24057920;

	public Skeletal_muscle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Skeletal_muscle(int id, Genes gene, double sRR24057916, double sRR24057917, double sRR24057918,
			double sRR24057920) {
		super();
		this.id = id;
		this.gene = gene;
		SRR24057916 = sRR24057916;
		SRR24057917 = sRR24057917;
		SRR24057918 = sRR24057918;
		SRR24057920 = sRR24057920;
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

	public double getSRR24057916() {
		return SRR24057916;
	}

	public void setSRR24057916(double sRR24057916) {
		SRR24057916 = sRR24057916;
	}

	public double getSRR24057917() {
		return SRR24057917;
	}

	public void setSRR24057917(double sRR24057917) {
		SRR24057917 = sRR24057917;
	}

	public double getSRR24057918() {
		return SRR24057918;
	}

	public void setSRR24057918(double sRR24057918) {
		SRR24057918 = sRR24057918;
	}

	public double getSRR24057920() {
		return SRR24057920;
	}

	public void setSRR24057920(double sRR24057920) {
		SRR24057920 = sRR24057920;
	}

	@Override
	public String toString() {
		return "Skeletal_muscle [id=" + id + ", gene=" + gene + ", SRR24057916=" + SRR24057916 + ", SRR24057917="
				+ SRR24057917 + ", SRR24057918=" + SRR24057918 + ", SRR24057920=" + SRR24057920 + "]";
	}
}
