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
@Table(name = "thyroid")
public class Thyroid {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="ERR2352994")
	 private double ERR2352994;

	 @Column(name="ERR2352995")
	 private double ERR2352995;

	 @Column(name="ERR2352996")
	 private double ERR2352996;

	 @Column(name="ERR2352997")
	 private double ERR2352997;

	 @Column(name="ERR2352998")
	 private double ERR2352998;

	 @Column(name="ERR2352999")
	 private double ERR2352999;

	 @Column(name="ERR2353000")
	 private double ERR2353000;

	 @Column(name="ERR2353555")
	 private double ERR2353555;

	 @Column(name="ERR2353556")
	 private double ERR2353556;

	 @Column(name="ERR2353557")
	 private double ERR2353557;

	 @Column(name="ERR2353558")
	 private double ERR2353558;

	 @Column(name="ERR2353559")
	 private double ERR2353559;

	 @Column(name="ERR2353560")
	 private double ERR2353560;

	 @Column(name="ERR2353561")
	 private double ERR2353561;

	 @Column(name="ERR2353562")
	 private double ERR2353562;

	 @Column(name="ERR2353563")
	 private double ERR2353563;

	 @Column(name="ERR2353845")
	 private double ERR2353845;

	 @Column(name="ERR2353846")
	 private double ERR2353846;

	 @Column(name="ERR2353847")
	 private double ERR2353847;

	 @Column(name="ERR2353848")
	 private double ERR2353848;

	 @Column(name="ERR2353849")
	 private double ERR2353849;

	 @Column(name="ERR2353850")
	 private double ERR2353850;

	 @Column(name="ERR2353851")
	 private double ERR2353851;

	 @Column(name="ERR2354397")
	 private double ERR2354397;

	 @Column(name="ERR2354398")
	 private double ERR2354398;

	 @Column(name="ERR2354399")
	 private double ERR2354399;

	 @Column(name="ERR2354400")
	 private double ERR2354400;

	 @Column(name="ERR2354401")
	 private double ERR2354401;

	 @Column(name="ERR2354402")
	 private double ERR2354402;

	 @Column(name="ERR2354403")
	 private double ERR2354403;

	 @Column(name="ERR2354404")
	 private double ERR2354404;

	 @Column(name="ERR2354405")
	 private double ERR2354405;

	 @Column(name="ERR2354707")
	 private double ERR2354707;

	 @Column(name="ERR2354708")
	 private double ERR2354708;

	 @Column(name="ERR2354709")
	 private double ERR2354709;

	 @Column(name="ERR2354710")
	 private double ERR2354710;

	 @Column(name="ERR2354711")
	 private double ERR2354711;

	 @Column(name="ERR2354712")
	 private double ERR2354712;

	 @Column(name="ERR2354713")
	 private double ERR2354713;

	 @Column(name="ERR2354714")
	 private double ERR2354714;

	 @Column(name="ERR2354715")
	 private double ERR2354715;

	public Thyroid() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Thyroid(int id, String geneId, double eRR2352994, double eRR2352995, double eRR2352996, double eRR2352997,
			double eRR2352998, double eRR2352999, double eRR2353000, double eRR2353555, double eRR2353556,
			double eRR2353557, double eRR2353558, double eRR2353559, double eRR2353560, double eRR2353561,
			double eRR2353562, double eRR2353563, double eRR2353845, double eRR2353846, double eRR2353847,
			double eRR2353848, double eRR2353849, double eRR2353850, double eRR2353851, double eRR2354397,
			double eRR2354398, double eRR2354399, double eRR2354400, double eRR2354401, double eRR2354402,
			double eRR2354403, double eRR2354404, double eRR2354405, double eRR2354707, double eRR2354708,
			double eRR2354709, double eRR2354710, double eRR2354711, double eRR2354712, double eRR2354713,
			double eRR2354714, double eRR2354715) {
		super();
		this.id = id;
		this.geneId = geneId;
		ERR2352994 = eRR2352994;
		ERR2352995 = eRR2352995;
		ERR2352996 = eRR2352996;
		ERR2352997 = eRR2352997;
		ERR2352998 = eRR2352998;
		ERR2352999 = eRR2352999;
		ERR2353000 = eRR2353000;
		ERR2353555 = eRR2353555;
		ERR2353556 = eRR2353556;
		ERR2353557 = eRR2353557;
		ERR2353558 = eRR2353558;
		ERR2353559 = eRR2353559;
		ERR2353560 = eRR2353560;
		ERR2353561 = eRR2353561;
		ERR2353562 = eRR2353562;
		ERR2353563 = eRR2353563;
		ERR2353845 = eRR2353845;
		ERR2353846 = eRR2353846;
		ERR2353847 = eRR2353847;
		ERR2353848 = eRR2353848;
		ERR2353849 = eRR2353849;
		ERR2353850 = eRR2353850;
		ERR2353851 = eRR2353851;
		ERR2354397 = eRR2354397;
		ERR2354398 = eRR2354398;
		ERR2354399 = eRR2354399;
		ERR2354400 = eRR2354400;
		ERR2354401 = eRR2354401;
		ERR2354402 = eRR2354402;
		ERR2354403 = eRR2354403;
		ERR2354404 = eRR2354404;
		ERR2354405 = eRR2354405;
		ERR2354707 = eRR2354707;
		ERR2354708 = eRR2354708;
		ERR2354709 = eRR2354709;
		ERR2354710 = eRR2354710;
		ERR2354711 = eRR2354711;
		ERR2354712 = eRR2354712;
		ERR2354713 = eRR2354713;
		ERR2354714 = eRR2354714;
		ERR2354715 = eRR2354715;
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

	public double getERR2352994() {
		return ERR2352994;
	}

	public void setERR2352994(double eRR2352994) {
		ERR2352994 = eRR2352994;
	}

	public double getERR2352995() {
		return ERR2352995;
	}

	public void setERR2352995(double eRR2352995) {
		ERR2352995 = eRR2352995;
	}

	public double getERR2352996() {
		return ERR2352996;
	}

	public void setERR2352996(double eRR2352996) {
		ERR2352996 = eRR2352996;
	}

	public double getERR2352997() {
		return ERR2352997;
	}

	public void setERR2352997(double eRR2352997) {
		ERR2352997 = eRR2352997;
	}

	public double getERR2352998() {
		return ERR2352998;
	}

	public void setERR2352998(double eRR2352998) {
		ERR2352998 = eRR2352998;
	}

	public double getERR2352999() {
		return ERR2352999;
	}

	public void setERR2352999(double eRR2352999) {
		ERR2352999 = eRR2352999;
	}

	public double getERR2353000() {
		return ERR2353000;
	}

	public void setERR2353000(double eRR2353000) {
		ERR2353000 = eRR2353000;
	}

	public double getERR2353555() {
		return ERR2353555;
	}

	public void setERR2353555(double eRR2353555) {
		ERR2353555 = eRR2353555;
	}

	public double getERR2353556() {
		return ERR2353556;
	}

	public void setERR2353556(double eRR2353556) {
		ERR2353556 = eRR2353556;
	}

	public double getERR2353557() {
		return ERR2353557;
	}

	public void setERR2353557(double eRR2353557) {
		ERR2353557 = eRR2353557;
	}

	public double getERR2353558() {
		return ERR2353558;
	}

	public void setERR2353558(double eRR2353558) {
		ERR2353558 = eRR2353558;
	}

	public double getERR2353559() {
		return ERR2353559;
	}

	public void setERR2353559(double eRR2353559) {
		ERR2353559 = eRR2353559;
	}

	public double getERR2353560() {
		return ERR2353560;
	}

	public void setERR2353560(double eRR2353560) {
		ERR2353560 = eRR2353560;
	}

	public double getERR2353561() {
		return ERR2353561;
	}

	public void setERR2353561(double eRR2353561) {
		ERR2353561 = eRR2353561;
	}

	public double getERR2353562() {
		return ERR2353562;
	}

	public void setERR2353562(double eRR2353562) {
		ERR2353562 = eRR2353562;
	}

	public double getERR2353563() {
		return ERR2353563;
	}

	public void setERR2353563(double eRR2353563) {
		ERR2353563 = eRR2353563;
	}

	public double getERR2353845() {
		return ERR2353845;
	}

	public void setERR2353845(double eRR2353845) {
		ERR2353845 = eRR2353845;
	}

	public double getERR2353846() {
		return ERR2353846;
	}

	public void setERR2353846(double eRR2353846) {
		ERR2353846 = eRR2353846;
	}

	public double getERR2353847() {
		return ERR2353847;
	}

	public void setERR2353847(double eRR2353847) {
		ERR2353847 = eRR2353847;
	}

	public double getERR2353848() {
		return ERR2353848;
	}

	public void setERR2353848(double eRR2353848) {
		ERR2353848 = eRR2353848;
	}

	public double getERR2353849() {
		return ERR2353849;
	}

	public void setERR2353849(double eRR2353849) {
		ERR2353849 = eRR2353849;
	}

	public double getERR2353850() {
		return ERR2353850;
	}

	public void setERR2353850(double eRR2353850) {
		ERR2353850 = eRR2353850;
	}

	public double getERR2353851() {
		return ERR2353851;
	}

	public void setERR2353851(double eRR2353851) {
		ERR2353851 = eRR2353851;
	}

	public double getERR2354397() {
		return ERR2354397;
	}

	public void setERR2354397(double eRR2354397) {
		ERR2354397 = eRR2354397;
	}

	public double getERR2354398() {
		return ERR2354398;
	}

	public void setERR2354398(double eRR2354398) {
		ERR2354398 = eRR2354398;
	}

	public double getERR2354399() {
		return ERR2354399;
	}

	public void setERR2354399(double eRR2354399) {
		ERR2354399 = eRR2354399;
	}

	public double getERR2354400() {
		return ERR2354400;
	}

	public void setERR2354400(double eRR2354400) {
		ERR2354400 = eRR2354400;
	}

	public double getERR2354401() {
		return ERR2354401;
	}

	public void setERR2354401(double eRR2354401) {
		ERR2354401 = eRR2354401;
	}

	public double getERR2354402() {
		return ERR2354402;
	}

	public void setERR2354402(double eRR2354402) {
		ERR2354402 = eRR2354402;
	}

	public double getERR2354403() {
		return ERR2354403;
	}

	public void setERR2354403(double eRR2354403) {
		ERR2354403 = eRR2354403;
	}

	public double getERR2354404() {
		return ERR2354404;
	}

	public void setERR2354404(double eRR2354404) {
		ERR2354404 = eRR2354404;
	}

	public double getERR2354405() {
		return ERR2354405;
	}

	public void setERR2354405(double eRR2354405) {
		ERR2354405 = eRR2354405;
	}

	public double getERR2354707() {
		return ERR2354707;
	}

	public void setERR2354707(double eRR2354707) {
		ERR2354707 = eRR2354707;
	}

	public double getERR2354708() {
		return ERR2354708;
	}

	public void setERR2354708(double eRR2354708) {
		ERR2354708 = eRR2354708;
	}

	public double getERR2354709() {
		return ERR2354709;
	}

	public void setERR2354709(double eRR2354709) {
		ERR2354709 = eRR2354709;
	}

	public double getERR2354710() {
		return ERR2354710;
	}

	public void setERR2354710(double eRR2354710) {
		ERR2354710 = eRR2354710;
	}

	public double getERR2354711() {
		return ERR2354711;
	}

	public void setERR2354711(double eRR2354711) {
		ERR2354711 = eRR2354711;
	}

	public double getERR2354712() {
		return ERR2354712;
	}

	public void setERR2354712(double eRR2354712) {
		ERR2354712 = eRR2354712;
	}

	public double getERR2354713() {
		return ERR2354713;
	}

	public void setERR2354713(double eRR2354713) {
		ERR2354713 = eRR2354713;
	}

	public double getERR2354714() {
		return ERR2354714;
	}

	public void setERR2354714(double eRR2354714) {
		ERR2354714 = eRR2354714;
	}

	public double getERR2354715() {
		return ERR2354715;
	}

	public void setERR2354715(double eRR2354715) {
		ERR2354715 = eRR2354715;
	}

	@Override
	public String toString() {
		return "Thyroid [id=" + id + ", geneId=" + geneId + ", ERR2352994=" + ERR2352994 + ", ERR2352995=" + ERR2352995
				+ ", ERR2352996=" + ERR2352996 + ", ERR2352997=" + ERR2352997 + ", ERR2352998=" + ERR2352998
				+ ", ERR2352999=" + ERR2352999 + ", ERR2353000=" + ERR2353000 + ", ERR2353555=" + ERR2353555
				+ ", ERR2353556=" + ERR2353556 + ", ERR2353557=" + ERR2353557 + ", ERR2353558=" + ERR2353558
				+ ", ERR2353559=" + ERR2353559 + ", ERR2353560=" + ERR2353560 + ", ERR2353561=" + ERR2353561
				+ ", ERR2353562=" + ERR2353562 + ", ERR2353563=" + ERR2353563 + ", ERR2353845=" + ERR2353845
				+ ", ERR2353846=" + ERR2353846 + ", ERR2353847=" + ERR2353847 + ", ERR2353848=" + ERR2353848
				+ ", ERR2353849=" + ERR2353849 + ", ERR2353850=" + ERR2353850 + ", ERR2353851=" + ERR2353851
				+ ", ERR2354397=" + ERR2354397 + ", ERR2354398=" + ERR2354398 + ", ERR2354399=" + ERR2354399
				+ ", ERR2354400=" + ERR2354400 + ", ERR2354401=" + ERR2354401 + ", ERR2354402=" + ERR2354402
				+ ", ERR2354403=" + ERR2354403 + ", ERR2354404=" + ERR2354404 + ", ERR2354405=" + ERR2354405
				+ ", ERR2354707=" + ERR2354707 + ", ERR2354708=" + ERR2354708 + ", ERR2354709=" + ERR2354709
				+ ", ERR2354710=" + ERR2354710 + ", ERR2354711=" + ERR2354711 + ", ERR2354712=" + ERR2354712
				+ ", ERR2354713=" + ERR2354713 + ", ERR2354714=" + ERR2354714 + ", ERR2354715=" + ERR2354715 + "]";
	}
}
