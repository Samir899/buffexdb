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
@Table(name = "pineal_gland")
public class Pineal_gland {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="SRR15721755")
	 private double SRR15721755;

	public Pineal_gland() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pineal_gland(int id, String geneId, double sRR15721755) {
		super();
		this.id = id;
		this.geneId = geneId;
		SRR15721755 = sRR15721755;
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

	public double getSRR15721755() {
		return SRR15721755;
	}

	public void setSRR15721755(double sRR15721755) {
		SRR15721755 = sRR15721755;
	}

	@Override
	public String toString() {
		return "Pineal_gland [id=" + id + ", geneId=" + geneId + ", SRR15721755=" + SRR15721755 + "]";
	}
	 
	 
}
