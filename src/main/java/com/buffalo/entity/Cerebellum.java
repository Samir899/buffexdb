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
@Table(name = "cerebellum")
public class Cerebellum {
	 @Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
	 @Column(name="ERR2352782")
	 private double ERR2352782;
	 
	 @Column(name="ERR2352783") 
	 private double ERR2352783;
	 
	 @Column(name="ERR2352784")
	 private double ERR2352784;
	 
	 @Column(name="ERR2352785") 
	 private double ERR2352785;
	 
	 @Column(name="ERR2352786") 
	 private double ERR2352786;
	 
	 @Column(name="ERR2352787") 
	 private double ERR2352787;
	 
	 @Column(name="ERR2352788") 
	 private double ERR2352788;
	 
	 @Column(name="ERR2353132") 
	 private double ERR2353132;
	 
	 @Column(name="ERR2353133")
	 private double ERR2353133;
	 
	 @Column(name="ERR2353134") 
	 private double ERR2353134;
	 
	 @Column(name="ERR2353135") 
	 private double ERR2353135;
	 
	 @Column(name="ERR2353136") 
	 private double ERR2353136;
	 
	 @Column(name="ERR2353137") 
	 private double ERR2353137;
	 
	 @Column(name="ERR2353138") 
	 private double ERR2353138;
	 
	 @Column(name="ERR2353139") 
	 private double ERR2353139;
	 
	 @Column(name="ERR2353140") 
	 private double ERR2353140;
	 
	 @Column(name="ERR2353617") 
	 private double ERR2353617;
	 
	 @Column(name="ERR2353618") 
	 private double ERR2353618;
	 
	 @Column(name="ERR2353619") 
	 private double ERR2353619;
	 
	 @Column(name="ERR2353620") 
	 private double ERR2353620;
	 
	 @Column(name="ERR2353621") 
	 private double ERR2353621;
	 
	 @Column(name="ERR2353622") 
	 private double ERR2353622;
	 
	 @Column(name="ERR2353623") 
	 private double ERR2353623;
	 
	 @Column(name="ERR2354001") 
	 private double ERR2354001;
	 
	 @Column(name="ERR2354002") 
	 private double ERR2354002;
	 
	 @Column(name="ERR2354003") 
	 private double ERR2354003;
	 
	 @Column(name="ERR2354004") 
	 private double ERR2354004;
	 
	 @Column(name="ERR2354005") 
	 private double ERR2354005;
	 
	 @Column(name="ERR2354006") 
	 private double ERR2354006;
	 
	 @Column(name="ERR2354007") 
	 private double ERR2354007;
	 
	 @Column(name="ERR2354008") 
	 private double ERR2354008;
	 
	 @Column(name="ERR2354009") 
	 private double ERR2354009;
	 
	 @Column(name="SRR15721751") 
	 private double SRR15721751;
	 
	 @Column(name="SRR24057953") 
	 private double SRR24057953;
	 
	 @Column(name="SRR24057954") 
	 private double SRR24057954;
	 
	 @Column(name="SRR24057955") 
	 private double SRR24057955;
	 
	 @Column(name="SRR24057956") 
	 private double SRR24057956;
	 
	 public double getERR2352783() {
		return ERR2352783;
	}

	public void setERR2352783(double eRR2352783) {
		ERR2352783 = eRR2352783;
	}

	public double getERR2352784() {
		return ERR2352784;
	}

	public void setERR2352784(double eRR2352784) {
		ERR2352784 = eRR2352784;
	}

	public double getERR2352785() {
		return ERR2352785;
	}

	public void setERR2352785(double eRR2352785) {
		ERR2352785 = eRR2352785;
	}

	public double getERR2352786() {
		return ERR2352786;
	}

	public void setERR2352786(double eRR2352786) {
		ERR2352786 = eRR2352786;
	}

	public double getERR2352787() {
		return ERR2352787;
	}

	public void setERR2352787(double eRR2352787) {
		ERR2352787 = eRR2352787;
	}

