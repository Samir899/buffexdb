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
@Table(name = "jejunum")
public class Jejunum {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
	 @Column(name="ERR2352633")
	 private double ERR2352633;

	@Column(name="ERR2352634")
	 private double ERR2352634;

	@Column(name="ERR2352635")
	 private double ERR2352635;

	@Column(name="ERR2352636")
	 private double ERR2352636;

	@Column(name="ERR2352637")
	 private double ERR2352637;

	@Column(name="ERR2352638")
	 private double ERR2352638;

	@Column(name="ERR2352639")
	 private double ERR2352639;

	@Column(name="ERR2352640")
	 private double ERR2352640;

	@Column(name="ERR2352641")
	 private double ERR2352641;

	@Column(name="ERR2352835")
	 private double ERR2352835;

	@Column(name="ERR2352836")
	 private double ERR2352836;

	@Column(name="ERR2352837")
	 private double ERR2352837;

	@Column(name="ERR2352838")
	 private double ERR2352838;

	@Column(name="ERR2352839")
	 private double ERR2352839;

	@Column(name="ERR2352840")
	 private double ERR2352840;

	@Column(name="ERR2352841")
	 private double ERR2352841;

	@Column(name="ERR2353200")
	 private double ERR2353200;

	@Column(name="ERR2353201")
	 private double ERR2353201;

	@Column(name="ERR2353202")
	 private double ERR2353202;

	@Column(name="ERR2353203")
	 private double ERR2353203;

	@Column(name="ERR2353204")
	 private double ERR2353204;

	@Column(name="ERR2353205")
	 private double ERR2353205;

	@Column(name="ERR2353206")
	 private double ERR2353206;

	@Column(name="ERR2353207")
	 private double ERR2353207;

	@Column(name="ERR2353208")
	 private double ERR2353208;

	@Column(name="ERR2353686")
	 private double ERR2353686;

	@Column(name="ERR2353687")
	 private double ERR2353687;

	@Column(name="ERR2353688")
	 private double ERR2353688;

	@Column(name="ERR2353689")
	 private double ERR2353689;

	@Column(name="ERR2353690")
	 private double ERR2353690;

	@Column(name="ERR2353691")
	 private double ERR2353691;

	@Column(name="ERR2353692")
	 private double ERR2353692;

	@Column(name="ERR2354060")
	 private double ERR2354060;

	@Column(name="ERR2354061")
	 private double ERR2354061;

	@Column(name="ERR2354062")
	 private double ERR2354062;

	@Column(name="ERR2354063")
	 private double ERR2354063;

	@Column(name="ERR2354064")
	 private double ERR2354064;

	@Column(name="ERR2354065")
	 private double ERR2354065;

	@Column(name="ERR2354066")
	 private double ERR2354066;

	@Column(name="ERR2354067")
	 private double ERR2354067;

	@Column(name="ERR2354068")
	 private double ERR2354068;

	@Column(name="ERR2354743")
	 private double ERR2354743;

	@Column(name="ERR2354744")
	 private double ERR2354744;

	@Column(name="ERR2354745")
	 private double ERR2354745;

	@Column(name="ERR2354746")
	 private double ERR2354746;

	@Column(name="ERR2354747")
	 private double ERR2354747;

	@Column(name="ERR2354748")
	 private double ERR2354748;

	@Column(name="ERR2354749")
	 private double ERR2354749;

	@Column(name="ERR2354750")
	 private double ERR2354750;

	@Column(name="ERR2354751")
	 private double ERR2354751;

	@Column(name="SRR24057903")
	 private double SRR24057903;

	@Column(name="SRR24057904")
	 private double SRR24057904;

	@Column(name="SRR24057934")
	 private double SRR24057934;

