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
@Table(name = "peyer_patch")
public class Peyer_patch {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
	 @Column(name="ERR2352915")
	 private double ERR2352915;

	@Column(name="ERR2352916")
	 private double ERR2352916;

	@Column(name="ERR2352917")
	 private double ERR2352917;

	@Column(name="ERR2352918")
	 private double ERR2352918;

	@Column(name="ERR2352919")
	 private double ERR2352919;

	@Column(name="ERR2352920")
	 private double ERR2352920;

	@Column(name="ERR2352921")
	 private double ERR2352921;

	@Column(name="ERR2353424")
	 private double ERR2353424;

	@Column(name="ERR2353425")
	 private double ERR2353425;

	@Column(name="ERR2353426")
	 private double ERR2353426;

	@Column(name="ERR2353427")
	 private double ERR2353427;

	@Column(name="ERR2353428")
	 private double ERR2353428;

	@Column(name="ERR2353429")
	 private double ERR2353429;

	@Column(name="ERR2353430")
	 private double ERR2353430;

	@Column(name="ERR2353431")
	 private double ERR2353431;

	@Column(name="ERR2353432")
	 private double ERR2353432;

	@Column(name="ERR2353757")
	 private double ERR2353757;

	@Column(name="ERR2353758")
	 private double ERR2353758;

	@Column(name="ERR2353759")
	 private double ERR2353759;

	@Column(name="ERR2353760")
	 private double ERR2353760;

	@Column(name="ERR2353761")
	 private double ERR2353761;

	@Column(name="ERR2353762")
	 private double ERR2353762;

	@Column(name="ERR2353763")
	 private double ERR2353763;

	@Column(name="ERR2354252")
	 private double ERR2354252;

	@Column(name="ERR2354253")
	 private double ERR2354253;

	@Column(name="ERR2354254")
	 private double ERR2354254;

	@Column(name="ERR2354255")
	 private double ERR2354255;

	@Column(name="ERR2354256")
	 private double ERR2354256;

	@Column(name="ERR2354257")
	 private double ERR2354257;

	@Column(name="ERR2354258")
	 private double ERR2354258;

	@Column(name="ERR2354259")
	 private double ERR2354259;

	@Column(name="ERR2354260")
	 private double ERR2354260;

