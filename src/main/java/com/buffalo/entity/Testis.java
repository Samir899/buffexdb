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
@Table(name = "testis")
public class Testis {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
	 @Column(name="ERR2352738")
	 private double ERR2352738;

	 @Column(name="ERR2352739")
	 private double ERR2352739;

	 @Column(name="ERR2352740")
	 private double ERR2352740;

	 @Column(name="ERR2352741")
	 private double ERR2352741;

	 @Column(name="ERR2352742")
	 private double ERR2352742;

	 @Column(name="ERR2352743")
	 private double ERR2352743;

	 @Column(name="ERR2352744")
	 private double ERR2352744;

	 @Column(name="ERR2352745")
	 private double ERR2352745;

	 @Column(name="ERR2352746")
	 private double ERR2352746;

	 @Column(name="ERR2352747")
	 private double ERR2352747;

	 @Column(name="ERR2352748")
	 private double ERR2352748;

	 @Column(name="ERR2352749")
	 private double ERR2352749;

	 @Column(name="ERR2352750")
	 private double ERR2352750;

	 @Column(name="ERR2352751")
	 private double ERR2352751;

	 @Column(name="ERR2352752")
	 private double ERR2352752;

	 @Column(name="ERR2352753")
	 private double ERR2352753;

	 @Column(name="ERR2352754")
	 private double ERR2352754;

	 @Column(name="ERR2352755")
	 private double ERR2352755;

	 @Column(name="ERR2352756")
	 private double ERR2352756;

	 @Column(name="ERR2352757")
	 private double ERR2352757;

	 @Column(name="ERR2352758")
	 private double ERR2352758;

	 @Column(name="ERR2352759")
	 private double ERR2352759;

	 @Column(name="ERR2352760")
	 private double ERR2352760;

	 @Column(name="ERR2353836")
	 private double ERR2353836;

	 @Column(name="ERR2353837")
	 private double ERR2353837;

	 @Column(name="ERR2353838")
	 private double ERR2353838;

	 @Column(name="ERR2353839")
	 private double ERR2353839;

	 @Column(name="ERR2353840")
	 private double ERR2353840;

	 @Column(name="ERR2353841")
	 private double ERR2353841;

	 @Column(name="ERR2353842")
	 private double ERR2353842;

	 @Column(name="ERR2353843")
	 private double ERR2353843;

	 @Column(name="ERR2353844")
	 private double ERR2353844;

	 @Column(name="ERR2354365")
	 private double ERR2354365;

	 @Column(name="ERR2354366")
	 private double ERR2354366;

	 @Column(name="ERR2354367")
	 private double ERR2354367;

	 @Column(name="ERR2354368")
	 private double ERR2354368;

	 @Column(name="ERR2354369")
	 private double ERR2354369;

	 @Column(name="ERR2354370")
	 private double ERR2354370;

	 @Column(name="ERR2354371")
	 private double ERR2354371;

	 @Column(name="ERR2354372")
	 private double ERR2354372;

	 @Column(name="ERR2354373")
	 private double ERR2354373;

	 @Column(name="ERR2354374")
	 private double ERR2354374;

	 @Column(name="ERR2354375")
	 private double ERR2354375;

	 @Column(name="ERR2354376")
	 private double ERR2354376;

	 @Column(name="ERR2354377")
	 private double ERR2354377;

	 @Column(name="ERR2354378")
	 private double ERR2354378;

	 @Column(name="ERR2354379")
	 private double ERR2354379;

	 @Column(name="ERR2354380")
	 private double ERR2354380;

	 @Column(name="ERR2354381")
	 private double ERR2354381;

	 @Column(name="ERR2354382")
	 private double ERR2354382;

	 @Column(name="ERR2354383")
	 private double ERR2354383;

	 @Column(name="ERR2354384")
	 private double ERR2354384;

	 @Column(name="ERR2354385")
	 private double ERR2354385;

	 @Column(name="ERR2354386")
	 private double ERR2354386;

	 @Column(name="ERR2354387")
	 private double ERR2354387;

	 @Column(name="SRR17169788")
	 private double SRR17169788;

	 @Column(name="SRR17169789")
	 private double SRR17169789;

	 @Column(name="SRR17169790")
	 private double SRR17169790;

	 @Column(name="SRR17169791")
	 private double SRR17169791;

	 @Column(name="SRR17169792")
	 private double SRR17169792;

