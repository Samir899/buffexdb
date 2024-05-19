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
@Table(name = "thoracic_esophagus")
public class Thoracic_esophagus {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="ERR2353546")
	 private double ERR2353546;
	 
	@Column(name="ERR2353547")
	 private double ERR2353547;
	
	@Column(name="ERR2353548")
	 private double ERR2353548;
	
	@Column(name="ERR2353549")
	 private double ERR2353549;
	
	@Column(name="ERR2353550")
	 private double ERR2353550;
	
	@Column(name="ERR2353551")
	 private double ERR2353551;
	
	@Column(name="ERR2353552")
	 private double ERR2353552;
	
	@Column(name="ERR2353553")
	 private double ERR2353553;
	
	@Column(name="ERR2353554")
	 private double ERR2353554;
	
	@Column(name="ERR2354388")
	 private double ERR2354388;
	
	@Column(name="ERR2354389")
	 private double ERR2354389;
	
	@Column(name="ERR2354390")
	 private double ERR2354390;
	
	@Column(name="ERR2354391")
	 private double ERR2354391;
	
	@Column(name="ERR2354392")
	 private double ERR2354392;
	
	@Column(name="ERR2354393")
	 private double ERR2354393;
	
	@Column(name="ERR2354394")
	 private double ERR2354394;
	
	@Column(name="ERR2354395")
	 private double ERR2354395;
	
	@Column(name="ERR2354396")
	 private double ERR2354396;

	public Thoracic_esophagus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Thoracic_esophagus(int id, String geneId, double eRR2353546, double eRR2353547, double eRR2353548,
			double eRR2353549, double eRR2353550, double eRR2353551, double eRR2353552, double eRR2353553,
			double eRR2353554, double eRR2354388, double eRR2354389, double eRR2354390, double eRR2354391,
			double eRR2354392, double eRR2354393, double eRR2354394, double eRR2354395, double eRR2354396) {
		super();
		this.id = id;
		this.geneId = geneId;
		ERR2353546 = eRR2353546;
		ERR2353547 = eRR2353547;
		ERR2353548 = eRR2353548;
		ERR2353549 = eRR2353549;
		ERR2353550 = eRR2353550;
		ERR2353551 = eRR2353551;
		ERR2353552 = eRR2353552;
		ERR2353553 = eRR2353553;
		ERR2353554 = eRR2353554;
		ERR2354388 = eRR2354388;
		ERR2354389 = eRR2354389;
		ERR2354390 = eRR2354390;
		ERR2354391 = eRR2354391;
		ERR2354392 = eRR2354392;
		ERR2354393 = eRR2354393;
		ERR2354394 = eRR2354394;
		ERR2354395 = eRR2354395;
		ERR2354396 = eRR2354396;
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

	public double getERR2353546() {
		return ERR2353546;
	}

	public void setERR2353546(double eRR2353546) {
		ERR2353546 = eRR2353546;
	}

	public double getERR2353547() {
		return ERR2353547;
	}

	public void setERR2353547(double eRR2353547) {
		ERR2353547 = eRR2353547;
	}

	public double getERR2353548() {
		return ERR2353548;
	}

	public void setERR2353548(double eRR2353548) {
		ERR2353548 = eRR2353548;
	}

	public double getERR2353549() {
		return ERR2353549;
	}

	public void setERR2353549(double eRR2353549) {
		ERR2353549 = eRR2353549;
	}

	public double getERR2353550() {
		return ERR2353550;
	}

	public void setERR2353550(double eRR2353550) {
		ERR2353550 = eRR2353550;
	}

	public double getERR2353551() {
		return ERR2353551;
	}

	public void setERR2353551(double eRR2353551) {
		ERR2353551 = eRR2353551;
	}

	public double getERR2353552() {
		return ERR2353552;
	}

	public void setERR2353552(double eRR2353552) {
		ERR2353552 = eRR2353552;
	}

	public double getERR2353553() {
		return ERR2353553;
	}

	public void setERR2353553(double eRR2353553) {
		ERR2353553 = eRR2353553;
	}

	public double getERR2353554() {
		return ERR2353554;
	}

	public void setERR2353554(double eRR2353554) {
		ERR2353554 = eRR2353554;
	}

	public double getERR2354388() {
		return ERR2354388;
	}

	public void setERR2354388(double eRR2354388) {
		ERR2354388 = eRR2354388;
	}

	public double getERR2354389() {
		return ERR2354389;
	}

	public void setERR2354389(double eRR2354389) {
		ERR2354389 = eRR2354389;
	}

	public double getERR2354390() {
		return ERR2354390;
	}

	public void setERR2354390(double eRR2354390) {
		ERR2354390 = eRR2354390;
	}

	public double getERR2354391() {
		return ERR2354391;
	}

	public void setERR2354391(double eRR2354391) {
		ERR2354391 = eRR2354391;
	}

	public double getERR2354392() {
		return ERR2354392;
	}

	public void setERR2354392(double eRR2354392) {
		ERR2354392 = eRR2354392;
	}

	public double getERR2354393() {
		return ERR2354393;
	}

	public void setERR2354393(double eRR2354393) {
		ERR2354393 = eRR2354393;
	}

	public double getERR2354394() {
		return ERR2354394;
	}

	public void setERR2354394(double eRR2354394) {
		ERR2354394 = eRR2354394;
	}

	public double getERR2354395() {
		return ERR2354395;
	}

	public void setERR2354395(double eRR2354395) {
		ERR2354395 = eRR2354395;
	}

	public double getERR2354396() {
		return ERR2354396;
	}

	public void setERR2354396(double eRR2354396) {
		ERR2354396 = eRR2354396;
	}

	@Override
	public String toString() {
		return "Thoracic_esophagus [id=" + id + ", geneId=" + geneId + ", ERR2353546=" + ERR2353546 + ", ERR2353547="
				+ ERR2353547 + ", ERR2353548=" + ERR2353548 + ", ERR2353549=" + ERR2353549 + ", ERR2353550="
				+ ERR2353550 + ", ERR2353551=" + ERR2353551 + ", ERR2353552=" + ERR2353552 + ", ERR2353553="
				+ ERR2353553 + ", ERR2353554=" + ERR2353554 + ", ERR2354388=" + ERR2354388 + ", ERR2354389="
				+ ERR2354389 + ", ERR2354390=" + ERR2354390 + ", ERR2354391=" + ERR2354391 + ", ERR2354392="
				+ ERR2354392 + ", ERR2354393=" + ERR2354393 + ", ERR2354394=" + ERR2354394 + ", ERR2354395="
				+ ERR2354395 + ", ERR2354396=" + ERR2354396 + "]";
	}
}
