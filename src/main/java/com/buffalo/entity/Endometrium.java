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
@Table(name = "endometrium")
public class Endometrium {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	@Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="ERR315635")
	 private double ERR315635;

	public Endometrium() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Endometrium(int id, String geneId, double eRR315635) {
		super();
		this.id = id;
		this.geneId = geneId;
		ERR315635 = eRR315635;
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

	public double getERR315635() {
		return ERR315635;
	}

	public void setERR315635(double eRR315635) {
		ERR315635 = eRR315635;
	}

	@Override
	public String toString() {
		return "Endometrium [id=" + id + ", geneId=" + geneId + ", ERR315635=" + ERR315635 + "]";
	}
	 
}
