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
@Table(name = "brain_stem")
public class Brain_stem {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
	 @Column(name="SRR24057957")
	 private double SRR24057957;
	 
	 @Column(name="SRR24057958")
	 private double SRR240579578;
	 
	 @Column(name="SRR24057959")
	 private double SRR24057959;
	 
	 @Column(name="SRR24057960")
	 private double SRR24057960;

	public Brain_stem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Brain_stem(int id, Genes gene, double sRR24057957, double sRR240579578, double sRR24057959,
			double sRR24057960) {
		super();
		this.id = id;
		this.gene = gene;
		SRR24057957 = sRR24057957;
		SRR240579578 = sRR240579578;
		SRR24057959 = sRR24057959;
		SRR24057960 = sRR24057960;
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

	public double getSRR24057957() {
		return SRR24057957;
	}

	public void setSRR24057957(double sRR24057957) {
		SRR24057957 = sRR24057957;
	}

	public double getSRR240579578() {
		return SRR240579578;
	}

	public void setSRR240579578(double sRR240579578) {
		SRR240579578 = sRR240579578;
	}

	public double getSRR24057959() {
		return SRR24057959;
	}

	public void setSRR24057959(double sRR24057959) {
		SRR24057959 = sRR24057959;
	}

	public double getSRR24057960() {
		return SRR24057960;
	}

	public void setSRR24057960(double sRR24057960) {
		SRR24057960 = sRR24057960;
	}

	@Override
	public String toString() {
		return "Brain_stem [id=" + id + ", gene=" + gene + ", SRR24057957=" + SRR24057957 + ", SRR240579578="
				+ SRR240579578 + ", SRR24057959=" + SRR24057959 + ", SRR24057960=" + SRR24057960 + "]";
	}
}
