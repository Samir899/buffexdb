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
@Table(name = "lungs")
public class Lungs {
	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="ERR315645")
	 private double ERR315645;

	@Column(name="SRR15721739")
	 private double SRR15721739;

	@Column(name="SRR24057925")
	 private double SRR24057925;

	@Column(name="SRR24057926")
	 private double SRR24057926;

	@Column(name="SRR24057927")
	 private double SRR24057927;

	@Column(name="SRR24057928")
	 private double SRR24057928;

	public Lungs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lungs(int id, String geneId, double eRR315645, double sRR15721739, double sRR24057925, double sRR24057926,
			double sRR24057927, double sRR24057928) {
		super();
		this.id = id;
		this.geneId = geneId;
		ERR315645 = eRR315645;
		SRR15721739 = sRR15721739;
		SRR24057925 = sRR24057925;
		SRR24057926 = sRR24057926;
		SRR24057927 = sRR24057927;
		SRR24057928 = sRR24057928;
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

	public double getERR315645() {
		return ERR315645;
	}

	public void setERR315645(double eRR315645) {
		ERR315645 = eRR315645;
	}

	public double getSRR15721739() {
		return SRR15721739;
	}

	public void setSRR15721739(double sRR15721739) {
		SRR15721739 = sRR15721739;
	}

	public double getSRR24057925() {
		return SRR24057925;
	}

	public void setSRR24057925(double sRR24057925) {
		SRR24057925 = sRR24057925;
	}

	public double getSRR24057926() {
		return SRR24057926;
	}

	public void setSRR24057926(double sRR24057926) {
		SRR24057926 = sRR24057926;
	}

	public double getSRR24057927() {
		return SRR24057927;
	}

	public void setSRR24057927(double sRR24057927) {
		SRR24057927 = sRR24057927;
	}

	public double getSRR24057928() {
		return SRR24057928;
	}

	public void setSRR24057928(double sRR24057928) {
		SRR24057928 = sRR24057928;
	}

	@Override
	public String toString() {
		return "Lungs [id=" + id + ", geneId=" + geneId + ", ERR315645=" + ERR315645 + ", SRR15721739=" + SRR15721739
				+ ", SRR24057925=" + SRR24057925 + ", SRR24057926=" + SRR24057926 + ", SRR24057927=" + SRR24057927
				+ ", SRR24057928=" + SRR24057928 + "]";
	}

}
