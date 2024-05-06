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
@Table(name = "uterus")
public class Uterus {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="SRR15721749") 
	 private double SRR15721749;

	public Uterus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Uterus(int id, String geneId, double sRR15721749) {
		super();
		this.id = id;
		this.geneId = geneId;
		SRR15721749 = sRR15721749;
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

	public double getSRR15721749() {
		return SRR15721749;
	}

	public void setSRR15721749(double sRR15721749) {
		SRR15721749 = sRR15721749;
	}

	@Override
	public String toString() {
		return "Uterus [id=" + id + ", geneId=" + geneId + ", SRR15721749=" + SRR15721749 + "]";
	}
	 
	 
}