	public Peyer_patch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Peyer_patch(int id, Genes gene, double eRR2352915, double eRR2352916, double eRR2352917, double eRR2352918,
			double eRR2352919, double eRR2352920, double eRR2352921, double eRR2353424, double eRR2353425,
			double eRR2353426, double eRR2353427, double eRR2353428, double eRR2353429, double eRR2353430,
			double eRR2353431, double eRR2353432, double eRR2353757, double eRR2353758, double eRR2353759,
			double eRR2353760, double eRR2353761, double eRR2353762, double eRR2353763, double eRR2354252,
			double eRR2354253, double eRR2354254, double eRR2354255, double eRR2354256, double eRR2354257,
			double eRR2354258, double eRR2354259, double eRR2354260) {
		super();
		this.id = id;
		this.gene = gene;
		ERR2352915 = eRR2352915;
		ERR2352916 = eRR2352916;
		ERR2352917 = eRR2352917;
		ERR2352918 = eRR2352918;
		ERR2352919 = eRR2352919;
		ERR2352920 = eRR2352920;
		ERR2352921 = eRR2352921;
		ERR2353424 = eRR2353424;
		ERR2353425 = eRR2353425;
		ERR2353426 = eRR2353426;
		ERR2353427 = eRR2353427;
		ERR2353428 = eRR2353428;
		ERR2353429 = eRR2353429;
		ERR2353430 = eRR2353430;
		ERR2353431 = eRR2353431;
		ERR2353432 = eRR2353432;
		ERR2353757 = eRR2353757;
		ERR2353758 = eRR2353758;
		ERR2353759 = eRR2353759;
		ERR2353760 = eRR2353760;
		ERR2353761 = eRR2353761;
		ERR2353762 = eRR2353762;
		ERR2353763 = eRR2353763;
		ERR2354252 = eRR2354252;
		ERR2354253 = eRR2354253;
		ERR2354254 = eRR2354254;
		ERR2354255 = eRR2354255;
		ERR2354256 = eRR2354256;
		ERR2354257 = eRR2354257;
		ERR2354258 = eRR2354258;
		ERR2354259 = eRR2354259;
		ERR2354260 = eRR2354260;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Genes getGene() {
		return gene;
	}

	public void setGene(Genes gene) {
		this.gene = gene;
	}

	public double getERR2352915() {
		return ERR2352915;
	}

	public void setERR2352915(double eRR2352915) {
		ERR2352915 = eRR2352915;
	}

	public double getERR2352916() {
		return ERR2352916;
	}

	public void setERR2352916(double eRR2352916) {
		ERR2352916 = eRR2352916;
	}

	public double getERR2352917() {
		return ERR2352917;
	}

	public void setERR2352917(double eRR2352917) {
		ERR2352917 = eRR2352917;
	}

	public double getERR2352918() {
		return ERR2352918;
	}

	public void setERR2352918(double eRR2352918) {
		ERR2352918 = eRR2352918;
	}

	public double getERR2352919() {
		return ERR2352919;
	}

	public void setERR2352919(double eRR2352919) {
		ERR2352919 = eRR2352919;
	}

	public double getERR2352920() {
		return ERR2352920;
	}

	public void setERR2352920(double eRR2352920) {
		ERR2352920 = eRR2352920;
	}

	public double getERR2352921() {
		return ERR2352921;
	}

	public void setERR2352921(double eRR2352921) {
		ERR2352921 = eRR2352921;
	}

	public double getERR2353424() {
		return ERR2353424;
	}

	public void setERR2353424(double eRR2353424) {
		ERR2353424 = eRR2353424;
	}

	public double getERR2353425() {
		return ERR2353425;
	}

	public void setERR2353425(double eRR2353425) {
		ERR2353425 = eRR2353425;
	}

	public double getERR2353426() {
		return ERR2353426;
	}

	public void setERR2353426(double eRR2353426) {
		ERR2353426 = eRR2353426;
	}

	public double getERR2353427() {
		return ERR2353427;
	}

	public void setERR2353427(double eRR2353427) {
		ERR2353427 = eRR2353427;
	}

	public double getERR2353428() {
		return ERR2353428;
	}

	public void setERR2353428(double eRR2353428) {
		ERR2353428 = eRR2353428;
	}

	public double getERR2353429() {
		return ERR2353429;
	}

	public void setERR2353429(double eRR2353429) {
		ERR2353429 = eRR2353429;
	}

	public double getERR2353430() {
		return ERR2353430;
	}

	public void setERR2353430(double eRR2353430) {
		ERR2353430 = eRR2353430;
	}

	public double getERR2353431() {
		return ERR2353431;
	}

	public void setERR2353431(double eRR2353431) {
		ERR2353431 = eRR2353431;
	}

	public double getERR2353432() {
		return ERR2353432;
	}

	public void setERR2353432(double eRR2353432) {
		ERR2353432 = eRR2353432;
	}

	public double getERR2353757() {
		return ERR2353757;
	}

	public void setERR2353757(double eRR2353757) {
		ERR2353757 = eRR2353757;
	}

	public double getERR2353758() {
		return ERR2353758;
	}

	public void setERR2353758(double eRR2353758) {
		ERR2353758 = eRR2353758;
	}

	public double getERR2353759() {
		return ERR2353759;
	}

	public void setERR2353759(double eRR2353759) {
		ERR2353759 = eRR2353759;
	}

	public double getERR2353760() {
		return ERR2353760;
	}

	public void setERR2353760(double eRR2353760) {
		ERR2353760 = eRR2353760;
	}

	public double getERR2353761() {
		return ERR2353761;
	}

	public void setERR2353761(double eRR2353761) {
		ERR2353761 = eRR2353761;
	}

	public double getERR2353762() {
		return ERR2353762;
	}

	public void setERR2353762(double eRR2353762) {
		ERR2353762 = eRR2353762;
	}

	public double getERR2353763() {
		return ERR2353763;
	}

	public void setERR2353763(double eRR2353763) {
		ERR2353763 = eRR2353763;
	}

	public double getERR2354252() {
		return ERR2354252;
	}

	public void setERR2354252(double eRR2354252) {
		ERR2354252 = eRR2354252;
	}

	public double getERR2354253() {
		return ERR2354253;
	}

	public void setERR2354253(double eRR2354253) {
		ERR2354253 = eRR2354253;
	}

	public double getERR2354254() {
		return ERR2354254;
	}

	public void setERR2354254(double eRR2354254) {
		ERR2354254 = eRR2354254;
	}

	public double getERR2354255() {
		return ERR2354255;
	}

	public void setERR2354255(double eRR2354255) {
		ERR2354255 = eRR2354255;
	}

	public double getERR2354256() {
		return ERR2354256;
	}

	public void setERR2354256(double eRR2354256) {
		ERR2354256 = eRR2354256;
	}

	public double getERR2354257() {
		return ERR2354257;
	}

	public void setERR2354257(double eRR2354257) {
		ERR2354257 = eRR2354257;
	}

	public double getERR2354258() {
		return ERR2354258;
	}

	public void setERR2354258(double eRR2354258) {
		ERR2354258 = eRR2354258;
	}

	public double getERR2354259() {
		return ERR2354259;
	}

	public void setERR2354259(double eRR2354259) {
		ERR2354259 = eRR2354259;
	}

	public double getERR2354260() {
		return ERR2354260;
	}

	public void setERR2354260(double eRR2354260) {
		ERR2354260 = eRR2354260;
	}

	@Override
	public String toString() {
		return "Peyer_patch [id=" + id + ", gene=" + gene + ", ERR2352915=" + ERR2352915 + ", ERR2352916=" + ERR2352916
				+ ", ERR2352917=" + ERR2352917 + ", ERR2352918=" + ERR2352918 + ", ERR2352919=" + ERR2352919
				+ ", ERR2352920=" + ERR2352920 + ", ERR2352921=" + ERR2352921 + ", ERR2353424=" + ERR2353424
				+ ", ERR2353425=" + ERR2353425 + ", ERR2353426=" + ERR2353426 + ", ERR2353427=" + ERR2353427
				+ ", ERR2353428=" + ERR2353428 + ", ERR2353429=" + ERR2353429 + ", ERR2353430=" + ERR2353430
				+ ", ERR2353431=" + ERR2353431 + ", ERR2353432=" + ERR2353432 + ", ERR2353757=" + ERR2353757
				+ ", ERR2353758=" + ERR2353758 + ", ERR2353759=" + ERR2353759 + ", ERR2353760=" + ERR2353760
				+ ", ERR2353761=" + ERR2353761 + ", ERR2353762=" + ERR2353762 + ", ERR2353763=" + ERR2353763
				+ ", ERR2354252=" + ERR2354252 + ", ERR2354253=" + ERR2354253 + ", ERR2354254=" + ERR2354254
				+ ", ERR2354255=" + ERR2354255 + ", ERR2354256=" + ERR2354256 + ", ERR2354257=" + ERR2354257
				+ ", ERR2354258=" + ERR2354258 + ", ERR2354259=" + ERR2354259 + ", ERR2354260=" + ERR2354260 + "]";
	}
}
