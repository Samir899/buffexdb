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
@Table(name = "leg_muscle")
public class Leg_muscle {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="SRR15721747")
	 private double SRR15721747;
	 
	 @Column(name="SRR15721760")
	 private double SRR15721760;

	public Leg_muscle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Leg_muscle(int id, String geneId, double sRR15721747, double sRR15721760) {
		super();
		this.id = id;
		this.geneId = geneId;
		SRR15721747 = sRR15721747;
		SRR15721760 = sRR15721760;
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

	public double getSRR15721747() {
		return SRR15721747;
	}

	public void setSRR15721747(double sRR15721747) {
		SRR15721747 = sRR15721747;
	}

	public double getSRR15721760() {
		return SRR15721760;
	}

	public void setSRR15721760(double sRR15721760) {
		SRR15721760 = sRR15721760;
	}

	@Override
	public String toString() {
		return "Leg_muscle [id=" + id + ", geneId=" + geneId + ", SRR15721747=" + SRR15721747 + ", SRR15721760="
				+ SRR15721760 + "]";
	}
}
