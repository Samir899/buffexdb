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
@Table(name = "occipital_cortex")
public class Occipital_cortex {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
	 @Column(name="ERR2353351")
	 private double ERR2353351;

	@Column(name="ERR2353352")
	 private double ERR2353352;

	@Column(name="ERR2353353")
	 private double ERR2353353;

	@Column(name="ERR2353354")
	 private double ERR2353354;

	@Column(name="ERR2353355")
	 private double ERR2353355;

	@Column(name="ERR2353356")
	 private double ERR2353356;

	@Column(name="ERR2353357")
	 private double ERR2353357;

	@Column(name="ERR2353358")
	 private double ERR2353358;

	@Column(name="ERR2353359")
	 private double ERR2353359;

	@Column(name="ERR2353360")
	 private double ERR2353360;

	@Column(name="ERR2353361")
	 private double ERR2353361;

	@Column(name="ERR2353362")
	 private double ERR2353362;

	@Column(name="ERR2353363")
	 private double ERR2353363;

	@Column(name="ERR2353364")
	 private double ERR2353364;

	@Column(name="ERR2353365")
	 private double ERR2353365;

	@Column(name="ERR2353366")
	 private double ERR2353366;

	@Column(name="ERR2353367")
	 private double ERR2353367;

	@Column(name="ERR2353368")
	 private double ERR2353368;

	@Column(name="ERR2353369")
	 private double ERR2353369;

	@Column(name="ERR2353370")
	 private double ERR2353370;

	@Column(name="ERR2353371")
	 private double ERR2353371;

	@Column(name="ERR2353372")
	 private double ERR2353372;

	@Column(name="ERR2353373")
	 private double ERR2353373;

	@Column(name="ERR2354202")
	 private double ERR2354202;

	@Column(name="ERR2354203")
	 private double ERR2354203;

	@Column(name="ERR2354204")
	 private double ERR2354204;

	@Column(name="ERR2354205")
	 private double ERR2354205;

	@Column(name="ERR2354206")
	 private double ERR2354206;

	@Column(name="ERR2354207")
	 private double ERR2354207;

	@Column(name="ERR2354208")
	 private double ERR2354208;

	@Column(name="ERR2354209")
	 private double ERR2354209;

	@Column(name="ERR2354210")
	 private double ERR2354210;

	@Column(name="ERR2354211")
	 private double ERR2354211;

	@Column(name="ERR2354212")
	 private double ERR2354212;

	@Column(name="ERR2354213")
	 private double ERR2354213;

	@Column(name="ERR2354214")
	 private double ERR2354214;

	@Column(name="ERR2354215")
	 private double ERR2354215;

	@Column(name="ERR2354216")
	 private double ERR2354216;

	@Column(name="ERR2354217")
	 private double ERR2354217;

	@Column(name="ERR2354218")
	 private double ERR2354218;

	@Column(name="ERR2354219")
	 private double ERR2354219;

	@Column(name="ERR2354220")
	 private double ERR2354220;

	@Column(name="ERR2354221")
	 private double ERR2354221;

	@Column(name="ERR2354222")
	 private double ERR2354222;

	@Column(name="ERR2354223")
	 private double ERR2354223;

	@Column(name="ERR2354224")
	 private double ERR2354224;

