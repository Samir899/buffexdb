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
@Table(name = "white_blood_cell")
public class White_blood_cell {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="ERR315624") 
	 private double ERR315624;

	public White_blood_cell() {
		super();
		// TODO Auto-generated constructor stub
	}

	public White_blood_cell(int id, String geneId, double eRR315624) {
		super();
		this.id = id;
		this.geneId = geneId;
		ERR315624 = eRR315624;
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

	public double getERR315624() {
		return ERR315624;
	}

	public void setERR315624(double eRR315624) {
		ERR315624 = eRR315624;
	}

	@Override
	public String toString() {
		return "White_blood_cell [id=" + id + ", geneId=" + geneId + ", ERR315624=" + ERR315624 + "]";
	}
	 
	 
}