	 @Column(name="SRR17169793")
	 private double SRR17169793;

	 @Column(name="SRR17169794")
	 private double SRR17169794;

	public Testis() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Testis(int id, Genes gene, double eRR2352738, double eRR2352739, double eRR2352740, double eRR2352741,
			double eRR2352742, double eRR2352743, double eRR2352744, double eRR2352745, double eRR2352746,
			double eRR2352747, double eRR2352748, double eRR2352749, double eRR2352750, double eRR2352751,
			double eRR2352752, double eRR2352753, double eRR2352754, double eRR2352755, double eRR2352756,
			double eRR2352757, double eRR2352758, double eRR2352759, double eRR2352760, double eRR2353836,
			double eRR2353837, double eRR2353838, double eRR2353839, double eRR2353840, double eRR2353841,
			double eRR2353842, double eRR2353843, double eRR2353844, double eRR2354365, double eRR2354366,
			double eRR2354367, double eRR2354368, double eRR2354369, double eRR2354370, double eRR2354371,
			double eRR2354372, double eRR2354373, double eRR2354374, double eRR2354375, double eRR2354376,
			double eRR2354377, double eRR2354378, double eRR2354379, double eRR2354380, double eRR2354381,
			double eRR2354382, double eRR2354383, double eRR2354384, double eRR2354385, double eRR2354386,
			double eRR2354387, double sRR17169788, double sRR17169789, double sRR17169790, double sRR17169791,
			double sRR17169792, double sRR17169793, double sRR17169794) {
		super();
		this.id = id;
		this.gene = gene;
		ERR2352738 = eRR2352738;
		ERR2352739 = eRR2352739;
		ERR2352740 = eRR2352740;
		ERR2352741 = eRR2352741;
		ERR2352742 = eRR2352742;
		ERR2352743 = eRR2352743;
		ERR2352744 = eRR2352744;
		ERR2352745 = eRR2352745;
		ERR2352746 = eRR2352746;
		ERR2352747 = eRR2352747;
		ERR2352748 = eRR2352748;
		ERR2352749 = eRR2352749;
		ERR2352750 = eRR2352750;
		ERR2352751 = eRR2352751;
		ERR2352752 = eRR2352752;
		ERR2352753 = eRR2352753;
		ERR2352754 = eRR2352754;
		ERR2352755 = eRR2352755;
		ERR2352756 = eRR2352756;
		ERR2352757 = eRR2352757;
		ERR2352758 = eRR2352758;
		ERR2352759 = eRR2352759;
		ERR2352760 = eRR2352760;
		ERR2353836 = eRR2353836;
		ERR2353837 = eRR2353837;
		ERR2353838 = eRR2353838;
		ERR2353839 = eRR2353839;
		ERR2353840 = eRR2353840;
		ERR2353841 = eRR2353841;
		ERR2353842 = eRR2353842;
		ERR2353843 = eRR2353843;
		ERR2353844 = eRR2353844;
		ERR2354365 = eRR2354365;
		ERR2354366 = eRR2354366;
		ERR2354367 = eRR2354367;
		ERR2354368 = eRR2354368;
		ERR2354369 = eRR2354369;
		ERR2354370 = eRR2354370;
		ERR2354371 = eRR2354371;
		ERR2354372 = eRR2354372;
		ERR2354373 = eRR2354373;
		ERR2354374 = eRR2354374;
		ERR2354375 = eRR2354375;
		ERR2354376 = eRR2354376;
		ERR2354377 = eRR2354377;
		ERR2354378 = eRR2354378;
		ERR2354379 = eRR2354379;
		ERR2354380 = eRR2354380;
		ERR2354381 = eRR2354381;
		ERR2354382 = eRR2354382;
		ERR2354383 = eRR2354383;
		ERR2354384 = eRR2354384;
		ERR2354385 = eRR2354385;
		ERR2354386 = eRR2354386;
		ERR2354387 = eRR2354387;
		SRR17169788 = sRR17169788;
		SRR17169789 = sRR17169789;
		SRR17169790 = sRR17169790;
		SRR17169791 = sRR17169791;
		SRR17169792 = sRR17169792;
		SRR17169793 = sRR17169793;
		SRR17169794 = sRR17169794;
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

	public double getERR2352738() {
		return ERR2352738;
	}

	public void setERR2352738(double eRR2352738) {
		ERR2352738 = eRR2352738;
	}

	public double getERR2352739() {
		return ERR2352739;
	}

	public void setERR2352739(double eRR2352739) {
		ERR2352739 = eRR2352739;
	}

	public double getERR2352740() {
		return ERR2352740;
	}

	public void setERR2352740(double eRR2352740) {
		ERR2352740 = eRR2352740;
	}

	public double getERR2352741() {
		return ERR2352741;
	}

	public void setERR2352741(double eRR2352741) {
		ERR2352741 = eRR2352741;
	}

	public double getERR2352742() {
		return ERR2352742;
	}

	public void setERR2352742(double eRR2352742) {
		ERR2352742 = eRR2352742;
	}

	public double getERR2352743() {
		return ERR2352743;
	}

	public void setERR2352743(double eRR2352743) {
		ERR2352743 = eRR2352743;
	}

	public double getERR2352744() {
		return ERR2352744;
	}

	public void setERR2352744(double eRR2352744) {
		ERR2352744 = eRR2352744;
	}

	public double getERR2352745() {
		return ERR2352745;
	}

	public void setERR2352745(double eRR2352745) {
		ERR2352745 = eRR2352745;
	}

	public double getERR2352746() {
		return ERR2352746;
	}

	public void setERR2352746(double eRR2352746) {
		ERR2352746 = eRR2352746;
	}

	public double getERR2352747() {
		return ERR2352747;
	}

	public void setERR2352747(double eRR2352747) {
		ERR2352747 = eRR2352747;
	}

	public double getERR2352748() {
		return ERR2352748;
	}

	public void setERR2352748(double eRR2352748) {
		ERR2352748 = eRR2352748;
	}

	public double getERR2352749() {
		return ERR2352749;
	}

	public void setERR2352749(double eRR2352749) {
		ERR2352749 = eRR2352749;
	}

	public double getERR2352750() {
		return ERR2352750;
	}

	public void setERR2352750(double eRR2352750) {
		ERR2352750 = eRR2352750;
	}

	public double getERR2352751() {
		return ERR2352751;
	}

	public void setERR2352751(double eRR2352751) {
		ERR2352751 = eRR2352751;
	}

	public double getERR2352752() {
		return ERR2352752;
	}

	public void setERR2352752(double eRR2352752) {
		ERR2352752 = eRR2352752;
	}

	public double getERR2352753() {
		return ERR2352753;
	}

	public void setERR2352753(double eRR2352753) {
		ERR2352753 = eRR2352753;
	}

	public double getERR2352754() {
		return ERR2352754;
	}

	public void setERR2352754(double eRR2352754) {
		ERR2352754 = eRR2352754;
	}

	public double getERR2352755() {
		return ERR2352755;
	}

	public void setERR2352755(double eRR2352755) {
		ERR2352755 = eRR2352755;
	}

	public double getERR2352756() {
		return ERR2352756;
	}

	public void setERR2352756(double eRR2352756) {
		ERR2352756 = eRR2352756;
	}

	public double getERR2352757() {
		return ERR2352757;
	}

	public void setERR2352757(double eRR2352757) {
		ERR2352757 = eRR2352757;
	}

	public double getERR2352758() {
		return ERR2352758;
	}

	public void setERR2352758(double eRR2352758) {
		ERR2352758 = eRR2352758;
	}

	public double getERR2352759() {
		return ERR2352759;
	}

	public void setERR2352759(double eRR2352759) {
		ERR2352759 = eRR2352759;
	}

	public double getERR2352760() {
		return ERR2352760;
	}

	public void setERR2352760(double eRR2352760) {
		ERR2352760 = eRR2352760;
	}

	public double getERR2353836() {
		return ERR2353836;
	}

	public void setERR2353836(double eRR2353836) {
		ERR2353836 = eRR2353836;
	}

	public double getERR2353837() {
		return ERR2353837;
	}

	public void setERR2353837(double eRR2353837) {
		ERR2353837 = eRR2353837;
	}

	public double getERR2353838() {
		return ERR2353838;
	}

	public void setERR2353838(double eRR2353838) {
		ERR2353838 = eRR2353838;
	}

	public double getERR2353839() {
		return ERR2353839;
	}

	public void setERR2353839(double eRR2353839) {
		ERR2353839 = eRR2353839;
	}

	public double getERR2353840() {
		return ERR2353840;
	}

	public void setERR2353840(double eRR2353840) {
		ERR2353840 = eRR2353840;
	}

	public double getERR2353841() {
		return ERR2353841;
	}

	public void setERR2353841(double eRR2353841) {
		ERR2353841 = eRR2353841;
	}

	public double getERR2353842() {
		return ERR2353842;
	}

	public void setERR2353842(double eRR2353842) {
		ERR2353842 = eRR2353842;
	}

	public double getERR2353843() {
		return ERR2353843;
	}

	public void setERR2353843(double eRR2353843) {
		ERR2353843 = eRR2353843;
	}

	public double getERR2353844() {
		return ERR2353844;
	}

	public void setERR2353844(double eRR2353844) {
		ERR2353844 = eRR2353844;
	}

	public double getERR2354365() {
		return ERR2354365;
	}

	public void setERR2354365(double eRR2354365) {
		ERR2354365 = eRR2354365;
	}

	public double getERR2354366() {
		return ERR2354366;
	}

	public void setERR2354366(double eRR2354366) {
		ERR2354366 = eRR2354366;
	}

	public double getERR2354367() {
		return ERR2354367;
	}

	public void setERR2354367(double eRR2354367) {
		ERR2354367 = eRR2354367;
	}

	public double getERR2354368() {
		return ERR2354368;
	}

	public void setERR2354368(double eRR2354368) {
		ERR2354368 = eRR2354368;
	}

	public double getERR2354369() {
		return ERR2354369;
	}

	public void setERR2354369(double eRR2354369) {
		ERR2354369 = eRR2354369;
	}

	public double getERR2354370() {
		return ERR2354370;
	}

	public void setERR2354370(double eRR2354370) {
		ERR2354370 = eRR2354370;
	}

	public double getERR2354371() {
		return ERR2354371;
	}

	public void setERR2354371(double eRR2354371) {
		ERR2354371 = eRR2354371;
	}

	public double getERR2354372() {
		return ERR2354372;
	}

	public void setERR2354372(double eRR2354372) {
		ERR2354372 = eRR2354372;
	}

	public double getERR2354373() {
		return ERR2354373;
	}

	public void setERR2354373(double eRR2354373) {
		ERR2354373 = eRR2354373;
	}

	public double getERR2354374() {
		return ERR2354374;
	}

	public void setERR2354374(double eRR2354374) {
		ERR2354374 = eRR2354374;
	}

	public double getERR2354375() {
		return ERR2354375;
	}

	public void setERR2354375(double eRR2354375) {
		ERR2354375 = eRR2354375;
	}

	public double getERR2354376() {
		return ERR2354376;
	}

	public void setERR2354376(double eRR2354376) {
		ERR2354376 = eRR2354376;
	}

	public double getERR2354377() {
		return ERR2354377;
	}

	public void setERR2354377(double eRR2354377) {
		ERR2354377 = eRR2354377;
	}

	public double getERR2354378() {
		return ERR2354378;
	}

	public void setERR2354378(double eRR2354378) {
		ERR2354378 = eRR2354378;
	}

	public double getERR2354379() {
		return ERR2354379;
	}

	public void setERR2354379(double eRR2354379) {
		ERR2354379 = eRR2354379;
	}

	public double getERR2354380() {
		return ERR2354380;
	}

	public void setERR2354380(double eRR2354380) {
		ERR2354380 = eRR2354380;
	}

	public double getERR2354381() {
		return ERR2354381;
	}

	public void setERR2354381(double eRR2354381) {
		ERR2354381 = eRR2354381;
	}

	public double getERR2354382() {
		return ERR2354382;
	}

	public void setERR2354382(double eRR2354382) {
		ERR2354382 = eRR2354382;
	}

	public double getERR2354383() {
		return ERR2354383;
	}

	public void setERR2354383(double eRR2354383) {
		ERR2354383 = eRR2354383;
	}

	public double getERR2354384() {
		return ERR2354384;
	}

	public void setERR2354384(double eRR2354384) {
		ERR2354384 = eRR2354384;
	}

	public double getERR2354385() {
		return ERR2354385;
	}

	public void setERR2354385(double eRR2354385) {
		ERR2354385 = eRR2354385;
	}

	public double getERR2354386() {
		return ERR2354386;
	}

	public void setERR2354386(double eRR2354386) {
		ERR2354386 = eRR2354386;
	}

	public double getERR2354387() {
		return ERR2354387;
	}

	public void setERR2354387(double eRR2354387) {
		ERR2354387 = eRR2354387;
	}

	public double getSRR17169788() {
		return SRR17169788;
	}

	public void setSRR17169788(double sRR17169788) {
		SRR17169788 = sRR17169788;
	}

	public double getSRR17169789() {
		return SRR17169789;
	}

	public void setSRR17169789(double sRR17169789) {
		SRR17169789 = sRR17169789;
	}

	public double getSRR17169790() {
		return SRR17169790;
	}

	public void setSRR17169790(double sRR17169790) {
		SRR17169790 = sRR17169790;
	}

	public double getSRR17169791() {
		return SRR17169791;
	}

	public void setSRR17169791(double sRR17169791) {
		SRR17169791 = sRR17169791;
	}

	public double getSRR17169792() {
		return SRR17169792;
	}

	public void setSRR17169792(double sRR17169792) {
		SRR17169792 = sRR17169792;
	}

	public double getSRR17169793() {
		return SRR17169793;
	}

	public void setSRR17169793(double sRR17169793) {
		SRR17169793 = sRR17169793;
	}

	public double getSRR17169794() {
		return SRR17169794;
	}

	public void setSRR17169794(double sRR17169794) {
		SRR17169794 = sRR17169794;
	}

	@Override
	public String toString() {
		return "Testis [id=" + id + ", gene=" + gene + ", ERR2352738=" + ERR2352738 + ", ERR2352739=" + ERR2352739
				+ ", ERR2352740=" + ERR2352740 + ", ERR2352741=" + ERR2352741 + ", ERR2352742=" + ERR2352742
				+ ", ERR2352743=" + ERR2352743 + ", ERR2352744=" + ERR2352744 + ", ERR2352745=" + ERR2352745
				+ ", ERR2352746=" + ERR2352746 + ", ERR2352747=" + ERR2352747 + ", ERR2352748=" + ERR2352748
				+ ", ERR2352749=" + ERR2352749 + ", ERR2352750=" + ERR2352750 + ", ERR2352751=" + ERR2352751
				+ ", ERR2352752=" + ERR2352752 + ", ERR2352753=" + ERR2352753 + ", ERR2352754=" + ERR2352754
				+ ", ERR2352755=" + ERR2352755 + ", ERR2352756=" + ERR2352756 + ", ERR2352757=" + ERR2352757
				+ ", ERR2352758=" + ERR2352758 + ", ERR2352759=" + ERR2352759 + ", ERR2352760=" + ERR2352760
				+ ", ERR2353836=" + ERR2353836 + ", ERR2353837=" + ERR2353837 + ", ERR2353838=" + ERR2353838
				+ ", ERR2353839=" + ERR2353839 + ", ERR2353840=" + ERR2353840 + ", ERR2353841=" + ERR2353841
				+ ", ERR2353842=" + ERR2353842 + ", ERR2353843=" + ERR2353843 + ", ERR2353844=" + ERR2353844
				+ ", ERR2354365=" + ERR2354365 + ", ERR2354366=" + ERR2354366 + ", ERR2354367=" + ERR2354367
				+ ", ERR2354368=" + ERR2354368 + ", ERR2354369=" + ERR2354369 + ", ERR2354370=" + ERR2354370
				+ ", ERR2354371=" + ERR2354371 + ", ERR2354372=" + ERR2354372 + ", ERR2354373=" + ERR2354373
				+ ", ERR2354374=" + ERR2354374 + ", ERR2354375=" + ERR2354375 + ", ERR2354376=" + ERR2354376
				+ ", ERR2354377=" + ERR2354377 + ", ERR2354378=" + ERR2354378 + ", ERR2354379=" + ERR2354379
				+ ", ERR2354380=" + ERR2354380 + ", ERR2354381=" + ERR2354381 + ", ERR2354382=" + ERR2354382
				+ ", ERR2354383=" + ERR2354383 + ", ERR2354384=" + ERR2354384 + ", ERR2354385=" + ERR2354385
				+ ", ERR2354386=" + ERR2354386 + ", ERR2354387=" + ERR2354387 + ", SRR17169788=" + SRR17169788
				+ ", SRR17169789=" + SRR17169789 + ", SRR17169790=" + SRR17169790 + ", SRR17169791=" + SRR17169791
				+ ", SRR17169792=" + SRR17169792 + ", SRR17169793=" + SRR17169793 + ", SRR17169794=" + SRR17169794
				+ "]";
	}

}
