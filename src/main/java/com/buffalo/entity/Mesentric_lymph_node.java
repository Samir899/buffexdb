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
@Table(name = "mesentric_lymph_node")
public class Mesentric_lymph_node {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="ERR2352885")
	 private double ERR2352885;

	@Column(name="ERR2352886")
	 private double ERR2352886;

	@Column(name="ERR2352887")
	 private double ERR2352887;

	@Column(name="ERR2352888")
	 private double ERR2352888;

	@Column(name="ERR2352889")
	 private double ERR2352889;

	@Column(name="ERR2352890")
	 private double ERR2352890;

	@Column(name="ERR2352891")
	 private double ERR2352891;

	@Column(name="ERR2353342")
	 private double ERR2353342;

	@Column(name="ERR2353343")
	 private double ERR2353343;

	@Column(name="ERR2353344")
	 private double ERR2353344;

	@Column(name="ERR2353345")
	 private double ERR2353345;

	@Column(name="ERR2353346")
	 private double ERR2353346;

	@Column(name="ERR2353347")
	 private double ERR2353347;

	@Column(name="ERR2353348")
	 private double ERR2353348;

	@Column(name="ERR2353349")
	 private double ERR2353349;

	@Column(name="ERR2353350")
	 private double ERR2353350;

	@Column(name="ERR2353736")
	 private double ERR2353736;

	@Column(name="ERR2353737")
	 private double ERR2353737;

	@Column(name="ERR2353738")
	 private double ERR2353738;

	@Column(name="ERR2353739")
	 private double ERR2353739;

	@Column(name="ERR2353740")
	 private double ERR2353740;

	@Column(name="ERR2353741")
	 private double ERR2353741;

	@Column(name="ERR2353742")
	 private double ERR2353742;

	@Column(name="ERR2354193")
	 private double ERR2354193;

	@Column(name="ERR2354194")
	 private double ERR2354194;

	@Column(name="ERR2354195")
	 private double ERR2354195;

	@Column(name="ERR2354196")
	 private double ERR2354196;

	@Column(name="ERR2354197")
	 private double ERR2354197;

	@Column(name="ERR2354198")
	 private double ERR2354198;

	@Column(name="ERR2354199")
	 private double ERR2354199;

	@Column(name="ERR2354200")
	 private double ERR2354200;

	@Column(name="ERR2354201")
	 private double ERR2354201;

	@Column(name="ERR2354589")
	 private double ERR2354589;

	@Column(name="ERR2354590")
	 private double ERR2354590;

	@Column(name="ERR2354591")
	 private double ERR2354591;

	@Column(name="ERR2354592")
	 private double ERR2354592;

	@Column(name="ERR2354593")
	 private double ERR2354593;

	@Column(name="ERR2354594")
	 private double ERR2354594;

	@Column(name="ERR2354595")
	 private double ERR2354595;

	@Column(name="ERR2354596")
	 private double ERR2354596;

	@Column(name="ERR2354597")
	 private double ERR2354597;

	@Column(name="ERR2354830")
	 private double ERR2354830;

	@Column(name="ERR2354831")
	 private double ERR2354831;

	@Column(name="ERR2354832")
	 private double ERR2354832;

	@Column(name="ERR2354833")
	 private double ERR2354833;

	@Column(name="ERR2354834")
	 private double ERR2354834;

	@Column(name="ERR2354835")
	 private double ERR2354835;

	@Column(name="ERR2354836")
	 private double ERR2354836;

	@Column(name="ERR2354837")
	 private double ERR2354837;

	@Column(name="ERR2354838")
	 private double ERR2354838;

	@Column(name="ERR315640")
	 private double ERR315640;

	public Mesentric_lymph_node() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mesentric_lymph_node(int id, String geneId, double eRR2352885, double eRR2352886, double eRR2352887,
			double eRR2352888, double eRR2352889, double eRR2352890, double eRR2352891, double eRR2353342,
			double eRR2353343, double eRR2353344, double eRR2353345, double eRR2353346, double eRR2353347,
			double eRR2353348, double eRR2353349, double eRR2353350, double eRR2353736, double eRR2353737,
			double eRR2353738, double eRR2353739, double eRR2353740, double eRR2353741, double eRR2353742,
			double eRR2354193, double eRR2354194, double eRR2354195, double eRR2354196, double eRR2354197,
			double eRR2354198, double eRR2354199, double eRR2354200, double eRR2354201, double eRR2354589,
			double eRR2354590, double eRR2354591, double eRR2354592, double eRR2354593, double eRR2354594,
			double eRR2354595, double eRR2354596, double eRR2354597, double eRR2354830, double eRR2354831,
			double eRR2354832, double eRR2354833, double eRR2354834, double eRR2354835, double eRR2354836,
			double eRR2354837, double eRR2354838, double eRR315640) {
		super();
		this.id = id;
		this.geneId = geneId;
		ERR2352885 = eRR2352885;
		ERR2352886 = eRR2352886;
		ERR2352887 = eRR2352887;
		ERR2352888 = eRR2352888;
		ERR2352889 = eRR2352889;
		ERR2352890 = eRR2352890;
		ERR2352891 = eRR2352891;
		ERR2353342 = eRR2353342;
		ERR2353343 = eRR2353343;
		ERR2353344 = eRR2353344;
		ERR2353345 = eRR2353345;
		ERR2353346 = eRR2353346;
		ERR2353347 = eRR2353347;
		ERR2353348 = eRR2353348;
		ERR2353349 = eRR2353349;
		ERR2353350 = eRR2353350;
		ERR2353736 = eRR2353736;
		ERR2353737 = eRR2353737;
		ERR2353738 = eRR2353738;
		ERR2353739 = eRR2353739;
		ERR2353740 = eRR2353740;
		ERR2353741 = eRR2353741;
		ERR2353742 = eRR2353742;
		ERR2354193 = eRR2354193;
		ERR2354194 = eRR2354194;
		ERR2354195 = eRR2354195;
		ERR2354196 = eRR2354196;
		ERR2354197 = eRR2354197;
		ERR2354198 = eRR2354198;
		ERR2354199 = eRR2354199;
		ERR2354200 = eRR2354200;
		ERR2354201 = eRR2354201;
		ERR2354589 = eRR2354589;
		ERR2354590 = eRR2354590;
		ERR2354591 = eRR2354591;
		ERR2354592 = eRR2354592;
		ERR2354593 = eRR2354593;
		ERR2354594 = eRR2354594;
		ERR2354595 = eRR2354595;
		ERR2354596 = eRR2354596;
		ERR2354597 = eRR2354597;
		ERR2354830 = eRR2354830;
		ERR2354831 = eRR2354831;
		ERR2354832 = eRR2354832;
		ERR2354833 = eRR2354833;
		ERR2354834 = eRR2354834;
		ERR2354835 = eRR2354835;
		ERR2354836 = eRR2354836;
		ERR2354837 = eRR2354837;
		ERR2354838 = eRR2354838;
		ERR315640 = eRR315640;
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

	public double getERR2352885() {
		return ERR2352885;
	}

	public void setERR2352885(double eRR2352885) {
		ERR2352885 = eRR2352885;
	}

	public double getERR2352886() {
		return ERR2352886;
	}

	public void setERR2352886(double eRR2352886) {
		ERR2352886 = eRR2352886;
	}

	public double getERR2352887() {
		return ERR2352887;
	}

	public void setERR2352887(double eRR2352887) {
		ERR2352887 = eRR2352887;
	}

	public double getERR2352888() {
		return ERR2352888;
	}

	public void setERR2352888(double eRR2352888) {
		ERR2352888 = eRR2352888;
	}

	public double getERR2352889() {
		return ERR2352889;
	}

	public void setERR2352889(double eRR2352889) {
		ERR2352889 = eRR2352889;
	}

	public double getERR2352890() {
		return ERR2352890;
	}

	public void setERR2352890(double eRR2352890) {
		ERR2352890 = eRR2352890;
	}

	public double getERR2352891() {
		return ERR2352891;
	}

	public void setERR2352891(double eRR2352891) {
		ERR2352891 = eRR2352891;
	}

	public double getERR2353342() {
		return ERR2353342;
	}

	public void setERR2353342(double eRR2353342) {
		ERR2353342 = eRR2353342;
	}

	public double getERR2353343() {
		return ERR2353343;
	}

	public void setERR2353343(double eRR2353343) {
		ERR2353343 = eRR2353343;
	}

	public double getERR2353344() {
		return ERR2353344;
	}

	public void setERR2353344(double eRR2353344) {
		ERR2353344 = eRR2353344;
	}

	public double getERR2353345() {
		return ERR2353345;
	}

	public void setERR2353345(double eRR2353345) {
		ERR2353345 = eRR2353345;
	}

	public double getERR2353346() {
		return ERR2353346;
	}

	public void setERR2353346(double eRR2353346) {
		ERR2353346 = eRR2353346;
	}

	public double getERR2353347() {
		return ERR2353347;
	}

	public void setERR2353347(double eRR2353347) {
		ERR2353347 = eRR2353347;
	}

	public double getERR2353348() {
		return ERR2353348;
	}

	public void setERR2353348(double eRR2353348) {
		ERR2353348 = eRR2353348;
	}

	public double getERR2353349() {
		return ERR2353349;
	}

	public void setERR2353349(double eRR2353349) {
		ERR2353349 = eRR2353349;
	}

	public double getERR2353350() {
		return ERR2353350;
	}

	public void setERR2353350(double eRR2353350) {
		ERR2353350 = eRR2353350;
	}

	public double getERR2353736() {
		return ERR2353736;
	}

	public void setERR2353736(double eRR2353736) {
		ERR2353736 = eRR2353736;
	}

	public double getERR2353737() {
		return ERR2353737;
	}

	public void setERR2353737(double eRR2353737) {
		ERR2353737 = eRR2353737;
	}

	public double getERR2353738() {
		return ERR2353738;
	}

	public void setERR2353738(double eRR2353738) {
		ERR2353738 = eRR2353738;
	}

	public double getERR2353739() {
		return ERR2353739;
	}

	public void setERR2353739(double eRR2353739) {
		ERR2353739 = eRR2353739;
	}

	public double getERR2353740() {
		return ERR2353740;
	}

	public void setERR2353740(double eRR2353740) {
		ERR2353740 = eRR2353740;
	}

	public double getERR2353741() {
		return ERR2353741;
	}

	public void setERR2353741(double eRR2353741) {
		ERR2353741 = eRR2353741;
	}

	public double getERR2353742() {
		return ERR2353742;
	}

	public void setERR2353742(double eRR2353742) {
		ERR2353742 = eRR2353742;
	}

	public double getERR2354193() {
		return ERR2354193;
	}

	public void setERR2354193(double eRR2354193) {
		ERR2354193 = eRR2354193;
	}

	public double getERR2354194() {
		return ERR2354194;
	}

	public void setERR2354194(double eRR2354194) {
		ERR2354194 = eRR2354194;
	}

	public double getERR2354195() {
		return ERR2354195;
	}

	public void setERR2354195(double eRR2354195) {
		ERR2354195 = eRR2354195;
	}

	public double getERR2354196() {
		return ERR2354196;
	}

	public void setERR2354196(double eRR2354196) {
		ERR2354196 = eRR2354196;
	}

	public double getERR2354197() {
		return ERR2354197;
	}

	public void setERR2354197(double eRR2354197) {
		ERR2354197 = eRR2354197;
	}

	public double getERR2354198() {
		return ERR2354198;
	}

	public void setERR2354198(double eRR2354198) {
		ERR2354198 = eRR2354198;
	}

	public double getERR2354199() {
		return ERR2354199;
	}

	public void setERR2354199(double eRR2354199) {
		ERR2354199 = eRR2354199;
	}

	public double getERR2354200() {
		return ERR2354200;
	}

	public void setERR2354200(double eRR2354200) {
		ERR2354200 = eRR2354200;
	}

	public double getERR2354201() {
		return ERR2354201;
	}

	public void setERR2354201(double eRR2354201) {
		ERR2354201 = eRR2354201;
	}

	public double getERR2354589() {
		return ERR2354589;
	}

	public void setERR2354589(double eRR2354589) {
		ERR2354589 = eRR2354589;
	}

	public double getERR2354590() {
		return ERR2354590;
	}

	public void setERR2354590(double eRR2354590) {
		ERR2354590 = eRR2354590;
	}

	public double getERR2354591() {
		return ERR2354591;
	}

	public void setERR2354591(double eRR2354591) {
		ERR2354591 = eRR2354591;
	}

	public double getERR2354592() {
		return ERR2354592;
	}

	public void setERR2354592(double eRR2354592) {
		ERR2354592 = eRR2354592;
	}

	public double getERR2354593() {
		return ERR2354593;
	}

	public void setERR2354593(double eRR2354593) {
		ERR2354593 = eRR2354593;
	}

	public double getERR2354594() {
		return ERR2354594;
	}

	public void setERR2354594(double eRR2354594) {
		ERR2354594 = eRR2354594;
	}

	public double getERR2354595() {
		return ERR2354595;
	}

	public void setERR2354595(double eRR2354595) {
		ERR2354595 = eRR2354595;
	}

	public double getERR2354596() {
		return ERR2354596;
	}

	public void setERR2354596(double eRR2354596) {
		ERR2354596 = eRR2354596;
	}

	public double getERR2354597() {
		return ERR2354597;
	}

	public void setERR2354597(double eRR2354597) {
		ERR2354597 = eRR2354597;
	}

	public double getERR2354830() {
		return ERR2354830;
	}

	public void setERR2354830(double eRR2354830) {
		ERR2354830 = eRR2354830;
	}

	public double getERR2354831() {
		return ERR2354831;
	}

	public void setERR2354831(double eRR2354831) {
		ERR2354831 = eRR2354831;
	}

	public double getERR2354832() {
		return ERR2354832;
	}

	public void setERR2354832(double eRR2354832) {
		ERR2354832 = eRR2354832;
	}

	public double getERR2354833() {
		return ERR2354833;
	}

	public void setERR2354833(double eRR2354833) {
		ERR2354833 = eRR2354833;
	}

	public double getERR2354834() {
		return ERR2354834;
	}

	public void setERR2354834(double eRR2354834) {
		ERR2354834 = eRR2354834;
	}

	public double getERR2354835() {
		return ERR2354835;
	}

	public void setERR2354835(double eRR2354835) {
		ERR2354835 = eRR2354835;
	}

	public double getERR2354836() {
		return ERR2354836;
	}

	public void setERR2354836(double eRR2354836) {
		ERR2354836 = eRR2354836;
	}

	public double getERR2354837() {
		return ERR2354837;
	}

	public void setERR2354837(double eRR2354837) {
		ERR2354837 = eRR2354837;
	}

	public double getERR2354838() {
		return ERR2354838;
	}

	public void setERR2354838(double eRR2354838) {
		ERR2354838 = eRR2354838;
	}

	public double getERR315640() {
		return ERR315640;
	}

	public void setERR315640(double eRR315640) {
		ERR315640 = eRR315640;
	}

	@Override
	public String toString() {
		return "Mesentric_lymph_node [id=" + id + ", geneId=" + geneId + ", ERR2352885=" + ERR2352885 + ", ERR2352886="
				+ ERR2352886 + ", ERR2352887=" + ERR2352887 + ", ERR2352888=" + ERR2352888 + ", ERR2352889="
				+ ERR2352889 + ", ERR2352890=" + ERR2352890 + ", ERR2352891=" + ERR2352891 + ", ERR2353342="
				+ ERR2353342 + ", ERR2353343=" + ERR2353343 + ", ERR2353344=" + ERR2353344 + ", ERR2353345="
				+ ERR2353345 + ", ERR2353346=" + ERR2353346 + ", ERR2353347=" + ERR2353347 + ", ERR2353348="
				+ ERR2353348 + ", ERR2353349=" + ERR2353349 + ", ERR2353350=" + ERR2353350 + ", ERR2353736="
				+ ERR2353736 + ", ERR2353737=" + ERR2353737 + ", ERR2353738=" + ERR2353738 + ", ERR2353739="
				+ ERR2353739 + ", ERR2353740=" + ERR2353740 + ", ERR2353741=" + ERR2353741 + ", ERR2353742="
				+ ERR2353742 + ", ERR2354193=" + ERR2354193 + ", ERR2354194=" + ERR2354194 + ", ERR2354195="
				+ ERR2354195 + ", ERR2354196=" + ERR2354196 + ", ERR2354197=" + ERR2354197 + ", ERR2354198="
				+ ERR2354198 + ", ERR2354199=" + ERR2354199 + ", ERR2354200=" + ERR2354200 + ", ERR2354201="
				+ ERR2354201 + ", ERR2354589=" + ERR2354589 + ", ERR2354590=" + ERR2354590 + ", ERR2354591="
				+ ERR2354591 + ", ERR2354592=" + ERR2354592 + ", ERR2354593=" + ERR2354593 + ", ERR2354594="
				+ ERR2354594 + ", ERR2354595=" + ERR2354595 + ", ERR2354596=" + ERR2354596 + ", ERR2354597="
				+ ERR2354597 + ", ERR2354830=" + ERR2354830 + ", ERR2354831=" + ERR2354831 + ", ERR2354832="
				+ ERR2354832 + ", ERR2354833=" + ERR2354833 + ", ERR2354834=" + ERR2354834 + ", ERR2354835="
				+ ERR2354835 + ", ERR2354836=" + ERR2354836 + ", ERR2354837=" + ERR2354837 + ", ERR2354838="
				+ ERR2354838 + ", ERR315640=" + ERR315640 + "]";
	}
}
