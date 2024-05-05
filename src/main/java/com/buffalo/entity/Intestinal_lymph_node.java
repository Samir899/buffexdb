package com.buffalo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "intestinal_lymph_node")
public class Intestinal_lymph_node {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 

	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="SRR24057892") 
	 private double SRR24057892;
	 
	@Column(name="SRR24057893") 
	private double SRR24057893;
	
	@Column(name="SRR24057961") 
	private double SRR24057961;
	
	@Column(name="SRR24057962") 
	private double SRR24057962;

	public Intestinal_lymph_node() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Intestinal_lymph_node(int id, String geneId, double sRR24057892, double sRR24057893, double sRR24057961,
			double sRR24057962) {
		super();
		this.id = id;
		this.geneId = geneId;
		SRR24057892 = sRR24057892;
		SRR24057893 = sRR24057893;
		SRR24057961 = sRR24057961;
		SRR24057962 = sRR24057962;
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

	public double getSRR24057892() {
		return SRR24057892;
	}

	public void setSRR24057892(double sRR24057892) {
		SRR24057892 = sRR24057892;
	}

	public double getSRR24057893() {
		return SRR24057893;
	}

	public void setSRR24057893(double sRR24057893) {
		SRR24057893 = sRR24057893;
	}

	public double getSRR24057961() {
		return SRR24057961;
	}

	public void setSRR24057961(double sRR24057961) {
		SRR24057961 = sRR24057961;
	}

	public double getSRR24057962() {
		return SRR24057962;
	}

	public void setSRR24057962(double sRR24057962) {
		SRR24057962 = sRR24057962;
	}

	@Override
	public String toString() {
		return "Intestinal_lymph_node [id=" + id + ", geneId=" + geneId + ", SRR24057892=" + SRR24057892
				+ ", SRR24057893=" + SRR24057893 + ", SRR24057961=" + SRR24057961 + ", SRR24057962=" + SRR24057962
				+ "]";
	}
	
	
}
