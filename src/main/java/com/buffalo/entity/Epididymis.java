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
@Table(name = "epididymis")
public class Epididymis {
	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;

	 @Column(name="ERR2352624")
	 private double ERR2352624;
	 
	@Column(name="ERR2352625")
	 private double ERR2352625;
	
	@Column(name="ERR2352626")
	 private double ERR2352626;
	
	@Column(name="ERR2352627")
	 private double ERR2352627;
	
	@Column(name="ERR2352628")
	 private double ERR2352628;
	
	@Column(name="ERR2352629")
	 private double ERR2352629;
	
	@Column(name="ERR2352630")
	 private double ERR2352630;
	
	@Column(name="ERR2352631")
	 private double ERR2352631;
	
	@Column(name="ERR2352632")
	 private double ERR2352632;
	
	@Column(name="ERR2353645")
	 private double ERR2353645;
	
	@Column(name="ERR2353646")
	 private double ERR2353646;
	
	@Column(name="ERR2353647")
	 private double ERR2353647;
	
	@Column(name="ERR2353648")
	 private double ERR2353648;
	
	@Column(name="ERR2353649")
	 private double ERR2353649;
	
	@Column(name="ERR2353650")
	 private double ERR2353650;
	
	@Column(name="ERR2353651")
	 private double ERR2353651;
	
	@Column(name="ERR2354028")
	 private double ERR2354028;
	
	@Column(name="ERR2354029")
	 private double ERR2354029;
	
	@Column(name="ERR2354030")
	 private double ERR2354030;
	
	@Column(name="ERR2354031")
	 private double ERR2354031;
	
	@Column(name="ERR2354032")
	 private double ERR2354032;
	
	@Column(name="ERR2354033")
	 private double ERR2354033;
	
	@Column(name="ERR2354034")
	 private double ERR2354034;
	
	@Column(name="ERR2354035")
	 private double ERR2354035;
	
	@Column(name="ERR2354036")
	 private double ERR2354036;
}
