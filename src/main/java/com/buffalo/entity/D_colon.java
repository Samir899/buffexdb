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
@Table(name = "descending_colon")
public class D_colon {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	@Column(name = "geneId")
	 String geneId;
	 
	@Column(name="ERR2352789")
	 private double ERR2352789;
	 
	@Column(name="ERR2352790")
	 private double ERR2352790;
	
	@Column(name="ERR2352791")
	 private double ERR2352791;
	
	@Column(name="ERR2352792")
	 private double ERR2352792;
	
	@Column(name="ERR2352793")
	 private double ERR2352793;
	
	@Column(name="ERR2352794")
	 private double ERR2352794;
	
	@Column(name="ERR2352795")
	 private double ERR2352795;
	
	@Column(name="ERR2353141")
	 private double ERR2353141;
	
	@Column(name="ERR2353142")
	 private double ERR2353142;
	
	@Column(name="ERR2353143")
	 private double ERR2353143;
	
	@Column(name="ERR2353144")
	 private double ERR2353144;
	
	@Column(name="ERR2353145")
	 private double ERR2353145;
	
	@Column(name="ERR2353146")
	 private double ERR2353146;
	
	@Column(name="ERR2353147")
	 private double ERR2353147;
	
	@Column(name="ERR2353148")
	 private double ERR2353148;
	
	@Column(name="ERR2353149")
	 private double ERR2353149;
	
	@Column(name="ERR2353624")
	 private double ERR2353624;
	
	@Column(name="ERR2353625")
	 private double ERR2353625;
	
	@Column(name="ERR2353626")
	 private double ERR2353626;
	
	@Column(name="ERR2353627")
	 private double ERR2353627;
	
	@Column(name="ERR2353629")
	 private double ERR2353629;
	
	@Column(name="ERR2353630")
	 private double ERR2353630;
	
	@Column(name="ERR2354456")
	 private double ERR2354456;
	
	@Column(name="ERR2354457")
	 private double ERR2354457;
	
	@Column(name="ERR2354458")
	 private double ERR2354458;
	
	@Column(name="ERR2354459")
	 private double ERR2354459;
	
	@Column(name="ERR2354460")
	 private double ERR2354460;
	
	@Column(name="ERR2354461")
	 private double ERR2354461;
	
	@Column(name="ERR2354462")
	 private double ERR2354462;
	
	@Column(name="ERR2354463")
	 private double ERR2354463;
	
	@Column(name="ERR2354464")
	 private double ERR2354464;

