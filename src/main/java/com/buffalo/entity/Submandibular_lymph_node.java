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
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
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
}
