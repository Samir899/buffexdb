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
@Table(name = "lung_parenchyma_b")
public class Lung_parenchyma_B {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
	 @Column(name="ERR2354556")
	 private double ERR2354556;

	 @Column(name="ERR2354557")
	 private double ERR2354557;

	 @Column(name="ERR2354558")
	 private double ERR2354558;

	 @Column(name="ERR2354559")
	 private double ERR2354559;

	 @Column(name="ERR2354560")
	 private double ERR2354560;

	 @Column(name="ERR2354561")
	 private double ERR2354561;

	 @Column(name="ERR2354562")
	 private double ERR2354562;

	 @Column(name="ERR2354563")
	 private double ERR2354563;

	 @Column(name="ERR2354564")
	 private double ERR2354564;

	 @Column(name="ERR2354565")
	 private double ERR2354565;

	 @Column(name="ERR2354807")
	 private double ERR2354807;

	 @Column(name="ERR2354808")
	 private double ERR2354808;

	 @Column(name="ERR2354809")
	 private double ERR2354809;

	 @Column(name="ERR2354810")
	 private double ERR2354810;

	 @Column(name="ERR2354811")
	 private double ERR2354811;

	 @Column(name="ERR2354812")
	 private double ERR2354812;

	 @Column(name="ERR2354813")
	 private double ERR2354813;

	 @Column(name="ERR2354814")
	 private double ERR2354814;

	 @Column(name="ERR2354815")
	 private double ERR2354815;

	 @Column(name="ERR2354816")
	 private double ERR2354816;

	 @Column(name="ERR2354817")
	 private double ERR2354817;

	 @Column(name="ERR2354818")
	 private double ERR2354818;

	 @Column(name="ERR2354819")
	 private double ERR2354819;

	 @Column(name="ERR2354820")
	 private double ERR2354820;

	 @Column(name="ERR2354821")
	 private double ERR2354821;

	 @Column(name="ERR2354822")
	 private double ERR2354822;

	 @Column(name="ERR2354823")
	 private double ERR2354823;

	 @Column(name="ERR2354824")
	 private double ERR2354824;

	 @Column(name="ERR2354825")
	 private double ERR2354825;

	 @Column(name="ERR2354826")
	 private double ERR2354826;

	 @Column(name="ERR2354827")
	 private double ERR2354827;

	 @Column(name="ERR2354828")
	 private double ERR2354828;

	 @Column(name="ERR2354829")
	 private double ERR2354829;

	 @Column(name="ERR2354985")
	 private double ERR2354985;

	 @Column(name="ERR2354986")
	 private double ERR2354986;

	 @Column(name="ERR2354987")
	 private double ERR2354987;

	 @Column(name="ERR2354988")
	 private double ERR2354988;

	 @Column(name="ERR2354989")
	 private double ERR2354989;

	 @Column(name="ERR2354990")
	 private double ERR2354990;

	 @Column(name="ERR2354991")
	 private double ERR2354991;

	 @Column(name="ERR2354992")
	 private double ERR2354992;

	 @Column(name="ERR2354993")
	 private double ERR2354993;

	 @Column(name="ERR2354994")
	 private double ERR2354994;

	 @Column(name="ERR2354995")
	 private double ERR2354995;

	 @Column(name="ERR2354996")
	 private double ERR2354996;

	 @Column(name="ERR2354997")
	 private double ERR2354997;

	 @Column(name="ERR2354998")
	 private double ERR2354998;

	 @Column(name="ERR2354999")
	 private double ERR2354999;

	 @Column(name="ERR2355000")
	 private double ERR2355000;

	 @Column(name="ERR2355001")
	 private double ERR2355001;

	 @Column(name="ERR2355002")
	 private double ERR2355002;

	 @Column(name="ERR2355003")
	 private double ERR2355003;

	 @Column(name="ERR2355004")
	 private double ERR2355004;

	 @Column(name="ERR2355005")
	 private double ERR2355005;

	 @Column(name="ERR2355006")
	 private double ERR2355006;

