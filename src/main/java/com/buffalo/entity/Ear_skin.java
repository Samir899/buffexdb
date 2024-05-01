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
@Table(name = "Ear_skin")
public class Ear_skin {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="SRR11842086")
	 private double SRR11842086;
	 
	 @Column(name="SRR11842087")
	 private double SRR11842087;
	 
	 @Column(name="SRR11842088")
	 private double SRR11842088;
	 
	 @Column(name="SRR11842089")
	 private double SRR11842089;
	 
	 @Column(name="SRR11842090")
	 private double SRR11842090;
	 
	 @Column(name="SRR11842091")
	 private double SRR11842091;

	public Ear_skin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ear_skin(int id, String geneId, double sRR11842086, double sRR11842087, double sRR11842088, double sRR11842089,
			double sRR11842090, double sRR11842091) {
		super();
		this.id = id;
		this.geneId = geneId;
		SRR11842086 = sRR11842086;
		SRR11842087 = sRR11842087;
		SRR11842088 = sRR11842088;
		SRR11842089 = sRR11842089;
		SRR11842090 = sRR11842090;
		SRR11842091 = sRR11842091;
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

	public double getSRR11842086() {
		return SRR11842086;
	}

	public void setSRR11842086(double sRR11842086) {
		SRR11842086 = sRR11842086;
	}

	public double getSRR11842087() {
		return SRR11842087;
	}

	public void setSRR11842087(double sRR11842087) {
		SRR11842087 = sRR11842087;
	}

	public double getSRR11842088() {
		return SRR11842088;
	}

	public void setSRR11842088(double sRR11842088) {
		SRR11842088 = sRR11842088;
	}

	public double getSRR11842089() {
		return SRR11842089;
	}

	public void setSRR11842089(double sRR11842089) {
		SRR11842089 = sRR11842089;
	}

	public double getSRR11842090() {
		return SRR11842090;
	}

	public void setSRR11842090(double sRR11842090) {
		SRR11842090 = sRR11842090;
	}

	public double getSRR11842091() {
		return SRR11842091;
	}

	public void setSRR11842091(double sRR11842091) {
		SRR11842091 = sRR11842091;
	}

	@Override
	public String toString() {
		return "Ear_skin [id=" + id + ", geneId=" + geneId + ", SRR11842086=" + SRR11842086 + ", SRR11842087=" + SRR11842087
				+ ", SRR11842088=" + SRR11842088 + ", SRR11842089=" + SRR11842089 + ", SRR11842090=" + SRR11842090
				+ ", SRR11842091=" + SRR11842091 + "]";
	}
}
