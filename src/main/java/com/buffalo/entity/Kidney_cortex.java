package com.buffalo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "kidney_cortex")
public class Kidney_cortex {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 

	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="ERR2352842")
	 private double ERR2352842;

	 @Column(name="ERR2352843")
	 private double ERR2352843;

	 @Column(name="ERR2352844")
	 private double ERR2352844;

	 @Column(name="ERR2352845")
	 private double ERR2352845;

	 @Column(name="ERR2352846")
	 private double ERR2352846;

	 @Column(name="ERR2352847")
	 private double ERR2352847;

	 @Column(name="ERR2352848")
	 private double ERR2352848;

	 @Column(name="ERR2353209")
	 private double ERR2353209;

	 @Column(name="ERR2353210")
	 private double ERR2353210;

	 @Column(name="ERR2353211")
	 private double ERR2353211;

	 @Column(name="ERR2353212")
	 private double ERR2353212;

	 @Column(name="ERR2353213")
	 private double ERR2353213;

	 @Column(name="ERR2353214")
	 private double ERR2353214;

	 @Column(name="ERR2353215")
	 private double ERR2353215;

	 @Column(name="ERR2353216")
	 private double ERR2353216;

	 @Column(name="ERR2353217")
	 private double ERR2353217;

	 @Column(name="ERR2353693")
	 private double ERR2353693;

	 @Column(name="ERR2353694")
	 private double ERR2353694;

	 @Column(name="ERR2353695")
	 private double ERR2353695;

	 @Column(name="ERR2353696")
	 private double ERR2353696;

	 @Column(name="ERR2353697")
	 private double ERR2353697;

	 @Column(name="ERR2353698")
	 private double ERR2353698;

	 @Column(name="ERR2353699")
	 private double ERR2353699;

	 @Column(name="ERR2354069")
	 private double ERR2354069;

	 @Column(name="ERR2354070")
	 private double ERR2354070;

	 @Column(name="ERR2354071")
	 private double ERR2354071;

	 @Column(name="ERR2354072")
	 private double ERR2354072;

	 @Column(name="ERR2354073")
	 private double ERR2354073;

	 @Column(name="ERR2354074")
	 private double ERR2354074;

	 @Column(name="ERR2354075")
	 private double ERR2354075;

	 @Column(name="ERR2354076")
	 private double ERR2354076;

	 @Column(name="ERR2354077")
	 private double ERR2354077;

	 @Column(name="ERR2354752")
	 private double ERR2354752;

	 @Column(name="ERR2354753")
	 private double ERR2354753;

	 @Column(name="ERR2354754")
	 private double ERR2354754;

	 @Column(name="ERR2354755")
	 private double ERR2354755;

	 @Column(name="ERR2354756")
	 private double ERR2354756;

	 @Column(name="ERR2354757")
	 private double ERR2354757;

	 @Column(name="ERR2354758")
	 private double ERR2354758;

	 @Column(name="ERR2354759")
	 private double ERR2354759;

	 @Column(name="ERR2354760")
	 private double ERR2354760;

	 @Column(name="SRR24057935")
	 private double SRR24057935;

	 @Column(name="SRR24057936")
	 private double SRR24057936;

	 @Column(name="SRR24057937")
	 private double SRR24057937;

	 @Column(name="SRR24057938")
	 private double SRR24057938;

	public Kidney_cortex() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Kidney_cortex(int id, String geneId, double eRR2352842, double eRR2352843, double eRR2352844,
			double eRR2352845, double eRR2352846, double eRR2352847, double eRR2352848, double eRR2353209,
			double eRR2353210, double eRR2353211, double eRR2353212, double eRR2353213, double eRR2353214,
			double eRR2353215, double eRR2353216, double eRR2353217, double eRR2353693, double eRR2353694,
			double eRR2353695, double eRR2353696, double eRR2353697, double eRR2353698, double eRR2353699,
			double eRR2354069, double eRR2354070, double eRR2354071, double eRR2354072, double eRR2354073,
			double eRR2354074, double eRR2354075, double eRR2354076, double eRR2354077, double eRR2354752,
			double eRR2354753, double eRR2354754, double eRR2354755, double eRR2354756, double eRR2354757,
			double eRR2354758, double eRR2354759, double eRR2354760, double sRR24057935, double sRR24057936,
			double sRR24057937, double sRR24057938) {
		super();
		this.id = id;
		this.geneId = geneId;
		ERR2352842 = eRR2352842;
		ERR2352843 = eRR2352843;
		ERR2352844 = eRR2352844;
		ERR2352845 = eRR2352845;
		ERR2352846 = eRR2352846;
		ERR2352847 = eRR2352847;
		ERR2352848 = eRR2352848;
		ERR2353209 = eRR2353209;
		ERR2353210 = eRR2353210;
		ERR2353211 = eRR2353211;
		ERR2353212 = eRR2353212;
		ERR2353213 = eRR2353213;
		ERR2353214 = eRR2353214;
		ERR2353215 = eRR2353215;
		ERR2353216 = eRR2353216;
		ERR2353217 = eRR2353217;
		ERR2353693 = eRR2353693;
		ERR2353694 = eRR2353694;
		ERR2353695 = eRR2353695;
		ERR2353696 = eRR2353696;
		ERR2353697 = eRR2353697;
		ERR2353698 = eRR2353698;
		ERR2353699 = eRR2353699;
		ERR2354069 = eRR2354069;
		ERR2354070 = eRR2354070;
		ERR2354071 = eRR2354071;
		ERR2354072 = eRR2354072;
		ERR2354073 = eRR2354073;
		ERR2354074 = eRR2354074;
		ERR2354075 = eRR2354075;
		ERR2354076 = eRR2354076;
		ERR2354077 = eRR2354077;
		ERR2354752 = eRR2354752;
		ERR2354753 = eRR2354753;
		ERR2354754 = eRR2354754;
		ERR2354755 = eRR2354755;
		ERR2354756 = eRR2354756;
		ERR2354757 = eRR2354757;
		ERR2354758 = eRR2354758;
		ERR2354759 = eRR2354759;
		ERR2354760 = eRR2354760;
		SRR24057935 = sRR24057935;
		SRR24057936 = sRR24057936;
		SRR24057937 = sRR24057937;
		SRR24057938 = sRR24057938;
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

	public double getERR2352842() {
		return ERR2352842;
	}

	public void setERR2352842(double eRR2352842) {
		ERR2352842 = eRR2352842;
	}

	public double getERR2352843() {
		return ERR2352843;
	}

	public void setERR2352843(double eRR2352843) {
		ERR2352843 = eRR2352843;
	}

	public double getERR2352844() {
		return ERR2352844;
	}

	public void setERR2352844(double eRR2352844) {
		ERR2352844 = eRR2352844;
	}

	public double getERR2352845() {
		return ERR2352845;
	}

	public void setERR2352845(double eRR2352845) {
		ERR2352845 = eRR2352845;
	}

	public double getERR2352846() {
		return ERR2352846;
	}

	public void setERR2352846(double eRR2352846) {
		ERR2352846 = eRR2352846;
	}

	public double getERR2352847() {
		return ERR2352847;
	}

	public void setERR2352847(double eRR2352847) {
		ERR2352847 = eRR2352847;
	}

	public double getERR2352848() {
		return ERR2352848;
	}

	public void setERR2352848(double eRR2352848) {
		ERR2352848 = eRR2352848;
	}

	public double getERR2353209() {
		return ERR2353209;
	}

	public void setERR2353209(double eRR2353209) {
		ERR2353209 = eRR2353209;
	}

	public double getERR2353210() {
		return ERR2353210;
	}

	public void setERR2353210(double eRR2353210) {
		ERR2353210 = eRR2353210;
	}

	public double getERR2353211() {
		return ERR2353211;
	}

	public void setERR2353211(double eRR2353211) {
		ERR2353211 = eRR2353211;
	}

	public double getERR2353212() {
		return ERR2353212;
	}

	public void setERR2353212(double eRR2353212) {
		ERR2353212 = eRR2353212;
	}

	public double getERR2353213() {
		return ERR2353213;
	}

	public void setERR2353213(double eRR2353213) {
		ERR2353213 = eRR2353213;
	}

	public double getERR2353214() {
		return ERR2353214;
	}

	public void setERR2353214(double eRR2353214) {
		ERR2353214 = eRR2353214;
	}

	public double getERR2353215() {
		return ERR2353215;
	}

	public void setERR2353215(double eRR2353215) {
		ERR2353215 = eRR2353215;
	}

	public double getERR2353216() {
		return ERR2353216;
	}

	public void setERR2353216(double eRR2353216) {
		ERR2353216 = eRR2353216;
	}

	public double getERR2353217() {
		return ERR2353217;
	}

	public void setERR2353217(double eRR2353217) {
		ERR2353217 = eRR2353217;
	}

	public double getERR2353693() {
		return ERR2353693;
	}

	public void setERR2353693(double eRR2353693) {
		ERR2353693 = eRR2353693;
	}

	public double getERR2353694() {
		return ERR2353694;
	}

	public void setERR2353694(double eRR2353694) {
		ERR2353694 = eRR2353694;
	}

	public double getERR2353695() {
		return ERR2353695;
	}

	public void setERR2353695(double eRR2353695) {
		ERR2353695 = eRR2353695;
	}

	public double getERR2353696() {
		return ERR2353696;
	}

	public void setERR2353696(double eRR2353696) {
		ERR2353696 = eRR2353696;
	}

	public double getERR2353697() {
		return ERR2353697;
	}

	public void setERR2353697(double eRR2353697) {
		ERR2353697 = eRR2353697;
	}

	public double getERR2353698() {
		return ERR2353698;
	}

	public void setERR2353698(double eRR2353698) {
		ERR2353698 = eRR2353698;
	}

	public double getERR2353699() {
		return ERR2353699;
	}

	public void setERR2353699(double eRR2353699) {
		ERR2353699 = eRR2353699;
	}

	public double getERR2354069() {
		return ERR2354069;
	}

	public void setERR2354069(double eRR2354069) {
		ERR2354069 = eRR2354069;
	}

	public double getERR2354070() {
		return ERR2354070;
	}

	public void setERR2354070(double eRR2354070) {
		ERR2354070 = eRR2354070;
	}

	public double getERR2354071() {
		return ERR2354071;
	}

	public void setERR2354071(double eRR2354071) {
		ERR2354071 = eRR2354071;
	}

	public double getERR2354072() {
		return ERR2354072;
	}

	public void setERR2354072(double eRR2354072) {
		ERR2354072 = eRR2354072;
	}

	public double getERR2354073() {
		return ERR2354073;
	}

	public void setERR2354073(double eRR2354073) {
		ERR2354073 = eRR2354073;
	}

	public double getERR2354074() {
		return ERR2354074;
	}

	public void setERR2354074(double eRR2354074) {
		ERR2354074 = eRR2354074;
	}

	public double getERR2354075() {
		return ERR2354075;
	}

	public void setERR2354075(double eRR2354075) {
		ERR2354075 = eRR2354075;
	}

	public double getERR2354076() {
		return ERR2354076;
	}

	public void setERR2354076(double eRR2354076) {
		ERR2354076 = eRR2354076;
	}

	public double getERR2354077() {
		return ERR2354077;
	}

	public void setERR2354077(double eRR2354077) {
		ERR2354077 = eRR2354077;
	}

	public double getERR2354752() {
		return ERR2354752;
	}

	public void setERR2354752(double eRR2354752) {
		ERR2354752 = eRR2354752;
	}

	public double getERR2354753() {
		return ERR2354753;
	}

	public void setERR2354753(double eRR2354753) {
		ERR2354753 = eRR2354753;
	}

	public double getERR2354754() {
		return ERR2354754;
	}

	public void setERR2354754(double eRR2354754) {
		ERR2354754 = eRR2354754;
	}

	public double getERR2354755() {
		return ERR2354755;
	}

	public void setERR2354755(double eRR2354755) {
		ERR2354755 = eRR2354755;
	}

	public double getERR2354756() {
		return ERR2354756;
	}

	public void setERR2354756(double eRR2354756) {
		ERR2354756 = eRR2354756;
	}

	public double getERR2354757() {
		return ERR2354757;
	}

	public void setERR2354757(double eRR2354757) {
		ERR2354757 = eRR2354757;
	}

	public double getERR2354758() {
		return ERR2354758;
	}

	public void setERR2354758(double eRR2354758) {
		ERR2354758 = eRR2354758;
	}

	public double getERR2354759() {
		return ERR2354759;
	}

	public void setERR2354759(double eRR2354759) {
		ERR2354759 = eRR2354759;
	}

	public double getERR2354760() {
		return ERR2354760;
	}

	public void setERR2354760(double eRR2354760) {
		ERR2354760 = eRR2354760;
	}

	public double getSRR24057935() {
		return SRR24057935;
	}

	public void setSRR24057935(double sRR24057935) {
		SRR24057935 = sRR24057935;
	}

	public double getSRR24057936() {
		return SRR24057936;
	}

	public void setSRR24057936(double sRR24057936) {
		SRR24057936 = sRR24057936;
	}

	public double getSRR24057937() {
		return SRR24057937;
	}

	public void setSRR24057937(double sRR24057937) {
		SRR24057937 = sRR24057937;
	}

	public double getSRR24057938() {
		return SRR24057938;
	}

	public void setSRR24057938(double sRR24057938) {
		SRR24057938 = sRR24057938;
	}

	@Override
	public String toString() {
		return "Kidney_cortex [id=" + id + ", geneId=" + geneId + ", ERR2352842=" + ERR2352842 + ", ERR2352843="
				+ ERR2352843 + ", ERR2352844=" + ERR2352844 + ", ERR2352845=" + ERR2352845 + ", ERR2352846="
				+ ERR2352846 + ", ERR2352847=" + ERR2352847 + ", ERR2352848=" + ERR2352848 + ", ERR2353209="
				+ ERR2353209 + ", ERR2353210=" + ERR2353210 + ", ERR2353211=" + ERR2353211 + ", ERR2353212="
				+ ERR2353212 + ", ERR2353213=" + ERR2353213 + ", ERR2353214=" + ERR2353214 + ", ERR2353215="
				+ ERR2353215 + ", ERR2353216=" + ERR2353216 + ", ERR2353217=" + ERR2353217 + ", ERR2353693="
				+ ERR2353693 + ", ERR2353694=" + ERR2353694 + ", ERR2353695=" + ERR2353695 + ", ERR2353696="
				+ ERR2353696 + ", ERR2353697=" + ERR2353697 + ", ERR2353698=" + ERR2353698 + ", ERR2353699="
				+ ERR2353699 + ", ERR2354069=" + ERR2354069 + ", ERR2354070=" + ERR2354070 + ", ERR2354071="
				+ ERR2354071 + ", ERR2354072=" + ERR2354072 + ", ERR2354073=" + ERR2354073 + ", ERR2354074="
				+ ERR2354074 + ", ERR2354075=" + ERR2354075 + ", ERR2354076=" + ERR2354076 + ", ERR2354077="
				+ ERR2354077 + ", ERR2354752=" + ERR2354752 + ", ERR2354753=" + ERR2354753 + ", ERR2354754="
				+ ERR2354754 + ", ERR2354755=" + ERR2354755 + ", ERR2354756=" + ERR2354756 + ", ERR2354757="
				+ ERR2354757 + ", ERR2354758=" + ERR2354758 + ", ERR2354759=" + ERR2354759 + ", ERR2354760="
				+ ERR2354760 + ", SRR24057935=" + SRR24057935 + ", SRR24057936=" + SRR24057936 + ", SRR24057937="
				+ SRR24057937 + ", SRR24057938=" + SRR24057938 + "]";
	}
	 
	 
}
