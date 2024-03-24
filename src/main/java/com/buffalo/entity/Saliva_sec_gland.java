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
@Table(name = "saliva_sec_gland")
public class Saliva_sec_gland {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
	 @Column(name="ERR2352729")
	 private double ERR2352729;

	 @Column(name="ERR2352730")
	 private double ERR2352730;

	 @Column(name="ERR2352731")
	 private double ERR2352731;

	 @Column(name="ERR2352732")
	 private double ERR2352732;

	 @Column(name="ERR2352733")
	 private double ERR2352733;

	 @Column(name="ERR2352734")
	 private double ERR2352734;

	 @Column(name="ERR2352735")
	 private double ERR2352735;

	 @Column(name="ERR2352736")
	 private double ERR2352736;

	 @Column(name="ERR2352737")
	 private double ERR2352737;

	 @Column(name="ERR2352980")
	 private double ERR2352980;

	 @Column(name="ERR2352981")
	 private double ERR2352981;

	 @Column(name="ERR2352982")
	 private double ERR2352982;

	 @Column(name="ERR2352983")
	 private double ERR2352983;

	 @Column(name="ERR2352984")
	 private double ERR2352984;

	 @Column(name="ERR2352985")
	 private double ERR2352985;

	 @Column(name="ERR2352986")
	 private double ERR2352986;

	 @Column(name="ERR2353519")
	 private double ERR2353519;

	 @Column(name="ERR2353520")
	 private double ERR2353520;

	 @Column(name="ERR2353521")
	 private double ERR2353521;

	 @Column(name="ERR2353522")
	 private double ERR2353522;

	 @Column(name="ERR2353523")
	 private double ERR2353523;

	 @Column(name="ERR2353524")
	 private double ERR2353524;

	 @Column(name="ERR2353525")
	 private double ERR2353525;

	 @Column(name="ERR2353526")
	 private double ERR2353526;

	 @Column(name="ERR2353527")
	 private double ERR2353527;

	 @Column(name="ERR2353822")
	 private double ERR2353822;

	 @Column(name="ERR2353823")
	 private double ERR2353823;

	 @Column(name="ERR2353824")
	 private double ERR2353824;

	 @Column(name="ERR2353825")
	 private double ERR2353825;

	 @Column(name="ERR2353826")
	 private double ERR2353826;

	 @Column(name="ERR2353827")
	 private double ERR2353827;

	 @Column(name="ERR2353828")
	 private double ERR2353828;

	 @Column(name="ERR2354338")
	 private double ERR2354338;

	 @Column(name="ERR2354339")
	 private double ERR2354339;

	 @Column(name="ERR2354340")
	 private double ERR2354340;

	 @Column(name="ERR2354341")
	 private double ERR2354341;

	 @Column(name="ERR2354342")
	 private double ERR2354342;

	 @Column(name="ERR2354343")
	 private double ERR2354343;

	 @Column(name="ERR2354344")
	 private double ERR2354344;

	 @Column(name="ERR2354345")
	 private double ERR2354345;

	 @Column(name="ERR2354346")
	 private double ERR2354346;

	 @Column(name="ERR2355058")
	 private double ERR2355058;

	 @Column(name="ERR2355059")
	 private double ERR2355059;

	 @Column(name="ERR2355060")
	 private double ERR2355060;

	 @Column(name="ERR2355061")
	 private double ERR2355061;

	 @Column(name="ERR2355062")
	 private double ERR2355062;

	 @Column(name="ERR2355063")
	 private double ERR2355063;

	 @Column(name="ERR2355064")
	 private double ERR2355064;

	 @Column(name="ERR2355065")
	 private double ERR2355065;

	 @Column(name="ERR2355066")
	 private double ERR2355066;