	public double getERR2352788() {
		return ERR2352788;
	}

	public void setERR2352788(double eRR2352788) {
		ERR2352788 = eRR2352788;
	}

	public double getERR2353132() {
		return ERR2353132;
	}

	public void setERR2353132(double eRR2353132) {
		ERR2353132 = eRR2353132;
	}

	public double getERR2353133() {
		return ERR2353133;
	}

	public void setERR2353133(double eRR2353133) {
		ERR2353133 = eRR2353133;
	}

	public double getERR2353134() {
		return ERR2353134;
	}

	public void setERR2353134(double eRR2353134) {
		ERR2353134 = eRR2353134;
	}

	public double getERR2353135() {
		return ERR2353135;
	}

	public void setERR2353135(double eRR2353135) {
		ERR2353135 = eRR2353135;
	}

	public double getERR2353136() {
		return ERR2353136;
	}

	public void setERR2353136(double eRR2353136) {
		ERR2353136 = eRR2353136;
	}

	public double getERR2353137() {
		return ERR2353137;
	}

	public void setERR2353137(double eRR2353137) {
		ERR2353137 = eRR2353137;
	}

	public double getERR2353138() {
		return ERR2353138;
	}

	public void setERR2353138(double eRR2353138) {
		ERR2353138 = eRR2353138;
	}

	public double getERR2353139() {
		return ERR2353139;
	}

	public void setERR2353139(double eRR2353139) {
		ERR2353139 = eRR2353139;
	}

	public double getERR2353140() {
		return ERR2353140;
	}

	public void setERR2353140(double eRR2353140) {
		ERR2353140 = eRR2353140;
	}

	public double getERR2353617() {
		return ERR2353617;
	}

	public void setERR2353617(double eRR2353617) {
		ERR2353617 = eRR2353617;
	}

	public double getERR2353618() {
		return ERR2353618;
	}

	public void setERR2353618(double eRR2353618) {
		ERR2353618 = eRR2353618;
	}

	public double getERR2353619() {
		return ERR2353619;
	}

	public void setERR2353619(double eRR2353619) {
		ERR2353619 = eRR2353619;
	}

	public double getERR2353620() {
		return ERR2353620;
	}

	public void setERR2353620(double eRR2353620) {
		ERR2353620 = eRR2353620;
	}

	public double getERR2353621() {
		return ERR2353621;
	}

	public void setERR2353621(double eRR2353621) {
		ERR2353621 = eRR2353621;
	}

	public double getERR2353622() {
		return ERR2353622;
	}

	public void setERR2353622(double eRR2353622) {
		ERR2353622 = eRR2353622;
	}

	public double getERR2353623() {
		return ERR2353623;
	}

	public void setERR2353623(double eRR2353623) {
		ERR2353623 = eRR2353623;
	}

	public double getERR2354001() {
		return ERR2354001;
	}

	public void setERR2354001(double eRR2354001) {
		ERR2354001 = eRR2354001;
	}

	public double getERR2354002() {
		return ERR2354002;
	}

	public void setERR2354002(double eRR2354002) {
		ERR2354002 = eRR2354002;
	}

	public double getERR2354003() {
		return ERR2354003;
	}

	public void setERR2354003(double eRR2354003) {
		ERR2354003 = eRR2354003;
	}

	public double getERR2354004() {
		return ERR2354004;
	}

	public void setERR2354004(double eRR2354004) {
		ERR2354004 = eRR2354004;
	}

	public double getERR2354005() {
		return ERR2354005;
	}

	public void setERR2354005(double eRR2354005) {
		ERR2354005 = eRR2354005;
	}

	public double getERR2354006() {
		return ERR2354006;
	}

	public void setERR2354006(double eRR2354006) {
		ERR2354006 = eRR2354006;
	}

	public double getERR2354007() {
		return ERR2354007;
	}

	public void setERR2354007(double eRR2354007) {
		ERR2354007 = eRR2354007;
	}

