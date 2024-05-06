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
@Table(name = "intestine")
public class Intestine {
	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
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

	public double getERR315620() {
		return ERR315620;
	}

	public void setERR315620(double eRR315620) {
		ERR315620 = eRR315620;
	}

	@Override
	public String toString() {
		return "Intestine [id=" + id + ", geneId=" + geneId + ", ERR315620=" + ERR315620 + "]";
	}

	public Intestine(int id, String geneId, double eRR315620) {
		super();
		this.id = id;
		this.geneId = geneId;
		ERR315620 = eRR315620;
	}

	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="ERR315620")
	 private double ERR315620;

	public Intestine() {
		super();
		// TODO Auto-generated constructor stub
	}
}