	public D_colon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public D_colon(int id, String geneId, double eRR2352789, double eRR2352790, double eRR2352791, double eRR2352792,
			double eRR2352793, double eRR2352794, double eRR2352795, double eRR2353141, double eRR2353142,
			double eRR2353143, double eRR2353144, double eRR2353145, double eRR2353146, double eRR2353147,
			double eRR2353148, double eRR2353149, double eRR2353624, double eRR2353625, double eRR2353626,
			double eRR2353627, double eRR2353629, double eRR2353630, double eRR2354456, double eRR2354457,
			double eRR2354458, double eRR2354459, double eRR2354460, double eRR2354461, double eRR2354462,
			double eRR2354463, double eRR2354464) {
		super();
		this.id = id;
		this.geneId = geneId;
		ERR2352789 = eRR2352789;
		ERR2352790 = eRR2352790;
		ERR2352791 = eRR2352791;
		ERR2352792 = eRR2352792;
		ERR2352793 = eRR2352793;
		ERR2352794 = eRR2352794;
		ERR2352795 = eRR2352795;
		ERR2353141 = eRR2353141;
		ERR2353142 = eRR2353142;
		ERR2353143 = eRR2353143;
		ERR2353144 = eRR2353144;
		ERR2353145 = eRR2353145;
		ERR2353146 = eRR2353146;
		ERR2353147 = eRR2353147;
		ERR2353148 = eRR2353148;
		ERR2353149 = eRR2353149;
		ERR2353624 = eRR2353624;
		ERR2353625 = eRR2353625;
		ERR2353626 = eRR2353626;
		ERR2353627 = eRR2353627;
		ERR2353629 = eRR2353629;
		ERR2353630 = eRR2353630;
		ERR2354456 = eRR2354456;
		ERR2354457 = eRR2354457;
		ERR2354458 = eRR2354458;
		ERR2354459 = eRR2354459;
		ERR2354460 = eRR2354460;
		ERR2354461 = eRR2354461;
		ERR2354462 = eRR2354462;
		ERR2354463 = eRR2354463;
		ERR2354464 = eRR2354464;
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

	public double getERR2352789() {
		return ERR2352789;
	}

	public void setERR2352789(double eRR2352789) {
		ERR2352789 = eRR2352789;
	}

	public double getERR2352790() {
		return ERR2352790;
	}

	public void setERR2352790(double eRR2352790) {
		ERR2352790 = eRR2352790;
	}

	public double getERR2352791() {
		return ERR2352791;
	}

	public void setERR2352791(double eRR2352791) {
		ERR2352791 = eRR2352791;
	}

	public double getERR2352792() {
		return ERR2352792;
	}

	public void setERR2352792(double eRR2352792) {
		ERR2352792 = eRR2352792;
	}

	public double getERR2352793() {
		return ERR2352793;
	}

	public void setERR2352793(double eRR2352793) {
		ERR2352793 = eRR2352793;
	}

	public double getERR2352794() {
		return ERR2352794;
	}

	public void setERR2352794(double eRR2352794) {
		ERR2352794 = eRR2352794;
	}

	public double getERR2352795() {
		return ERR2352795;
	}

	public void setERR2352795(double eRR2352795) {
		ERR2352795 = eRR2352795;
	}

	public double getERR2353141() {
		return ERR2353141;
	}

	public void setERR2353141(double eRR2353141) {
		ERR2353141 = eRR2353141;
	}

	public double getERR2353142() {
		return ERR2353142;
	}

	public void setERR2353142(double eRR2353142) {
		ERR2353142 = eRR2353142;
	}

	public double getERR2353143() {
		return ERR2353143;
	}

	public void setERR2353143(double eRR2353143) {
		ERR2353143 = eRR2353143;
	}

	public double getERR2353144() {
		return ERR2353144;
	}

	public void setERR2353144(double eRR2353144) {
		ERR2353144 = eRR2353144;
	}

	public double getERR2353145() {
		return ERR2353145;
	}

	public void setERR2353145(double eRR2353145) {
		ERR2353145 = eRR2353145;
	}

	public double getERR2353146() {
		return ERR2353146;
	}

	public void setERR2353146(double eRR2353146) {
		ERR2353146 = eRR2353146;
	}

	public double getERR2353147() {
		return ERR2353147;
	}

	public void setERR2353147(double eRR2353147) {
		ERR2353147 = eRR2353147;
	}

	public double getERR2353148() {
		return ERR2353148;
	}

	public void setERR2353148(double eRR2353148) {
		ERR2353148 = eRR2353148;
	}

	public double getERR2353149() {
		return ERR2353149;
	}

	public void setERR2353149(double eRR2353149) {
		ERR2353149 = eRR2353149;
	}

	public double getERR2353624() {
		return ERR2353624;
	}

	public void setERR2353624(double eRR2353624) {
		ERR2353624 = eRR2353624;
	}

	public double getERR2353625() {
		return ERR2353625;
	}

	public void setERR2353625(double eRR2353625) {
		ERR2353625 = eRR2353625;
	}

	public double getERR2353626() {
		return ERR2353626;
	}

	public void setERR2353626(double eRR2353626) {
		ERR2353626 = eRR2353626;
	}

	public double getERR2353627() {
		return ERR2353627;
	}

	public void setERR2353627(double eRR2353627) {
		ERR2353627 = eRR2353627;
	}

	public double getERR2353629() {
		return ERR2353629;
	}

	public void setERR2353629(double eRR2353629) {
		ERR2353629 = eRR2353629;
	}

	public double getERR2353630() {
		return ERR2353630;
	}

	public void setERR2353630(double eRR2353630) {
		ERR2353630 = eRR2353630;
	}

	public double getERR2354456() {
		return ERR2354456;
	}

	public void setERR2354456(double eRR2354456) {
		ERR2354456 = eRR2354456;
	}

	public double getERR2354457() {
		return ERR2354457;
	}

	public void setERR2354457(double eRR2354457) {
		ERR2354457 = eRR2354457;
	}

	public double getERR2354458() {
		return ERR2354458;
	}

	public void setERR2354458(double eRR2354458) {
		ERR2354458 = eRR2354458;
	}

	public double getERR2354459() {
		return ERR2354459;
	}

	public void setERR2354459(double eRR2354459) {
		ERR2354459 = eRR2354459;
	}

	public double getERR2354460() {
		return ERR2354460;
	}

	public void setERR2354460(double eRR2354460) {
		ERR2354460 = eRR2354460;
	}

	public double getERR2354461() {
		return ERR2354461;
	}

	public void setERR2354461(double eRR2354461) {
		ERR2354461 = eRR2354461;
	}

	public double getERR2354462() {
		return ERR2354462;
	}

	public void setERR2354462(double eRR2354462) {
		ERR2354462 = eRR2354462;
	}

	public double getERR2354463() {
		return ERR2354463;
	}

	public void setERR2354463(double eRR2354463) {
		ERR2354463 = eRR2354463;
	}

	public double getERR2354464() {
		return ERR2354464;
	}

	public void setERR2354464(double eRR2354464) {
		ERR2354464 = eRR2354464;
	}

	@Override
	public String toString() {
		return "D_colon [id=" + id + ", geneId=" + geneId + ", ERR2352789=" + ERR2352789 + ", ERR2352790=" + ERR2352790
				+ ", ERR2352791=" + ERR2352791 + ", ERR2352792=" + ERR2352792 + ", ERR2352793=" + ERR2352793
				+ ", ERR2352794=" + ERR2352794 + ", ERR2352795=" + ERR2352795 + ", ERR2353141=" + ERR2353141
				+ ", ERR2353142=" + ERR2353142 + ", ERR2353143=" + ERR2353143 + ", ERR2353144=" + ERR2353144
				+ ", ERR2353145=" + ERR2353145 + ", ERR2353146=" + ERR2353146 + ", ERR2353147=" + ERR2353147
				+ ", ERR2353148=" + ERR2353148 + ", ERR2353149=" + ERR2353149 + ", ERR2353624=" + ERR2353624
				+ ", ERR2353625=" + ERR2353625 + ", ERR2353626=" + ERR2353626 + ", ERR2353627=" + ERR2353627
				+ ", ERR2353629=" + ERR2353629 + ", ERR2353630=" + ERR2353630 + ", ERR2354456=" + ERR2354456
				+ ", ERR2354457=" + ERR2354457 + ", ERR2354458=" + ERR2354458 + ", ERR2354459=" + ERR2354459
				+ ", ERR2354460=" + ERR2354460 + ", ERR2354461=" + ERR2354461 + ", ERR2354462=" + ERR2354462
				+ ", ERR2354463=" + ERR2354463 + ", ERR2354464=" + ERR2354464 + "]";
	}
}