	public Occipital_cortex() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Occipital_cortex(int id, Genes gene, double eRR2353351, double eRR2353352, double eRR2353353,
			double eRR2353354, double eRR2353355, double eRR2353356, double eRR2353357, double eRR2353358,
			double eRR2353359, double eRR2353360, double eRR2353361, double eRR2353362, double eRR2353363,
			double eRR2353364, double eRR2353365, double eRR2353366, double eRR2353367, double eRR2353368,
			double eRR2353369, double eRR2353370, double eRR2353371, double eRR2353372, double eRR2353373,
			double eRR2354202, double eRR2354203, double eRR2354204, double eRR2354205, double eRR2354206,
			double eRR2354207, double eRR2354208, double eRR2354209, double eRR2354210, double eRR2354211,
			double eRR2354212, double eRR2354213, double eRR2354214, double eRR2354215, double eRR2354216,
			double eRR2354217, double eRR2354218, double eRR2354219, double eRR2354220, double eRR2354221,
			double eRR2354222, double eRR2354223, double eRR2354224) {
		super();
		this.id = id;
		this.gene = gene;
		ERR2353351 = eRR2353351;
		ERR2353352 = eRR2353352;
		ERR2353353 = eRR2353353;
		ERR2353354 = eRR2353354;
		ERR2353355 = eRR2353355;
		ERR2353356 = eRR2353356;
		ERR2353357 = eRR2353357;
		ERR2353358 = eRR2353358;
		ERR2353359 = eRR2353359;
		ERR2353360 = eRR2353360;
		ERR2353361 = eRR2353361;
		ERR2353362 = eRR2353362;
		ERR2353363 = eRR2353363;
		ERR2353364 = eRR2353364;
		ERR2353365 = eRR2353365;
		ERR2353366 = eRR2353366;
		ERR2353367 = eRR2353367;
		ERR2353368 = eRR2353368;
		ERR2353369 = eRR2353369;
		ERR2353370 = eRR2353370;
		ERR2353371 = eRR2353371;
		ERR2353372 = eRR2353372;
		ERR2353373 = eRR2353373;
		ERR2354202 = eRR2354202;
		ERR2354203 = eRR2354203;
		ERR2354204 = eRR2354204;
		ERR2354205 = eRR2354205;
		ERR2354206 = eRR2354206;
		ERR2354207 = eRR2354207;
		ERR2354208 = eRR2354208;
		ERR2354209 = eRR2354209;
		ERR2354210 = eRR2354210;
		ERR2354211 = eRR2354211;
		ERR2354212 = eRR2354212;
		ERR2354213 = eRR2354213;
		ERR2354214 = eRR2354214;
		ERR2354215 = eRR2354215;
		ERR2354216 = eRR2354216;
		ERR2354217 = eRR2354217;
		ERR2354218 = eRR2354218;
		ERR2354219 = eRR2354219;
		ERR2354220 = eRR2354220;
		ERR2354221 = eRR2354221;
		ERR2354222 = eRR2354222;
		ERR2354223 = eRR2354223;
		ERR2354224 = eRR2354224;
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

	public double getERR2353351() {
		return ERR2353351;
	}

	public void setERR2353351(double eRR2353351) {
		ERR2353351 = eRR2353351;
	}

	public double getERR2353352() {
		return ERR2353352;
	}

	public void setERR2353352(double eRR2353352) {
		ERR2353352 = eRR2353352;
	}

	public double getERR2353353() {
		return ERR2353353;
	}

	public void setERR2353353(double eRR2353353) {
		ERR2353353 = eRR2353353;
	}

	public double getERR2353354() {
		return ERR2353354;
	}

	public void setERR2353354(double eRR2353354) {
		ERR2353354 = eRR2353354;
	}

	public double getERR2353355() {
		return ERR2353355;
	}

	public void setERR2353355(double eRR2353355) {
		ERR2353355 = eRR2353355;
	}

	public double getERR2353356() {
		return ERR2353356;
	}

	public void setERR2353356(double eRR2353356) {
		ERR2353356 = eRR2353356;
	}

	public double getERR2353357() {
		return ERR2353357;
	}

	public void setERR2353357(double eRR2353357) {
		ERR2353357 = eRR2353357;
	}

	public double getERR2353358() {
		return ERR2353358;
	}

	public void setERR2353358(double eRR2353358) {
		ERR2353358 = eRR2353358;
	}

	public double getERR2353359() {
		return ERR2353359;
	}

	public void setERR2353359(double eRR2353359) {
		ERR2353359 = eRR2353359;
	}

	public double getERR2353360() {
		return ERR2353360;
	}

	public void setERR2353360(double eRR2353360) {
		ERR2353360 = eRR2353360;
	}

	public double getERR2353361() {
		return ERR2353361;
	}

	public void setERR2353361(double eRR2353361) {
		ERR2353361 = eRR2353361;
	}

	public double getERR2353362() {
		return ERR2353362;
	}

	public void setERR2353362(double eRR2353362) {
		ERR2353362 = eRR2353362;
	}

	public double getERR2353363() {
		return ERR2353363;
	}

	public void setERR2353363(double eRR2353363) {
		ERR2353363 = eRR2353363;
	}

	public double getERR2353364() {
		return ERR2353364;
	}

	public void setERR2353364(double eRR2353364) {
		ERR2353364 = eRR2353364;
	}

	public double getERR2353365() {
		return ERR2353365;
	}

	public void setERR2353365(double eRR2353365) {
		ERR2353365 = eRR2353365;
	}

	public double getERR2353366() {
		return ERR2353366;
	}

	public void setERR2353366(double eRR2353366) {
		ERR2353366 = eRR2353366;
	}

	public double getERR2353367() {
		return ERR2353367;
	}

	public void setERR2353367(double eRR2353367) {
		ERR2353367 = eRR2353367;
	}

	public double getERR2353368() {
		return ERR2353368;
	}

	public void setERR2353368(double eRR2353368) {
		ERR2353368 = eRR2353368;
	}

	public double getERR2353369() {
		return ERR2353369;
	}

	public void setERR2353369(double eRR2353369) {
		ERR2353369 = eRR2353369;
	}

	public double getERR2353370() {
		return ERR2353370;
	}

	public void setERR2353370(double eRR2353370) {
		ERR2353370 = eRR2353370;
	}

	public double getERR2353371() {
		return ERR2353371;
	}

	public void setERR2353371(double eRR2353371) {
		ERR2353371 = eRR2353371;
	}

	public double getERR2353372() {
		return ERR2353372;
	}

	public void setERR2353372(double eRR2353372) {
		ERR2353372 = eRR2353372;
	}

	public double getERR2353373() {
		return ERR2353373;
	}

	public void setERR2353373(double eRR2353373) {
		ERR2353373 = eRR2353373;
	}

	public double getERR2354202() {
		return ERR2354202;
	}

	public void setERR2354202(double eRR2354202) {
		ERR2354202 = eRR2354202;
	}

	public double getERR2354203() {
		return ERR2354203;
	}

	public void setERR2354203(double eRR2354203) {
		ERR2354203 = eRR2354203;
	}

	public double getERR2354204() {
		return ERR2354204;
	}

	public void setERR2354204(double eRR2354204) {
		ERR2354204 = eRR2354204;
	}

	public double getERR2354205() {
		return ERR2354205;
	}

	public void setERR2354205(double eRR2354205) {
		ERR2354205 = eRR2354205;
	}

	public double getERR2354206() {
		return ERR2354206;
	}

	public void setERR2354206(double eRR2354206) {
		ERR2354206 = eRR2354206;
	}

	public double getERR2354207() {
		return ERR2354207;
	}

	public void setERR2354207(double eRR2354207) {
		ERR2354207 = eRR2354207;
	}

	public double getERR2354208() {
		return ERR2354208;
	}

	public void setERR2354208(double eRR2354208) {
		ERR2354208 = eRR2354208;
	}

	public double getERR2354209() {
		return ERR2354209;
	}

	public void setERR2354209(double eRR2354209) {
		ERR2354209 = eRR2354209;
	}

	public double getERR2354210() {
		return ERR2354210;
	}

	public void setERR2354210(double eRR2354210) {
		ERR2354210 = eRR2354210;
	}

	public double getERR2354211() {
		return ERR2354211;
	}

	public void setERR2354211(double eRR2354211) {
		ERR2354211 = eRR2354211;
	}

	public double getERR2354212() {
		return ERR2354212;
	}

	public void setERR2354212(double eRR2354212) {
		ERR2354212 = eRR2354212;
	}

	public double getERR2354213() {
		return ERR2354213;
	}

	public void setERR2354213(double eRR2354213) {
		ERR2354213 = eRR2354213;
	}

	public double getERR2354214() {
		return ERR2354214;
	}

	public void setERR2354214(double eRR2354214) {
		ERR2354214 = eRR2354214;
	}

	public double getERR2354215() {
		return ERR2354215;
	}

	public void setERR2354215(double eRR2354215) {
		ERR2354215 = eRR2354215;
	}

	public double getERR2354216() {
		return ERR2354216;
	}

	public void setERR2354216(double eRR2354216) {
		ERR2354216 = eRR2354216;
	}

	public double getERR2354217() {
		return ERR2354217;
	}

	public void setERR2354217(double eRR2354217) {
		ERR2354217 = eRR2354217;
	}

	public double getERR2354218() {
		return ERR2354218;
	}

	public void setERR2354218(double eRR2354218) {
		ERR2354218 = eRR2354218;
	}

	public double getERR2354219() {
		return ERR2354219;
	}

	public void setERR2354219(double eRR2354219) {
		ERR2354219 = eRR2354219;
	}

	public double getERR2354220() {
		return ERR2354220;
	}

	public void setERR2354220(double eRR2354220) {
		ERR2354220 = eRR2354220;
	}

	public double getERR2354221() {
		return ERR2354221;
	}

	public void setERR2354221(double eRR2354221) {
		ERR2354221 = eRR2354221;
	}

	public double getERR2354222() {
		return ERR2354222;
	}

	public void setERR2354222(double eRR2354222) {
		ERR2354222 = eRR2354222;
	}

	public double getERR2354223() {
		return ERR2354223;
	}

	public void setERR2354223(double eRR2354223) {
		ERR2354223 = eRR2354223;
	}

	public double getERR2354224() {
		return ERR2354224;
	}

	public void setERR2354224(double eRR2354224) {
		ERR2354224 = eRR2354224;
	}

	@Override
	public String toString() {
		return "Occipital_cortex [id=" + id + ", gene=" + gene + ", ERR2353351=" + ERR2353351 + ", ERR2353352="
				+ ERR2353352 + ", ERR2353353=" + ERR2353353 + ", ERR2353354=" + ERR2353354 + ", ERR2353355="
				+ ERR2353355 + ", ERR2353356=" + ERR2353356 + ", ERR2353357=" + ERR2353357 + ", ERR2353358="
				+ ERR2353358 + ", ERR2353359=" + ERR2353359 + ", ERR2353360=" + ERR2353360 + ", ERR2353361="
				+ ERR2353361 + ", ERR2353362=" + ERR2353362 + ", ERR2353363=" + ERR2353363 + ", ERR2353364="
				+ ERR2353364 + ", ERR2353365=" + ERR2353365 + ", ERR2353366=" + ERR2353366 + ", ERR2353367="
				+ ERR2353367 + ", ERR2353368=" + ERR2353368 + ", ERR2353369=" + ERR2353369 + ", ERR2353370="
				+ ERR2353370 + ", ERR2353371=" + ERR2353371 + ", ERR2353372=" + ERR2353372 + ", ERR2353373="
				+ ERR2353373 + ", ERR2354202=" + ERR2354202 + ", ERR2354203=" + ERR2354203 + ", ERR2354204="
				+ ERR2354204 + ", ERR2354205=" + ERR2354205 + ", ERR2354206=" + ERR2354206 + ", ERR2354207="
				+ ERR2354207 + ", ERR2354208=" + ERR2354208 + ", ERR2354209=" + ERR2354209 + ", ERR2354210="
				+ ERR2354210 + ", ERR2354211=" + ERR2354211 + ", ERR2354212=" + ERR2354212 + ", ERR2354213="
				+ ERR2354213 + ", ERR2354214=" + ERR2354214 + ", ERR2354215=" + ERR2354215 + ", ERR2354216="
				+ ERR2354216 + ", ERR2354217=" + ERR2354217 + ", ERR2354218=" + ERR2354218 + ", ERR2354219="
				+ ERR2354219 + ", ERR2354220=" + ERR2354220 + ", ERR2354221=" + ERR2354221 + ", ERR2354222="
				+ ERR2354222 + ", ERR2354223=" + ERR2354223 + ", ERR2354224=" + ERR2354224 + "]";
	}
}
