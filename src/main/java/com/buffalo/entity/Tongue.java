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
@Table(name = "tongue")
public class Tongue {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="ERR315616")
	 private double ERR315616;

	@Column(name="SRR15721748")
	 private double SRR15721748;

	public Tongue() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tongue(int id, String geneId, double eRR315616, double sRR15721748) {
		super();
		this.id = id;
		this.geneId = geneId;
		ERR315616 = eRR315616;
		SRR15721748 = sRR15721748;
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

	public double getERR315616() {
		return ERR315616;
	}

	public void setERR315616(double eRR315616) {
		ERR315616 = eRR315616;
	}

	public double getSRR15721748() {
		return SRR15721748;
	}

	public void setSRR15721748(double sRR15721748) {
		SRR15721748 = sRR15721748;
	}

	@Override
	public String toString() {
		return "Tongue [id=" + id + ", geneId=" + geneId + ", ERR315616=" + ERR315616 + ", SRR15721748=" + SRR15721748
				+ "]";
	}
}