	public double getERR2354008() {
		return ERR2354008;
	}

	public void setERR2354008(double eRR2354008) {
		ERR2354008 = eRR2354008;
	}

	public double getERR2354009() {
		return ERR2354009;
	}

	public void setERR2354009(double eRR2354009) {
		ERR2354009 = eRR2354009;
	}

	public double getSRR15721751() {
		return SRR15721751;
	}

	public void setSRR15721751(double sRR15721751) {
		SRR15721751 = sRR15721751;
	}

	public double getSRR24057953() {
		return SRR24057953;
	}

	public void setSRR24057953(double sRR24057953) {
		SRR24057953 = sRR24057953;
	}

	public double getSRR24057954() {
		return SRR24057954;
	}

	public void setSRR24057954(double sRR24057954) {
		SRR24057954 = sRR24057954;
	}

	public double getSRR24057955() {
		return SRR24057955;
	}

	public void setSRR24057955(double sRR24057955) {
		SRR24057955 = sRR24057955;
	}

	public double getSRR24057956() {
		return SRR24057956;
	}

	public void setSRR24057956(double sRR24057956) {
		SRR24057956 = sRR24057956;
	}

	

	public Cerebellum() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cerebellum(int id, Genes gene, double eRR2352782, double eRR2352783, double eRR2352784, double eRR2352785, double eRR2352786, double eRR2352787, double eRR2352788, double eRR2353132, double eRR2353133, double eRR2353134, double eRR2353135, double eRR2353136, double eRR2353137, double eRR2353138, double eRR2353139, double eRR2353140, double eRR2353617, double eRR2353618, double eRR2353619, double eRR2353620, double eRR2353621, double eRR2353622, double eRR2353623, double eRR2354001, double eRR2354002, double eRR2354003, double eRR2354004, double eRR2354005, double eRR2354006, double	eRR2354007, double eRR2354008, double eRR2354009, double sRR15721751, double sRR24057953, double sRR24057954, double sRR24057955, double sRR24057956) {
		super();
		this.id = id;
		this.gene = gene;
		ERR2352782 = eRR2352782;
		ERR2352783 = eRR2352783;
		ERR2352784 = eRR2352784;
		ERR2352785 = eRR2352785;
		ERR2352786 = eRR2352786;
		ERR2352787 = eRR2352787;
		ERR2352788 = eRR2352788;
		ERR2353132 = eRR2353132;
		ERR2353133 = eRR2353133;
		ERR2353134 = eRR2353134;
		ERR2353135 = eRR2353135;
		ERR2353136 = eRR2353136;
		ERR2353137 = eRR2353137;
		ERR2353138 = eRR2353138;
		ERR2353139 = eRR2353139;
		ERR2353140 = eRR2353140;
		ERR2353617 = eRR2353617;
		ERR2353618 = eRR2353618;
		ERR2353619 = eRR2353619;
		ERR2353620 = eRR2353620;
		ERR2353621 = eRR2353621;
		ERR2353622 = eRR2353622;
		ERR2353623 = eRR2353623;
		ERR2354001 = eRR2354001;
		ERR2354002 = eRR2354002;
		ERR2354003 = eRR2354003;
		ERR2354004 = eRR2354004;
		ERR2354005 = eRR2354005;
		ERR2354006 = eRR2354006;
		ERR2354007 = eRR2354007;
		ERR2354008 = eRR2354008;
		ERR2354009 = eRR2354009;
		SRR15721751 = sRR15721751;
		SRR24057953 = sRR24057953;
		SRR24057954 = sRR24057954;
		SRR24057955 = sRR24057955;
		SRR24057956 = sRR24057956;
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

	public double getERR2352782() {
		return ERR2352782;
	}

	public void setERR2352782(double eRR2352782) {
		ERR2352782 = eRR2352782;
	}

	@Override
	public String toString() {
		return "Cerebellum [id=" + id + ", gene=" + gene + ", ERR2352782=" + ERR2352782 + "]";
	}
	 
}
