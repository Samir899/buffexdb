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
@Table(name = "pylorus")
public class Pylorus {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="ERR2352936")
	 private double ERR2352936;

	@Column(name="ERR2352937")
	 private double ERR2352937;

	@Column(name="ERR2352938")
	 private double ERR2352938;

	@Column(name="ERR2352939")
	 private double ERR2352939;

	@Column(name="ERR2352940")
	 private double ERR2352940;

	@Column(name="ERR2352941")
	 private double ERR2352941;

	@Column(name="ERR2352942")
	 private double ERR2352942;

	@Column(name="ERR2353451")
	 private double ERR2353451;

	@Column(name="ERR2353452")
	 private double ERR2353452;

	@Column(name="ERR2353453")
	 private double ERR2353453;

	@Column(name="ERR2353454")
	 private double ERR2353454;

	@Column(name="ERR2353455")
	 private double ERR2353455;

	@Column(name="ERR2353456")
	 private double ERR2353456;

	@Column(name="ERR2353457")
	 private double ERR2353457;

	@Column(name="ERR2353458")
	 private double ERR2353458;

	@Column(name="ERR2353459")
	 private double ERR2353459;

	@Column(name="ERR2353778")
	 private double ERR2353778;

	@Column(name="ERR2353779")
	 private double ERR2353779;

	@Column(name="ERR2353780")
	 private double ERR2353780;

	@Column(name="ERR2353781")
	 private double ERR2353781;

	@Column(name="ERR2353782")
	 private double ERR2353782;

	@Column(name="ERR2353783")
	 private double ERR2353783;

	@Column(name="ERR2353784")
	 private double ERR2353784;

	@Column(name="ERR2354270")
	 private double ERR2354270;

	@Column(name="ERR2354271")
	 private double ERR2354271;

	@Column(name="ERR2354272")
	 private double ERR2354272;

	@Column(name="ERR2354273")
	 private double ERR2354273;

	@Column(name="ERR2354274")
	 private double ERR2354274;

	@Column(name="ERR2354275")
	 private double ERR2354275;

	@Column(name="ERR2354276")
	 private double ERR2354276;

	@Column(name="ERR2354277")
	 private double ERR2354277;

	@Column(name="ERR2354278")
	 private double ERR2354278;

	@Column(name="ERR2354639")
	 private double ERR2354639;

	@Column(name="ERR2354640")
	 private double ERR2354640;

	@Column(name="ERR2354641")
	 private double ERR2354641;

	@Column(name="ERR2354642")
	 private double ERR2354642;

	@Column(name="ERR2354643")
	 private double ERR2354643;

	@Column(name="ERR2354644")
	 private double ERR2354644;

	@Column(name="ERR2354645")
	 private double ERR2354645;

	@Column(name="ERR2354646")
	 private double ERR2354646;

	@Column(name="ERR2354647")
	 private double ERR2354647;

	public Pylorus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pylorus(int id, String geneId, double eRR2352936, double eRR2352937, double eRR2352938, double eRR2352939,
			double eRR2352940, double eRR2352941, double eRR2352942, double eRR2353451, double eRR2353452,
			double eRR2353453, double eRR2353454, double eRR2353455, double eRR2353456, double eRR2353457,
			double eRR2353458, double eRR2353459, double eRR2353778, double eRR2353779, double eRR2353780,
			double eRR2353781, double eRR2353782, double eRR2353783, double eRR2353784, double eRR2354270,
			double eRR2354271, double eRR2354272, double eRR2354273, double eRR2354274, double eRR2354275,
			double eRR2354276, double eRR2354277, double eRR2354278, double eRR2354639, double eRR2354640,
			double eRR2354641, double eRR2354642, double eRR2354643, double eRR2354644, double eRR2354645,
			double eRR2354646, double eRR2354647) {
		super();
		this.id = id;
		this.geneId = geneId;
		ERR2352936 = eRR2352936;
		ERR2352937 = eRR2352937;
		ERR2352938 = eRR2352938;
		ERR2352939 = eRR2352939;
		ERR2352940 = eRR2352940;
		ERR2352941 = eRR2352941;
		ERR2352942 = eRR2352942;
		ERR2353451 = eRR2353451;
		ERR2353452 = eRR2353452;
		ERR2353453 = eRR2353453;
		ERR2353454 = eRR2353454;
		ERR2353455 = eRR2353455;
		ERR2353456 = eRR2353456;
		ERR2353457 = eRR2353457;
		ERR2353458 = eRR2353458;
		ERR2353459 = eRR2353459;
		ERR2353778 = eRR2353778;
		ERR2353779 = eRR2353779;
		ERR2353780 = eRR2353780;
		ERR2353781 = eRR2353781;
		ERR2353782 = eRR2353782;
		ERR2353783 = eRR2353783;
		ERR2353784 = eRR2353784;
		ERR2354270 = eRR2354270;
		ERR2354271 = eRR2354271;
		ERR2354272 = eRR2354272;
		ERR2354273 = eRR2354273;
		ERR2354274 = eRR2354274;
		ERR2354275 = eRR2354275;
		ERR2354276 = eRR2354276;
		ERR2354277 = eRR2354277;
		ERR2354278 = eRR2354278;
		ERR2354639 = eRR2354639;
		ERR2354640 = eRR2354640;
		ERR2354641 = eRR2354641;
		ERR2354642 = eRR2354642;
		ERR2354643 = eRR2354643;
		ERR2354644 = eRR2354644;
		ERR2354645 = eRR2354645;
		ERR2354646 = eRR2354646;
		ERR2354647 = eRR2354647;
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

	public double getERR2352936() {
		return ERR2352936;
	}

	public void setERR2352936(double eRR2352936) {
		ERR2352936 = eRR2352936;
	}

	public double getERR2352937() {
		return ERR2352937;
	}

	public void setERR2352937(double eRR2352937) {
		ERR2352937 = eRR2352937;
	}

	public double getERR2352938() {
		return ERR2352938;
	}

	public void setERR2352938(double eRR2352938) {
		ERR2352938 = eRR2352938;
	}

	public double getERR2352939() {
		return ERR2352939;
	}

	public void setERR2352939(double eRR2352939) {
		ERR2352939 = eRR2352939;
	}

	public double getERR2352940() {
		return ERR2352940;
	}

	public void setERR2352940(double eRR2352940) {
		ERR2352940 = eRR2352940;
	}

	public double getERR2352941() {
		return ERR2352941;
	}

	public void setERR2352941(double eRR2352941) {
		ERR2352941 = eRR2352941;
	}

	public double getERR2352942() {
		return ERR2352942;
	}

	public void setERR2352942(double eRR2352942) {
		ERR2352942 = eRR2352942;
	}

	public double getERR2353451() {
		return ERR2353451;
	}

	public void setERR2353451(double eRR2353451) {
		ERR2353451 = eRR2353451;
	}

	public double getERR2353452() {
		return ERR2353452;
	}

	public void setERR2353452(double eRR2353452) {
		ERR2353452 = eRR2353452;
	}

	public double getERR2353453() {
		return ERR2353453;
	}

	public void setERR2353453(double eRR2353453) {
		ERR2353453 = eRR2353453;
	}

	public double getERR2353454() {
		return ERR2353454;
	}

	public void setERR2353454(double eRR2353454) {
		ERR2353454 = eRR2353454;
	}

	public double getERR2353455() {
		return ERR2353455;
	}

	public void setERR2353455(double eRR2353455) {
		ERR2353455 = eRR2353455;
	}

	public double getERR2353456() {
		return ERR2353456;
	}

	public void setERR2353456(double eRR2353456) {
		ERR2353456 = eRR2353456;
	}

	public double getERR2353457() {
		return ERR2353457;
	}

	public void setERR2353457(double eRR2353457) {
		ERR2353457 = eRR2353457;
	}

	public double getERR2353458() {
		return ERR2353458;
	}

	public void setERR2353458(double eRR2353458) {
		ERR2353458 = eRR2353458;
	}

	public double getERR2353459() {
		return ERR2353459;
	}

	public void setERR2353459(double eRR2353459) {
		ERR2353459 = eRR2353459;
	}

	public double getERR2353778() {
		return ERR2353778;
	}

	public void setERR2353778(double eRR2353778) {
		ERR2353778 = eRR2353778;
	}

	public double getERR2353779() {
		return ERR2353779;
	}

	public void setERR2353779(double eRR2353779) {
		ERR2353779 = eRR2353779;
	}

	public double getERR2353780() {
		return ERR2353780;
	}

	public void setERR2353780(double eRR2353780) {
		ERR2353780 = eRR2353780;
	}

	public double getERR2353781() {
		return ERR2353781;
	}

	public void setERR2353781(double eRR2353781) {
		ERR2353781 = eRR2353781;
	}

	public double getERR2353782() {
		return ERR2353782;
	}

	public void setERR2353782(double eRR2353782) {
		ERR2353782 = eRR2353782;
	}

	public double getERR2353783() {
		return ERR2353783;
	}

	public void setERR2353783(double eRR2353783) {
		ERR2353783 = eRR2353783;
	}

	public double getERR2353784() {
		return ERR2353784;
	}

	public void setERR2353784(double eRR2353784) {
		ERR2353784 = eRR2353784;
	}

	public double getERR2354270() {
		return ERR2354270;
	}

	public void setERR2354270(double eRR2354270) {
		ERR2354270 = eRR2354270;
	}

	public double getERR2354271() {
		return ERR2354271;
	}

	public void setERR2354271(double eRR2354271) {
		ERR2354271 = eRR2354271;
	}

	public double getERR2354272() {
		return ERR2354272;
	}

	public void setERR2354272(double eRR2354272) {
		ERR2354272 = eRR2354272;
	}

	public double getERR2354273() {
		return ERR2354273;
	}

	public void setERR2354273(double eRR2354273) {
		ERR2354273 = eRR2354273;
	}

	public double getERR2354274() {
		return ERR2354274;
	}

	public void setERR2354274(double eRR2354274) {
		ERR2354274 = eRR2354274;
	}

	public double getERR2354275() {
		return ERR2354275;
	}

	public void setERR2354275(double eRR2354275) {
		ERR2354275 = eRR2354275;
	}

	public double getERR2354276() {
		return ERR2354276;
	}

	public void setERR2354276(double eRR2354276) {
		ERR2354276 = eRR2354276;
	}

	public double getERR2354277() {
		return ERR2354277;
	}

	public void setERR2354277(double eRR2354277) {
		ERR2354277 = eRR2354277;
	}

	public double getERR2354278() {
		return ERR2354278;
	}

	public void setERR2354278(double eRR2354278) {
		ERR2354278 = eRR2354278;
	}

	public double getERR2354639() {
		return ERR2354639;
	}

	public void setERR2354639(double eRR2354639) {
		ERR2354639 = eRR2354639;
	}

	public double getERR2354640() {
		return ERR2354640;
	}

	public void setERR2354640(double eRR2354640) {
		ERR2354640 = eRR2354640;
	}

	public double getERR2354641() {
		return ERR2354641;
	}

	public void setERR2354641(double eRR2354641) {
		ERR2354641 = eRR2354641;
	}

	public double getERR2354642() {
		return ERR2354642;
	}

	public void setERR2354642(double eRR2354642) {
		ERR2354642 = eRR2354642;
	}

	public double getERR2354643() {
		return ERR2354643;
	}

	public void setERR2354643(double eRR2354643) {
		ERR2354643 = eRR2354643;
	}

	public double getERR2354644() {
		return ERR2354644;
	}

	public void setERR2354644(double eRR2354644) {
		ERR2354644 = eRR2354644;
	}

	public double getERR2354645() {
		return ERR2354645;
	}

	public void setERR2354645(double eRR2354645) {
		ERR2354645 = eRR2354645;
	}

	public double getERR2354646() {
		return ERR2354646;
	}

	public void setERR2354646(double eRR2354646) {
		ERR2354646 = eRR2354646;
	}

	public double getERR2354647() {
		return ERR2354647;
	}

	public void setERR2354647(double eRR2354647) {
		ERR2354647 = eRR2354647;
	}

	@Override
	public String toString() {
		return "Pylorus [id=" + id + ", geneId=" + geneId + ", ERR2352936=" + ERR2352936 + ", ERR2352937=" + ERR2352937
				+ ", ERR2352938=" + ERR2352938 + ", ERR2352939=" + ERR2352939 + ", ERR2352940=" + ERR2352940
				+ ", ERR2352941=" + ERR2352941 + ", ERR2352942=" + ERR2352942 + ", ERR2353451=" + ERR2353451
				+ ", ERR2353452=" + ERR2353452 + ", ERR2353453=" + ERR2353453 + ", ERR2353454=" + ERR2353454
				+ ", ERR2353455=" + ERR2353455 + ", ERR2353456=" + ERR2353456 + ", ERR2353457=" + ERR2353457
				+ ", ERR2353458=" + ERR2353458 + ", ERR2353459=" + ERR2353459 + ", ERR2353778=" + ERR2353778
				+ ", ERR2353779=" + ERR2353779 + ", ERR2353780=" + ERR2353780 + ", ERR2353781=" + ERR2353781
				+ ", ERR2353782=" + ERR2353782 + ", ERR2353783=" + ERR2353783 + ", ERR2353784=" + ERR2353784
				+ ", ERR2354270=" + ERR2354270 + ", ERR2354271=" + ERR2354271 + ", ERR2354272=" + ERR2354272
				+ ", ERR2354273=" + ERR2354273 + ", ERR2354274=" + ERR2354274 + ", ERR2354275=" + ERR2354275
				+ ", ERR2354276=" + ERR2354276 + ", ERR2354277=" + ERR2354277 + ", ERR2354278=" + ERR2354278
				+ ", ERR2354639=" + ERR2354639 + ", ERR2354640=" + ERR2354640 + ", ERR2354641=" + ERR2354641
				+ ", ERR2354642=" + ERR2354642 + ", ERR2354643=" + ERR2354643 + ", ERR2354644=" + ERR2354644
				+ ", ERR2354645=" + ERR2354645 + ", ERR2354646=" + ERR2354646 + ", ERR2354647=" + ERR2354647 + "]";
	}

}
