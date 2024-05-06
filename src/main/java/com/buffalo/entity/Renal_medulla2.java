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
@Table(name = "renal_medulla2")
public class Renal_medulla2 {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="ERR2354511")
	 private double ERR2354511;

	 @Column(name="ERR2354512")
	 private double ERR2354512;

	 @Column(name="ERR2354513")
	 private double ERR2354513;

	 @Column(name="ERR2354514")
	 private double ERR2354514;

	 @Column(name="ERR2354515")
	 private double ERR2354515;

	 @Column(name="ERR2354516")
	 private double ERR2354516;

	 @Column(name="ERR2354517")
	 private double ERR2354517;

	 @Column(name="ERR2354518")
	 private double ERR2354518;

	 @Column(name="ERR2354519")
	 private double ERR2354519;

	 @Column(name="ERR2354761")
	 private double ERR2354761;

	 @Column(name="ERR2354762")
	 private double ERR2354762;

	 @Column(name="ERR2354763")
	 private double ERR2354763;

	 @Column(name="ERR2354764")
	 private double ERR2354764;

	 @Column(name="ERR2354765")
	 private double ERR2354765;

	 @Column(name="ERR2354766")
	 private double ERR2354766;

	 @Column(name="ERR2354767")
	 private double ERR2354767;

	 @Column(name="ERR2354768")
	 private double ERR2354768;

	 @Column(name="ERR2354769")
	 private double ERR2354769;

	 @Column(name="ERR2354770")
	 private double ERR2354770;

	 @Column(name="ERR2354771")
	 private double ERR2354771;

	 @Column(name="ERR2354772")
	 private double ERR2354772;

	 @Column(name="ERR2354773")
	 private double ERR2354773;

	 @Column(name="ERR2354774")
	 private double ERR2354774;

	 @Column(name="ERR2354775")
	 private double ERR2354775;

	 @Column(name="ERR2354776")
	 private double ERR2354776;

	 @Column(name="ERR2354777")
	 private double ERR2354777;

	 @Column(name="ERR2354778")
	 private double ERR2354778;

	 @Column(name="ERR2354779")
	 private double ERR2354779;

	 @Column(name="ERR2354780")
	 private double ERR2354780;

	 @Column(name="ERR2354781")
	 private double ERR2354781;

	 @Column(name="ERR2354782")
	 private double ERR2354782;

	 @Column(name="ERR2354783")
	 private double ERR2354783;

	 @Column(name="ERR2354939")
	 private double ERR2354939;

	 @Column(name="ERR2354940")
	 private double ERR2354940;

	 @Column(name="ERR2354941")
	 private double ERR2354941;

	 @Column(name="ERR2354942")
	 private double ERR2354942;

	 @Column(name="ERR2354943")
	 private double ERR2354943;

	 @Column(name="ERR2354944")
	 private double ERR2354944;

	 @Column(name="ERR2354945")
	 private double ERR2354945;

	 @Column(name="ERR2354946")
	 private double ERR2354946;

	 @Column(name="ERR2354947")
	 private double ERR2354947;

	 @Column(name="ERR2354948")
	 private double ERR2354948;

	 @Column(name="ERR2354949")
	 private double ERR2354949;

	 @Column(name="ERR2354950")
	 private double ERR2354950;

	 @Column(name="ERR2354951")
	 private double ERR2354951;

	 @Column(name="ERR2354952")
	 private double ERR2354952;

	 @Column(name="ERR2354953")
	 private double ERR2354953;

	 @Column(name="ERR2354954")
	 private double ERR2354954;

	 @Column(name="ERR2354955")
	 private double ERR2354955;

	 @Column(name="ERR2354956")
	 private double ERR2354956;

	 @Column(name="ERR2354957")
	 private double ERR2354957;

	 @Column(name="ERR2354958")
	 private double ERR2354958;

	 @Column(name="ERR2354959")
	 private double ERR2354959;

	 @Column(name="ERR2354960")
	 private double ERR2354960;

	 @Column(name="ERR2354961")
	 private double ERR2354961;

	public Renal_medulla2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Renal_medulla2(int id, String geneId, double eRR2354511, double eRR2354512, double eRR2354513,
			double eRR2354514, double eRR2354515, double eRR2354516, double eRR2354517, double eRR2354518,
			double eRR2354519, double eRR2354761, double eRR2354762, double eRR2354763, double eRR2354764,
			double eRR2354765, double eRR2354766, double eRR2354767, double eRR2354768, double eRR2354769,
			double eRR2354770, double eRR2354771, double eRR2354772, double eRR2354773, double eRR2354774,
			double eRR2354775, double eRR2354776, double eRR2354777, double eRR2354778, double eRR2354779,
			double eRR2354780, double eRR2354781, double eRR2354782, double eRR2354783, double eRR2354939,
			double eRR2354940, double eRR2354941, double eRR2354942, double eRR2354943, double eRR2354944,
			double eRR2354945, double eRR2354946, double eRR2354947, double eRR2354948, double eRR2354949,
			double eRR2354950, double eRR2354951, double eRR2354952, double eRR2354953, double eRR2354954,
			double eRR2354955, double eRR2354956, double eRR2354957, double eRR2354958, double eRR2354959,
			double eRR2354960, double eRR2354961) {
		super();
		this.id = id;
		this.geneId = geneId;
		ERR2354511 = eRR2354511;
		ERR2354512 = eRR2354512;
		ERR2354513 = eRR2354513;
		ERR2354514 = eRR2354514;
		ERR2354515 = eRR2354515;
		ERR2354516 = eRR2354516;
		ERR2354517 = eRR2354517;
		ERR2354518 = eRR2354518;
		ERR2354519 = eRR2354519;
		ERR2354761 = eRR2354761;
		ERR2354762 = eRR2354762;
		ERR2354763 = eRR2354763;
		ERR2354764 = eRR2354764;
		ERR2354765 = eRR2354765;
		ERR2354766 = eRR2354766;
		ERR2354767 = eRR2354767;
		ERR2354768 = eRR2354768;
		ERR2354769 = eRR2354769;
		ERR2354770 = eRR2354770;
		ERR2354771 = eRR2354771;
		ERR2354772 = eRR2354772;
		ERR2354773 = eRR2354773;
		ERR2354774 = eRR2354774;
		ERR2354775 = eRR2354775;
		ERR2354776 = eRR2354776;
		ERR2354777 = eRR2354777;
		ERR2354778 = eRR2354778;
		ERR2354779 = eRR2354779;
		ERR2354780 = eRR2354780;
		ERR2354781 = eRR2354781;
		ERR2354782 = eRR2354782;
		ERR2354783 = eRR2354783;
		ERR2354939 = eRR2354939;
		ERR2354940 = eRR2354940;
		ERR2354941 = eRR2354941;
		ERR2354942 = eRR2354942;
		ERR2354943 = eRR2354943;
		ERR2354944 = eRR2354944;
		ERR2354945 = eRR2354945;
		ERR2354946 = eRR2354946;
		ERR2354947 = eRR2354947;
		ERR2354948 = eRR2354948;
		ERR2354949 = eRR2354949;
		ERR2354950 = eRR2354950;
		ERR2354951 = eRR2354951;
		ERR2354952 = eRR2354952;
		ERR2354953 = eRR2354953;
		ERR2354954 = eRR2354954;
		ERR2354955 = eRR2354955;
		ERR2354956 = eRR2354956;
		ERR2354957 = eRR2354957;
		ERR2354958 = eRR2354958;
		ERR2354959 = eRR2354959;
		ERR2354960 = eRR2354960;
		ERR2354961 = eRR2354961;
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

	public double getERR2354511() {
		return ERR2354511;
	}

	public void setERR2354511(double eRR2354511) {
		ERR2354511 = eRR2354511;
	}

	public double getERR2354512() {
		return ERR2354512;
	}

	public void setERR2354512(double eRR2354512) {
		ERR2354512 = eRR2354512;
	}

	public double getERR2354513() {
		return ERR2354513;
	}

	public void setERR2354513(double eRR2354513) {
		ERR2354513 = eRR2354513;
	}

	public double getERR2354514() {
		return ERR2354514;
	}

	public void setERR2354514(double eRR2354514) {
		ERR2354514 = eRR2354514;
	}

	public double getERR2354515() {
		return ERR2354515;
	}

	public void setERR2354515(double eRR2354515) {
		ERR2354515 = eRR2354515;
	}

	public double getERR2354516() {
		return ERR2354516;
	}

	public void setERR2354516(double eRR2354516) {
		ERR2354516 = eRR2354516;
	}

	public double getERR2354517() {
		return ERR2354517;
	}

	public void setERR2354517(double eRR2354517) {
		ERR2354517 = eRR2354517;
	}

	public double getERR2354518() {
		return ERR2354518;
	}

	public void setERR2354518(double eRR2354518) {
		ERR2354518 = eRR2354518;
	}

	public double getERR2354519() {
		return ERR2354519;
	}

	public void setERR2354519(double eRR2354519) {
		ERR2354519 = eRR2354519;
	}

	public double getERR2354761() {
		return ERR2354761;
	}

	public void setERR2354761(double eRR2354761) {
		ERR2354761 = eRR2354761;
	}

	public double getERR2354762() {
		return ERR2354762;
	}

	public void setERR2354762(double eRR2354762) {
		ERR2354762 = eRR2354762;
	}

	public double getERR2354763() {
		return ERR2354763;
	}

	public void setERR2354763(double eRR2354763) {
		ERR2354763 = eRR2354763;
	}

	public double getERR2354764() {
		return ERR2354764;
	}

	public void setERR2354764(double eRR2354764) {
		ERR2354764 = eRR2354764;
	}

	public double getERR2354765() {
		return ERR2354765;
	}

	public void setERR2354765(double eRR2354765) {
		ERR2354765 = eRR2354765;
	}

	public double getERR2354766() {
		return ERR2354766;
	}

	public void setERR2354766(double eRR2354766) {
		ERR2354766 = eRR2354766;
	}

	public double getERR2354767() {
		return ERR2354767;
	}

	public void setERR2354767(double eRR2354767) {
		ERR2354767 = eRR2354767;
	}

	public double getERR2354768() {
		return ERR2354768;
	}

	public void setERR2354768(double eRR2354768) {
		ERR2354768 = eRR2354768;
	}

	public double getERR2354769() {
		return ERR2354769;
	}

	public void setERR2354769(double eRR2354769) {
		ERR2354769 = eRR2354769;
	}

	public double getERR2354770() {
		return ERR2354770;
	}

	public void setERR2354770(double eRR2354770) {
		ERR2354770 = eRR2354770;
	}

	public double getERR2354771() {
		return ERR2354771;
	}

	public void setERR2354771(double eRR2354771) {
		ERR2354771 = eRR2354771;
	}

	public double getERR2354772() {
		return ERR2354772;
	}

	public void setERR2354772(double eRR2354772) {
		ERR2354772 = eRR2354772;
	}

	public double getERR2354773() {
		return ERR2354773;
	}

	public void setERR2354773(double eRR2354773) {
		ERR2354773 = eRR2354773;
	}

	public double getERR2354774() {
		return ERR2354774;
	}

	public void setERR2354774(double eRR2354774) {
		ERR2354774 = eRR2354774;
	}

	public double getERR2354775() {
		return ERR2354775;
	}

	public void setERR2354775(double eRR2354775) {
		ERR2354775 = eRR2354775;
	}

	public double getERR2354776() {
		return ERR2354776;
	}

	public void setERR2354776(double eRR2354776) {
		ERR2354776 = eRR2354776;
	}

	public double getERR2354777() {
		return ERR2354777;
	}

	public void setERR2354777(double eRR2354777) {
		ERR2354777 = eRR2354777;
	}

	public double getERR2354778() {
		return ERR2354778;
	}

	public void setERR2354778(double eRR2354778) {
		ERR2354778 = eRR2354778;
	}

	public double getERR2354779() {
		return ERR2354779;
	}

	public void setERR2354779(double eRR2354779) {
		ERR2354779 = eRR2354779;
	}

	public double getERR2354780() {
		return ERR2354780;
	}

	public void setERR2354780(double eRR2354780) {
		ERR2354780 = eRR2354780;
	}

	public double getERR2354781() {
		return ERR2354781;
	}

	public void setERR2354781(double eRR2354781) {
		ERR2354781 = eRR2354781;
	}

	public double getERR2354782() {
		return ERR2354782;
	}

	public void setERR2354782(double eRR2354782) {
		ERR2354782 = eRR2354782;
	}

	public double getERR2354783() {
		return ERR2354783;
	}

	public void setERR2354783(double eRR2354783) {
		ERR2354783 = eRR2354783;
	}

	public double getERR2354939() {
		return ERR2354939;
	}

	public void setERR2354939(double eRR2354939) {
		ERR2354939 = eRR2354939;
	}

	public double getERR2354940() {
		return ERR2354940;
	}

	public void setERR2354940(double eRR2354940) {
		ERR2354940 = eRR2354940;
	}

	public double getERR2354941() {
		return ERR2354941;
	}

	public void setERR2354941(double eRR2354941) {
		ERR2354941 = eRR2354941;
	}

	public double getERR2354942() {
		return ERR2354942;
	}

	public void setERR2354942(double eRR2354942) {
		ERR2354942 = eRR2354942;
	}

	public double getERR2354943() {
		return ERR2354943;
	}

	public void setERR2354943(double eRR2354943) {
		ERR2354943 = eRR2354943;
	}

	public double getERR2354944() {
		return ERR2354944;
	}

	public void setERR2354944(double eRR2354944) {
		ERR2354944 = eRR2354944;
	}

	public double getERR2354945() {
		return ERR2354945;
	}

	public void setERR2354945(double eRR2354945) {
		ERR2354945 = eRR2354945;
	}

	public double getERR2354946() {
		return ERR2354946;
	}

	public void setERR2354946(double eRR2354946) {
		ERR2354946 = eRR2354946;
	}

	public double getERR2354947() {
		return ERR2354947;
	}

	public void setERR2354947(double eRR2354947) {
		ERR2354947 = eRR2354947;
	}

	public double getERR2354948() {
		return ERR2354948;
	}

	public void setERR2354948(double eRR2354948) {
		ERR2354948 = eRR2354948;
	}

	public double getERR2354949() {
		return ERR2354949;
	}

	public void setERR2354949(double eRR2354949) {
		ERR2354949 = eRR2354949;
	}

	public double getERR2354950() {
		return ERR2354950;
	}

	public void setERR2354950(double eRR2354950) {
		ERR2354950 = eRR2354950;
	}

	public double getERR2354951() {
		return ERR2354951;
	}

	public void setERR2354951(double eRR2354951) {
		ERR2354951 = eRR2354951;
	}

	public double getERR2354952() {
		return ERR2354952;
	}

	public void setERR2354952(double eRR2354952) {
		ERR2354952 = eRR2354952;
	}

	public double getERR2354953() {
		return ERR2354953;
	}

	public void setERR2354953(double eRR2354953) {
		ERR2354953 = eRR2354953;
	}

	public double getERR2354954() {
		return ERR2354954;
	}

	public void setERR2354954(double eRR2354954) {
		ERR2354954 = eRR2354954;
	}

	public double getERR2354955() {
		return ERR2354955;
	}

	public void setERR2354955(double eRR2354955) {
		ERR2354955 = eRR2354955;
	}

	public double getERR2354956() {
		return ERR2354956;
	}

	public void setERR2354956(double eRR2354956) {
		ERR2354956 = eRR2354956;
	}

	public double getERR2354957() {
		return ERR2354957;
	}

	public void setERR2354957(double eRR2354957) {
		ERR2354957 = eRR2354957;
	}

	public double getERR2354958() {
		return ERR2354958;
	}

	public void setERR2354958(double eRR2354958) {
		ERR2354958 = eRR2354958;
	}

	public double getERR2354959() {
		return ERR2354959;
	}

	public void setERR2354959(double eRR2354959) {
		ERR2354959 = eRR2354959;
	}

	public double getERR2354960() {
		return ERR2354960;
	}

	public void setERR2354960(double eRR2354960) {
		ERR2354960 = eRR2354960;
	}

	public double getERR2354961() {
		return ERR2354961;
	}

	public void setERR2354961(double eRR2354961) {
		ERR2354961 = eRR2354961;
	}

	@Override
	public String toString() {
		return "Renal_medulla2 [id=" + id + ", geneId=" + geneId + ", ERR2354511=" + ERR2354511 + ", ERR2354512="
				+ ERR2354512 + ", ERR2354513=" + ERR2354513 + ", ERR2354514=" + ERR2354514 + ", ERR2354515="
				+ ERR2354515 + ", ERR2354516=" + ERR2354516 + ", ERR2354517=" + ERR2354517 + ", ERR2354518="
				+ ERR2354518 + ", ERR2354519=" + ERR2354519 + ", ERR2354761=" + ERR2354761 + ", ERR2354762="
				+ ERR2354762 + ", ERR2354763=" + ERR2354763 + ", ERR2354764=" + ERR2354764 + ", ERR2354765="
				+ ERR2354765 + ", ERR2354766=" + ERR2354766 + ", ERR2354767=" + ERR2354767 + ", ERR2354768="
				+ ERR2354768 + ", ERR2354769=" + ERR2354769 + ", ERR2354770=" + ERR2354770 + ", ERR2354771="
				+ ERR2354771 + ", ERR2354772=" + ERR2354772 + ", ERR2354773=" + ERR2354773 + ", ERR2354774="
				+ ERR2354774 + ", ERR2354775=" + ERR2354775 + ", ERR2354776=" + ERR2354776 + ", ERR2354777="
				+ ERR2354777 + ", ERR2354778=" + ERR2354778 + ", ERR2354779=" + ERR2354779 + ", ERR2354780="
				+ ERR2354780 + ", ERR2354781=" + ERR2354781 + ", ERR2354782=" + ERR2354782 + ", ERR2354783="
				+ ERR2354783 + ", ERR2354939=" + ERR2354939 + ", ERR2354940=" + ERR2354940 + ", ERR2354941="
				+ ERR2354941 + ", ERR2354942=" + ERR2354942 + ", ERR2354943=" + ERR2354943 + ", ERR2354944="
				+ ERR2354944 + ", ERR2354945=" + ERR2354945 + ", ERR2354946=" + ERR2354946 + ", ERR2354947="
				+ ERR2354947 + ", ERR2354948=" + ERR2354948 + ", ERR2354949=" + ERR2354949 + ", ERR2354950="
				+ ERR2354950 + ", ERR2354951=" + ERR2354951 + ", ERR2354952=" + ERR2354952 + ", ERR2354953="
				+ ERR2354953 + ", ERR2354954=" + ERR2354954 + ", ERR2354955=" + ERR2354955 + ", ERR2354956="
				+ ERR2354956 + ", ERR2354957=" + ERR2354957 + ", ERR2354958=" + ERR2354958 + ", ERR2354959="
				+ ERR2354959 + ", ERR2354960=" + ERR2354960 + ", ERR2354961=" + ERR2354961 + "]";
	}

	 
}
