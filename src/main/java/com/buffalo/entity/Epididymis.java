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
@Table(name = "epididymis")
public class Epididymis {
	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;

	 @Column(name="ERR2352624")
	 private double ERR2352624;
	 
	@Column(name="ERR2352625")
	 private double ERR2352625;
	
	@Column(name="ERR2352626")
	 private double ERR2352626;
	
	@Column(name="ERR2352627")
	 private double ERR2352627;
	
	@Column(name="ERR2352628")
	 private double ERR2352628;
	
	@Column(name="ERR2352629")
	 private double ERR2352629;
	
	@Column(name="ERR2352630")
	 private double ERR2352630;
	
	@Column(name="ERR2352631")
	 private double ERR2352631;
	
	@Column(name="ERR2352632")
	 private double ERR2352632;
	
	@Column(name="ERR2353645")
	 private double ERR2353645;
	
	@Column(name="ERR2353646")
	 private double ERR2353646;
	
	@Column(name="ERR2353647")
	 private double ERR2353647;
	
	@Column(name="ERR2353648")
	 private double ERR2353648;
	
	@Column(name="ERR2353649")
	 private double ERR2353649;
	
	@Column(name="ERR2353650")
	 private double ERR2353650;
	
	@Column(name="ERR2353651")
	 private double ERR2353651;
	
	@Column(name="ERR2354028")
	 private double ERR2354028;
	
	@Column(name="ERR2354029")
	 private double ERR2354029;
	
	@Column(name="ERR2354030")
	 private double ERR2354030;
	
	@Column(name="ERR2354031")
	 private double ERR2354031;
	
	@Column(name="ERR2354032")
	 private double ERR2354032;
	
	@Column(name="ERR2354033")
	 private double ERR2354033;
	
	@Column(name="ERR2354034")
	 private double ERR2354034;
	
	@Column(name="ERR2354035")
	 private double ERR2354035;
	
	@Column(name="ERR2354036")
	 private double ERR2354036;

