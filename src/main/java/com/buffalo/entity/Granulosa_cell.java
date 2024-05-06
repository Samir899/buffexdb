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
@Table(name = "granulosa_cell")
public class Granulosa_cell {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="SRR10863210")
	 private double SRR10863210;

	 @Column(name="SRR10863211")
	 private double SRR10863211;

	 @Column(name="SRR10863212")
	 private double SRR10863212;

	 @Column(name="SRR10863213")
	 private double SRR10863213;

	 @Column(name="SRR10863214")
	 private double SRR10863214;

	 @Column(name="SRR10863215")
	 private double SRR10863215;

	 @Column(name="SRR10863216")
	 private double SRR10863216;

	 @Column(name="SRR10863217")
	 private double SRR10863217;

	 @Column(name="SRR10863218")
	 private double SRR10863218;

	 @Column(name="SRR10863219")
	 private double SRR10863219;

	public Granulosa_cell() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Granulosa_cell(int id, String geneId, double sRR10863210, double sRR10863211, double sRR10863212,
			double sRR10863213, double sRR10863214, double sRR10863215, double sRR10863216, double sRR10863217,
			double sRR10863218, double sRR10863219) {
		super();
		this.id = id;
		this.geneId = geneId;
		SRR10863210 = sRR10863210;
		SRR10863211 = sRR10863211;
		SRR10863212 = sRR10863212;
		SRR10863213 = sRR10863213;
		SRR10863214 = sRR10863214;
		SRR10863215 = sRR10863215;
		SRR10863216 = sRR10863216;
		SRR10863217 = sRR10863217;
		SRR10863218 = sRR10863218;
		SRR10863219 = sRR10863219;
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

	public double getSRR10863210() {
		return SRR10863210;
	}

	public void setSRR10863210(double sRR10863210) {
		SRR10863210 = sRR10863210;
	}

	public double getSRR10863211() {
		return SRR10863211;
	}

	public void setSRR10863211(double sRR10863211) {
		SRR10863211 = sRR10863211;
	}

	public double getSRR10863212() {
		return SRR10863212;
	}

	public void setSRR10863212(double sRR10863212) {
		SRR10863212 = sRR10863212;
	}

	public double getSRR10863213() {
		return SRR10863213;
	}

	public void setSRR10863213(double sRR10863213) {
		SRR10863213 = sRR10863213;
	}

	public double getSRR10863214() {
		return SRR10863214;
	}

	public void setSRR10863214(double sRR10863214) {
		SRR10863214 = sRR10863214;
	}

	public double getSRR10863215() {
		return SRR10863215;
	}

	public void setSRR10863215(double sRR10863215) {
		SRR10863215 = sRR10863215;
	}

	public double getSRR10863216() {
		return SRR10863216;
	}

	public void setSRR10863216(double sRR10863216) {
		SRR10863216 = sRR10863216;
	}

	public double getSRR10863217() {
		return SRR10863217;
	}

	public void setSRR10863217(double sRR10863217) {
		SRR10863217 = sRR10863217;
	}

	public double getSRR10863218() {
		return SRR10863218;
	}

	public void setSRR10863218(double sRR10863218) {
		SRR10863218 = sRR10863218;
	}

	public double getSRR10863219() {
		return SRR10863219;
	}

	public void setSRR10863219(double sRR10863219) {
		SRR10863219 = sRR10863219;
	}

	@Override
	public String toString() {
		return "Granulosa_cell [id=" + id + ", geneId=" + geneId + ", SRR10863210=" + SRR10863210 + ", SRR10863211="
				+ SRR10863211 + ", SRR10863212=" + SRR10863212 + ", SRR10863213=" + SRR10863213 + ", SRR10863214="
				+ SRR10863214 + ", SRR10863215=" + SRR10863215 + ", SRR10863216=" + SRR10863216 + ", SRR10863217="
				+ SRR10863217 + ", SRR10863218=" + SRR10863218 + ", SRR10863219=" + SRR10863219 + "]";
	}
	
	 
}
