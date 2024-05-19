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
@Table(name = "oviduct")
public class Oviduct {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="ERR315634")
	 private double ERR315634;

	public Oviduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Oviduct(int id, String geneId, double eRR315634) {
		super();
		this.id = id;
		this.geneId = geneId;
		ERR315634 = eRR315634;
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

	public double getERR315634() {
		return ERR315634;
	}

	public void setERR315634(double eRR315634) {
		ERR315634 = eRR315634;
	}

	@Override
	public String toString() {
		return "Oviduct [id=" + id + ", geneId=" + geneId + ", ERR315634=" + ERR315634 + "]";
	}
	 
	 
}