	public Epididymis() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Epididymis(int id, Genes gene, double eRR2352624, double eRR2352625, double eRR2352626, double eRR2352627,
			double eRR2352628, double eRR2352629, double eRR2352630, double eRR2352631, double eRR2352632,
			double eRR2353645, double eRR2353646, double eRR2353647, double eRR2353648, double eRR2353649,
			double eRR2353650, double eRR2353651, double eRR2354028, double eRR2354029, double eRR2354030,
			double eRR2354031, double eRR2354032, double eRR2354033, double eRR2354034, double eRR2354035,
			double eRR2354036) {
		super();
		this.id = id;
		this.gene = gene;
		ERR2352624 = eRR2352624;
		ERR2352625 = eRR2352625;
		ERR2352626 = eRR2352626;
		ERR2352627 = eRR2352627;
		ERR2352628 = eRR2352628;
		ERR2352629 = eRR2352629;
		ERR2352630 = eRR2352630;
		ERR2352631 = eRR2352631;
		ERR2352632 = eRR2352632;
		ERR2353645 = eRR2353645;
		ERR2353646 = eRR2353646;
		ERR2353647 = eRR2353647;
		ERR2353648 = eRR2353648;
		ERR2353649 = eRR2353649;
		ERR2353650 = eRR2353650;
		ERR2353651 = eRR2353651;
		ERR2354028 = eRR2354028;
		ERR2354029 = eRR2354029;
		ERR2354030 = eRR2354030;
		ERR2354031 = eRR2354031;
		ERR2354032 = eRR2354032;
		ERR2354033 = eRR2354033;
		ERR2354034 = eRR2354034;
		ERR2354035 = eRR2354035;
		ERR2354036 = eRR2354036;
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

	public double getERR2352624() {
		return ERR2352624;
	}

	public void setERR2352624(double eRR2352624) {
		ERR2352624 = eRR2352624;
	}

	public double getERR2352625() {
		return ERR2352625;
	}

	public void setERR2352625(double eRR2352625) {
		ERR2352625 = eRR2352625;
	}

	public double getERR2352626() {
		return ERR2352626;
	}

	public void setERR2352626(double eRR2352626) {
		ERR2352626 = eRR2352626;
	}

	public double getERR2352627() {
		return ERR2352627;
	}

	public void setERR2352627(double eRR2352627) {
		ERR2352627 = eRR2352627;
	}

	public double getERR2352628() {
		return ERR2352628;
	}

	public void setERR2352628(double eRR2352628) {
		ERR2352628 = eRR2352628;
	}

	public double getERR2352629() {
		return ERR2352629;
	}

	public void setERR2352629(double eRR2352629) {
		ERR2352629 = eRR2352629;
	}

	public double getERR2352630() {
		return ERR2352630;
	}

	public void setERR2352630(double eRR2352630) {
		ERR2352630 = eRR2352630;
	}

	public double getERR2352631() {
		return ERR2352631;
	}

	public void setERR2352631(double eRR2352631) {
		ERR2352631 = eRR2352631;
	}

	public double getERR2352632() {
		return ERR2352632;
	}

	public void setERR2352632(double eRR2352632) {
		ERR2352632 = eRR2352632;
	}

	public double getERR2353645() {
		return ERR2353645;
	}

	public void setERR2353645(double eRR2353645) {
		ERR2353645 = eRR2353645;
	}

	public double getERR2353646() {
		return ERR2353646;
	}

	public void setERR2353646(double eRR2353646) {
		ERR2353646 = eRR2353646;
	}

	public double getERR2353647() {
		return ERR2353647;
	}

	public void setERR2353647(double eRR2353647) {
		ERR2353647 = eRR2353647;
	}

	public double getERR2353648() {
		return ERR2353648;
	}

	public void setERR2353648(double eRR2353648) {
		ERR2353648 = eRR2353648;
	}

	public double getERR2353649() {
		return ERR2353649;
	}

	public void setERR2353649(double eRR2353649) {
		ERR2353649 = eRR2353649;
	}

	public double getERR2353650() {
		return ERR2353650;
	}

	public void setERR2353650(double eRR2353650) {
		ERR2353650 = eRR2353650;
	}

	public double getERR2353651() {
		return ERR2353651;
	}

	public void setERR2353651(double eRR2353651) {
		ERR2353651 = eRR2353651;
	}

	public double getERR2354028() {
		return ERR2354028;
	}

	public void setERR2354028(double eRR2354028) {
		ERR2354028 = eRR2354028;
	}

	public double getERR2354029() {
		return ERR2354029;
	}

	public void setERR2354029(double eRR2354029) {
		ERR2354029 = eRR2354029;
	}

	public double getERR2354030() {
		return ERR2354030;
	}

	public void setERR2354030(double eRR2354030) {
		ERR2354030 = eRR2354030;
	}

	public double getERR2354031() {
		return ERR2354031;
	}

	public void setERR2354031(double eRR2354031) {
		ERR2354031 = eRR2354031;
	}

	public double getERR2354032() {
		return ERR2354032;
	}

	public void setERR2354032(double eRR2354032) {
		ERR2354032 = eRR2354032;
	}

	public double getERR2354033() {
		return ERR2354033;
	}

	public void setERR2354033(double eRR2354033) {
		ERR2354033 = eRR2354033;
	}

	public double getERR2354034() {
		return ERR2354034;
	}

	public void setERR2354034(double eRR2354034) {
		ERR2354034 = eRR2354034;
	}

	public double getERR2354035() {
		return ERR2354035;
	}

	public void setERR2354035(double eRR2354035) {
		ERR2354035 = eRR2354035;
	}

	public double getERR2354036() {
		return ERR2354036;
	}

	public void setERR2354036(double eRR2354036) {
		ERR2354036 = eRR2354036;
	}

	@Override
	public String toString() {
		return "Epididymis [id=" + id + ", gene=" + gene + ", ERR2352624=" + ERR2352624 + ", ERR2352625=" + ERR2352625
				+ ", ERR2352626=" + ERR2352626 + ", ERR2352627=" + ERR2352627 + ", ERR2352628=" + ERR2352628
				+ ", ERR2352629=" + ERR2352629 + ", ERR2352630=" + ERR2352630 + ", ERR2352631=" + ERR2352631
				+ ", ERR2352632=" + ERR2352632 + ", ERR2353645=" + ERR2353645 + ", ERR2353646=" + ERR2353646
				+ ", ERR2353647=" + ERR2353647 + ", ERR2353648=" + ERR2353648 + ", ERR2353649=" + ERR2353649
				+ ", ERR2353650=" + ERR2353650 + ", ERR2353651=" + ERR2353651 + ", ERR2354028=" + ERR2354028
				+ ", ERR2354029=" + ERR2354029 + ", ERR2354030=" + ERR2354030 + ", ERR2354031=" + ERR2354031
				+ ", ERR2354032=" + ERR2354032 + ", ERR2354033=" + ERR2354033 + ", ERR2354034=" + ERR2354034
				+ ", ERR2354035=" + ERR2354035 + ", ERR2354036=" + ERR2354036 + "]";
	}
	
	
}
