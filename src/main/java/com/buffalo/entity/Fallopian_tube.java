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
@Table(name = "fallopian_tube")

public class Fallopian_tube {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;

	 @Column(name="ERR2352810")
	 private double ERR2352810;
	 
	@Column(name="ERR2352811")
	 private double ERR2352811;
	
	@Column(name="ERR2352812")
	 private double ERR2352812;
	
	@Column(name="ERR2352813")
	 private double ERR2352813;
	
	@Column(name="ERR2352814")
	 private double ERR2352814;
	
	@Column(name="ERR2352815")
	 private double ERR2352815;
	
	@Column(name="ERR2352816")
	 private double ERR2352816;
	
	@Column(name="ERR2353168")
	 private double ERR2353168;
	
	@Column(name="ERR2353169")
	 private double ERR2353169;
	
	@Column(name="ERR2353170")
	 private double ERR2353170;
	
	@Column(name="ERR2353171")
	 private double ERR2353171;
	
	@Column(name="ERR2353172")
	 private double ERR2353172;
	
	@Column(name="ERR2353173")
	 private double ERR2353173;
	
	@Column(name="ERR2353174")
	 private double ERR2353174;
	
	@Column(name="ERR2353175")
	 private double ERR2353175;
	
	@Column(name="ERR2353176")
	 private double ERR2353176;
	
	@Column(name="ERR2354465")
	 private double ERR2354465;
	
	@Column(name="ERR2354466")
	 private double ERR2354466;
	
	@Column(name="ERR2354467")
	 private double ERR2354467;
	
	@Column(name="ERR2354468")
	 private double ERR2354468;
	
	@Column(name="ERR2354469")
	 private double ERR2354469;
	
	@Column(name="ERR2354470")
	 private double ERR2354470;
	
	@Column(name="ERR2354471")
	 private double ERR2354471;
	
	@Column(name="ERR2354472")
	 private double ERR2354472;
	
	@Column(name="ERR2354473")
	 private double ERR2354473;
}
