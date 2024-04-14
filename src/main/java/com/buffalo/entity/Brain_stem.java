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
	 
	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="SRR24057957")
	 private double SRR24057957;
	 
	 @Column(name="SRR24057958")
	 private double SRR24057958;
	 
	 @Column(name="SRR24057959")
	 private double SRR24057959;
	 
	 @Column(name="SRR24057960")
	 private double SRR24057960;

	public Brain_stem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Brain_stem(int id, String geneId, double sRR24057957, double sRR24057958, double sRR24057959,
			double sRR24057960) {
		super();
		this.id = id;
		this.geneId = geneId;
		SRR24057957 = sRR24057957;
		SRR24057958 = sRR24057958;
		SRR24057959 = sRR24057959;
		SRR24057960 = sRR24057960;
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

	public double getSRR24057957() {
		return SRR24057957;
	}

	public void setSRR24057957(double sRR24057957) {
		SRR24057957 = sRR24057957;
	}

	public double getSRR24057958() {
		return SRR24057958;
	}

	public void setSRR240579578(double sRR24057958) {
		SRR24057958 = sRR24057958;
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
		return "Brain_stem [id=" + id + ", geneId=" + geneId + ", SRR24057957=" + SRR24057957 + ", SRR24057958="
				+ SRR24057958 + ", SRR24057959=" + SRR24057959 + ", SRR24057960=" + SRR24057960 + "]";
	}
}