	public Saliva_sec_gland() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Saliva_sec_gland(int id, Genes gene, double eRR2352729, double eRR2352730, double eRR2352731,
			double eRR2352732, double eRR2352733, double eRR2352734, double eRR2352735, double eRR2352736,
			double eRR2352737, double eRR2352980, double eRR2352981, double eRR2352982, double eRR2352983,
			double eRR2352984, double eRR2352985, double eRR2352986, double eRR2353519, double eRR2353520,
			double eRR2353521, double eRR2353522, double eRR2353523, double eRR2353524, double eRR2353525,
			double eRR2353526, double eRR2353527, double eRR2353822, double eRR2353823, double eRR2353824,
			double eRR2353825, double eRR2353826, double eRR2353827, double eRR2353828, double eRR2354338,
			double eRR2354339, double eRR2354340, double eRR2354341, double eRR2354342, double eRR2354343,
			double eRR2354344, double eRR2354345, double eRR2354346, double eRR2355058, double eRR2355059,
			double eRR2355060, double eRR2355061, double eRR2355062, double eRR2355063, double eRR2355064,
			double eRR2355065, double eRR2355066) {
		super();
		this.id = id;
		this.gene = gene;
		ERR2352729 = eRR2352729;
		ERR2352730 = eRR2352730;
		ERR2352731 = eRR2352731;
		ERR2352732 = eRR2352732;
		ERR2352733 = eRR2352733;
		ERR2352734 = eRR2352734;
		ERR2352735 = eRR2352735;
		ERR2352736 = eRR2352736;
		ERR2352737 = eRR2352737;
		ERR2352980 = eRR2352980;
		ERR2352981 = eRR2352981;
		ERR2352982 = eRR2352982;
		ERR2352983 = eRR2352983;
		ERR2352984 = eRR2352984;
		ERR2352985 = eRR2352985;
		ERR2352986 = eRR2352986;
		ERR2353519 = eRR2353519;
		ERR2353520 = eRR2353520;
		ERR2353521 = eRR2353521;
		ERR2353522 = eRR2353522;
		ERR2353523 = eRR2353523;
		ERR2353524 = eRR2353524;
		ERR2353525 = eRR2353525;
		ERR2353526 = eRR2353526;
		ERR2353527 = eRR2353527;
		ERR2353822 = eRR2353822;
		ERR2353823 = eRR2353823;
		ERR2353824 = eRR2353824;
		ERR2353825 = eRR2353825;
		ERR2353826 = eRR2353826;
		ERR2353827 = eRR2353827;
		ERR2353828 = eRR2353828;
		ERR2354338 = eRR2354338;
		ERR2354339 = eRR2354339;
		ERR2354340 = eRR2354340;
		ERR2354341 = eRR2354341;
		ERR2354342 = eRR2354342;
		ERR2354343 = eRR2354343;
		ERR2354344 = eRR2354344;
		ERR2354345 = eRR2354345;
		ERR2354346 = eRR2354346;
		ERR2355058 = eRR2355058;
		ERR2355059 = eRR2355059;
		ERR2355060 = eRR2355060;
		ERR2355061 = eRR2355061;
		ERR2355062 = eRR2355062;
		ERR2355063 = eRR2355063;
		ERR2355064 = eRR2355064;
		ERR2355065 = eRR2355065;
		ERR2355066 = eRR2355066;
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

	public double getERR2352729() {
		return ERR2352729;
	}

	public void setERR2352729(double eRR2352729) {
		ERR2352729 = eRR2352729;
	}

	public double getERR2352730() {
		return ERR2352730;
	}

	public void setERR2352730(double eRR2352730) {
		ERR2352730 = eRR2352730;
	}

	public double getERR2352731() {
		return ERR2352731;
	}

	public void setERR2352731(double eRR2352731) {
		ERR2352731 = eRR2352731;
	}

	public double getERR2352732() {
		return ERR2352732;
	}

	public void setERR2352732(double eRR2352732) {
		ERR2352732 = eRR2352732;
	}

	public double getERR2352733() {
		return ERR2352733;
	}

	public void setERR2352733(double eRR2352733) {
		ERR2352733 = eRR2352733;
	}

	public double getERR2352734() {
		return ERR2352734;
	}

	public void setERR2352734(double eRR2352734) {
		ERR2352734 = eRR2352734;
	}

	public double getERR2352735() {
		return ERR2352735;
	}

	public void setERR2352735(double eRR2352735) {
		ERR2352735 = eRR2352735;
	}

	public double getERR2352736() {
		return ERR2352736;
	}

	public void setERR2352736(double eRR2352736) {
		ERR2352736 = eRR2352736;
	}

	public double getERR2352737() {
		return ERR2352737;
	}

	public void setERR2352737(double eRR2352737) {
		ERR2352737 = eRR2352737;
	}

	public double getERR2352980() {
		return ERR2352980;
	}

	public void setERR2352980(double eRR2352980) {
		ERR2352980 = eRR2352980;
	}

	public double getERR2352981() {
		return ERR2352981;
	}

	public void setERR2352981(double eRR2352981) {
		ERR2352981 = eRR2352981;
	}

	public double getERR2352982() {
		return ERR2352982;
	}

	public void setERR2352982(double eRR2352982) {
		ERR2352982 = eRR2352982;
	}

	public double getERR2352983() {
		return ERR2352983;
	}

	public void setERR2352983(double eRR2352983) {
		ERR2352983 = eRR2352983;
	}

	public double getERR2352984() {
		return ERR2352984;
	}

	public void setERR2352984(double eRR2352984) {
		ERR2352984 = eRR2352984;
	}

	public double getERR2352985() {
		return ERR2352985;
	}

	public void setERR2352985(double eRR2352985) {
		ERR2352985 = eRR2352985;
	}

	public double getERR2352986() {
		return ERR2352986;
	}

	public void setERR2352986(double eRR2352986) {
		ERR2352986 = eRR2352986;
	}

	public double getERR2353519() {
		return ERR2353519;
	}

	public void setERR2353519(double eRR2353519) {
		ERR2353519 = eRR2353519;
	}

	public double getERR2353520() {
		return ERR2353520;
	}

	public void setERR2353520(double eRR2353520) {
		ERR2353520 = eRR2353520;
	}

	public double getERR2353521() {
		return ERR2353521;
	}

	public void setERR2353521(double eRR2353521) {
		ERR2353521 = eRR2353521;
	}

	public double getERR2353522() {
		return ERR2353522;
	}

	public void setERR2353522(double eRR2353522) {
		ERR2353522 = eRR2353522;
	}

	public double getERR2353523() {
		return ERR2353523;
	}

	public void setERR2353523(double eRR2353523) {
		ERR2353523 = eRR2353523;
	}

	public double getERR2353524() {
		return ERR2353524;
	}

	public void setERR2353524(double eRR2353524) {
		ERR2353524 = eRR2353524;
	}

	public double getERR2353525() {
		return ERR2353525;
	}

	public void setERR2353525(double eRR2353525) {
		ERR2353525 = eRR2353525;
	}

	public double getERR2353526() {
		return ERR2353526;
	}

	public void setERR2353526(double eRR2353526) {
		ERR2353526 = eRR2353526;
	}

	public double getERR2353527() {
		return ERR2353527;
	}

	public void setERR2353527(double eRR2353527) {
		ERR2353527 = eRR2353527;
	}

	public double getERR2353822() {
		return ERR2353822;
	}

	public void setERR2353822(double eRR2353822) {
		ERR2353822 = eRR2353822;
	}

	public double getERR2353823() {
		return ERR2353823;
	}

	public void setERR2353823(double eRR2353823) {
		ERR2353823 = eRR2353823;
	}

	public double getERR2353824() {
		return ERR2353824;
	}

	public void setERR2353824(double eRR2353824) {
		ERR2353824 = eRR2353824;
	}

	public double getERR2353825() {
		return ERR2353825;
	}

	public void setERR2353825(double eRR2353825) {
		ERR2353825 = eRR2353825;
	}

	public double getERR2353826() {
		return ERR2353826;
	}

	public void setERR2353826(double eRR2353826) {
		ERR2353826 = eRR2353826;
	}

	public double getERR2353827() {
		return ERR2353827;
	}

	public void setERR2353827(double eRR2353827) {
		ERR2353827 = eRR2353827;
	}

	public double getERR2353828() {
		return ERR2353828;
	}

	public void setERR2353828(double eRR2353828) {
		ERR2353828 = eRR2353828;
	}

	public double getERR2354338() {
		return ERR2354338;
	}

	public void setERR2354338(double eRR2354338) {
		ERR2354338 = eRR2354338;
	}

	public double getERR2354339() {
		return ERR2354339;
	}

	public void setERR2354339(double eRR2354339) {
		ERR2354339 = eRR2354339;
	}

	public double getERR2354340() {
		return ERR2354340;
	}

	public void setERR2354340(double eRR2354340) {
		ERR2354340 = eRR2354340;
	}

	public double getERR2354341() {
		return ERR2354341;
	}

	public void setERR2354341(double eRR2354341) {
		ERR2354341 = eRR2354341;
	}

	public double getERR2354342() {
		return ERR2354342;
	}

	public void setERR2354342(double eRR2354342) {
		ERR2354342 = eRR2354342;
	}

	public double getERR2354343() {
		return ERR2354343;
	}

	public void setERR2354343(double eRR2354343) {
		ERR2354343 = eRR2354343;
	}

	public double getERR2354344() {
		return ERR2354344;
	}

	public void setERR2354344(double eRR2354344) {
		ERR2354344 = eRR2354344;
	}

	public double getERR2354345() {
		return ERR2354345;
	}

	public void setERR2354345(double eRR2354345) {
		ERR2354345 = eRR2354345;
	}

	public double getERR2354346() {
		return ERR2354346;
	}

	public void setERR2354346(double eRR2354346) {
		ERR2354346 = eRR2354346;
	}

	public double getERR2355058() {
		return ERR2355058;
	}

	public void setERR2355058(double eRR2355058) {
		ERR2355058 = eRR2355058;
	}

	public double getERR2355059() {
		return ERR2355059;
	}

	public void setERR2355059(double eRR2355059) {
		ERR2355059 = eRR2355059;
	}

	public double getERR2355060() {
		return ERR2355060;
	}

	public void setERR2355060(double eRR2355060) {
		ERR2355060 = eRR2355060;
	}

	public double getERR2355061() {
		return ERR2355061;
	}

	public void setERR2355061(double eRR2355061) {
		ERR2355061 = eRR2355061;
	}

	public double getERR2355062() {
		return ERR2355062;
	}

	public void setERR2355062(double eRR2355062) {
		ERR2355062 = eRR2355062;
	}

	public double getERR2355063() {
		return ERR2355063;
	}

	public void setERR2355063(double eRR2355063) {
		ERR2355063 = eRR2355063;
	}

	public double getERR2355064() {
		return ERR2355064;
	}

	public void setERR2355064(double eRR2355064) {
		ERR2355064 = eRR2355064;
	}

	public double getERR2355065() {
		return ERR2355065;
	}

	public void setERR2355065(double eRR2355065) {
		ERR2355065 = eRR2355065;
	}

	public double getERR2355066() {
		return ERR2355066;
	}

	public void setERR2355066(double eRR2355066) {
		ERR2355066 = eRR2355066;
	}

	@Override
	public String toString() {
		return "Saliva_sec_gland [id=" + id + ", gene=" + gene + ", ERR2352729=" + ERR2352729 + ", ERR2352730="
				+ ERR2352730 + ", ERR2352731=" + ERR2352731 + ", ERR2352732=" + ERR2352732 + ", ERR2352733="
				+ ERR2352733 + ", ERR2352734=" + ERR2352734 + ", ERR2352735=" + ERR2352735 + ", ERR2352736="
				+ ERR2352736 + ", ERR2352737=" + ERR2352737 + ", ERR2352980=" + ERR2352980 + ", ERR2352981="
				+ ERR2352981 + ", ERR2352982=" + ERR2352982 + ", ERR2352983=" + ERR2352983 + ", ERR2352984="
				+ ERR2352984 + ", ERR2352985=" + ERR2352985 + ", ERR2352986=" + ERR2352986 + ", ERR2353519="
				+ ERR2353519 + ", ERR2353520=" + ERR2353520 + ", ERR2353521=" + ERR2353521 + ", ERR2353522="
				+ ERR2353522 + ", ERR2353523=" + ERR2353523 + ", ERR2353524=" + ERR2353524 + ", ERR2353525="
				+ ERR2353525 + ", ERR2353526=" + ERR2353526 + ", ERR2353527=" + ERR2353527 + ", ERR2353822="
				+ ERR2353822 + ", ERR2353823=" + ERR2353823 + ", ERR2353824=" + ERR2353824 + ", ERR2353825="
				+ ERR2353825 + ", ERR2353826=" + ERR2353826 + ", ERR2353827=" + ERR2353827 + ", ERR2353828="
				+ ERR2353828 + ", ERR2354338=" + ERR2354338 + ", ERR2354339=" + ERR2354339 + ", ERR2354340="
				+ ERR2354340 + ", ERR2354341=" + ERR2354341 + ", ERR2354342=" + ERR2354342 + ", ERR2354343="
				+ ERR2354343 + ", ERR2354344=" + ERR2354344 + ", ERR2354345=" + ERR2354345 + ", ERR2354346="
				+ ERR2354346 + ", ERR2355058=" + ERR2355058 + ", ERR2355059=" + ERR2355059 + ", ERR2355060="
				+ ERR2355060 + ", ERR2355061=" + ERR2355061 + ", ERR2355062=" + ERR2355062 + ", ERR2355063="
				+ ERR2355063 + ", ERR2355064=" + ERR2355064 + ", ERR2355065=" + ERR2355065 + ", ERR2355066="
				+ ERR2355066 + "]";
	}
}
