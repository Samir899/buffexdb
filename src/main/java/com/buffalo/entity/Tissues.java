package com.buffalo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tissues")
public class Tissues {
	
	 @Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	  
	 @Column(name="name", length=60)
	 private String tissue_name;


	public Tissues(int id, String tissue_name) {
		super();
		this.id = id;
		this.tissue_name = tissue_name;
	}


	public Tissues() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTissue_name() {
		return tissue_name;
	}


	public void setTissue_name(String tissue_name) {
		this.tissue_name = tissue_name;
	}
	 
	 
}
