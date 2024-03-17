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
@Table(name = "brain")
public class Brain {
	 @Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
	 @Column(name="SRR15721738")
	 private double SRR15721738;
	 
	 @Column(name="SRR15721741")
	 private double SRR15721741;
	 
	 @Column(name="SRR15721752")
	 private double SRR15721752;
	 
	 @Column(name="SRR15721753")
	 private double SRR15721753;
	 
	 @Column(name="SRR15721754")
	 private double SRR15721754;
	 
	 @Column(name="SRR15721756")
	 private double SRR15721756;
	 
	 @Column(name="SRR15721757")
	 private double SRR15721757;
	 
	 @Column(name="SRR15721761")
	 private double SRR15721761;

	public Brain() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Brain(int id, Genes gene, double sRR15721738, double sRR15721741, double sRR15721752, double sRR15721753,
			double sRR15721754, double sRR15721756, double sRR15721757, double sRR15721761) {
		super();
		this.id = id;
		this.gene = gene;
		SRR15721738 = sRR15721738;
		SRR15721741 = sRR15721741;
		SRR15721752 = sRR15721752;
		SRR15721753 = sRR15721753;
		SRR15721754 = sRR15721754;
		SRR15721756 = sRR15721756;
		SRR15721757 = sRR15721757;
		SRR15721761 = sRR15721761;
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

	public double getSRR15721738() {
		return SRR15721738;
	}

	public void setSRR15721738(double sRR15721738) {
		SRR15721738 = sRR15721738;
	}

	public double getSRR15721741() {
		return SRR15721741;
	}

	public void setSRR15721741(double sRR15721741) {
		SRR15721741 = sRR15721741;
	}

	public double getSRR15721752() {
		return SRR15721752;
	}

	public void setSRR15721752(double sRR15721752) {
		SRR15721752 = sRR15721752;
	}

	public double getSRR15721753() {
		return SRR15721753;
	}

	public void setSRR15721753(double sRR15721753) {
		SRR15721753 = sRR15721753;
	}

	public double getSRR15721754() {
		return SRR15721754;
	}

	public void setSRR15721754(double sRR15721754) {
		SRR15721754 = sRR15721754;
	}

	public double getSRR15721756() {
		return SRR15721756;
	}

	public void setSRR15721756(double sRR15721756) {
		SRR15721756 = sRR15721756;
	}

	public double getSRR15721757() {
		return SRR15721757;
	}

	public void setSRR15721757(double sRR15721757) {
		SRR15721757 = sRR15721757;
	}

	public double getSRR15721761() {
		return SRR15721761;
	}

	public void setSRR15721761(double sRR15721761) {
		SRR15721761 = sRR15721761;
	}

	@Override
	public String toString() {
		return "Brain [id=" + id + ", gene=" + gene + ", SRR15721738=" + SRR15721738 + ", SRR15721741=" + SRR15721741
				+ ", SRR15721752=" + SRR15721752 + ", SRR15721753=" + SRR15721753 + ", SRR15721754=" + SRR15721754
				+ ", SRR15721756=" + SRR15721756 + ", SRR15721757=" + SRR15721757 + ", SRR15721761=" + SRR15721761
				+ "]";
	}
	 
}
