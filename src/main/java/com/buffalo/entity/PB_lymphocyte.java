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
@Table(name = "pb_lymphocyte")
public class PB_lymphocyte {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="SRR7589954")
	 private double SRR7589954;

	@Column(name="SRR7589955")
	 private double SRR7589955;

	@Column(name="SRR7589956")
	 private double SRR7589956;

	@Column(name="SRR7589957")
	 private double SRR7589957;

	@Column(name="SRR7589958")
	 private double SRR7589958;

	@Column(name="SRR7589959")
	 private double SRR7589959;

	@Column(name="SRR7589960")
	 private double SRR7589960;

	@Column(name="SRR7589961")
	 private double SRR7589961;

	@Column(name="SRR7589962")
	 private double SRR7589962;

	@Column(name="SRR7589963")
	 private double SRR7589963;

	@Column(name="SRR7589964")
	 private double SRR7589964;

	@Column(name="SRR7589965")
	 private double SRR7589965;

	@Column(name="SRR7589966")
	 private double SRR7589966;

	@Column(name="SRR7589967")
	 private double SRR7589967;

	@Column(name="SRR7589968")
	 private double SRR7589968;

	@Column(name="SRR7589969")
	 private double SRR7589969;

	@Column(name="SRR7589970")
	 private double SRR7589970;

	@Column(name="SRR7589971")
	 private double SRR7589971;

	public PB_lymphocyte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PB_lymphocyte(int id, String geneId, double sRR7589954, double sRR7589955, double sRR7589956, double sRR7589957,
			double sRR7589958, double sRR7589959, double sRR7589960, double sRR7589961, double sRR7589962,
			double sRR7589963, double sRR7589964, double sRR7589965, double sRR7589966, double sRR7589967,
			double sRR7589968, double sRR7589969, double sRR7589970, double sRR7589971) {
		super();
		this.id = id;
		this.geneId = geneId;
		SRR7589954 = sRR7589954;
		SRR7589955 = sRR7589955;
		SRR7589956 = sRR7589956;
		SRR7589957 = sRR7589957;
		SRR7589958 = sRR7589958;
		SRR7589959 = sRR7589959;
		SRR7589960 = sRR7589960;
		SRR7589961 = sRR7589961;
		SRR7589962 = sRR7589962;
		SRR7589963 = sRR7589963;
		SRR7589964 = sRR7589964;
		SRR7589965 = sRR7589965;
		SRR7589966 = sRR7589966;
		SRR7589967 = sRR7589967;
		SRR7589968 = sRR7589968;
		SRR7589969 = sRR7589969;
		SRR7589970 = sRR7589970;
		SRR7589971 = sRR7589971;
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

	public double getSRR7589954() {
		return SRR7589954;
	}

	public void setSRR7589954(double sRR7589954) {
		SRR7589954 = sRR7589954;
	}

	public double getSRR7589955() {
		return SRR7589955;
	}

	public void setSRR7589955(double sRR7589955) {
		SRR7589955 = sRR7589955;
	}

	public double getSRR7589956() {
		return SRR7589956;
	}

	public void setSRR7589956(double sRR7589956) {
		SRR7589956 = sRR7589956;
	}

	public double getSRR7589957() {
		return SRR7589957;
	}

	public void setSRR7589957(double sRR7589957) {
		SRR7589957 = sRR7589957;
	}

	public double getSRR7589958() {
		return SRR7589958;
	}

	public void setSRR7589958(double sRR7589958) {
		SRR7589958 = sRR7589958;
	}

	public double getSRR7589959() {
		return SRR7589959;
	}

	public void setSRR7589959(double sRR7589959) {
		SRR7589959 = sRR7589959;
	}

	public double getSRR7589960() {
		return SRR7589960;
	}

	public void setSRR7589960(double sRR7589960) {
		SRR7589960 = sRR7589960;
	}

	public double getSRR7589961() {
		return SRR7589961;
	}

	public void setSRR7589961(double sRR7589961) {
		SRR7589961 = sRR7589961;
	}

	public double getSRR7589962() {
		return SRR7589962;
	}

	public void setSRR7589962(double sRR7589962) {
		SRR7589962 = sRR7589962;
	}

	public double getSRR7589963() {
		return SRR7589963;
	}

	public void setSRR7589963(double sRR7589963) {
		SRR7589963 = sRR7589963;
	}

	public double getSRR7589964() {
		return SRR7589964;
	}

	public void setSRR7589964(double sRR7589964) {
		SRR7589964 = sRR7589964;
	}

	public double getSRR7589965() {
		return SRR7589965;
	}

	public void setSRR7589965(double sRR7589965) {
		SRR7589965 = sRR7589965;
	}

	public double getSRR7589966() {
		return SRR7589966;
	}

	public void setSRR7589966(double sRR7589966) {
		SRR7589966 = sRR7589966;
	}

	public double getSRR7589967() {
		return SRR7589967;
	}

	public void setSRR7589967(double sRR7589967) {
		SRR7589967 = sRR7589967;
	}

	public double getSRR7589968() {
		return SRR7589968;
	}

	public void setSRR7589968(double sRR7589968) {
		SRR7589968 = sRR7589968;
	}

	public double getSRR7589969() {
		return SRR7589969;
	}

	public void setSRR7589969(double sRR7589969) {
		SRR7589969 = sRR7589969;
	}

	public double getSRR7589970() {
		return SRR7589970;
	}

	public void setSRR7589970(double sRR7589970) {
		SRR7589970 = sRR7589970;
	}

	public double getSRR7589971() {
		return SRR7589971;
	}

	public void setSRR7589971(double sRR7589971) {
		SRR7589971 = sRR7589971;
	}

	@Override
	public String toString() {
		return "PB_lymphocyte [id=" + id + ", geneId=" + geneId + ", SRR7589954=" + SRR7589954 + ", SRR7589955="
				+ SRR7589955 + ", SRR7589956=" + SRR7589956 + ", SRR7589957=" + SRR7589957 + ", SRR7589958="
				+ SRR7589958 + ", SRR7589959=" + SRR7589959 + ", SRR7589960=" + SRR7589960 + ", SRR7589961="
				+ SRR7589961 + ", SRR7589962=" + SRR7589962 + ", SRR7589963=" + SRR7589963 + ", SRR7589964="
				+ SRR7589964 + ", SRR7589965=" + SRR7589965 + ", SRR7589966=" + SRR7589966 + ", SRR7589967="
				+ SRR7589967 + ", SRR7589968=" + SRR7589968 + ", SRR7589969=" + SRR7589969 + ", SRR7589970="
				+ SRR7589970 + ", SRR7589971=" + SRR7589971 + "]";
	}

}