	 @Column(name="ERR2355007")
	 private double ERR2355007;

	public Lung_parenchyma_B() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lung_parenchyma_B(int id, Genes gene, double eRR2354556, double eRR2354557, double eRR2354558,
			double eRR2354559, double eRR2354560, double eRR2354561, double eRR2354562, double eRR2354563,
			double eRR2354564, double eRR2354565, double eRR2354807, double eRR2354808, double eRR2354809,
			double eRR2354810, double eRR2354811, double eRR2354812, double eRR2354813, double eRR2354814,
			double eRR2354815, double eRR2354816, double eRR2354817, double eRR2354818, double eRR2354819,
			double eRR2354820, double eRR2354821, double eRR2354822, double eRR2354823, double eRR2354824,
			double eRR2354825, double eRR2354826, double eRR2354827, double eRR2354828, double eRR2354829,
			double eRR2354985, double eRR2354986, double eRR2354987, double eRR2354988, double eRR2354989,
			double eRR2354990, double eRR2354991, double eRR2354992, double eRR2354993, double eRR2354994,
			double eRR2354995, double eRR2354996, double eRR2354997, double eRR2354998, double eRR2354999,
			double eRR2355000, double eRR2355001, double eRR2355002, double eRR2355003, double eRR2355004,
			double eRR2355005, double eRR2355006, double eRR2355007) {
		super();
		this.id = id;
		this.gene = gene;
		ERR2354556 = eRR2354556;
		ERR2354557 = eRR2354557;
		ERR2354558 = eRR2354558;
		ERR2354559 = eRR2354559;
		ERR2354560 = eRR2354560;
		ERR2354561 = eRR2354561;
		ERR2354562 = eRR2354562;
		ERR2354563 = eRR2354563;
		ERR2354564 = eRR2354564;
		ERR2354565 = eRR2354565;
		ERR2354807 = eRR2354807;
		ERR2354808 = eRR2354808;
		ERR2354809 = eRR2354809;
		ERR2354810 = eRR2354810;
		ERR2354811 = eRR2354811;
		ERR2354812 = eRR2354812;
		ERR2354813 = eRR2354813;
		ERR2354814 = eRR2354814;
		ERR2354815 = eRR2354815;
		ERR2354816 = eRR2354816;
		ERR2354817 = eRR2354817;
		ERR2354818 = eRR2354818;
		ERR2354819 = eRR2354819;
		ERR2354820 = eRR2354820;
		ERR2354821 = eRR2354821;
		ERR2354822 = eRR2354822;
		ERR2354823 = eRR2354823;
		ERR2354824 = eRR2354824;
		ERR2354825 = eRR2354825;
		ERR2354826 = eRR2354826;
		ERR2354827 = eRR2354827;
		ERR2354828 = eRR2354828;
		ERR2354829 = eRR2354829;
		ERR2354985 = eRR2354985;
		ERR2354986 = eRR2354986;
		ERR2354987 = eRR2354987;
		ERR2354988 = eRR2354988;
		ERR2354989 = eRR2354989;
		ERR2354990 = eRR2354990;
		ERR2354991 = eRR2354991;
		ERR2354992 = eRR2354992;
		ERR2354993 = eRR2354993;
		ERR2354994 = eRR2354994;
		ERR2354995 = eRR2354995;
		ERR2354996 = eRR2354996;
		ERR2354997 = eRR2354997;
		ERR2354998 = eRR2354998;
		ERR2354999 = eRR2354999;
		ERR2355000 = eRR2355000;
		ERR2355001 = eRR2355001;
		ERR2355002 = eRR2355002;
		ERR2355003 = eRR2355003;
		ERR2355004 = eRR2355004;
		ERR2355005 = eRR2355005;
		ERR2355006 = eRR2355006;
		ERR2355007 = eRR2355007;
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

	public double getERR2354556() {
		return ERR2354556;
	}

	public void setERR2354556(double eRR2354556) {
		ERR2354556 = eRR2354556;
	}

	public double getERR2354557() {
		return ERR2354557;
	}

	public void setERR2354557(double eRR2354557) {
		ERR2354557 = eRR2354557;
	}

	public double getERR2354558() {
		return ERR2354558;
	}

	public void setERR2354558(double eRR2354558) {
		ERR2354558 = eRR2354558;
	}

	public double getERR2354559() {
		return ERR2354559;
	}

	public void setERR2354559(double eRR2354559) {
		ERR2354559 = eRR2354559;
	}

	public double getERR2354560() {
		return ERR2354560;
	}

	public void setERR2354560(double eRR2354560) {
		ERR2354560 = eRR2354560;
	}

	public double getERR2354561() {
		return ERR2354561;
	}

	public void setERR2354561(double eRR2354561) {
		ERR2354561 = eRR2354561;
	}

	public double getERR2354562() {
		return ERR2354562;
	}

	public void setERR2354562(double eRR2354562) {
		ERR2354562 = eRR2354562;
	}

	public double getERR2354563() {
		return ERR2354563;
	}

	public void setERR2354563(double eRR2354563) {
		ERR2354563 = eRR2354563;
	}

	public double getERR2354564() {
		return ERR2354564;
	}

	public void setERR2354564(double eRR2354564) {
		ERR2354564 = eRR2354564;
	}

	public double getERR2354565() {
		return ERR2354565;
	}

	public void setERR2354565(double eRR2354565) {
		ERR2354565 = eRR2354565;
	}

	public double getERR2354807() {
		return ERR2354807;
	}

	public void setERR2354807(double eRR2354807) {
		ERR2354807 = eRR2354807;
	}

	public double getERR2354808() {
		return ERR2354808;
	}

	public void setERR2354808(double eRR2354808) {
		ERR2354808 = eRR2354808;
	}

	public double getERR2354809() {
		return ERR2354809;
	}

	public void setERR2354809(double eRR2354809) {
		ERR2354809 = eRR2354809;
	}

	public double getERR2354810() {
		return ERR2354810;
	}

	public void setERR2354810(double eRR2354810) {
		ERR2354810 = eRR2354810;
	}

	public double getERR2354811() {
		return ERR2354811;
	}

	public void setERR2354811(double eRR2354811) {
		ERR2354811 = eRR2354811;
	}

	public double getERR2354812() {
		return ERR2354812;
	}

	public void setERR2354812(double eRR2354812) {
		ERR2354812 = eRR2354812;
	}

	public double getERR2354813() {
		return ERR2354813;
	}

	public void setERR2354813(double eRR2354813) {
		ERR2354813 = eRR2354813;
	}

	public double getERR2354814() {
		return ERR2354814;
	}

	public void setERR2354814(double eRR2354814) {
		ERR2354814 = eRR2354814;
	}

	public double getERR2354815() {
		return ERR2354815;
	}

	public void setERR2354815(double eRR2354815) {
		ERR2354815 = eRR2354815;
	}

	public double getERR2354816() {
		return ERR2354816;
	}

	public void setERR2354816(double eRR2354816) {
		ERR2354816 = eRR2354816;
	}

	public double getERR2354817() {
		return ERR2354817;
	}

	public void setERR2354817(double eRR2354817) {
		ERR2354817 = eRR2354817;
	}

	public double getERR2354818() {
		return ERR2354818;
	}

	public void setERR2354818(double eRR2354818) {
		ERR2354818 = eRR2354818;
	}

	public double getERR2354819() {
		return ERR2354819;
	}

	public void setERR2354819(double eRR2354819) {
		ERR2354819 = eRR2354819;
	}

	public double getERR2354820() {
		return ERR2354820;
	}

	public void setERR2354820(double eRR2354820) {
		ERR2354820 = eRR2354820;
	}

	public double getERR2354821() {
		return ERR2354821;
	}

	public void setERR2354821(double eRR2354821) {
		ERR2354821 = eRR2354821;
	}

	public double getERR2354822() {
		return ERR2354822;
	}

	public void setERR2354822(double eRR2354822) {
		ERR2354822 = eRR2354822;
	}

	public double getERR2354823() {
		return ERR2354823;
	}

	public void setERR2354823(double eRR2354823) {
		ERR2354823 = eRR2354823;
	}

	public double getERR2354824() {
		return ERR2354824;
	}

	public void setERR2354824(double eRR2354824) {
		ERR2354824 = eRR2354824;
	}

	public double getERR2354825() {
		return ERR2354825;
	}

	public void setERR2354825(double eRR2354825) {
		ERR2354825 = eRR2354825;
	}

	public double getERR2354826() {
		return ERR2354826;
	}

	public void setERR2354826(double eRR2354826) {
		ERR2354826 = eRR2354826;
	}

	public double getERR2354827() {
		return ERR2354827;
	}

	public void setERR2354827(double eRR2354827) {
		ERR2354827 = eRR2354827;
	}

	public double getERR2354828() {
		return ERR2354828;
	}

	public void setERR2354828(double eRR2354828) {
		ERR2354828 = eRR2354828;
	}

	public double getERR2354829() {
		return ERR2354829;
	}

	public void setERR2354829(double eRR2354829) {
		ERR2354829 = eRR2354829;
	}

	public double getERR2354985() {
		return ERR2354985;
	}

	public void setERR2354985(double eRR2354985) {
		ERR2354985 = eRR2354985;
	}

	public double getERR2354986() {
		return ERR2354986;
	}

	public void setERR2354986(double eRR2354986) {
		ERR2354986 = eRR2354986;
	}

	public double getERR2354987() {
		return ERR2354987;
	}

	public void setERR2354987(double eRR2354987) {
		ERR2354987 = eRR2354987;
	}

	public double getERR2354988() {
		return ERR2354988;
	}

	public void setERR2354988(double eRR2354988) {
		ERR2354988 = eRR2354988;
	}

	public double getERR2354989() {
		return ERR2354989;
	}

	public void setERR2354989(double eRR2354989) {
		ERR2354989 = eRR2354989;
	}

	public double getERR2354990() {
		return ERR2354990;
	}

	public void setERR2354990(double eRR2354990) {
		ERR2354990 = eRR2354990;
	}

	public double getERR2354991() {
		return ERR2354991;
	}

	public void setERR2354991(double eRR2354991) {
		ERR2354991 = eRR2354991;
	}

	public double getERR2354992() {
		return ERR2354992;
	}

	public void setERR2354992(double eRR2354992) {
		ERR2354992 = eRR2354992;
	}

	public double getERR2354993() {
		return ERR2354993;
	}

	public void setERR2354993(double eRR2354993) {
		ERR2354993 = eRR2354993;
	}

	public double getERR2354994() {
		return ERR2354994;
	}

	public void setERR2354994(double eRR2354994) {
		ERR2354994 = eRR2354994;
	}

	public double getERR2354995() {
		return ERR2354995;
	}

	public void setERR2354995(double eRR2354995) {
		ERR2354995 = eRR2354995;
	}

	public double getERR2354996() {
		return ERR2354996;
	}

	public void setERR2354996(double eRR2354996) {
		ERR2354996 = eRR2354996;
	}

	public double getERR2354997() {
		return ERR2354997;
	}

	public void setERR2354997(double eRR2354997) {
		ERR2354997 = eRR2354997;
	}

	public double getERR2354998() {
		return ERR2354998;
	}

	public void setERR2354998(double eRR2354998) {
		ERR2354998 = eRR2354998;
	}

	public double getERR2354999() {
		return ERR2354999;
	}

	public void setERR2354999(double eRR2354999) {
		ERR2354999 = eRR2354999;
	}

	public double getERR2355000() {
		return ERR2355000;
	}

	public void setERR2355000(double eRR2355000) {
		ERR2355000 = eRR2355000;
	}

	public double getERR2355001() {
		return ERR2355001;
	}

	public void setERR2355001(double eRR2355001) {
		ERR2355001 = eRR2355001;
	}

	public double getERR2355002() {
		return ERR2355002;
	}

	public void setERR2355002(double eRR2355002) {
		ERR2355002 = eRR2355002;
	}

	public double getERR2355003() {
		return ERR2355003;
	}

	public void setERR2355003(double eRR2355003) {
		ERR2355003 = eRR2355003;
	}

	public double getERR2355004() {
		return ERR2355004;
	}

	public void setERR2355004(double eRR2355004) {
		ERR2355004 = eRR2355004;
	}

	public double getERR2355005() {
		return ERR2355005;
	}

	public void setERR2355005(double eRR2355005) {
		ERR2355005 = eRR2355005;
	}

	public double getERR2355006() {
		return ERR2355006;
	}

	public void setERR2355006(double eRR2355006) {
		ERR2355006 = eRR2355006;
	}

	public double getERR2355007() {
		return ERR2355007;
	}

	public void setERR2355007(double eRR2355007) {
		ERR2355007 = eRR2355007;
	}

	@Override
	public String toString() {
		return "Lung_parenchyma_B [id=" + id + ", gene=" + gene + ", ERR2354556=" + ERR2354556 + ", ERR2354557="
				+ ERR2354557 + ", ERR2354558=" + ERR2354558 + ", ERR2354559=" + ERR2354559 + ", ERR2354560="
				+ ERR2354560 + ", ERR2354561=" + ERR2354561 + ", ERR2354562=" + ERR2354562 + ", ERR2354563="
				+ ERR2354563 + ", ERR2354564=" + ERR2354564 + ", ERR2354565=" + ERR2354565 + ", ERR2354807="
				+ ERR2354807 + ", ERR2354808=" + ERR2354808 + ", ERR2354809=" + ERR2354809 + ", ERR2354810="
				+ ERR2354810 + ", ERR2354811=" + ERR2354811 + ", ERR2354812=" + ERR2354812 + ", ERR2354813="
				+ ERR2354813 + ", ERR2354814=" + ERR2354814 + ", ERR2354815=" + ERR2354815 + ", ERR2354816="
				+ ERR2354816 + ", ERR2354817=" + ERR2354817 + ", ERR2354818=" + ERR2354818 + ", ERR2354819="
				+ ERR2354819 + ", ERR2354820=" + ERR2354820 + ", ERR2354821=" + ERR2354821 + ", ERR2354822="
				+ ERR2354822 + ", ERR2354823=" + ERR2354823 + ", ERR2354824=" + ERR2354824 + ", ERR2354825="
				+ ERR2354825 + ", ERR2354826=" + ERR2354826 + ", ERR2354827=" + ERR2354827 + ", ERR2354828="
				+ ERR2354828 + ", ERR2354829=" + ERR2354829 + ", ERR2354985=" + ERR2354985 + ", ERR2354986="
				+ ERR2354986 + ", ERR2354987=" + ERR2354987 + ", ERR2354988=" + ERR2354988 + ", ERR2354989="
				+ ERR2354989 + ", ERR2354990=" + ERR2354990 + ", ERR2354991=" + ERR2354991 + ", ERR2354992="
				+ ERR2354992 + ", ERR2354993=" + ERR2354993 + ", ERR2354994=" + ERR2354994 + ", ERR2354995="
				+ ERR2354995 + ", ERR2354996=" + ERR2354996 + ", ERR2354997=" + ERR2354997 + ", ERR2354998="
				+ ERR2354998 + ", ERR2354999=" + ERR2354999 + ", ERR2355000=" + ERR2355000 + ", ERR2355001="
				+ ERR2355001 + ", ERR2355002=" + ERR2355002 + ", ERR2355003=" + ERR2355003 + ", ERR2355004="
				+ ERR2355004 + ", ERR2355005=" + ERR2355005 + ", ERR2355006=" + ERR2355006 + ", ERR2355007="
				+ ERR2355007 + "]";
	}
	 
	 
}
