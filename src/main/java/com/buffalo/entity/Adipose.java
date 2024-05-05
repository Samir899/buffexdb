package com.buffalo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "adipose")
public class Adipose {
	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="SRR24057941")
	 private double SRR24057941;
	 
	 @Column(name="SRR24057952")
	 private double SRR24057952;
	 
	 @Column(name="SRR24057963")
	 private double SRR24057963;
	 
	 @Column(name="SRR24057964")
	 private double SRR24057964;
	 
	 @Column(name="SSRR6949367")
	 private double SRR6949367;
	 
	 @Column(name="SRR6949368")
	 private double SRR6949368;
	 
	 @Column(name="SRR6949369")
	 private double SRR6949369;
	 
	 @Column(name="SRR6949370")
	 private double SRR6949370;
	 
	 @Column(name="SRR6949371")
	 private double SRR6949371;
	 
	 @Column(name="SRR6949372")
	 private double SRR6949372;

	public Adipose() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Adipose(int id, String geneId, double sRR24057941, double sRR24057952, double sRR24057963, double sRR24057964,
			double sRR6949367, double sRR6949368, double sRR6949369, double sRR6949370, double sRR6949371,
			double sRR6949372) {
		super();
		this.id = id;
		this.geneId = geneId;
		SRR24057941 = sRR24057941;
		SRR24057952 = sRR24057952;
		SRR24057963 = sRR24057963;
		SRR24057964 = sRR24057964;
		SRR6949367 = sRR6949367;
		SRR6949368 = sRR6949368;
		SRR6949369 = sRR6949369;
		SRR6949370 = sRR6949370;
		SRR6949371 = sRR6949371;
		SRR6949372 = sRR6949372;
	}

	@Override
	public String toString() {
		return "Adipose [id=" + id + ", geneId=" + geneId + ", SRR24057941=" + SRR24057941 + ", SRR24057952=" + SRR24057952
				+ ", SRR24057963=" + SRR24057963 + ", SRR24057964=" + SRR24057964 + ", SRR6949367=" + SRR6949367
				+ ", SRR6949368=" + SRR6949368 + ", SRR6949369=" + SRR6949369 + ", SRR6949370=" + SRR6949370
				+ ", SRR6949371=" + SRR6949371 + ", SRR6949372=" + SRR6949372 + "]";
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

	public double getSRR24057941() {
		return SRR24057941;
	}

	public void setSRR24057941(double sRR24057941) {
		SRR24057941 = sRR24057941;
	}

	public double getSRR24057952() {
		return SRR24057952;
	}

	public void setSRR24057952(double sRR24057952) {
		SRR24057952 = sRR24057952;
	}

	public double getSRR24057963() {
		return SRR24057963;
	}

	public void setSRR24057963(double sRR24057963) {
		SRR24057963 = sRR24057963;
	}

	public double getSRR24057964() {
		return SRR24057964;
	}

	public void setSRR24057964(double sRR24057964) {
		SRR24057964 = sRR24057964;
	}

	public double getSRR6949367() {
		return SRR6949367;
	}

	public void setSRR6949367(double sRR6949367) {
		SRR6949367 = sRR6949367;
	}

	public double getSRR6949368() {
		return SRR6949368;
	}

	public void setSRR6949368(double sRR6949368) {
		SRR6949368 = sRR6949368;
	}

	public double getSRR6949369() {
		return SRR6949369;
	}

	public void setSRR6949369(double sRR6949369) {
		SRR6949369 = sRR6949369;
	}

	public double getSRR6949370() {
		return SRR6949370;
	}

	public void setSRR6949370(double sRR6949370) {
		SRR6949370 = sRR6949370;
	}

	public double getSRR6949371() {
		return SRR6949371;
	}

	public void setSRR6949371(double sRR6949371) {
		SRR6949371 = sRR6949371;
	}

	public double getSRR6949372() {
		return SRR6949372;
	}

	public void setSRR6949372(double sRR6949372) {
		SRR6949372 = sRR6949372;
	}
}