	public Jejunum() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Jejunum(int id, Genes gene, double eRR2352633, double eRR2352634, double eRR2352635, double eRR2352636,
			double eRR2352637, double eRR2352638, double eRR2352639, double eRR2352640, double eRR2352641,
			double eRR2352835, double eRR2352836, double eRR2352837, double eRR2352838, double eRR2352839,
			double eRR2352840, double eRR2352841, double eRR2353200, double eRR2353201, double eRR2353202,
			double eRR2353203, double eRR2353204, double eRR2353205, double eRR2353206, double eRR2353207,
			double eRR2353208, double eRR2353686, double eRR2353687, double eRR2353688, double eRR2353689,
			double eRR2353690, double eRR2353691, double eRR2353692, double eRR2354060, double eRR2354061,
			double eRR2354062, double eRR2354063, double eRR2354064, double eRR2354065, double eRR2354066,
			double eRR2354067, double eRR2354068, double eRR2354743, double eRR2354744, double eRR2354745,
			double eRR2354746, double eRR2354747, double eRR2354748, double eRR2354749, double eRR2354750,
			double eRR2354751, double sRR24057903, double sRR24057904, double sRR24057934) {
		super();
		this.id = id;
		this.gene = gene;
		ERR2352633 = eRR2352633;
		ERR2352634 = eRR2352634;
		ERR2352635 = eRR2352635;
		ERR2352636 = eRR2352636;
		ERR2352637 = eRR2352637;
		ERR2352638 = eRR2352638;
		ERR2352639 = eRR2352639;
		ERR2352640 = eRR2352640;
		ERR2352641 = eRR2352641;
		ERR2352835 = eRR2352835;
		ERR2352836 = eRR2352836;
		ERR2352837 = eRR2352837;
		ERR2352838 = eRR2352838;
		ERR2352839 = eRR2352839;
		ERR2352840 = eRR2352840;
		ERR2352841 = eRR2352841;
		ERR2353200 = eRR2353200;
		ERR2353201 = eRR2353201;
		ERR2353202 = eRR2353202;
		ERR2353203 = eRR2353203;
		ERR2353204 = eRR2353204;
		ERR2353205 = eRR2353205;
		ERR2353206 = eRR2353206;
		ERR2353207 = eRR2353207;
		ERR2353208 = eRR2353208;
		ERR2353686 = eRR2353686;
		ERR2353687 = eRR2353687;
		ERR2353688 = eRR2353688;
		ERR2353689 = eRR2353689;
		ERR2353690 = eRR2353690;
		ERR2353691 = eRR2353691;
		ERR2353692 = eRR2353692;
		ERR2354060 = eRR2354060;
		ERR2354061 = eRR2354061;
		ERR2354062 = eRR2354062;
		ERR2354063 = eRR2354063;
		ERR2354064 = eRR2354064;
		ERR2354065 = eRR2354065;
		ERR2354066 = eRR2354066;
		ERR2354067 = eRR2354067;
		ERR2354068 = eRR2354068;
		ERR2354743 = eRR2354743;
		ERR2354744 = eRR2354744;
		ERR2354745 = eRR2354745;
		ERR2354746 = eRR2354746;
		ERR2354747 = eRR2354747;
		ERR2354748 = eRR2354748;
		ERR2354749 = eRR2354749;
		ERR2354750 = eRR2354750;
		ERR2354751 = eRR2354751;
		SRR24057903 = sRR24057903;
		SRR24057904 = sRR24057904;
		SRR24057934 = sRR24057934;
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

	public double getERR2352633() {
		return ERR2352633;
	}

	public void setERR2352633(double eRR2352633) {
		ERR2352633 = eRR2352633;
	}

	public double getERR2352634() {
		return ERR2352634;
	}

	public void setERR2352634(double eRR2352634) {
		ERR2352634 = eRR2352634;
	}

	public double getERR2352635() {
		return ERR2352635;
	}

	public void setERR2352635(double eRR2352635) {
		ERR2352635 = eRR2352635;
	}

	public double getERR2352636() {
		return ERR2352636;
	}

	public void setERR2352636(double eRR2352636) {
		ERR2352636 = eRR2352636;
	}

	public double getERR2352637() {
		return ERR2352637;
	}

	public void setERR2352637(double eRR2352637) {
		ERR2352637 = eRR2352637;
	}

	public double getERR2352638() {
		return ERR2352638;
	}

	public void setERR2352638(double eRR2352638) {
		ERR2352638 = eRR2352638;
	}

	public double getERR2352639() {
		return ERR2352639;
	}

	public void setERR2352639(double eRR2352639) {
		ERR2352639 = eRR2352639;
	}

	public double getERR2352640() {
		return ERR2352640;
	}

	public void setERR2352640(double eRR2352640) {
		ERR2352640 = eRR2352640;
	}

	public double getERR2352641() {
		return ERR2352641;
	}

	public void setERR2352641(double eRR2352641) {
		ERR2352641 = eRR2352641;
	}

	public double getERR2352835() {
		return ERR2352835;
	}

	public void setERR2352835(double eRR2352835) {
		ERR2352835 = eRR2352835;
	}

	public double getERR2352836() {
		return ERR2352836;
	}

	public void setERR2352836(double eRR2352836) {
		ERR2352836 = eRR2352836;
	}

	public double getERR2352837() {
		return ERR2352837;
	}

	public void setERR2352837(double eRR2352837) {
		ERR2352837 = eRR2352837;
	}

	public double getERR2352838() {
		return ERR2352838;
	}

	public void setERR2352838(double eRR2352838) {
		ERR2352838 = eRR2352838;
	}

	public double getERR2352839() {
		return ERR2352839;
	}

	public void setERR2352839(double eRR2352839) {
		ERR2352839 = eRR2352839;
	}

	public double getERR2352840() {
		return ERR2352840;
	}

	public void setERR2352840(double eRR2352840) {
		ERR2352840 = eRR2352840;
	}

	public double getERR2352841() {
		return ERR2352841;
	}

	public void setERR2352841(double eRR2352841) {
		ERR2352841 = eRR2352841;
	}

	public double getERR2353200() {
		return ERR2353200;
	}

	public void setERR2353200(double eRR2353200) {
		ERR2353200 = eRR2353200;
	}

	public double getERR2353201() {
		return ERR2353201;
	}

	public void setERR2353201(double eRR2353201) {
		ERR2353201 = eRR2353201;
	}

	public double getERR2353202() {
		return ERR2353202;
	}

	public void setERR2353202(double eRR2353202) {
		ERR2353202 = eRR2353202;
	}

	public double getERR2353203() {
		return ERR2353203;
	}

	public void setERR2353203(double eRR2353203) {
		ERR2353203 = eRR2353203;
	}

	public double getERR2353204() {
		return ERR2353204;
	}

	public void setERR2353204(double eRR2353204) {
		ERR2353204 = eRR2353204;
	}

	public double getERR2353205() {
		return ERR2353205;
	}

	public void setERR2353205(double eRR2353205) {
		ERR2353205 = eRR2353205;
	}

	public double getERR2353206() {
		return ERR2353206;
	}

	public void setERR2353206(double eRR2353206) {
		ERR2353206 = eRR2353206;
	}

	public double getERR2353207() {
		return ERR2353207;
	}

	public void setERR2353207(double eRR2353207) {
		ERR2353207 = eRR2353207;
	}

	public double getERR2353208() {
		return ERR2353208;
	}

	public void setERR2353208(double eRR2353208) {
		ERR2353208 = eRR2353208;
	}

	public double getERR2353686() {
		return ERR2353686;
	}

	public void setERR2353686(double eRR2353686) {
		ERR2353686 = eRR2353686;
	}

	public double getERR2353687() {
		return ERR2353687;
	}

	public void setERR2353687(double eRR2353687) {
		ERR2353687 = eRR2353687;
	}

	public double getERR2353688() {
		return ERR2353688;
	}

	public void setERR2353688(double eRR2353688) {
		ERR2353688 = eRR2353688;
	}

	public double getERR2353689() {
		return ERR2353689;
	}

	public void setERR2353689(double eRR2353689) {
		ERR2353689 = eRR2353689;
	}

	public double getERR2353690() {
		return ERR2353690;
	}

	public void setERR2353690(double eRR2353690) {
		ERR2353690 = eRR2353690;
	}

	public double getERR2353691() {
		return ERR2353691;
	}

	public void setERR2353691(double eRR2353691) {
		ERR2353691 = eRR2353691;
	}

	public double getERR2353692() {
		return ERR2353692;
	}

	public void setERR2353692(double eRR2353692) {
		ERR2353692 = eRR2353692;
	}

	public double getERR2354060() {
		return ERR2354060;
	}

	public void setERR2354060(double eRR2354060) {
		ERR2354060 = eRR2354060;
	}

	public double getERR2354061() {
		return ERR2354061;
	}

	public void setERR2354061(double eRR2354061) {
		ERR2354061 = eRR2354061;
	}

	public double getERR2354062() {
		return ERR2354062;
	}

	public void setERR2354062(double eRR2354062) {
		ERR2354062 = eRR2354062;
	}

	public double getERR2354063() {
		return ERR2354063;
	}

	public void setERR2354063(double eRR2354063) {
		ERR2354063 = eRR2354063;
	}

	public double getERR2354064() {
		return ERR2354064;
	}

	public void setERR2354064(double eRR2354064) {
		ERR2354064 = eRR2354064;
	}

	public double getERR2354065() {
		return ERR2354065;
	}

	public void setERR2354065(double eRR2354065) {
		ERR2354065 = eRR2354065;
	}

	public double getERR2354066() {
		return ERR2354066;
	}

	public void setERR2354066(double eRR2354066) {
		ERR2354066 = eRR2354066;
	}

	public double getERR2354067() {
		return ERR2354067;
	}

	public void setERR2354067(double eRR2354067) {
		ERR2354067 = eRR2354067;
	}

	public double getERR2354068() {
		return ERR2354068;
	}

	public void setERR2354068(double eRR2354068) {
		ERR2354068 = eRR2354068;
	}

	public double getERR2354743() {
		return ERR2354743;
	}

	public void setERR2354743(double eRR2354743) {
		ERR2354743 = eRR2354743;
	}

	public double getERR2354744() {
		return ERR2354744;
	}

	public void setERR2354744(double eRR2354744) {
		ERR2354744 = eRR2354744;
	}

	public double getERR2354745() {
		return ERR2354745;
	}

	public void setERR2354745(double eRR2354745) {
		ERR2354745 = eRR2354745;
	}

	public double getERR2354746() {
		return ERR2354746;
	}

	public void setERR2354746(double eRR2354746) {
		ERR2354746 = eRR2354746;
	}

	public double getERR2354747() {
		return ERR2354747;
	}

	public void setERR2354747(double eRR2354747) {
		ERR2354747 = eRR2354747;
	}

	public double getERR2354748() {
		return ERR2354748;
	}

	public void setERR2354748(double eRR2354748) {
		ERR2354748 = eRR2354748;
	}

	public double getERR2354749() {
		return ERR2354749;
	}

	public void setERR2354749(double eRR2354749) {
		ERR2354749 = eRR2354749;
	}

	public double getERR2354750() {
		return ERR2354750;
	}

	public void setERR2354750(double eRR2354750) {
		ERR2354750 = eRR2354750;
	}

	public double getERR2354751() {
		return ERR2354751;
	}

	public void setERR2354751(double eRR2354751) {
		ERR2354751 = eRR2354751;
	}

	public double getSRR24057903() {
		return SRR24057903;
	}

	public void setSRR24057903(double sRR24057903) {
		SRR24057903 = sRR24057903;
	}

	public double getSRR24057904() {
		return SRR24057904;
	}

	public void setSRR24057904(double sRR24057904) {
		SRR24057904 = sRR24057904;
	}

	public double getSRR24057934() {
		return SRR24057934;
	}

	public void setSRR24057934(double sRR24057934) {
		SRR24057934 = sRR24057934;
	}

	@Override
	public String toString() {
		return "Jejunum [id=" + id + ", gene=" + gene + ", ERR2352633=" + ERR2352633 + ", ERR2352634=" + ERR2352634
				+ ", ERR2352635=" + ERR2352635 + ", ERR2352636=" + ERR2352636 + ", ERR2352637=" + ERR2352637
				+ ", ERR2352638=" + ERR2352638 + ", ERR2352639=" + ERR2352639 + ", ERR2352640=" + ERR2352640
				+ ", ERR2352641=" + ERR2352641 + ", ERR2352835=" + ERR2352835 + ", ERR2352836=" + ERR2352836
				+ ", ERR2352837=" + ERR2352837 + ", ERR2352838=" + ERR2352838 + ", ERR2352839=" + ERR2352839
				+ ", ERR2352840=" + ERR2352840 + ", ERR2352841=" + ERR2352841 + ", ERR2353200=" + ERR2353200
				+ ", ERR2353201=" + ERR2353201 + ", ERR2353202=" + ERR2353202 + ", ERR2353203=" + ERR2353203
				+ ", ERR2353204=" + ERR2353204 + ", ERR2353205=" + ERR2353205 + ", ERR2353206=" + ERR2353206
				+ ", ERR2353207=" + ERR2353207 + ", ERR2353208=" + ERR2353208 + ", ERR2353686=" + ERR2353686
				+ ", ERR2353687=" + ERR2353687 + ", ERR2353688=" + ERR2353688 + ", ERR2353689=" + ERR2353689
				+ ", ERR2353690=" + ERR2353690 + ", ERR2353691=" + ERR2353691 + ", ERR2353692=" + ERR2353692
				+ ", ERR2354060=" + ERR2354060 + ", ERR2354061=" + ERR2354061 + ", ERR2354062=" + ERR2354062
				+ ", ERR2354063=" + ERR2354063 + ", ERR2354064=" + ERR2354064 + ", ERR2354065=" + ERR2354065
				+ ", ERR2354066=" + ERR2354066 + ", ERR2354067=" + ERR2354067 + ", ERR2354068=" + ERR2354068
				+ ", ERR2354743=" + ERR2354743 + ", ERR2354744=" + ERR2354744 + ", ERR2354745=" + ERR2354745
				+ ", ERR2354746=" + ERR2354746 + ", ERR2354747=" + ERR2354747 + ", ERR2354748=" + ERR2354748
				+ ", ERR2354749=" + ERR2354749 + ", ERR2354750=" + ERR2354750 + ", ERR2354751=" + ERR2354751
				+ ", SRR24057903=" + SRR24057903 + ", SRR24057904=" + SRR24057904 + ", SRR24057934=" + SRR24057934
				+ "]";
	}
}
