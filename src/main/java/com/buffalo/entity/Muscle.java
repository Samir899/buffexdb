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
@Table(name = "muscle")
public class Muscle {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
	 @Column(name="SRR10312259")
	 private double SRR10312259;

	@Column(name="SRR10312260")
	 private double SRR10312260;

	@Column(name="SRR10312261")
	 private double SRR10312261;

	@Column(name="SRR13435634")
	 private double SRR13435634;

	@Column(name="SRR13435635")
	 private double SRR13435635;

	@Column(name="SRR13435636")
	 private double SRR13435636;

	@Column(name="SRR13435637")
	 private double SRR13435637;

	@Column(name="SRR13435638")
	 private double SRR13435638;

	@Column(name="SRR13435639")
	 private double SRR13435639;

	@Column(name="SRR15721759")
	 private double SRR15721759;

	public Muscle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Muscle(int id, Genes gene, double sRR10312259, double sRR10312260, double sRR10312261, double sRR13435634,
			double sRR13435635, double sRR13435636, double sRR13435637, double sRR13435638, double sRR13435639,
			double sRR15721759) {
		super();
		this.id = id;
		this.gene = gene;
		SRR10312259 = sRR10312259;
		SRR10312260 = sRR10312260;
		SRR10312261 = sRR10312261;
		SRR13435634 = sRR13435634;
		SRR13435635 = sRR13435635;
		SRR13435636 = sRR13435636;
		SRR13435637 = sRR13435637;
		SRR13435638 = sRR13435638;
		SRR13435639 = sRR13435639;
		SRR15721759 = sRR15721759;
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

	public double getSRR10312259() {
		return SRR10312259;
	}

	public void setSRR10312259(double sRR10312259) {
		SRR10312259 = sRR10312259;
	}

	public double getSRR10312260() {
		return SRR10312260;
	}

	public void setSRR10312260(double sRR10312260) {
		SRR10312260 = sRR10312260;
	}

	public double getSRR10312261() {
		return SRR10312261;
	}

	public void setSRR10312261(double sRR10312261) {
		SRR10312261 = sRR10312261;
	}

	public double getSRR13435634() {
		return SRR13435634;
	}

	public void setSRR13435634(double sRR13435634) {
		SRR13435634 = sRR13435634;
	}

	public double getSRR13435635() {
		return SRR13435635;
	}

	public void setSRR13435635(double sRR13435635) {
		SRR13435635 = sRR13435635;
	}

	public double getSRR13435636() {
		return SRR13435636;
	}

	public void setSRR13435636(double sRR13435636) {
		SRR13435636 = sRR13435636;
	}

	public double getSRR13435637() {
		return SRR13435637;
	}

	public void setSRR13435637(double sRR13435637) {
		SRR13435637 = sRR13435637;
	}

	public double getSRR13435638() {
		return SRR13435638;
	}

	public void setSRR13435638(double sRR13435638) {
		SRR13435638 = sRR13435638;
	}

	public double getSRR13435639() {
		return SRR13435639;
	}

	public void setSRR13435639(double sRR13435639) {
		SRR13435639 = sRR13435639;
	}

	public double getSRR15721759() {
		return SRR15721759;
	}

	public void setSRR15721759(double sRR15721759) {
		SRR15721759 = sRR15721759;
	}

	@Override
	public String toString() {
		return "Muscle [id=" + id + ", gene=" + gene + ", SRR10312259=" + SRR10312259 + ", SRR10312260=" + SRR10312260
				+ ", SRR10312261=" + SRR10312261 + ", SRR13435634=" + SRR13435634 + ", SRR13435635=" + SRR13435635
				+ ", SRR13435636=" + SRR13435636 + ", SRR13435637=" + SRR13435637 + ", SRR13435638=" + SRR13435638
				+ ", SRR13435639=" + SRR13435639 + ", SRR15721759=" + SRR15721759 + "]";
	}
}
