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
@Table(name = "pancreas")
public class Pancreas {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="ERR2352908")
	 private double ERR2352908;

	@Column(name="ERR2352909")
	 private double ERR2352909;

	@Column(name="ERR2352910")
	 private double ERR2352910;

	@Column(name="ERR2352911")
	 private double ERR2352911;

	@Column(name="ERR2352912")
	 private double ERR2352912;

	@Column(name="ERR2352913")
	 private double ERR2352913;

	@Column(name="ERR2352914")
	 private double ERR2352914;

	@Column(name="ERR2353406")
	 private double ERR2353406;

	@Column(name="ERR2353407")
	 private double ERR2353407;

	@Column(name="ERR2353408")
	 private double ERR2353408;

	@Column(name="ERR2353409")
	 private double ERR2353409;

	@Column(name="ERR2353410")
	 private double ERR2353410;

	@Column(name="ERR2353411")
	 private double ERR2353411;

	@Column(name="ERR2353412")
	 private double ERR2353412;

	@Column(name="ERR2353413")
	 private double ERR2353413;

	@Column(name="ERR2353414")
	 private double ERR2353414;

	@Column(name="ERR2353750")
	 private double ERR2353750;

	@Column(name="ERR2353751")
	 private double ERR2353751;

	@Column(name="ERR2353752")
	 private double ERR2353752;

	@Column(name="ERR2353753")
	 private double ERR2353753;

	@Column(name="ERR2353754")
	 private double ERR2353754;

	@Column(name="ERR2353755")
	 private double ERR2353755;

	@Column(name="ERR2353756")
	 private double ERR2353756;

	@Column(name="ERR2354234")
	 private double ERR2354234;

	@Column(name="ERR2354235")
	 private double ERR2354235;

	@Column(name="ERR2354236")
	 private double ERR2354236;

	@Column(name="ERR2354237")
	 private double ERR2354237;

	@Column(name="ERR2354238")
	 private double ERR2354238;

	@Column(name="ERR2354239")
	 private double ERR2354239;

	@Column(name="ERR2354240")
	 private double ERR2354240;

	@Column(name="ERR2354241")
	 private double ERR2354241;

	@Column(name="ERR2354242")
	 private double ERR2354242;

	public Pancreas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pancreas(int id, String geneId, double eRR2352908, double eRR2352909, double eRR2352910, double eRR2352911,
			double eRR2352912, double eRR2352913, double eRR2352914, double eRR2353406, double eRR2353407,
			double eRR2353408, double eRR2353409, double eRR2353410, double eRR2353411, double eRR2353412,
			double eRR2353413, double eRR2353414, double eRR2353750, double eRR2353751, double eRR2353752,
			double eRR2353753, double eRR2353754, double eRR2353755, double eRR2353756, double eRR2354234,
			double eRR2354235, double eRR2354236, double eRR2354237, double eRR2354238, double eRR2354239,
			double eRR2354240, double eRR2354241, double eRR2354242) {
		super();
		this.id = id;
		this.geneId = geneId;
		ERR2352908 = eRR2352908;
		ERR2352909 = eRR2352909;
		ERR2352910 = eRR2352910;
		ERR2352911 = eRR2352911;
		ERR2352912 = eRR2352912;
		ERR2352913 = eRR2352913;
		ERR2352914 = eRR2352914;
		ERR2353406 = eRR2353406;
		ERR2353407 = eRR2353407;
		ERR2353408 = eRR2353408;
		ERR2353409 = eRR2353409;
		ERR2353410 = eRR2353410;
		ERR2353411 = eRR2353411;
		ERR2353412 = eRR2353412;
		ERR2353413 = eRR2353413;
		ERR2353414 = eRR2353414;
		ERR2353750 = eRR2353750;
		ERR2353751 = eRR2353751;
		ERR2353752 = eRR2353752;
		ERR2353753 = eRR2353753;
		ERR2353754 = eRR2353754;
		ERR2353755 = eRR2353755;
		ERR2353756 = eRR2353756;
		ERR2354234 = eRR2354234;
		ERR2354235 = eRR2354235;
		ERR2354236 = eRR2354236;
		ERR2354237 = eRR2354237;
		ERR2354238 = eRR2354238;
		ERR2354239 = eRR2354239;
		ERR2354240 = eRR2354240;
		ERR2354241 = eRR2354241;
		ERR2354242 = eRR2354242;
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

	public double getERR2352908() {
		return ERR2352908;
	}

	public void setERR2352908(double eRR2352908) {
		ERR2352908 = eRR2352908;
	}

	public double getERR2352909() {
		return ERR2352909;
	}

	public void setERR2352909(double eRR2352909) {
		ERR2352909 = eRR2352909;
	}

	public double getERR2352910() {
		return ERR2352910;
	}

	public void setERR2352910(double eRR2352910) {
		ERR2352910 = eRR2352910;
	}

	public double getERR2352911() {
		return ERR2352911;
	}

	public void setERR2352911(double eRR2352911) {
		ERR2352911 = eRR2352911;
	}

	public double getERR2352912() {
		return ERR2352912;
	}

	public void setERR2352912(double eRR2352912) {
		ERR2352912 = eRR2352912;
	}

	public double getERR2352913() {
		return ERR2352913;
	}

	public void setERR2352913(double eRR2352913) {
		ERR2352913 = eRR2352913;
	}

	public double getERR2352914() {
		return ERR2352914;
	}

	public void setERR2352914(double eRR2352914) {
		ERR2352914 = eRR2352914;
	}

	public double getERR2353406() {
		return ERR2353406;
	}

	public void setERR2353406(double eRR2353406) {
		ERR2353406 = eRR2353406;
	}

	public double getERR2353407() {
		return ERR2353407;
	}

	public void setERR2353407(double eRR2353407) {
		ERR2353407 = eRR2353407;
	}

	public double getERR2353408() {
		return ERR2353408;
	}

	public void setERR2353408(double eRR2353408) {
		ERR2353408 = eRR2353408;
	}

	public double getERR2353409() {
		return ERR2353409;
	}

	public void setERR2353409(double eRR2353409) {
		ERR2353409 = eRR2353409;
	}

	public double getERR2353410() {
		return ERR2353410;
	}

	public void setERR2353410(double eRR2353410) {
		ERR2353410 = eRR2353410;
	}

	public double getERR2353411() {
		return ERR2353411;
	}

	public void setERR2353411(double eRR2353411) {
		ERR2353411 = eRR2353411;
	}

	public double getERR2353412() {
		return ERR2353412;
	}

	public void setERR2353412(double eRR2353412) {
		ERR2353412 = eRR2353412;
	}

	public double getERR2353413() {
		return ERR2353413;
	}

	public void setERR2353413(double eRR2353413) {
		ERR2353413 = eRR2353413;
	}

	public double getERR2353414() {
		return ERR2353414;
	}

	public void setERR2353414(double eRR2353414) {
		ERR2353414 = eRR2353414;
	}

	public double getERR2353750() {
		return ERR2353750;
	}

	public void setERR2353750(double eRR2353750) {
		ERR2353750 = eRR2353750;
	}

	public double getERR2353751() {
		return ERR2353751;
	}

	public void setERR2353751(double eRR2353751) {
		ERR2353751 = eRR2353751;
	}

	public double getERR2353752() {
		return ERR2353752;
	}

	public void setERR2353752(double eRR2353752) {
		ERR2353752 = eRR2353752;
	}

	public double getERR2353753() {
		return ERR2353753;
	}

	public void setERR2353753(double eRR2353753) {
		ERR2353753 = eRR2353753;
	}

	public double getERR2353754() {
		return ERR2353754;
	}

	public void setERR2353754(double eRR2353754) {
		ERR2353754 = eRR2353754;
	}

	public double getERR2353755() {
		return ERR2353755;
	}

	public void setERR2353755(double eRR2353755) {
		ERR2353755 = eRR2353755;
	}

	public double getERR2353756() {
		return ERR2353756;
	}

	public void setERR2353756(double eRR2353756) {
		ERR2353756 = eRR2353756;
	}

	public double getERR2354234() {
		return ERR2354234;
	}

	public void setERR2354234(double eRR2354234) {
		ERR2354234 = eRR2354234;
	}

	public double getERR2354235() {
		return ERR2354235;
	}

	public void setERR2354235(double eRR2354235) {
		ERR2354235 = eRR2354235;
	}

	public double getERR2354236() {
		return ERR2354236;
	}

	public void setERR2354236(double eRR2354236) {
		ERR2354236 = eRR2354236;
	}

	public double getERR2354237() {
		return ERR2354237;
	}

	public void setERR2354237(double eRR2354237) {
		ERR2354237 = eRR2354237;
	}

	public double getERR2354238() {
		return ERR2354238;
	}

	public void setERR2354238(double eRR2354238) {
		ERR2354238 = eRR2354238;
	}

	public double getERR2354239() {
		return ERR2354239;
	}

	public void setERR2354239(double eRR2354239) {
		ERR2354239 = eRR2354239;
	}

	public double getERR2354240() {
		return ERR2354240;
	}

	public void setERR2354240(double eRR2354240) {
		ERR2354240 = eRR2354240;
	}

	public double getERR2354241() {
		return ERR2354241;
	}

	public void setERR2354241(double eRR2354241) {
		ERR2354241 = eRR2354241;
	}

	public double getERR2354242() {
		return ERR2354242;
	}

	public void setERR2354242(double eRR2354242) {
		ERR2354242 = eRR2354242;
	}

	@Override
	public String toString() {
		return "Pancreas [id=" + id + ", geneId=" + geneId + ", ERR2352908=" + ERR2352908 + ", ERR2352909=" + ERR2352909
				+ ", ERR2352910=" + ERR2352910 + ", ERR2352911=" + ERR2352911 + ", ERR2352912=" + ERR2352912
				+ ", ERR2352913=" + ERR2352913 + ", ERR2352914=" + ERR2352914 + ", ERR2353406=" + ERR2353406
				+ ", ERR2353407=" + ERR2353407 + ", ERR2353408=" + ERR2353408 + ", ERR2353409=" + ERR2353409
				+ ", ERR2353410=" + ERR2353410 + ", ERR2353411=" + ERR2353411 + ", ERR2353412=" + ERR2353412
				+ ", ERR2353413=" + ERR2353413 + ", ERR2353414=" + ERR2353414 + ", ERR2353750=" + ERR2353750
				+ ", ERR2353751=" + ERR2353751 + ", ERR2353752=" + ERR2353752 + ", ERR2353753=" + ERR2353753
				+ ", ERR2353754=" + ERR2353754 + ", ERR2353755=" + ERR2353755 + ", ERR2353756=" + ERR2353756
				+ ", ERR2354234=" + ERR2354234 + ", ERR2354235=" + ERR2354235 + ", ERR2354236=" + ERR2354236
				+ ", ERR2354237=" + ERR2354237 + ", ERR2354238=" + ERR2354238 + ", ERR2354239=" + ERR2354239
				+ ", ERR2354240=" + ERR2354240 + ", ERR2354241=" + ERR2354241 + ", ERR2354242=" + ERR2354242 + "]";
	}

}
