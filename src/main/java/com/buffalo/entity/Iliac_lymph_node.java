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
@Table(name = "iliac_lymph_node")
public class Iliac_lymph_node {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="ERR2352818")
	 private double ERR2352818;

	@Column(name="ERR2352819")
	 private double ERR2352819;

	@Column(name="ERR2352821")
	 private double ERR2352821;

	@Column(name="ERR2352822")
	 private double ERR2352822;

	@Column(name="ERR2352823")
	 private double ERR2352823;

	@Column(name="ERR2352824")
	 private double ERR2352824;

	@Column(name="ERR2353661")
	 private double ERR2353661;

	@Column(name="ERR2353662")
	 private double ERR2353662;

	@Column(name="ERR2353663")
	 private double ERR2353663;

	@Column(name="ERR2353664")
	 private double ERR2353664;

	@Column(name="ERR2353665")
	 private double ERR2353665;

	@Column(name="ERR2353666")
	 private double ERR2353666;

	@Column(name="ERR2353667")
	 private double ERR2353667;

	public Iliac_lymph_node() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Iliac_lymph_node(int id, String geneId, double eRR2352818, double eRR2352819, double eRR2352821,
			double eRR2352822, double eRR2352823, double eRR2352824, double eRR2353661, double eRR2353662,
			double eRR2353663, double eRR2353664, double eRR2353665, double eRR2353666, double eRR2353667) {
		super();
		this.id = id;
		this.geneId = geneId;
		ERR2352818 = eRR2352818;
		ERR2352819 = eRR2352819;
		ERR2352821 = eRR2352821;
		ERR2352822 = eRR2352822;
		ERR2352823 = eRR2352823;
		ERR2352824 = eRR2352824;
		ERR2353661 = eRR2353661;
		ERR2353662 = eRR2353662;
		ERR2353663 = eRR2353663;
		ERR2353664 = eRR2353664;
		ERR2353665 = eRR2353665;
		ERR2353666 = eRR2353666;
		ERR2353667 = eRR2353667;
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

	public double getERR2352818() {
		return ERR2352818;
	}

	public void setERR2352818(double eRR2352818) {
		ERR2352818 = eRR2352818;
	}

	public double getERR2352819() {
		return ERR2352819;
	}

	public void setERR2352819(double eRR2352819) {
		ERR2352819 = eRR2352819;
	}

	public double getERR2352821() {
		return ERR2352821;
	}

	public void setERR2352821(double eRR2352821) {
		ERR2352821 = eRR2352821;
	}

	public double getERR2352822() {
		return ERR2352822;
	}

	public void setERR2352822(double eRR2352822) {
		ERR2352822 = eRR2352822;
	}

	public double getERR2352823() {
		return ERR2352823;
	}

	public void setERR2352823(double eRR2352823) {
		ERR2352823 = eRR2352823;
	}

	public double getERR2352824() {
		return ERR2352824;
	}

	public void setERR2352824(double eRR2352824) {
		ERR2352824 = eRR2352824;
	}

	public double getERR2353661() {
		return ERR2353661;
	}

	public void setERR2353661(double eRR2353661) {
		ERR2353661 = eRR2353661;
	}

	public double getERR2353662() {
		return ERR2353662;
	}

	public void setERR2353662(double eRR2353662) {
		ERR2353662 = eRR2353662;
	}

	public double getERR2353663() {
		return ERR2353663;
	}

	public void setERR2353663(double eRR2353663) {
		ERR2353663 = eRR2353663;
	}

	public double getERR2353664() {
		return ERR2353664;
	}

	public void setERR2353664(double eRR2353664) {
		ERR2353664 = eRR2353664;
	}

	public double getERR2353665() {
		return ERR2353665;
	}

	public void setERR2353665(double eRR2353665) {
		ERR2353665 = eRR2353665;
	}

	public double getERR2353666() {
		return ERR2353666;
	}

	public void setERR2353666(double eRR2353666) {
		ERR2353666 = eRR2353666;
	}

	public double getERR2353667() {
		return ERR2353667;
	}

	public void setERR2353667(double eRR2353667) {
		ERR2353667 = eRR2353667;
	}

	@Override
	public String toString() {
		return "Iliac_lymph_node [id=" + id + ", geneId=" + geneId + ", ERR2352818=" + ERR2352818 + ", ERR2352819="
				+ ERR2352819 + ", ERR2352821=" + ERR2352821 + ", ERR2352822=" + ERR2352822 + ", ERR2352823="
				+ ERR2352823 + ", ERR2352824=" + ERR2352824 + ", ERR2353661=" + ERR2353661 + ", ERR2353662="
				+ ERR2353662 + ", ERR2353663=" + ERR2353663 + ", ERR2353664=" + ERR2353664 + ", ERR2353665="
				+ ERR2353665 + ", ERR2353666=" + ERR2353666 + ", ERR2353667=" + ERR2353667 + "]";
	}
}
