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
@Table(name = "spleen")
public class Spleen {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="ERR2352987")
	 private double ERR2352987;

	 @Column(name="ERR2352988")
	 private double ERR2352988;

	 @Column(name="ERR2352989")
	 private double ERR2352989;

	 @Column(name="ERR2352990")
	 private double ERR2352990;

	 @Column(name="ERR2352991")
	 private double ERR2352991;

	 @Column(name="ERR2352992")
	 private double ERR2352992;

	 @Column(name="ERR2352993")
	 private double ERR2352993;

	 @Column(name="ERR2353537")
	 private double ERR2353537;

	 @Column(name="ERR2353538")
	 private double ERR2353538;

	 @Column(name="ERR2353539")
	 private double ERR2353539;

	 @Column(name="ERR2353540")
	 private double ERR2353540;

	 @Column(name="ERR2353541")
	 private double ERR2353541;

	 @Column(name="ERR2353542")
	 private double ERR2353542;

	 @Column(name="ERR2353543")
	 private double ERR2353543;

	 @Column(name="ERR2353544")
	 private double ERR2353544;

	 @Column(name="ERR2353545")
	 private double ERR2353545;

	 @Column(name="ERR2353829")
	 private double ERR2353829;

	 @Column(name="ERR2353830")
	 private double ERR2353830;

	 @Column(name="ERR2353831")
	 private double ERR2353831;

	 @Column(name="ERR2353832")
	 private double ERR2353832;

	 @Column(name="ERR2353833")
	 private double ERR2353833;

	 @Column(name="ERR2353834")
	 private double ERR2353834;

	 @Column(name="ERR2353835")
	 private double ERR2353835;

	 @Column(name="ERR2354356")
	 private double ERR2354356;

	 @Column(name="ERR2354357")
	 private double ERR2354357;

	 @Column(name="ERR2354358")
	 private double ERR2354358;

	 @Column(name="ERR2354359")
	 private double ERR2354359;

	 @Column(name="ERR2354360")
	 private double ERR2354360;

	 @Column(name="ERR2354361")
	 private double ERR2354361;

	 @Column(name="ERR2354362")
	 private double ERR2354362;

	 @Column(name="ERR2354363")
	 private double ERR2354363;

	 @Column(name="ERR2354364")
	 private double ERR2354364;

	 @Column(name="ERR315641")
	 private double ERR315641;

	 @Column(name="SRR15721750")
	 private double SRR15721750;

	 @Column(name="SRR24057899")
	 private double SRR24057899;

	 @Column(name="SRR24057900")
	 private double SRR24057900;

	 @Column(name="SRR24057901")
	 private double SRR24057901;

	 @Column(name="SRR24057902")
	 private double SRR24057902;

	public Spleen() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Spleen(int id, String geneId, double eRR2352987, double eRR2352988, double eRR2352989, double eRR2352990,
			double eRR2352991, double eRR2352992, double eRR2352993, double eRR2353537, double eRR2353538,
			double eRR2353539, double eRR2353540, double eRR2353541, double eRR2353542, double eRR2353543,
			double eRR2353544, double eRR2353545, double eRR2353829, double eRR2353830, double eRR2353831,
			double eRR2353832, double eRR2353833, double eRR2353834, double eRR2353835, double eRR2354356,
			double eRR2354357, double eRR2354358, double eRR2354359, double eRR2354360, double eRR2354361,
			double eRR2354362, double eRR2354363, double eRR2354364, double eRR315641, double sRR15721750,
			double sRR24057899, double sRR24057900, double sRR24057901, double sRR24057902) {
		super();
		this.id = id;
		this.geneId = geneId;
		ERR2352987 = eRR2352987;
		ERR2352988 = eRR2352988;
		ERR2352989 = eRR2352989;
		ERR2352990 = eRR2352990;
		ERR2352991 = eRR2352991;
		ERR2352992 = eRR2352992;
		ERR2352993 = eRR2352993;
		ERR2353537 = eRR2353537;
		ERR2353538 = eRR2353538;
		ERR2353539 = eRR2353539;
		ERR2353540 = eRR2353540;
		ERR2353541 = eRR2353541;
		ERR2353542 = eRR2353542;
		ERR2353543 = eRR2353543;
		ERR2353544 = eRR2353544;
		ERR2353545 = eRR2353545;
		ERR2353829 = eRR2353829;
		ERR2353830 = eRR2353830;
		ERR2353831 = eRR2353831;
		ERR2353832 = eRR2353832;
		ERR2353833 = eRR2353833;
		ERR2353834 = eRR2353834;
		ERR2353835 = eRR2353835;
		ERR2354356 = eRR2354356;
		ERR2354357 = eRR2354357;
		ERR2354358 = eRR2354358;
		ERR2354359 = eRR2354359;
		ERR2354360 = eRR2354360;
		ERR2354361 = eRR2354361;
		ERR2354362 = eRR2354362;
		ERR2354363 = eRR2354363;
		ERR2354364 = eRR2354364;
		ERR315641 = eRR315641;
		SRR15721750 = sRR15721750;
		SRR24057899 = sRR24057899;
		SRR24057900 = sRR24057900;
		SRR24057901 = sRR24057901;
		SRR24057902 = sRR24057902;
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

	public double getERR2352987() {
		return ERR2352987;
	}

	public void setERR2352987(double eRR2352987) {
		ERR2352987 = eRR2352987;
	}

	public double getERR2352988() {
		return ERR2352988;
	}

	public void setERR2352988(double eRR2352988) {
		ERR2352988 = eRR2352988;
	}

	public double getERR2352989() {
		return ERR2352989;
	}

	public void setERR2352989(double eRR2352989) {
		ERR2352989 = eRR2352989;
	}

	public double getERR2352990() {
		return ERR2352990;
	}

	public void setERR2352990(double eRR2352990) {
		ERR2352990 = eRR2352990;
	}

	public double getERR2352991() {
		return ERR2352991;
	}

	public void setERR2352991(double eRR2352991) {
		ERR2352991 = eRR2352991;
	}

	public double getERR2352992() {
		return ERR2352992;
	}

	public void setERR2352992(double eRR2352992) {
		ERR2352992 = eRR2352992;
	}

	public double getERR2352993() {
		return ERR2352993;
	}

	public void setERR2352993(double eRR2352993) {
		ERR2352993 = eRR2352993;
	}

	public double getERR2353537() {
		return ERR2353537;
	}

	public void setERR2353537(double eRR2353537) {
		ERR2353537 = eRR2353537;
	}

	public double getERR2353538() {
		return ERR2353538;
	}

	public void setERR2353538(double eRR2353538) {
		ERR2353538 = eRR2353538;
	}

	public double getERR2353539() {
		return ERR2353539;
	}

	public void setERR2353539(double eRR2353539) {
		ERR2353539 = eRR2353539;
	}

	public double getERR2353540() {
		return ERR2353540;
	}

	public void setERR2353540(double eRR2353540) {
		ERR2353540 = eRR2353540;
	}

	public double getERR2353541() {
		return ERR2353541;
	}

	public void setERR2353541(double eRR2353541) {
		ERR2353541 = eRR2353541;
	}

	public double getERR2353542() {
		return ERR2353542;
	}

	public void setERR2353542(double eRR2353542) {
		ERR2353542 = eRR2353542;
	}

	public double getERR2353543() {
		return ERR2353543;
	}

	public void setERR2353543(double eRR2353543) {
		ERR2353543 = eRR2353543;
	}

	public double getERR2353544() {
		return ERR2353544;
	}

	public void setERR2353544(double eRR2353544) {
		ERR2353544 = eRR2353544;
	}

	public double getERR2353545() {
		return ERR2353545;
	}

	public void setERR2353545(double eRR2353545) {
		ERR2353545 = eRR2353545;
	}

	public double getERR2353829() {
		return ERR2353829;
	}

	public void setERR2353829(double eRR2353829) {
		ERR2353829 = eRR2353829;
	}

	public double getERR2353830() {
		return ERR2353830;
	}

	public void setERR2353830(double eRR2353830) {
		ERR2353830 = eRR2353830;
	}

	public double getERR2353831() {
		return ERR2353831;
	}

	public void setERR2353831(double eRR2353831) {
		ERR2353831 = eRR2353831;
	}

	public double getERR2353832() {
		return ERR2353832;
	}

	public void setERR2353832(double eRR2353832) {
		ERR2353832 = eRR2353832;
	}

	public double getERR2353833() {
		return ERR2353833;
	}

	public void setERR2353833(double eRR2353833) {
		ERR2353833 = eRR2353833;
	}

	public double getERR2353834() {
		return ERR2353834;
	}

	public void setERR2353834(double eRR2353834) {
		ERR2353834 = eRR2353834;
	}

	public double getERR2353835() {
		return ERR2353835;
	}

	public void setERR2353835(double eRR2353835) {
		ERR2353835 = eRR2353835;
	}

	public double getERR2354356() {
		return ERR2354356;
	}

	public void setERR2354356(double eRR2354356) {
		ERR2354356 = eRR2354356;
	}

	public double getERR2354357() {
		return ERR2354357;
	}

	public void setERR2354357(double eRR2354357) {
		ERR2354357 = eRR2354357;
	}

	public double getERR2354358() {
		return ERR2354358;
	}

	public void setERR2354358(double eRR2354358) {
		ERR2354358 = eRR2354358;
	}

	public double getERR2354359() {
		return ERR2354359;
	}

	public void setERR2354359(double eRR2354359) {
		ERR2354359 = eRR2354359;
	}

	public double getERR2354360() {
		return ERR2354360;
	}

	public void setERR2354360(double eRR2354360) {
		ERR2354360 = eRR2354360;
	}

	public double getERR2354361() {
		return ERR2354361;
	}

	public void setERR2354361(double eRR2354361) {
		ERR2354361 = eRR2354361;
	}

	public double getERR2354362() {
		return ERR2354362;
	}

	public void setERR2354362(double eRR2354362) {
		ERR2354362 = eRR2354362;
	}

	public double getERR2354363() {
		return ERR2354363;
	}

	public void setERR2354363(double eRR2354363) {
		ERR2354363 = eRR2354363;
	}

	public double getERR2354364() {
		return ERR2354364;
	}

	public void setERR2354364(double eRR2354364) {
		ERR2354364 = eRR2354364;
	}

	public double getERR315641() {
		return ERR315641;
	}

	public void setERR315641(double eRR315641) {
		ERR315641 = eRR315641;
	}

	public double getSRR15721750() {
		return SRR15721750;
	}

	public void setSRR15721750(double sRR15721750) {
		SRR15721750 = sRR15721750;
	}

	public double getSRR24057899() {
		return SRR24057899;
	}

	public void setSRR24057899(double sRR24057899) {
		SRR24057899 = sRR24057899;
	}

	public double getSRR24057900() {
		return SRR24057900;
	}

	public void setSRR24057900(double sRR24057900) {
		SRR24057900 = sRR24057900;
	}

	public double getSRR24057901() {
		return SRR24057901;
	}

	public void setSRR24057901(double sRR24057901) {
		SRR24057901 = sRR24057901;
	}

	public double getSRR24057902() {
		return SRR24057902;
	}

	public void setSRR24057902(double sRR24057902) {
		SRR24057902 = sRR24057902;
	}

	@Override
	public String toString() {
		return "Spleen [id=" + id + ", geneId=" + geneId + ", ERR2352987=" + ERR2352987 + ", ERR2352988=" + ERR2352988
				+ ", ERR2352989=" + ERR2352989 + ", ERR2352990=" + ERR2352990 + ", ERR2352991=" + ERR2352991
				+ ", ERR2352992=" + ERR2352992 + ", ERR2352993=" + ERR2352993 + ", ERR2353537=" + ERR2353537
				+ ", ERR2353538=" + ERR2353538 + ", ERR2353539=" + ERR2353539 + ", ERR2353540=" + ERR2353540
				+ ", ERR2353541=" + ERR2353541 + ", ERR2353542=" + ERR2353542 + ", ERR2353543=" + ERR2353543
				+ ", ERR2353544=" + ERR2353544 + ", ERR2353545=" + ERR2353545 + ", ERR2353829=" + ERR2353829
				+ ", ERR2353830=" + ERR2353830 + ", ERR2353831=" + ERR2353831 + ", ERR2353832=" + ERR2353832
				+ ", ERR2353833=" + ERR2353833 + ", ERR2353834=" + ERR2353834 + ", ERR2353835=" + ERR2353835
				+ ", ERR2354356=" + ERR2354356 + ", ERR2354357=" + ERR2354357 + ", ERR2354358=" + ERR2354358
				+ ", ERR2354359=" + ERR2354359 + ", ERR2354360=" + ERR2354360 + ", ERR2354361=" + ERR2354361
				+ ", ERR2354362=" + ERR2354362 + ", ERR2354363=" + ERR2354363 + ", ERR2354364=" + ERR2354364
				+ ", ERR315641=" + ERR315641 + ", SRR15721750=" + SRR15721750 + ", SRR24057899=" + SRR24057899
				+ ", SRR24057900=" + SRR24057900 + ", SRR24057901=" + SRR24057901 + ", SRR24057902=" + SRR24057902
				+ "]";
	}
}
