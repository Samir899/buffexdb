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
@Table(name = "CorpusLuteum")
public class CorpusLuteum {
	
	 @Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="ERR315632")
	 private double ERR315632;

	public CorpusLuteum() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CorpusLuteum(int id, String geneId, double eRR315632) {
		super();
		this.id = id;
		this.geneId = geneId;
		ERR315632 = eRR315632;
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

	public void setGene(String geneId) {
		this.geneId = geneId;
	}

	public double getERR315632() {
		return ERR315632;
	}

	public void setERR315632(double eRR315632) {
		ERR315632 = eRR315632;
	}

	@Override
	public String toString() {
		return "CorpusLuteum [id=" + id + ", geneId=" + geneId + ", ERR315632=" + ERR315632 + "]";
	}
	 
	 

}
