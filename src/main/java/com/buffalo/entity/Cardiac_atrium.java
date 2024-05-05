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
@Table(name = "Cardiac_atrium")
public class Cardiac_atrium {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	@Column(name = "geneId")
	 String geneId;

	 @Column(name="ERR2352943")
	 private double ERR2352943;
	 
	@Column(name="ERR2352944")
	 private double ERR2352944;
	
	@Column(name="ERR2352945")
	 private double ERR2352945;
	
	@Column(name="ERR2352946")
	 private double ERR2352946;
	
	@Column(name="ERR2352947")
	 private double ERR2352947;
	
	@Column(name="ERR2352948")
	 private double ERR2352948;
	
	@Column(name="ERR2352949")
	 private double ERR2352949;
	
	@Column(name="ERR2353460")
	 private double ERR2353460;
	
	@Column(name="ERR2353461")
	 private double ERR2353461;
	
	@Column(name="ERR2353462")
	 private double ERR2353462;
	
	@Column(name="ERR2353463")
	 private double ERR2353463;
	
	@Column(name="ERR2353464")
	 private double ERR2353464;
	
	@Column(name="ERR2353465")
	 private double ERR2353465;
	
	@Column(name="ERR2353466")
	 private double ERR2353466;
	
	@Column(name="ERR2353467")
	 private double ERR2353467;
	
	@Column(name="ERR2353468")
	 private double ERR2353468;
	
	@Column(name="ERR2353785")
	 private double ERR2353785;
	
	@Column(name="ERR2353786")
	 private double ERR2353786;
	
	@Column(name="ERR2353787")
	 private double ERR2353787;
	
	@Column(name="ERR2353788")
	 private double ERR2353788;
	
	@Column(name="ERR2353789")
	 private double ERR2353789;
	
	@Column(name="ERR2353790")
	 private double ERR2353790;
	
	@Column(name="ERR2353791")
	 private double ERR2353791;
	
	@Column(name="ERR2354279")
	 private double ERR2354279;
	
	@Column(name="ERR2354280")
	 private double ERR2354280;
	
	@Column(name="ERR2354281")
	 private double ERR2354281;
	
	@Column(name="ERR2354282")
	 private double ERR2354282;
	
	@Column(name="ERR2354283")
	 private double ERR2354283;
	
	@Column(name="ERR2354284")
	 private double ERR2354284;
	
	@Column(name="ERR2354285")
	 private double ERR2354285;
	
	@Column(name="ERR2354286")
	 private double ERR2354286;
	
	@Column(name="ERR2354287")
	 private double ERR2354287;
	
	@Column(name="ERR2354648")
	 private double ERR2354648;
	
	@Column(name="ERR2354649")
	 private double ERR2354649;
	
	@Column(name="ERR2354650")
	 private double ERR2354650;
	
	@Column(name="ERR2354651")
	 private double ERR2354651;
	
	@Column(name="ERR2354652")
	 private double ERR2354652;
	
	@Column(name="ERR2354653")
	 private double ERR2354653;
	
	@Column(name="ERR2354654")
	 private double ERR2354654;
	
	@Column(name="ERR2354655")
	 private double ERR2354655;
	
	@Column(name="ERR2354656")
	 private double ERR2354656;

