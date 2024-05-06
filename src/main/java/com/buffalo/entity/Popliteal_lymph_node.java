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
@Table(name = "popliteal_lymph_node")
public class Popliteal_lymph_node {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="ERR2353433")
	 private double ERR2353433;

	@Column(name="ERR2353435")
	 private double ERR2353435;

	@Column(name="ERR2353436")
	 private double ERR2353436;

	@Column(name="ERR2353437")
	 private double ERR2353437;

	@Column(name="ERR2353438")
	 private double ERR2353438;

	@Column(name="ERR2353439")
	 private double ERR2353439;

	@Column(name="ERR2353440")
	 private double ERR2353440;

	@Column(name="ERR2353441")
	 private double ERR2353441;

	public Popliteal_lymph_node() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Popliteal_lymph_node(int id, String geneId, double eRR2353433, double eRR2353435, double eRR2353436,
			double eRR2353437, double eRR2353438, double eRR2353439, double eRR2353440, double eRR2353441) {
		super();
		this.id = id;
		this.geneId = geneId;
		ERR2353433 = eRR2353433;
		ERR2353435 = eRR2353435;
		ERR2353436 = eRR2353436;
		ERR2353437 = eRR2353437;
		ERR2353438 = eRR2353438;
		ERR2353439 = eRR2353439;
		ERR2353440 = eRR2353440;
		ERR2353441 = eRR2353441;
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

	public double getERR2353433() {
		return ERR2353433;
	}

	public void setERR2353433(double eRR2353433) {
		ERR2353433 = eRR2353433;
	}

	public double getERR2353435() {
		return ERR2353435;
	}

	public void setERR2353435(double eRR2353435) {
		ERR2353435 = eRR2353435;
	}

	public double getERR2353436() {
		return ERR2353436;
	}

	public void setERR2353436(double eRR2353436) {
		ERR2353436 = eRR2353436;
	}

	public double getERR2353437() {
		return ERR2353437;
	}

	public void setERR2353437(double eRR2353437) {
		ERR2353437 = eRR2353437;
	}

	public double getERR2353438() {
		return ERR2353438;
	}

	public void setERR2353438(double eRR2353438) {
		ERR2353438 = eRR2353438;
	}

	public double getERR2353439() {
		return ERR2353439;
	}

	public void setERR2353439(double eRR2353439) {
		ERR2353439 = eRR2353439;
	}

	public double getERR2353440() {
		return ERR2353440;
	}

	public void setERR2353440(double eRR2353440) {
		ERR2353440 = eRR2353440;
	}

	public double getERR2353441() {
		return ERR2353441;
	}

	public void setERR2353441(double eRR2353441) {
		ERR2353441 = eRR2353441;
	}

	@Override
	public String toString() {
		return "Popliteal_lymph_node [id=" + id + ", geneId=" + geneId + ", ERR2353433=" + ERR2353433 + ", ERR2353435="
				+ ERR2353435 + ", ERR2353436=" + ERR2353436 + ", ERR2353437=" + ERR2353437 + ", ERR2353438="
				+ ERR2353438 + ", ERR2353439=" + ERR2353439 + ", ERR2353440=" + ERR2353440 + ", ERR2353441="
				+ ERR2353441 + "]";
	}
}
