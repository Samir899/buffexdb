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
@Table(name = "kidney")
public class Kidney {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="ERR315644")
	 private double ERR315644;
	 
	 @Column(name="SRR15721740")
	 private double SRR15721740;

	public Kidney() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Kidney(int id, String geneId, double eRR315644, double sRR15721740) {
		super();
		this.id = id;
		this.geneId = geneId;
		ERR315644 = eRR315644;
		SRR15721740 = sRR15721740;
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

	public double getERR315644() {
		return ERR315644;
	}

	public void setERR315644(double eRR315644) {
		ERR315644 = eRR315644;
	}

	public double getSRR15721740() {
		return SRR15721740;
	}

	public void setSRR15721740(double sRR15721740) {
		SRR15721740 = sRR15721740;
	}

	@Override
	public String toString() {
		return "Kidney [id=" + id + ", geneId=" + geneId + ", ERR315644=" + ERR315644 + ", SRR15721740=" + SRR15721740
				+ "]";
	}
}
