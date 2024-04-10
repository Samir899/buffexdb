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
 @Table(name = "blood")
public class Blood {
	 
	 @Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 

	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="SRR14879259") 
	 private double SRR14879259;
	 
	@Column(name="SRR14879260") 
	private double SRR14879260;
	
	@Column(name="SRR14879261") 
	private double SRR14879261;
	
	@Column(name="SRR14879263") 
	private double SRR14879263;
	
	@Column(name="SRR14879264") 
	private double SRR14879264;
	
	@Column(name="SRR14879265") 
	private double SRR14879265;
	
	@Column(name="SRR14879267") 
	private double SRR14879267;
	
	@Column(name="SRR14879268") 
	private double SRR14879268;
	
	@Column(name="SRR14879269") 
	private double SRR14879269;
	
	@Column(name="SRR14879270") 
	private double SRR14879270;
	
	@Column(name="SRR14879271") 
	private double SRR14879271;
	
	@Column(name="SRR20281532") 
	private double SRR20281532;
	
	@Column(name="SRR20281533") 
	private double SRR20281533;
	
	@Column(name="SRR20281534") 
	private double SRR20281534;
	
	@Column(name="SRR23563044") 
	private double SRR23563044;
	
	@Column(name="SRR23563045") 
	private double SRR23563045;
	
	@Column(name="SRR23563046") 
	private double SRR23563046;
	
	@Column(name="SRR23563047") 
	private double SRR23563047;
	
	@Column(name="SRR23563048") 
	private double SRR23563048;
	
	@Column(name="SRR23563054") 
	private double SRR23563054;
	
	@Column(name="SRR8494323") 
	private double SRR8494323;
	
	@Column(name="SRR8494324") 
	private double SRR8494324;
	
	@Column(name="SRR8494326") 
	private double SRR8494326;
	
	@Column(name="SRR8494328") 
	private double SRR8494328;
	
	@Column(name="SRR8494329") 
	private double SRR8494329;
	
	@Column(name="SRR8494332") 
	private double SRR8494332;
	
	@Column(name="SRR8494334") 
	private double SRR8494334;
	
	@Column(name="SRR8494335") 
	private double SRR8494335;
 
 public Blood() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Blood(int id, String geneId, double sRR14879259, double sRR14879260, double sRR14879261, double sRR14879263,
			double sRR14879264, double sRR14879265, double sRR14879267, double sRR14879268, double sRR14879269,
			double sRR14879270, double sRR14879271, double sRR20281532, double sRR20281533, double sRR20281534,
			double sRR23563044, double sRR23563045, double sRR23563046, double sRR23563047, double sRR23563048,
			double sRR23563054, double sRR8494323, double sRR8494324, double sRR8494326, double sRR8494328,
			double sRR8494329, double sRR8494332, double sRR8494334, double sRR8494335) {
		super();
		this.id = id;
		this.geneId = geneId;
		SRR14879259 = sRR14879259;
		SRR14879260 = sRR14879260;
		SRR14879261 = sRR14879261;
		SRR14879263 = sRR14879263;
		SRR14879264 = sRR14879264;
		SRR14879265 = sRR14879265;
		SRR14879267 = sRR14879267;
		SRR14879268 = sRR14879268;
		SRR14879269 = sRR14879269;
		SRR14879270 = sRR14879270;
		SRR14879271 = sRR14879271;
		SRR20281532 = sRR20281532;
		SRR20281533 = sRR20281533;
		SRR20281534 = sRR20281534;
		SRR23563044 = sRR23563044;
		SRR23563045 = sRR23563045;
		SRR23563046 = sRR23563046;
		SRR23563047 = sRR23563047;
		SRR23563048 = sRR23563048;
		SRR23563054 = sRR23563054;
		SRR8494323 = sRR8494323;
		SRR8494324 = sRR8494324;
		SRR8494326 = sRR8494326;
		SRR8494328 = sRR8494328;
		SRR8494329 = sRR8494329;
		SRR8494332 = sRR8494332;
		SRR8494334 = sRR8494334;
		SRR8494335 = sRR8494335;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGeneId() {
		return this.geneId;
	}

	public void setGene(String geneId) {
		this.geneId = geneId;
	}

	public double getSRR14879259() {
		return SRR14879259;
	}

	public void setSRR14879259(double sRR14879259) {
		SRR14879259 = sRR14879259;
	}

	public double getSRR14879260() {
		return SRR14879260;
	}

	public void setSRR14879260(double sRR14879260) {
		SRR14879260 = sRR14879260;
	}

	public double getSRR14879261() {
		return SRR14879261;
	}

	public void setSRR14879261(double sRR14879261) {
		SRR14879261 = sRR14879261;
	}

	public double getSRR14879263() {
		return SRR14879263;
	}

	public void setSRR14879263(double sRR14879263) {
		SRR14879263 = sRR14879263;
	}

	public double getSRR14879264() {
		return SRR14879264;
	}

	public void setSRR14879264(double sRR14879264) {
		SRR14879264 = sRR14879264;
	}

	public double getSRR14879265() {
		return SRR14879265;
	}

	public void setSRR14879265(double sRR14879265) {
		SRR14879265 = sRR14879265;
	}

	public double getSRR14879267() {
		return SRR14879267;
	}

	public void setSRR14879267(double sRR14879267) {
		SRR14879267 = sRR14879267;
	}

	public double getSRR14879268() {
		return SRR14879268;
	}

	public void setSRR14879268(double sRR14879268) {
		SRR14879268 = sRR14879268;
	}

	public double getSRR14879269() {
		return SRR14879269;
	}

	public void setSRR14879269(double sRR14879269) {
		SRR14879269 = sRR14879269;
	}

	public double getSRR14879270() {
		return SRR14879270;
	}

	public void setSRR14879270(double sRR14879270) {
		SRR14879270 = sRR14879270;
	}

	public double getSRR14879271() {
		return SRR14879271;
	}

	public void setSRR14879271(double sRR14879271) {
		SRR14879271 = sRR14879271;
	}

	public double getSRR20281532() {
		return SRR20281532;
	}

	public void setSRR20281532(double sRR20281532) {
		SRR20281532 = sRR20281532;
	}

	public double getSRR20281533() {
		return SRR20281533;
	}

	public void setSRR20281533(double sRR20281533) {
		SRR20281533 = sRR20281533;
	}

	public double getSRR20281534() {
		return SRR20281534;
	}

	public void setSRR20281534(double sRR20281534) {
		SRR20281534 = sRR20281534;
	}

	public double getSRR23563044() {
		return SRR23563044;
	}

	public void setSRR23563044(double sRR23563044) {
		SRR23563044 = sRR23563044;
	}

	public double getSRR23563045() {
		return SRR23563045;
	}

	public void setSRR23563045(double sRR23563045) {
		SRR23563045 = sRR23563045;
	}

	public double getSRR23563046() {
		return SRR23563046;
	}

	public void setSRR23563046(double sRR23563046) {
		SRR23563046 = sRR23563046;
	}

	public double getSRR23563047() {
		return SRR23563047;
	}

	public void setSRR23563047(double sRR23563047) {
		SRR23563047 = sRR23563047;
	}

	public double getSRR23563048() {
		return SRR23563048;
	}

	public void setSRR23563048(double sRR23563048) {
		SRR23563048 = sRR23563048;
	}

	public double getSRR23563054() {
		return SRR23563054;
	}

	public void setSRR23563054(double sRR23563054) {
		SRR23563054 = sRR23563054;
	}

	public double getSRR8494323() {
		return SRR8494323;
	}

	public void setSRR8494323(double sRR8494323) {
		SRR8494323 = sRR8494323;
	}

	public double getSRR8494324() {
		return SRR8494324;
	}

	public void setSRR8494324(double sRR8494324) {
		SRR8494324 = sRR8494324;
	}

	public double getSRR8494326() {
		return SRR8494326;
	}

	public void setSRR8494326(double sRR8494326) {
		SRR8494326 = sRR8494326;
	}

	public double getSRR8494328() {
		return SRR8494328;
	}

	public void setSRR8494328(double sRR8494328) {
		SRR8494328 = sRR8494328;
	}

	public double getSRR8494329() {
		return SRR8494329;
	}

	public void setSRR8494329(double sRR8494329) {
		SRR8494329 = sRR8494329;
	}

	public double getSRR8494332() {
		return SRR8494332;
	}

	public void setSRR8494332(double sRR8494332) {
		SRR8494332 = sRR8494332;
	}

	public double getSRR8494334() {
		return SRR8494334;
	}

	public void setSRR8494334(double sRR8494334) {
		SRR8494334 = sRR8494334;
	}

	public double getSRR8494335() {
		return SRR8494335;
	}

	public void setSRR8494335(double sRR8494335) {
		SRR8494335 = sRR8494335;
	}

	@Override
	public String toString() {
		return "Blood [id=" + id + ", geneId=" + geneId + ", SRR14879259=" + SRR14879259 + ", SRR14879260=" + SRR14879260
				+ ", SRR14879261=" + SRR14879261 + ", SRR14879263=" + SRR14879263 + ", SRR14879264=" + SRR14879264
				+ ", SRR14879265=" + SRR14879265 + ", SRR14879267=" + SRR14879267 + ", SRR14879268=" + SRR14879268
				+ ", SRR14879269=" + SRR14879269 + ", SRR14879270=" + SRR14879270 + ", SRR14879271=" + SRR14879271
				+ ", SRR20281532=" + SRR20281532 + ", SRR20281533=" + SRR20281533 + ", SRR20281534=" + SRR20281534
				+ ", SRR23563044=" + SRR23563044 + ", SRR23563045=" + SRR23563045 + ", SRR23563046=" + SRR23563046
				+ ", SRR23563047=" + SRR23563047 + ", SRR23563048=" + SRR23563048 + ", SRR23563054=" + SRR23563054
				+ ", SRR8494323=" + SRR8494323 + ", SRR8494324=" + SRR8494324 + ", SRR8494326=" + SRR8494326
				+ ", SRR8494328=" + SRR8494328 + ", SRR8494329=" + SRR8494329 + ", SRR8494332=" + SRR8494332
				+ ", SRR8494334=" + SRR8494334 + ", SRR8494335=" + SRR8494335 + "]";
	}
 }
