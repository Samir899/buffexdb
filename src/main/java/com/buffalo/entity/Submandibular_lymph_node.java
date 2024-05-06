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
@Table(name = "submandibular_lymph_node")
public class Submandibular_lymph_node {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="ERR2353528")
	 private double ERR2353528;

	 @Column(name="ERR2353529")
	 private double ERR2353529;

	 @Column(name="ERR2353530")
	 private double ERR2353530;

	 @Column(name="ERR2353531")
	 private double ERR2353531;

	 @Column(name="ERR2353532")
	 private double ERR2353532;

	 @Column(name="ERR2353533")
	 private double ERR2353533;

	 @Column(name="ERR2353534")
	 private double ERR2353534;

	 @Column(name="ERR2353535")
	 private double ERR2353535;

	 @Column(name="ERR2353536")
	 private double ERR2353536;

	 @Column(name="ERR2354347")
	 private double ERR2354347;

	 @Column(name="ERR2354348")
	 private double ERR2354348;

	 @Column(name="ERR2354349")
	 private double ERR2354349;

	 @Column(name="ERR2354350")
	 private double ERR2354350;

	 @Column(name="ERR2354351")
	 private double ERR2354351;

	 @Column(name="ERR2354352")
	 private double ERR2354352;

	 @Column(name="ERR2354353")
	 private double ERR2354353;

	 @Column(name="ERR2354354")
	 private double ERR2354354;

	 @Column(name="ERR2354355")
	 private double ERR2354355;

	 @Column(name="ERR2354912")
	 private double ERR2354912;

	 @Column(name="ERR2354913")
	 private double ERR2354913;

	 @Column(name="ERR2354914")
	 private double ERR2354914;

	 @Column(name="ERR2354915")
	 private double ERR2354915;

	 @Column(name="ERR2354916")
	 private double ERR2354916;

	 @Column(name="ERR2354917")
	 private double ERR2354917;

	 @Column(name="ERR2354918")
	 private double ERR2354918;

	 @Column(name="ERR2354919")
	 private double ERR2354919;

	 @Column(name="ERR2354920")
	 private double ERR2354920;

	public Submandibular_lymph_node() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Submandibular_lymph_node(int id, String geneId, double eRR2353528, double eRR2353529, double eRR2353530,
			double eRR2353531, double eRR2353532, double eRR2353533, double eRR2353534, double eRR2353535,
			double eRR2353536, double eRR2354347, double eRR2354348, double eRR2354349, double eRR2354350,
			double eRR2354351, double eRR2354352, double eRR2354353, double eRR2354354, double eRR2354355,
			double eRR2354912, double eRR2354913, double eRR2354914, double eRR2354915, double eRR2354916,
			double eRR2354917, double eRR2354918, double eRR2354919, double eRR2354920) {
		super();
		this.id = id;
		this.geneId = geneId;
		ERR2353528 = eRR2353528;
		ERR2353529 = eRR2353529;
		ERR2353530 = eRR2353530;
		ERR2353531 = eRR2353531;
		ERR2353532 = eRR2353532;
		ERR2353533 = eRR2353533;
		ERR2353534 = eRR2353534;
		ERR2353535 = eRR2353535;
		ERR2353536 = eRR2353536;
		ERR2354347 = eRR2354347;
		ERR2354348 = eRR2354348;
		ERR2354349 = eRR2354349;
		ERR2354350 = eRR2354350;
		ERR2354351 = eRR2354351;
		ERR2354352 = eRR2354352;
		ERR2354353 = eRR2354353;
		ERR2354354 = eRR2354354;
		ERR2354355 = eRR2354355;
		ERR2354912 = eRR2354912;
		ERR2354913 = eRR2354913;
		ERR2354914 = eRR2354914;
		ERR2354915 = eRR2354915;
		ERR2354916 = eRR2354916;
		ERR2354917 = eRR2354917;
		ERR2354918 = eRR2354918;
		ERR2354919 = eRR2354919;
		ERR2354920 = eRR2354920;
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

	public double getERR2353528() {
		return ERR2353528;
	}

	public void setERR2353528(double eRR2353528) {
		ERR2353528 = eRR2353528;
	}

	public double getERR2353529() {
		return ERR2353529;
	}

	public void setERR2353529(double eRR2353529) {
		ERR2353529 = eRR2353529;
	}

	public double getERR2353530() {
		return ERR2353530;
	}

	public void setERR2353530(double eRR2353530) {
		ERR2353530 = eRR2353530;
	}

	public double getERR2353531() {
		return ERR2353531;
	}

	public void setERR2353531(double eRR2353531) {
		ERR2353531 = eRR2353531;
	}

	public double getERR2353532() {
		return ERR2353532;
	}

	public void setERR2353532(double eRR2353532) {
		ERR2353532 = eRR2353532;
	}

	public double getERR2353533() {
		return ERR2353533;
	}

	public void setERR2353533(double eRR2353533) {
		ERR2353533 = eRR2353533;
	}

	public double getERR2353534() {
		return ERR2353534;
	}

	public void setERR2353534(double eRR2353534) {
		ERR2353534 = eRR2353534;
	}

	public double getERR2353535() {
		return ERR2353535;
	}

	public void setERR2353535(double eRR2353535) {
		ERR2353535 = eRR2353535;
	}

	public double getERR2353536() {
		return ERR2353536;
	}

	public void setERR2353536(double eRR2353536) {
		ERR2353536 = eRR2353536;
	}

	public double getERR2354347() {
		return ERR2354347;
	}

	public void setERR2354347(double eRR2354347) {
		ERR2354347 = eRR2354347;
	}

	public double getERR2354348() {
		return ERR2354348;
	}

	public void setERR2354348(double eRR2354348) {
		ERR2354348 = eRR2354348;
	}

	public double getERR2354349() {
		return ERR2354349;
	}

	public void setERR2354349(double eRR2354349) {
		ERR2354349 = eRR2354349;
	}

	public double getERR2354350() {
		return ERR2354350;
	}

	public void setERR2354350(double eRR2354350) {
		ERR2354350 = eRR2354350;
	}

	public double getERR2354351() {
		return ERR2354351;
	}

	public void setERR2354351(double eRR2354351) {
		ERR2354351 = eRR2354351;
	}

	public double getERR2354352() {
		return ERR2354352;
	}

	public void setERR2354352(double eRR2354352) {
		ERR2354352 = eRR2354352;
	}

	public double getERR2354353() {
		return ERR2354353;
	}

	public void setERR2354353(double eRR2354353) {
		ERR2354353 = eRR2354353;
	}

	public double getERR2354354() {
		return ERR2354354;
	}

	public void setERR2354354(double eRR2354354) {
		ERR2354354 = eRR2354354;
	}

	public double getERR2354355() {
		return ERR2354355;
	}

	public void setERR2354355(double eRR2354355) {
		ERR2354355 = eRR2354355;
	}

	public double getERR2354912() {
		return ERR2354912;
	}

	public void setERR2354912(double eRR2354912) {
		ERR2354912 = eRR2354912;
	}

	public double getERR2354913() {
		return ERR2354913;
	}

	public void setERR2354913(double eRR2354913) {
		ERR2354913 = eRR2354913;
	}

	public double getERR2354914() {
		return ERR2354914;
	}

	public void setERR2354914(double eRR2354914) {
		ERR2354914 = eRR2354914;
	}

	public double getERR2354915() {
		return ERR2354915;
	}

	public void setERR2354915(double eRR2354915) {
		ERR2354915 = eRR2354915;
	}

	public double getERR2354916() {
		return ERR2354916;
	}

	public void setERR2354916(double eRR2354916) {
		ERR2354916 = eRR2354916;
	}

	public double getERR2354917() {
		return ERR2354917;
	}

	public void setERR2354917(double eRR2354917) {
		ERR2354917 = eRR2354917;
	}

	public double getERR2354918() {
		return ERR2354918;
	}

	public void setERR2354918(double eRR2354918) {
		ERR2354918 = eRR2354918;
	}

	public double getERR2354919() {
		return ERR2354919;
	}

	public void setERR2354919(double eRR2354919) {
		ERR2354919 = eRR2354919;
	}

	public double getERR2354920() {
		return ERR2354920;
	}

	public void setERR2354920(double eRR2354920) {
		ERR2354920 = eRR2354920;
	}

	@Override
	public String toString() {
		return "Submandibular_lymph_node [id=" + id + ", geneId=" + geneId + ", ERR2353528=" + ERR2353528
				+ ", ERR2353529=" + ERR2353529 + ", ERR2353530=" + ERR2353530 + ", ERR2353531=" + ERR2353531
				+ ", ERR2353532=" + ERR2353532 + ", ERR2353533=" + ERR2353533 + ", ERR2353534=" + ERR2353534
				+ ", ERR2353535=" + ERR2353535 + ", ERR2353536=" + ERR2353536 + ", ERR2354347=" + ERR2354347
				+ ", ERR2354348=" + ERR2354348 + ", ERR2354349=" + ERR2354349 + ", ERR2354350=" + ERR2354350
				+ ", ERR2354351=" + ERR2354351 + ", ERR2354352=" + ERR2354352 + ", ERR2354353=" + ERR2354353
				+ ", ERR2354354=" + ERR2354354 + ", ERR2354355=" + ERR2354355 + ", ERR2354912=" + ERR2354912
				+ ", ERR2354913=" + ERR2354913 + ", ERR2354914=" + ERR2354914 + ", ERR2354915=" + ERR2354915
				+ ", ERR2354916=" + ERR2354916 + ", ERR2354917=" + ERR2354917 + ", ERR2354918=" + ERR2354918
				+ ", ERR2354919=" + ERR2354919 + ", ERR2354920=" + ERR2354920 + "]";
	}
	 
}
