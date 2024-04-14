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
@Table(name = "Cotyledon")
public class Cotyledon {

	 @Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="SRR4119663")
	 private double SRR4119663;
	 
	 
	public Cotyledon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cotyledon(int id, String geneId, double sRR4119663) {
		super();
		this.id = id;
		this.geneId = geneId;
		this.SRR4119663 = sRR4119663;

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

	public void setString(String geneId) {
		this.geneId = geneId;
	}

	public double getSRR4119663() {
		return SRR4119663;
	}

	public void setSRR4119663(double sRR4119663) {
		SRR4119663 = sRR4119663;
	}

	@Override
	public String toString() {
		return "Cotyledon [id=" + id + ", geneId=" + geneId + ", SRR4119663=" + SRR4119663 + "]";
	}
	  
}
