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
@Table(name = "ovary_follicle")
public class Ovary_follicle {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="ERR315633")
	 private double ERR315633;

	public Ovary_follicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ovary_follicle(int id, String geneId, double eRR315633) {
		super();
		this.id = id;
		this.geneId = geneId;
		ERR315633 = eRR315633;
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

	public double getERR315633() {
		return ERR315633;
	}

	public void setERR315633(double eRR315633) {
		ERR315633 = eRR315633;
	}

	@Override
	public String toString() {
		return "Ovary_follicle [id=" + id + ", geneId=" + geneId + ", ERR315633=" + ERR315633 + "]";
	}
	 
	 
}
