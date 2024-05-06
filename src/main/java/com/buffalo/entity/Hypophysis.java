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
@Table(name = "hypophysis")
public class Hypophysis {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="ERR315622")
	 private double ERR315622;

	public Hypophysis() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hypophysis(int id, String geneId, double eRR315622) {
		super();
		this.id = id;
		this.geneId = geneId;
		ERR315622 = eRR315622;
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

	public double getERR315622() {
		return ERR315622;
	}

	public void setERR315622(double eRR315622) {
		ERR315622 = eRR315622;
	}

	@Override
	public String toString() {
		return "Hypophysis [id=" + id + ", geneId=" + geneId + ", ERR315622=" + ERR315622 + "]";
	}
	 
	 
}
