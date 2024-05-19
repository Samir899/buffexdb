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
@Table(name = "mammary_gland")
public class Mammary_gland {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="ERR315636")
	 private double ERR315636;

	 @Column(name="SRR24057921")
	 private double SRR24057921;

	 @Column(name="SRR24057922")
	 private double SRR24057922;

	 @Column(name="SRR24057923")
	 private double SRR24057923;

	 @Column(name="SRR24057924")
	 private double SRR24057924;

	 @Column(name="SRR7523531")
	 private double SRR7523531;

	 @Column(name="SRR7523532")
	 private double SRR7523532;

	 @Column(name="SRR7523533")
	 private double SRR7523533;

	 @Column(name="SRR7523534")
	 private double SRR7523534;

	 @Column(name="SRR7523535")
	 private double SRR7523535;

	 @Column(name="SRR7523536")
	 private double SRR7523536;

	 @Column(name="SRR7523537")
	 private double SRR7523537;

	 @Column(name="SRR7523538")
	 private double SRR7523538;

	public Mammary_gland() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mammary_gland(int id, String geneId, double eRR315636, double sRR24057921, double sRR24057922,
			double sRR24057923, double sRR24057924, double sRR7523531, double sRR7523532, double sRR7523533,
			double sRR7523534, double sRR7523535, double sRR7523536, double sRR7523537, double sRR7523538) {
		super();
		this.id = id;
		this.geneId = geneId;
		ERR315636 = eRR315636;
		SRR24057921 = sRR24057921;
		SRR24057922 = sRR24057922;
		SRR24057923 = sRR24057923;
		SRR24057924 = sRR24057924;
		SRR7523531 = sRR7523531;
		SRR7523532 = sRR7523532;
		SRR7523533 = sRR7523533;
		SRR7523534 = sRR7523534;
		SRR7523535 = sRR7523535;
		SRR7523536 = sRR7523536;
		SRR7523537 = sRR7523537;
		SRR7523538 = sRR7523538;
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

	public double getERR315636() {
		return ERR315636;
	}

	public void setERR315636(double eRR315636) {
		ERR315636 = eRR315636;
	}

	public double getSRR24057921() {
		return SRR24057921;
	}

	public void setSRR24057921(double sRR24057921) {
		SRR24057921 = sRR24057921;
	}

	public double getSRR24057922() {
		return SRR24057922;
	}

	public void setSRR24057922(double sRR24057922) {
		SRR24057922 = sRR24057922;
	}

	public double getSRR24057923() {
		return SRR24057923;
	}

	public void setSRR24057923(double sRR24057923) {
		SRR24057923 = sRR24057923;
	}

	public double getSRR24057924() {
		return SRR24057924;
	}

	public void setSRR24057924(double sRR24057924) {
		SRR24057924 = sRR24057924;
	}

	public double getSRR7523531() {
		return SRR7523531;
	}

	public void setSRR7523531(double sRR7523531) {
		SRR7523531 = sRR7523531;
	}

	public double getSRR7523532() {
		return SRR7523532;
	}

	public void setSRR7523532(double sRR7523532) {
		SRR7523532 = sRR7523532;
	}

	public double getSRR7523533() {
		return SRR7523533;
	}

	public void setSRR7523533(double sRR7523533) {
		SRR7523533 = sRR7523533;
	}

	public double getSRR7523534() {
		return SRR7523534;
	}

	public void setSRR7523534(double sRR7523534) {
		SRR7523534 = sRR7523534;
	}

	public double getSRR7523535() {
		return SRR7523535;
	}

	public void setSRR7523535(double sRR7523535) {
		SRR7523535 = sRR7523535;
	}

	public double getSRR7523536() {
		return SRR7523536;
	}

	public void setSRR7523536(double sRR7523536) {
		SRR7523536 = sRR7523536;
	}

	public double getSRR7523537() {
		return SRR7523537;
	}

	public void setSRR7523537(double sRR7523537) {
		SRR7523537 = sRR7523537;
	}

	public double getSRR7523538() {
		return SRR7523538;
	}

	public void setSRR7523538(double sRR7523538) {
		SRR7523538 = sRR7523538;
	}

	@Override
	public String toString() {
		return "Mammary_gland [id=" + id + ", geneId=" + geneId + ", ERR315636=" + ERR315636 + ", SRR24057921="
				+ SRR24057921 + ", SRR24057922=" + SRR24057922 + ", SRR24057923=" + SRR24057923 + ", SRR24057924="
				+ SRR24057924 + ", SRR7523531=" + SRR7523531 + ", SRR7523532=" + SRR7523532 + ", SRR7523533="
				+ SRR7523533 + ", SRR7523534=" + SRR7523534 + ", SRR7523535=" + SRR7523535 + ", SRR7523536="
				+ SRR7523536 + ", SRR7523537=" + SRR7523537 + ", SRR7523538=" + SRR7523538 + "]";
	}
	 
	 
}
