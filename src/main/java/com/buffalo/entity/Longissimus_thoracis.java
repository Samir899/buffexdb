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
@Table(name = "longissimus_thoracis")
public class Longissimus_thoracis {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="ERR2352867")
	 private double ERR2352867;

	@Column(name="ERR2352868")
	 private double ERR2352868;

	@Column(name="ERR2352869")
	 private double ERR2352869;

	@Column(name="ERR2352870")
	 private double ERR2352870;

	@Column(name="ERR2352871")
	 private double ERR2352871;

	@Column(name="ERR2352872")
	 private double ERR2352872;

	@Column(name="ERR2352873")
	 private double ERR2352873;

	@Column(name="ERR2352874")
	 private double ERR2352874;

	@Column(name="ERR2352875")
	 private double ERR2352875;

	@Column(name="ERR2353264")
	 private double ERR2353264;

	@Column(name="ERR2353266")
	 private double ERR2353266;

	@Column(name="ERR2353267")
	 private double ERR2353267;

	@Column(name="ERR2353268")
	 private double ERR2353268;

	@Column(name="ERR2353269")
	 private double ERR2353269;

	@Column(name="ERR2353270")
	 private double ERR2353270;

	@Column(name="ERR2353271")
	 private double ERR2353271;

	@Column(name="ERR2353272")
	 private double ERR2353272;

	@Column(name="ERR2353273")
	 private double ERR2353273;

	@Column(name="ERR2353274")
	 private double ERR2353274;

	@Column(name="ERR2353275")
	 private double ERR2353275;

	@Column(name="ERR2353276")
	 private double ERR2353276;

	@Column(name="ERR2353277")
	 private double ERR2353277;

	@Column(name="ERR2353278")
	 private double ERR2353278;

	@Column(name="ERR2353279")
	 private double ERR2353279;

	@Column(name="ERR2353280")
	 private double ERR2353280;

	@Column(name="ERR2353281")
	 private double ERR2353281;

	@Column(name="ERR2353282")
	 private double ERR2353282;

	@Column(name="ERR2353283")
	 private double ERR2353283;

	@Column(name="ERR2353284")
	 private double ERR2353284;

	@Column(name="ERR2353285")
	 private double ERR2353285;

	@Column(name="ERR2353286")
	 private double ERR2353286;

	@Column(name="ERR2353718")
	 private double ERR2353718;

	@Column(name="ERR2353719")
	 private double ERR2353719;

	@Column(name="ERR2353720")
	 private double ERR2353720;

	@Column(name="ERR2353721")
	 private double ERR2353721;

	@Column(name="ERR2353722")
	 private double ERR2353722;

	@Column(name="ERR2353723")
	 private double ERR2353723;

	@Column(name="ERR2353724")
	 private double ERR2353724;

	@Column(name="ERR2353725")
	 private double ERR2353725;

	@Column(name="ERR2353726")
	 private double ERR2353726;

	@Column(name="ERR2354124")
	 private double ERR2354124;

	@Column(name="ERR2354125")
	 private double ERR2354125;

	@Column(name="ERR2354126")
	 private double ERR2354126;

	@Column(name="ERR2354127")
	 private double ERR2354127;

	@Column(name="ERR2354128")
	 private double ERR2354128;

	@Column(name="ERR2354130")
	 private double ERR2354130;

	@Column(name="ERR2354131")
	 private double ERR2354131;

	@Column(name="ERR2354132")
	 private double ERR2354132;

	@Column(name="ERR2354133")
	 private double ERR2354133;

	@Column(name="ERR2354134")
	 private double ERR2354134;

	@Column(name="ERR2354135")
	 private double ERR2354135;

	@Column(name="ERR2354136")
	 private double ERR2354136;

	@Column(name="ERR2354137")
	 private double ERR2354137;

	@Column(name="ERR2354138")
	 private double ERR2354138;

	@Column(name="ERR2354139")
	 private double ERR2354139;

	@Column(name="ERR2354140")
	 private double ERR2354140;

	@Column(name="ERR2354141")
	 private double ERR2354141;

	@Column(name="ERR2354142")
	 private double ERR2354142;

	@Column(name="ERR2354143")
	 private double ERR2354143;

	@Column(name="ERR2354144")
	 private double ERR2354144;

	@Column(name="ERR2354145")
	 private double ERR2354145;

	@Column(name="ERR2354146")
	 private double ERR2354146;

	public Longissimus_thoracis() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Longissimus_thoracis(int id, String geneId, double eRR2352867, double eRR2352868, double eRR2352869,
			double eRR2352870, double eRR2352871, double eRR2352872, double eRR2352873, double eRR2352874,
			double eRR2352875, double eRR2353264, double eRR2353266, double eRR2353267, double eRR2353268,
			double eRR2353269, double eRR2353270, double eRR2353271, double eRR2353272, double eRR2353273,
			double eRR2353274, double eRR2353275, double eRR2353276, double eRR2353277, double eRR2353278,
			double eRR2353279, double eRR2353280, double eRR2353281, double eRR2353282, double eRR2353283,
			double eRR2353284, double eRR2353285, double eRR2353286, double eRR2353718, double eRR2353719,
			double eRR2353720, double eRR2353721, double eRR2353722, double eRR2353723, double eRR2353724,
			double eRR2353725, double eRR2353726, double eRR2354124, double eRR2354125, double eRR2354126,
			double eRR2354127, double eRR2354128, double eRR2354130, double eRR2354131, double eRR2354132,
			double eRR2354133, double eRR2354134, double eRR2354135, double eRR2354136, double eRR2354137,
			double eRR2354138, double eRR2354139, double eRR2354140, double eRR2354141, double eRR2354142,
			double eRR2354143, double eRR2354144, double eRR2354145, double eRR2354146) {
		super();
		this.id = id;
		this.geneId = geneId;
		ERR2352867 = eRR2352867;
		ERR2352868 = eRR2352868;
		ERR2352869 = eRR2352869;
		ERR2352870 = eRR2352870;
		ERR2352871 = eRR2352871;
		ERR2352872 = eRR2352872;
		ERR2352873 = eRR2352873;
		ERR2352874 = eRR2352874;
		ERR2352875 = eRR2352875;
		ERR2353264 = eRR2353264;
		ERR2353266 = eRR2353266;
		ERR2353267 = eRR2353267;
		ERR2353268 = eRR2353268;
		ERR2353269 = eRR2353269;
		ERR2353270 = eRR2353270;
		ERR2353271 = eRR2353271;
		ERR2353272 = eRR2353272;
		ERR2353273 = eRR2353273;
		ERR2353274 = eRR2353274;
		ERR2353275 = eRR2353275;
		ERR2353276 = eRR2353276;
		ERR2353277 = eRR2353277;
		ERR2353278 = eRR2353278;
		ERR2353279 = eRR2353279;
		ERR2353280 = eRR2353280;
		ERR2353281 = eRR2353281;
		ERR2353282 = eRR2353282;
		ERR2353283 = eRR2353283;
		ERR2353284 = eRR2353284;
		ERR2353285 = eRR2353285;
		ERR2353286 = eRR2353286;
		ERR2353718 = eRR2353718;
		ERR2353719 = eRR2353719;
		ERR2353720 = eRR2353720;
		ERR2353721 = eRR2353721;
		ERR2353722 = eRR2353722;
		ERR2353723 = eRR2353723;
		ERR2353724 = eRR2353724;
		ERR2353725 = eRR2353725;
		ERR2353726 = eRR2353726;
		ERR2354124 = eRR2354124;
		ERR2354125 = eRR2354125;
		ERR2354126 = eRR2354126;
		ERR2354127 = eRR2354127;
		ERR2354128 = eRR2354128;
		ERR2354130 = eRR2354130;
		ERR2354131 = eRR2354131;
		ERR2354132 = eRR2354132;
		ERR2354133 = eRR2354133;
		ERR2354134 = eRR2354134;
		ERR2354135 = eRR2354135;
		ERR2354136 = eRR2354136;
		ERR2354137 = eRR2354137;
		ERR2354138 = eRR2354138;
		ERR2354139 = eRR2354139;
		ERR2354140 = eRR2354140;
		ERR2354141 = eRR2354141;
		ERR2354142 = eRR2354142;
		ERR2354143 = eRR2354143;
		ERR2354144 = eRR2354144;
		ERR2354145 = eRR2354145;
		ERR2354146 = eRR2354146;
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

	public double getERR2352867() {
		return ERR2352867;
	}

	public void setERR2352867(double eRR2352867) {
		ERR2352867 = eRR2352867;
	}

	public double getERR2352868() {
		return ERR2352868;
	}

	public void setERR2352868(double eRR2352868) {
		ERR2352868 = eRR2352868;
	}

	public double getERR2352869() {
		return ERR2352869;
	}

	public void setERR2352869(double eRR2352869) {
		ERR2352869 = eRR2352869;
	}

	public double getERR2352870() {
		return ERR2352870;
	}

	public void setERR2352870(double eRR2352870) {
		ERR2352870 = eRR2352870;
	}

	public double getERR2352871() {
		return ERR2352871;
	}

	public void setERR2352871(double eRR2352871) {
		ERR2352871 = eRR2352871;
	}

	public double getERR2352872() {
		return ERR2352872;
	}

	public void setERR2352872(double eRR2352872) {
		ERR2352872 = eRR2352872;
	}

	public double getERR2352873() {
		return ERR2352873;
	}

	public void setERR2352873(double eRR2352873) {
		ERR2352873 = eRR2352873;
	}

	public double getERR2352874() {
		return ERR2352874;
	}

	public void setERR2352874(double eRR2352874) {
		ERR2352874 = eRR2352874;
	}

	public double getERR2352875() {
		return ERR2352875;
	}

	public void setERR2352875(double eRR2352875) {
		ERR2352875 = eRR2352875;
	}

	public double getERR2353264() {
		return ERR2353264;
	}

	public void setERR2353264(double eRR2353264) {
		ERR2353264 = eRR2353264;
	}

	public double getERR2353266() {
		return ERR2353266;
	}

	public void setERR2353266(double eRR2353266) {
		ERR2353266 = eRR2353266;
	}

	public double getERR2353267() {
		return ERR2353267;
	}

	public void setERR2353267(double eRR2353267) {
		ERR2353267 = eRR2353267;
	}

	public double getERR2353268() {
		return ERR2353268;
	}

	public void setERR2353268(double eRR2353268) {
		ERR2353268 = eRR2353268;
	}

	public double getERR2353269() {
		return ERR2353269;
	}

	public void setERR2353269(double eRR2353269) {
		ERR2353269 = eRR2353269;
	}

	public double getERR2353270() {
		return ERR2353270;
	}

	public void setERR2353270(double eRR2353270) {
		ERR2353270 = eRR2353270;
	}

	public double getERR2353271() {
		return ERR2353271;
	}

	public void setERR2353271(double eRR2353271) {
		ERR2353271 = eRR2353271;
	}

	public double getERR2353272() {
		return ERR2353272;
	}

	public void setERR2353272(double eRR2353272) {
		ERR2353272 = eRR2353272;
	}

	public double getERR2353273() {
		return ERR2353273;
	}

	public void setERR2353273(double eRR2353273) {
		ERR2353273 = eRR2353273;
	}

	public double getERR2353274() {
		return ERR2353274;
	}

	public void setERR2353274(double eRR2353274) {
		ERR2353274 = eRR2353274;
	}

	public double getERR2353275() {
		return ERR2353275;
	}

	public void setERR2353275(double eRR2353275) {
		ERR2353275 = eRR2353275;
	}

	public double getERR2353276() {
		return ERR2353276;
	}

	public void setERR2353276(double eRR2353276) {
		ERR2353276 = eRR2353276;
	}

	public double getERR2353277() {
		return ERR2353277;
	}

	public void setERR2353277(double eRR2353277) {
		ERR2353277 = eRR2353277;
	}

	public double getERR2353278() {
		return ERR2353278;
	}

	public void setERR2353278(double eRR2353278) {
		ERR2353278 = eRR2353278;
	}

	public double getERR2353279() {
		return ERR2353279;
	}

	public void setERR2353279(double eRR2353279) {
		ERR2353279 = eRR2353279;
	}

	public double getERR2353280() {
		return ERR2353280;
	}

	public void setERR2353280(double eRR2353280) {
		ERR2353280 = eRR2353280;
	}

	public double getERR2353281() {
		return ERR2353281;
	}

	public void setERR2353281(double eRR2353281) {
		ERR2353281 = eRR2353281;
	}

	public double getERR2353282() {
		return ERR2353282;
	}

	public void setERR2353282(double eRR2353282) {
		ERR2353282 = eRR2353282;
	}

	public double getERR2353283() {
		return ERR2353283;
	}

	public void setERR2353283(double eRR2353283) {
		ERR2353283 = eRR2353283;
	}

	public double getERR2353284() {
		return ERR2353284;
	}

	public void setERR2353284(double eRR2353284) {
		ERR2353284 = eRR2353284;
	}

	public double getERR2353285() {
		return ERR2353285;
	}

	public void setERR2353285(double eRR2353285) {
		ERR2353285 = eRR2353285;
	}

	public double getERR2353286() {
		return ERR2353286;
	}

	public void setERR2353286(double eRR2353286) {
		ERR2353286 = eRR2353286;
	}

	public double getERR2353718() {
		return ERR2353718;
	}

	public void setERR2353718(double eRR2353718) {
		ERR2353718 = eRR2353718;
	}

	public double getERR2353719() {
		return ERR2353719;
	}

	public void setERR2353719(double eRR2353719) {
		ERR2353719 = eRR2353719;
	}

	public double getERR2353720() {
		return ERR2353720;
	}

	public void setERR2353720(double eRR2353720) {
		ERR2353720 = eRR2353720;
	}

	public double getERR2353721() {
		return ERR2353721;
	}

	public void setERR2353721(double eRR2353721) {
		ERR2353721 = eRR2353721;
	}

	public double getERR2353722() {
		return ERR2353722;
	}

	public void setERR2353722(double eRR2353722) {
		ERR2353722 = eRR2353722;
	}

	public double getERR2353723() {
		return ERR2353723;
	}

	public void setERR2353723(double eRR2353723) {
		ERR2353723 = eRR2353723;
	}

	public double getERR2353724() {
		return ERR2353724;
	}

	public void setERR2353724(double eRR2353724) {
		ERR2353724 = eRR2353724;
	}

	public double getERR2353725() {
		return ERR2353725;
	}

	public void setERR2353725(double eRR2353725) {
		ERR2353725 = eRR2353725;
	}

	public double getERR2353726() {
		return ERR2353726;
	}

	public void setERR2353726(double eRR2353726) {
		ERR2353726 = eRR2353726;
	}

	public double getERR2354124() {
		return ERR2354124;
	}

	public void setERR2354124(double eRR2354124) {
		ERR2354124 = eRR2354124;
	}

	public double getERR2354125() {
		return ERR2354125;
	}

	public void setERR2354125(double eRR2354125) {
		ERR2354125 = eRR2354125;
	}

	public double getERR2354126() {
		return ERR2354126;
	}

	public void setERR2354126(double eRR2354126) {
		ERR2354126 = eRR2354126;
	}

	public double getERR2354127() {
		return ERR2354127;
	}

	public void setERR2354127(double eRR2354127) {
		ERR2354127 = eRR2354127;
	}

	public double getERR2354128() {
		return ERR2354128;
	}

	public void setERR2354128(double eRR2354128) {
		ERR2354128 = eRR2354128;
	}

	public double getERR2354130() {
		return ERR2354130;
	}

	public void setERR2354130(double eRR2354130) {
		ERR2354130 = eRR2354130;
	}

	public double getERR2354131() {
		return ERR2354131;
	}

	public void setERR2354131(double eRR2354131) {
		ERR2354131 = eRR2354131;
	}

	public double getERR2354132() {
		return ERR2354132;
	}

	public void setERR2354132(double eRR2354132) {
		ERR2354132 = eRR2354132;
	}

	public double getERR2354133() {
		return ERR2354133;
	}

	public void setERR2354133(double eRR2354133) {
		ERR2354133 = eRR2354133;
	}

	public double getERR2354134() {
		return ERR2354134;
	}

	public void setERR2354134(double eRR2354134) {
		ERR2354134 = eRR2354134;
	}

	public double getERR2354135() {
		return ERR2354135;
	}

	public void setERR2354135(double eRR2354135) {
		ERR2354135 = eRR2354135;
	}

	public double getERR2354136() {
		return ERR2354136;
	}

	public void setERR2354136(double eRR2354136) {
		ERR2354136 = eRR2354136;
	}

	public double getERR2354137() {
		return ERR2354137;
	}

	public void setERR2354137(double eRR2354137) {
		ERR2354137 = eRR2354137;
	}

	public double getERR2354138() {
		return ERR2354138;
	}

	public void setERR2354138(double eRR2354138) {
		ERR2354138 = eRR2354138;
	}

	public double getERR2354139() {
		return ERR2354139;
	}

	public void setERR2354139(double eRR2354139) {
		ERR2354139 = eRR2354139;
	}

	public double getERR2354140() {
		return ERR2354140;
	}

	public void setERR2354140(double eRR2354140) {
		ERR2354140 = eRR2354140;
	}

	public double getERR2354141() {
		return ERR2354141;
	}

	public void setERR2354141(double eRR2354141) {
		ERR2354141 = eRR2354141;
	}

	public double getERR2354142() {
		return ERR2354142;
	}

	public void setERR2354142(double eRR2354142) {
		ERR2354142 = eRR2354142;
	}

	public double getERR2354143() {
		return ERR2354143;
	}

	public void setERR2354143(double eRR2354143) {
		ERR2354143 = eRR2354143;
	}

	public double getERR2354144() {
		return ERR2354144;
	}

	public void setERR2354144(double eRR2354144) {
		ERR2354144 = eRR2354144;
	}

	public double getERR2354145() {
		return ERR2354145;
	}

	public void setERR2354145(double eRR2354145) {
		ERR2354145 = eRR2354145;
	}

	public double getERR2354146() {
		return ERR2354146;
	}

	public void setERR2354146(double eRR2354146) {
		ERR2354146 = eRR2354146;
	}

	@Override
	public String toString() {
		return "Longissimus_thoracis [id=" + id + ", geneId=" + geneId + ", ERR2352867=" + ERR2352867 + ", ERR2352868="
				+ ERR2352868 + ", ERR2352869=" + ERR2352869 + ", ERR2352870=" + ERR2352870 + ", ERR2352871="
				+ ERR2352871 + ", ERR2352872=" + ERR2352872 + ", ERR2352873=" + ERR2352873 + ", ERR2352874="
				+ ERR2352874 + ", ERR2352875=" + ERR2352875 + ", ERR2353264=" + ERR2353264 + ", ERR2353266="
				+ ERR2353266 + ", ERR2353267=" + ERR2353267 + ", ERR2353268=" + ERR2353268 + ", ERR2353269="
				+ ERR2353269 + ", ERR2353270=" + ERR2353270 + ", ERR2353271=" + ERR2353271 + ", ERR2353272="
				+ ERR2353272 + ", ERR2353273=" + ERR2353273 + ", ERR2353274=" + ERR2353274 + ", ERR2353275="
				+ ERR2353275 + ", ERR2353276=" + ERR2353276 + ", ERR2353277=" + ERR2353277 + ", ERR2353278="
				+ ERR2353278 + ", ERR2353279=" + ERR2353279 + ", ERR2353280=" + ERR2353280 + ", ERR2353281="
				+ ERR2353281 + ", ERR2353282=" + ERR2353282 + ", ERR2353283=" + ERR2353283 + ", ERR2353284="
				+ ERR2353284 + ", ERR2353285=" + ERR2353285 + ", ERR2353286=" + ERR2353286 + ", ERR2353718="
				+ ERR2353718 + ", ERR2353719=" + ERR2353719 + ", ERR2353720=" + ERR2353720 + ", ERR2353721="
				+ ERR2353721 + ", ERR2353722=" + ERR2353722 + ", ERR2353723=" + ERR2353723 + ", ERR2353724="
				+ ERR2353724 + ", ERR2353725=" + ERR2353725 + ", ERR2353726=" + ERR2353726 + ", ERR2354124="
				+ ERR2354124 + ", ERR2354125=" + ERR2354125 + ", ERR2354126=" + ERR2354126 + ", ERR2354127="
				+ ERR2354127 + ", ERR2354128=" + ERR2354128 + ", ERR2354130=" + ERR2354130 + ", ERR2354131="
				+ ERR2354131 + ", ERR2354132=" + ERR2354132 + ", ERR2354133=" + ERR2354133 + ", ERR2354134="
				+ ERR2354134 + ", ERR2354135=" + ERR2354135 + ", ERR2354136=" + ERR2354136 + ", ERR2354137="
				+ ERR2354137 + ", ERR2354138=" + ERR2354138 + ", ERR2354139=" + ERR2354139 + ", ERR2354140="
				+ ERR2354140 + ", ERR2354141=" + ERR2354141 + ", ERR2354142=" + ERR2354142 + ", ERR2354143="
				+ ERR2354143 + ", ERR2354144=" + ERR2354144 + ", ERR2354145=" + ERR2354145 + ", ERR2354146="
				+ ERR2354146 + "]";
	}
}