	public Cardiac_atrium() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cardiac_atrium(int id, String geneId, double eRR2352943, double eRR2352944, double eRR2352945,
			double eRR2352946, double eRR2352947, double eRR2352948, double eRR2352949, double eRR2353460,
			double eRR2353461, double eRR2353462, double eRR2353463, double eRR2353464, double eRR2353465,
			double eRR2353466, double eRR2353467, double eRR2353468, double eRR2353785, double eRR2353786,
			double eRR2353787, double eRR2353788, double eRR2353789, double eRR2353790, double eRR2353791,
			double eRR2354279, double eRR2354280, double eRR2354281, double eRR2354282, double eRR2354283,
			double eRR2354284, double eRR2354285, double eRR2354286, double eRR2354287, double eRR2354648,
			double eRR2354649, double eRR2354650, double eRR2354651, double eRR2354652, double eRR2354653,
			double eRR2354654, double eRR2354655, double eRR2354656) {
		super();
		this.id = id;
		this.geneId = geneId;
		ERR2352943 = eRR2352943;
		ERR2352944 = eRR2352944;
		ERR2352945 = eRR2352945;
		ERR2352946 = eRR2352946;
		ERR2352947 = eRR2352947;
		ERR2352948 = eRR2352948;
		ERR2352949 = eRR2352949;
		ERR2353460 = eRR2353460;
		ERR2353461 = eRR2353461;
		ERR2353462 = eRR2353462;
		ERR2353463 = eRR2353463;
		ERR2353464 = eRR2353464;
		ERR2353465 = eRR2353465;
		ERR2353466 = eRR2353466;
		ERR2353467 = eRR2353467;
		ERR2353468 = eRR2353468;
		ERR2353785 = eRR2353785;
		ERR2353786 = eRR2353786;
		ERR2353787 = eRR2353787;
		ERR2353788 = eRR2353788;
		ERR2353789 = eRR2353789;
		ERR2353790 = eRR2353790;
		ERR2353791 = eRR2353791;
		ERR2354279 = eRR2354279;
		ERR2354280 = eRR2354280;
		ERR2354281 = eRR2354281;
		ERR2354282 = eRR2354282;
		ERR2354283 = eRR2354283;
		ERR2354284 = eRR2354284;
		ERR2354285 = eRR2354285;
		ERR2354286 = eRR2354286;
		ERR2354287 = eRR2354287;
		ERR2354648 = eRR2354648;
		ERR2354649 = eRR2354649;
		ERR2354650 = eRR2354650;
		ERR2354651 = eRR2354651;
		ERR2354652 = eRR2354652;
		ERR2354653 = eRR2354653;
		ERR2354654 = eRR2354654;
		ERR2354655 = eRR2354655;
		ERR2354656 = eRR2354656;
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

	public double getERR2352943() {
		return ERR2352943;
	}

	public void setERR2352943(double eRR2352943) {
		ERR2352943 = eRR2352943;
	}

	public double getERR2352944() {
		return ERR2352944;
	}

	public void setERR2352944(double eRR2352944) {
		ERR2352944 = eRR2352944;
	}

	public double getERR2352945() {
		return ERR2352945;
	}

	public void setERR2352945(double eRR2352945) {
		ERR2352945 = eRR2352945;
	}

	public double getERR2352946() {
		return ERR2352946;
	}

	public void setERR2352946(double eRR2352946) {
		ERR2352946 = eRR2352946;
	}

	public double getERR2352947() {
		return ERR2352947;
	}

	public void setERR2352947(double eRR2352947) {
		ERR2352947 = eRR2352947;
	}

	public double getERR2352948() {
		return ERR2352948;
	}

	public void setERR2352948(double eRR2352948) {
		ERR2352948 = eRR2352948;
	}

	public double getERR2352949() {
		return ERR2352949;
	}

	public void setERR2352949(double eRR2352949) {
		ERR2352949 = eRR2352949;
	}

	public double getERR2353460() {
		return ERR2353460;
	}

	public void setERR2353460(double eRR2353460) {
		ERR2353460 = eRR2353460;
	}

	public double getERR2353461() {
		return ERR2353461;
	}

	public void setERR2353461(double eRR2353461) {
		ERR2353461 = eRR2353461;
	}

	public double getERR2353462() {
		return ERR2353462;
	}

	public void setERR2353462(double eRR2353462) {
		ERR2353462 = eRR2353462;
	}

	public double getERR2353463() {
		return ERR2353463;
	}

	public void setERR2353463(double eRR2353463) {
		ERR2353463 = eRR2353463;
	}

	public double getERR2353464() {
		return ERR2353464;
	}

	public void setERR2353464(double eRR2353464) {
		ERR2353464 = eRR2353464;
	}

	public double getERR2353465() {
		return ERR2353465;
	}

	public void setERR2353465(double eRR2353465) {
		ERR2353465 = eRR2353465;
	}

	public double getERR2353466() {
		return ERR2353466;
	}

	public void setERR2353466(double eRR2353466) {
		ERR2353466 = eRR2353466;
	}

	public double getERR2353467() {
		return ERR2353467;
	}

	public void setERR2353467(double eRR2353467) {
		ERR2353467 = eRR2353467;
	}

	public double getERR2353468() {
		return ERR2353468;
	}

	public void setERR2353468(double eRR2353468) {
		ERR2353468 = eRR2353468;
	}

	public double getERR2353785() {
		return ERR2353785;
	}

	public void setERR2353785(double eRR2353785) {
		ERR2353785 = eRR2353785;
	}

	public double getERR2353786() {
		return ERR2353786;
	}

	public void setERR2353786(double eRR2353786) {
		ERR2353786 = eRR2353786;
	}

	public double getERR2353787() {
		return ERR2353787;
	}

	public void setERR2353787(double eRR2353787) {
		ERR2353787 = eRR2353787;
	}

	public double getERR2353788() {
		return ERR2353788;
	}

	public void setERR2353788(double eRR2353788) {
		ERR2353788 = eRR2353788;
	}

	public double getERR2353789() {
		return ERR2353789;
	}

	public void setERR2353789(double eRR2353789) {
		ERR2353789 = eRR2353789;
	}

	public double getERR2353790() {
		return ERR2353790;
	}

	public void setERR2353790(double eRR2353790) {
		ERR2353790 = eRR2353790;
	}

	public double getERR2353791() {
		return ERR2353791;
	}

	public void setERR2353791(double eRR2353791) {
		ERR2353791 = eRR2353791;
	}

	public double getERR2354279() {
		return ERR2354279;
	}

	public void setERR2354279(double eRR2354279) {
		ERR2354279 = eRR2354279;
	}

	public double getERR2354280() {
		return ERR2354280;
	}

	public void setERR2354280(double eRR2354280) {
		ERR2354280 = eRR2354280;
	}

	public double getERR2354281() {
		return ERR2354281;
	}

	public void setERR2354281(double eRR2354281) {
		ERR2354281 = eRR2354281;
	}

	public double getERR2354282() {
		return ERR2354282;
	}

	public void setERR2354282(double eRR2354282) {
		ERR2354282 = eRR2354282;
	}

	public double getERR2354283() {
		return ERR2354283;
	}

	public void setERR2354283(double eRR2354283) {
		ERR2354283 = eRR2354283;
	}

	public double getERR2354284() {
		return ERR2354284;
	}

	public void setERR2354284(double eRR2354284) {
		ERR2354284 = eRR2354284;
	}

	public double getERR2354285() {
		return ERR2354285;
	}

	public void setERR2354285(double eRR2354285) {
		ERR2354285 = eRR2354285;
	}

	public double getERR2354286() {
		return ERR2354286;
	}

	public void setERR2354286(double eRR2354286) {
		ERR2354286 = eRR2354286;
	}

	public double getERR2354287() {
		return ERR2354287;
	}

	public void setERR2354287(double eRR2354287) {
		ERR2354287 = eRR2354287;
	}

	public double getERR2354648() {
		return ERR2354648;
	}

	public void setERR2354648(double eRR2354648) {
		ERR2354648 = eRR2354648;
	}

	public double getERR2354649() {
		return ERR2354649;
	}

	public void setERR2354649(double eRR2354649) {
		ERR2354649 = eRR2354649;
	}

	public double getERR2354650() {
		return ERR2354650;
	}

	public void setERR2354650(double eRR2354650) {
		ERR2354650 = eRR2354650;
	}

	public double getERR2354651() {
		return ERR2354651;
	}

	public void setERR2354651(double eRR2354651) {
		ERR2354651 = eRR2354651;
	}

	public double getERR2354652() {
		return ERR2354652;
	}

	public void setERR2354652(double eRR2354652) {
		ERR2354652 = eRR2354652;
	}

	public double getERR2354653() {
		return ERR2354653;
	}

	public void setERR2354653(double eRR2354653) {
		ERR2354653 = eRR2354653;
	}

	public double getERR2354654() {
		return ERR2354654;
	}

	public void setERR2354654(double eRR2354654) {
		ERR2354654 = eRR2354654;
	}

	public double getERR2354655() {
		return ERR2354655;
	}

	public void setERR2354655(double eRR2354655) {
		ERR2354655 = eRR2354655;
	}

	public double getERR2354656() {
		return ERR2354656;
	}

	public void setERR2354656(double eRR2354656) {
		ERR2354656 = eRR2354656;
	}

	@Override
	public String toString() {
		return "Cardiac_atrium [id=" + id + ", geneId=" + geneId + ", ERR2352943=" + ERR2352943 + ", ERR2352944="
				+ ERR2352944 + ", ERR2352945=" + ERR2352945 + ", ERR2352946=" + ERR2352946 + ", ERR2352947="
				+ ERR2352947 + ", ERR2352948=" + ERR2352948 + ", ERR2352949=" + ERR2352949 + ", ERR2353460="
				+ ERR2353460 + ", ERR2353461=" + ERR2353461 + ", ERR2353462=" + ERR2353462 + ", ERR2353463="
				+ ERR2353463 + ", ERR2353464=" + ERR2353464 + ", ERR2353465=" + ERR2353465 + ", ERR2353466="
				+ ERR2353466 + ", ERR2353467=" + ERR2353467 + ", ERR2353468=" + ERR2353468 + ", ERR2353785="
				+ ERR2353785 + ", ERR2353786=" + ERR2353786 + ", ERR2353787=" + ERR2353787 + ", ERR2353788="
				+ ERR2353788 + ", ERR2353789=" + ERR2353789 + ", ERR2353790=" + ERR2353790 + ", ERR2353791="
				+ ERR2353791 + ", ERR2354279=" + ERR2354279 + ", ERR2354280=" + ERR2354280 + ", ERR2354281="
				+ ERR2354281 + ", ERR2354282=" + ERR2354282 + ", ERR2354283=" + ERR2354283 + ", ERR2354284="
				+ ERR2354284 + ", ERR2354285=" + ERR2354285 + ", ERR2354286=" + ERR2354286 + ", ERR2354287="
				+ ERR2354287 + ", ERR2354648=" + ERR2354648 + ", ERR2354649=" + ERR2354649 + ", ERR2354650="
				+ ERR2354650 + ", ERR2354651=" + ERR2354651 + ", ERR2354652=" + ERR2354652 + ", ERR2354653="
				+ ERR2354653 + ", ERR2354654=" + ERR2354654 + ", ERR2354655=" + ERR2354655 + ", ERR2354656="
				+ ERR2354656 + "]";
	}
}
