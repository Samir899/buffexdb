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
@Table(name = "cerebral_cortex")
public class Cerebral_cortex {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="SRR24057948")
	 private double SRR24057948;
	 
	 @Column(name="SRR24057949")
	 private double SRR24057949;
	 
	 @Column(name="SRR24057950")
	 private double SRR24057950;
	 
	 @Column(name="SRR24057951")
	 private double SRR24057951;

	public Cerebral_cortex() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cerebral_cortex(int id, String geneId, double sRR24057948, double sRR24057949, double sRR24057950,
			double sRR24057951) {
		super();
		this.id = id;
		this.geneId = geneId;
		SRR24057948 = sRR24057948;
		SRR24057949 = sRR24057949;
		SRR24057950 = sRR24057950;
		SRR24057951 = sRR24057951;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGeneId() {
		return geneId;
	}

	public void setGeneId(String geneId) {
		this.geneId = geneId;
	}

	public double getSRR24057948() {
		return SRR24057948;
	}

	public void setSRR24057948(double sRR24057948) {
		SRR24057948 = sRR24057948;
	}

	public double getSRR24057949() {
		return SRR24057949;
	}

	public void setSRR24057949(double sRR24057949) {
		SRR24057949 = sRR24057949;
	}

	public double getSRR24057950() {
		return SRR24057950;
	}

	public void setSRR24057950(double sRR24057950) {
		SRR24057950 = sRR24057950;
	}

	public double getSRR24057951() {
		return SRR24057951;
	}

	public void setSRR24057951(double sRR24057951) {
		SRR24057951 = sRR24057951;
	}

	@Override
	public String toString() {
		return "Cerebral_cortex [id=" + id + ", geneId=" + geneId + ", SRR24057948=" + SRR24057948 + ", SRR24057949="
				+ SRR24057949 + ", SRR24057950=" + SRR24057950 + ", SRR24057951=" + SRR24057951 + "]";
	}
}
