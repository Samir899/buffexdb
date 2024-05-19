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
@Table(name = "hippocampus_layer")
public class Hippocampus_layer {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="ERR2352825")
	 private double ERR2352825;

	@Column(name="ERR2353668")
	 private double ERR2353668;

	@Column(name="ERR2353669")
	 private double ERR2353669;

	@Column(name="ERR2353670")
	 private double ERR2353670;

	@Column(name="ERR2353671")
	 private double ERR2353671;

	@Column(name="ERR2353672")
	 private double ERR2353672;

	@Column(name="ERR2353673")
	 private double ERR2353673;

	@Column(name="ERR2353674")
	 private double ERR2353674;

	@Column(name="ERR2353675")
	 private double ERR2353675;

	@Column(name="ERR2353676")
	 private double ERR2353676;

	public Hippocampus_layer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hippocampus_layer(int id, String geneId, double eRR2352825, double eRR2353668, double eRR2353669,
			double eRR2353670, double eRR2353671, double eRR2353672, double eRR2353673, double eRR2353674,
			double eRR2353675, double eRR2353676) {
		super();
		this.id = id;
		this.geneId = geneId;
		ERR2352825 = eRR2352825;
		ERR2353668 = eRR2353668;
		ERR2353669 = eRR2353669;
		ERR2353670 = eRR2353670;
		ERR2353671 = eRR2353671;
		ERR2353672 = eRR2353672;
		ERR2353673 = eRR2353673;
		ERR2353674 = eRR2353674;
		ERR2353675 = eRR2353675;
		ERR2353676 = eRR2353676;
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

	public double getERR2352825() {
		return ERR2352825;
	}

	public void setERR2352825(double eRR2352825) {
		ERR2352825 = eRR2352825;
	}

	public double getERR2353668() {
		return ERR2353668;
	}

	public void setERR2353668(double eRR2353668) {
		ERR2353668 = eRR2353668;
	}

	public double getERR2353669() {
		return ERR2353669;
	}

	public void setERR2353669(double eRR2353669) {
		ERR2353669 = eRR2353669;
	}

	public double getERR2353670() {
		return ERR2353670;
	}

	public void setERR2353670(double eRR2353670) {
		ERR2353670 = eRR2353670;
	}

	public double getERR2353671() {
		return ERR2353671;
	}

	public void setERR2353671(double eRR2353671) {
		ERR2353671 = eRR2353671;
	}

	public double getERR2353672() {
		return ERR2353672;
	}

	public void setERR2353672(double eRR2353672) {
		ERR2353672 = eRR2353672;
	}

	public double getERR2353673() {
		return ERR2353673;
	}

	public void setERR2353673(double eRR2353673) {
		ERR2353673 = eRR2353673;
	}

	public double getERR2353674() {
		return ERR2353674;
	}

	public void setERR2353674(double eRR2353674) {
		ERR2353674 = eRR2353674;
	}

	public double getERR2353675() {
		return ERR2353675;
	}

	public void setERR2353675(double eRR2353675) {
		ERR2353675 = eRR2353675;
	}

	public double getERR2353676() {
		return ERR2353676;
	}

	public void setERR2353676(double eRR2353676) {
		ERR2353676 = eRR2353676;
	}

	@Override
	public String toString() {
		return "Hippocampus_layer [id=" + id + ", geneId=" + geneId + ", ERR2352825=" + ERR2352825 + ", ERR2353668="
				+ ERR2353668 + ", ERR2353669=" + ERR2353669 + ", ERR2353670=" + ERR2353670 + ", ERR2353671="
				+ ERR2353671 + ", ERR2353672=" + ERR2353672 + ", ERR2353673=" + ERR2353673 + ", ERR2353674="
				+ ERR2353674 + ", ERR2353675=" + ERR2353675 + ", ERR2353676=" + ERR2353676 + "]";
	}
}
