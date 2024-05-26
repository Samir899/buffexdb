package com.buffalo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mean_tissue_fpkm")
public class Mean_tissue_fpkm {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(length = 10)
    private double abomasum;
	 
	 @Column(length = 10)
    private double adipose;
	 
	 @Column(length = 10)
    private double adrenal_gland;
	 
	 @Column(length = 10)
    private double ascending_colon;
	 
	 @Column(length = 10)
    private double blood;
	 
	 @Column(length = 10)
    private double brain;
	 
	 @Column(length = 10)
    private double brain_stem;
	 
	 @Column(length = 10)
    private double caecum;
	 
	 @Column(length = 10)
    private double cardiac_atrium;
	 
	 @Column(length = 10)
    private double cerebellum;
	 
	 @Column(length = 10)
    private double cerebral_cortex;
	 
	 @Column(length = 10)
    private double descending_colon;
	 
	 @Column(length = 10)
    private double duodenum;
	 
	 @Column(length = 10)
	  private double ear_skin;
		 
	 @Column(length = 10)
	  private double epididymis;
		 
	@Column(length = 10)
	 private double thoracic_esophagus;
		 
	@Column(length = 10)
	 private double fallopian_tube;
		 
	@Column(length = 10)
	 private double female_gonad;
		 
	@Column(length = 10)
	 private double corpus_luteum;
	
	 @Column(length = 10)
	    private double cotyledon;
		 
		 @Column(length = 10)
	    private double endometrium;
		 
		 @Column(length = 10)
	    private double fat;
		 
		 @Column(length = 10)
	    private double hypophysis;
		 
		 @Column(length = 10)
	    private double intestine;
		 
		 @Column(length = 10)
	    private double Medulla_oblongata;
		 
		 @Column(length = 10)
	    private double obex;
		 
		 @Column(length = 10)
	    private double ovary_follicle;
		 
		 @Column(length = 10)
		  private double oviduct;
			 
		 @Column(length = 10)
		  private double Pineal_gland;
			 
		@Column(length = 10)
		 private double uterus;
			 
		@Column(length = 10)
		 private double white_blood_cells;
			 
		@Column(length = 10)
		 private double granulosa_cell;
			 
		@Column(length = 10)
		 private double heart;
		
		@Column(length = 10)
	    private double Hepatic_lymph_nodes;
		 
		 @Column(length = 10)
	    private double hippocampus_layer;
		 
		 @Column(length = 10)
	    private double hypothalamus;
		 
		 @Column(length = 10)
	    private double ileum;
		 
		 @Column(length = 10)
	    private double iliac_lymph_node;
		 
		 @Column(length = 10)
	    private double intestinal_lymph_node;
		 
		 @Column(length = 10)
	    private double jejunum;
		 
		 @Column(length = 10)
	    private double kidney_cortex;
		 
		 @Column(length = 10)
	    private double kidney;
		 
		 @Column(length = 10)
	    private double leg_muscle;
		 
		 @Column(length = 10)
	    private double liver;
		 
		 @Column(length = 10)
	    private double longissimus_dorsi;
		 
		 @Column(length = 10)
		  private double longissimus_thoracis_muscle;
			 
		 @Column(length = 10)
		  private double lung;
			 
		@Column(length = 10)
		 private double lung_parenchyma;
			 
		@Column(length = 10)
		 private double mammary_gland;
			 
		@Column(length = 10)
		 private double mesenteric_lymph_node;
			 
		@Column(length = 10)
		 private double Muscle;
		
	    @Column(length = 10)
		 private double occipital_cortex;
			 
		@Column(length = 10)
		 private double omasum;
			 
		@Column(length = 10)
		private double oocyte;
		 
		@Column(length = 10)
		 private double ovary;
		 
		@Column(length = 10)
		 private double palatine_tonsil;
			 
		@Column(length = 10)
		 private double pancreas;
		 
		@Column(length = 10)
		 private double peripheral_blood_lymphocyte;
		 
		@Column(length = 10)
		 private double Peyer_patch;
			 
		@Column(length = 10)
		 private double pituitary_gland;
				 
		@Column(length = 10)
		 private double popliteal_lymph_node;
			 
		@Column(length = 10)
		 private double prescapular_lymph_node;
				 
		@Column(length = 10)
		 private double pylorus;
				 
		@Column(length = 10)
		 private double rectum;
				 
		@Column(length = 10)
		 private double renal_medulla;
		
		 
		@Column(length = 10)
		 private double reticulum;
			 
		@Column(length = 10)
		 private double rumen;
		 
		@Column(length = 10)
		 private double saliva_secreting_gland;
		 
		@Column(length = 10)
		 private double skeletal_muscle;
			 
		@Column(length = 10)
		 private double skin;
				 
		@Column(length = 10)
		 private double spleen;
			 
		@Column(length = 10)
		 private double submandibular_lymph_node;
				 
		@Column(length = 10)
		 private double testis;
				 
		@Column(length = 10)
		 private double thymus;
				 
		@Column(length = 10)
		 private double thyroid;
		
		@Column(length = 10)
		 private double tongue;

		public Mean_tissue_fpkm() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Mean_tissue_fpkm(int id, String geneId, double abomasum, double adipose, double adrenal_gland,
				double ascending_colon, double blood, double brain, double brain_stem, double caecum,
				double cardiac_atrium, double cerebellum, double cerebral_cortex, double descending_colon,
				double duodenum, double ear_skin, double epididymis, double thoracic_esophagus, double fallopian_tube,
				double female_gonad, double corpus_luteum, double cotyledon, double endometrium, double fat,
				double hypophysis, double intestine, double medulla_oblongata, double obex, double ovary_follicle,
				double oviduct, double pineal_gland, double uterus, double white_blood_cells, double granulosa_cell,
				double heart, double hepatic_lymph_nodes, double hippocampus_layer, double hypothalamus, double ileum,
				double iliac_lymph_node, double intestinal_lymph_node, double jejunum, double kidney_cortex,
				double kidney, double leg_muscle, double liver, double longissimus_dorsi,
				double longissimus_thoracis_muscle, double lung, double lung_parenchyma, double mammary_gland,
				double mesenteric_lymph_node, double muscle, double occipital_cortex, double omasum, double oocyte,
				double ovary, double palatine_tonsil, double pancreas, double peripheral_blood_lymphocyte,
				double peyer_patch, double pituitary_gland, double popliteal_lymph_node, double prescapular_lymph_node,
				double pylorus, double rectum, double renal_medulla, double reticulum, double rumen,
				double saliva_secreting_gland, double skeletal_muscle, double skin, double spleen,
				double submandibular_lymph_node, double testis, double thymus, double thyroid, double tongue) {
			super();
			this.id = id;
			this.geneId = geneId;
			this.abomasum = abomasum;
			this.adipose = adipose;
			this.adrenal_gland = adrenal_gland;
			this.ascending_colon = ascending_colon;
			this.blood = blood;
			this.brain = brain;
			this.brain_stem = brain_stem;
			this.caecum = caecum;
			this.cardiac_atrium = cardiac_atrium;
			this.cerebellum = cerebellum;
			this.cerebral_cortex = cerebral_cortex;
			this.descending_colon = descending_colon;
			this.duodenum = duodenum;
			this.ear_skin = ear_skin;
			this.epididymis = epididymis;
			this.thoracic_esophagus = thoracic_esophagus;
			this.fallopian_tube = fallopian_tube;
			this.female_gonad = female_gonad;
			this.corpus_luteum = corpus_luteum;
			this.cotyledon = cotyledon;
			this.endometrium = endometrium;
			this.fat = fat;
			this.hypophysis = hypophysis;
			this.intestine = intestine;
			Medulla_oblongata = medulla_oblongata;
			this.obex = obex;
			this.ovary_follicle = ovary_follicle;
			this.oviduct = oviduct;
			Pineal_gland = pineal_gland;
			this.uterus = uterus;
			this.white_blood_cells = white_blood_cells;
			this.granulosa_cell = granulosa_cell;
			this.heart = heart;
			Hepatic_lymph_nodes = hepatic_lymph_nodes;
			this.hippocampus_layer = hippocampus_layer;
			this.hypothalamus = hypothalamus;
			this.ileum = ileum;
			this.iliac_lymph_node = iliac_lymph_node;
			this.intestinal_lymph_node = intestinal_lymph_node;
			this.jejunum = jejunum;
			this.kidney_cortex = kidney_cortex;
			this.kidney = kidney;
			this.leg_muscle = leg_muscle;
			this.liver = liver;
			this.longissimus_dorsi = longissimus_dorsi;
			this.longissimus_thoracis_muscle = longissimus_thoracis_muscle;
			this.lung = lung;
			this.lung_parenchyma = lung_parenchyma;
			this.mammary_gland = mammary_gland;
			this.mesenteric_lymph_node = mesenteric_lymph_node;
			Muscle = muscle;
			this.occipital_cortex = occipital_cortex;
			this.omasum = omasum;
			this.oocyte = oocyte;
			this.ovary = ovary;
			this.palatine_tonsil = palatine_tonsil;
			this.pancreas = pancreas;
			this.peripheral_blood_lymphocyte = peripheral_blood_lymphocyte;
			Peyer_patch = peyer_patch;
			this.pituitary_gland = pituitary_gland;
			this.popliteal_lymph_node = popliteal_lymph_node;
			this.prescapular_lymph_node = prescapular_lymph_node;
			this.pylorus = pylorus;
			this.rectum = rectum;
			this.renal_medulla = renal_medulla;
			this.reticulum = reticulum;
			this.rumen = rumen;
			this.saliva_secreting_gland = saliva_secreting_gland;
			this.skeletal_muscle = skeletal_muscle;
			this.skin = skin;
			this.spleen = spleen;
			this.submandibular_lymph_node = submandibular_lymph_node;
			this.testis = testis;
			this.thymus = thymus;
			this.thyroid = thyroid;
			this.tongue = tongue;
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

		public double getAbomasum() {
			return abomasum;
		}

		public void setAbomasum(double abomasum) {
			this.abomasum = abomasum;
		}

		public double getAdipose() {
			return adipose;
		}

		public void setAdipose(double adipose) {
			this.adipose = adipose;
		}

		public double getAdrenal_gland() {
			return adrenal_gland;
		}

		public void setAdrenal_gland(double adrenal_gland) {
			this.adrenal_gland = adrenal_gland;
		}

		public double getAscending_colon() {
			return ascending_colon;
		}

		public void setAscending_colon(double ascending_colon) {
			this.ascending_colon = ascending_colon;
		}

		public double getBlood() {
			return blood;
		}

		public void setBlood(double blood) {
			this.blood = blood;
		}

		public double getBrain() {
			return brain;
		}

		public void setBrain(double brain) {
			this.brain = brain;
		}

		public double getBrain_stem() {
			return brain_stem;
		}

		public void setBrain_stem(double brain_stem) {
			this.brain_stem = brain_stem;
		}

		public double getCaecum() {
			return caecum;
		}

		public void setCaecum(double caecum) {
			this.caecum = caecum;
		}

		public double getCardiac_atrium() {
			return cardiac_atrium;
		}

		public void setCardiac_atrium(double cardiac_atrium) {
			this.cardiac_atrium = cardiac_atrium;
		}

		public double getCerebellum() {
			return cerebellum;
		}

		public void setCerebellum(double cerebellum) {
			this.cerebellum = cerebellum;
		}

		public double getCerebral_cortex() {
			return cerebral_cortex;
		}

		public void setCerebral_cortex(double cerebral_cortex) {
			this.cerebral_cortex = cerebral_cortex;
		}

		public double getDescending_colon() {
			return descending_colon;
		}

		public void setDescending_colon(double descending_colon) {
			this.descending_colon = descending_colon;
		}

		public double getDuodenum() {
			return duodenum;
		}

		public void setDuodenum(double duodenum) {
			this.duodenum = duodenum;
		}

		public double getEar_skin() {
			return ear_skin;
		}

		public void setEar_skin(double ear_skin) {
			this.ear_skin = ear_skin;
		}

		public double getEpididymis() {
			return epididymis;
		}

		public void setEpididymis(double epididymis) {
			this.epididymis = epididymis;
		}

		public double getThoracic_esophagus() {
			return thoracic_esophagus;
		}

		public void setThoracic_esophagus(double thoracic_esophagus) {
			this.thoracic_esophagus = thoracic_esophagus;
		}

		public double getFallopian_tube() {
			return fallopian_tube;
		}

		public void setFallopian_tube(double fallopian_tube) {
			this.fallopian_tube = fallopian_tube;
		}

		public double getFemale_gonad() {
			return female_gonad;
		}

		public void setFemale_gonad(double female_gonad) {
			this.female_gonad = female_gonad;
		}

		public double getCorpus_luteum() {
			return corpus_luteum;
		}

		public void setCorpus_luteum(double corpus_luteum) {
			this.corpus_luteum = corpus_luteum;
		}

		public double getCotyledon() {
			return cotyledon;
		}

		public void setCotyledon(double cotyledon) {
			this.cotyledon = cotyledon;
		}

		public double getEndometrium() {
			return endometrium;
		}

		public void setEndometrium(double endometrium) {
			this.endometrium = endometrium;
		}

		public double getFat() {
			return fat;
		}

		public void setFat(double fat) {
			this.fat = fat;
		}

		public double getHypophysis() {
			return hypophysis;
		}

		public void setHypophysis(double hypophysis) {
			this.hypophysis = hypophysis;
		}

		public double getIntestine() {
			return intestine;
		}

		public void setIntestine(double intestine) {
			this.intestine = intestine;
		}

		public double getMedulla_oblongata() {
			return Medulla_oblongata;
		}

		public void setMedulla_oblongata(double medulla_oblongata) {
			Medulla_oblongata = medulla_oblongata;
		}

		public double getObex() {
			return obex;
		}

		public void setObex(double obex) {
			this.obex = obex;
		}

		public double getOvary_follicle() {
			return ovary_follicle;
		}

		public void setOvary_follicle(double ovary_follicle) {
			this.ovary_follicle = ovary_follicle;
		}

		public double getOviduct() {
			return oviduct;
		}

		public void setOviduct(double oviduct) {
			this.oviduct = oviduct;
		}

		public double getPineal_gland() {
			return Pineal_gland;
		}

		public void setPineal_gland(double pineal_gland) {
			Pineal_gland = pineal_gland;
		}

		public double getUterus() {
			return uterus;
		}

		public void setUterus(double uterus) {
			this.uterus = uterus;
		}

		public double getWhite_blood_cells() {
			return white_blood_cells;
		}

		public void setWhite_blood_cells(double white_blood_cells) {
			this.white_blood_cells = white_blood_cells;
		}

		public double getGranulosa_cell() {
			return granulosa_cell;
		}

		public void setGranulosa_cell(double granulosa_cell) {
			this.granulosa_cell = granulosa_cell;
		}

		public double getHeart() {
			return heart;
		}

		public void setHeart(double heart) {
			this.heart = heart;
		}

		public double getHepatic_lymph_nodes() {
			return Hepatic_lymph_nodes;
		}

		public void setHepatic_lymph_nodes(double hepatic_lymph_nodes) {
			Hepatic_lymph_nodes = hepatic_lymph_nodes;
		}

		public double getHippocampus_layer() {
			return hippocampus_layer;
		}

		public void setHippocampus_layer(double hippocampus_layer) {
			this.hippocampus_layer = hippocampus_layer;
		}

		public double getHypothalamus() {
			return hypothalamus;
		}

		public void setHypothalamus(double hypothalamus) {
			this.hypothalamus = hypothalamus;
		}

		public double getIleum() {
			return ileum;
		}

		public void setIleum(double ileum) {
			this.ileum = ileum;
		}

		public double getIliac_lymph_node() {
			return iliac_lymph_node;
		}

		public void setIliac_lymph_node(double iliac_lymph_node) {
			this.iliac_lymph_node = iliac_lymph_node;
		}

		public double getIntestinal_lymph_node() {
			return intestinal_lymph_node;
		}

		public void setIntestinal_lymph_node(double intestinal_lymph_node) {
			this.intestinal_lymph_node = intestinal_lymph_node;
		}

		public double getJejunum() {
			return jejunum;
		}

		public void setJejunum(double jejunum) {
			this.jejunum = jejunum;
		}

		public double getKidney_cortex() {
			return kidney_cortex;
		}

		public void setKidney_cortex(double kidney_cortex) {
			this.kidney_cortex = kidney_cortex;
		}

		public double getKidney() {
			return kidney;
		}

		public void setKidney(double kidney) {
			this.kidney = kidney;
		}

		public double getLeg_muscle() {
			return leg_muscle;
		}

		public void setLeg_muscle(double leg_muscle) {
			this.leg_muscle = leg_muscle;
		}

		public double getLiver() {
			return liver;
		}

		public void setLiver(double liver) {
			this.liver = liver;
		}

		public double getLongissimus_dorsi() {
			return longissimus_dorsi;
		}

		public void setLongissimus_dorsi(double longissimus_dorsi) {
			this.longissimus_dorsi = longissimus_dorsi;
		}

		public double getLongissimus_thoracis_muscle() {
			return longissimus_thoracis_muscle;
		}

		public void setLongissimus_thoracis_muscle(double longissimus_thoracis_muscle) {
			this.longissimus_thoracis_muscle = longissimus_thoracis_muscle;
		}

		public double getLung() {
			return lung;
		}

		public void setLung(double lung) {
			this.lung = lung;
		}

		public double getLung_parenchyma() {
			return lung_parenchyma;
		}

		public void setLung_parenchyma(double lung_parenchyma) {
			this.lung_parenchyma = lung_parenchyma;
		}

		public double getMammary_gland() {
			return mammary_gland;
		}

		public void setMammary_gland(double mammary_gland) {
			this.mammary_gland = mammary_gland;
		}

		public double getMesenteric_lymph_node() {
			return mesenteric_lymph_node;
		}

		public void setMesenteric_lymph_node(double mesenteric_lymph_node) {
			this.mesenteric_lymph_node = mesenteric_lymph_node;
		}

		public double getMuscle() {
			return Muscle;
		}

		public void setMuscle(double muscle) {
			Muscle = muscle;
		}

		public double getOccipital_cortex() {
			return occipital_cortex;
		}

		public void setOccipital_cortex(double occipital_cortex) {
			this.occipital_cortex = occipital_cortex;
		}

		public double getOmasum() {
			return omasum;
		}

		public void setOmasum(double omasum) {
			this.omasum = omasum;
		}

		public double getOocyte() {
			return oocyte;
		}

		public void setOocyte(double oocyte) {
			this.oocyte = oocyte;
		}

		public double getOvary() {
			return ovary;
		}

		public void setOvary(double ovary) {
			this.ovary = ovary;
		}

		public double getPalatine_tonsil() {
			return palatine_tonsil;
		}

		public void setPalatine_tonsil(double palatine_tonsil) {
			this.palatine_tonsil = palatine_tonsil;
		}

		public double getPancreas() {
			return pancreas;
		}

		public void setPancreas(double pancreas) {
			this.pancreas = pancreas;
		}

		public double getPeripheral_blood_lymphocyte() {
			return peripheral_blood_lymphocyte;
		}

		public void setPeripheral_blood_lymphocyte(double peripheral_blood_lymphocyte) {
			this.peripheral_blood_lymphocyte = peripheral_blood_lymphocyte;
		}

		public double getPeyer_patch() {
			return Peyer_patch;
		}

		public void setPeyer_patch(double peyer_patch) {
			Peyer_patch = peyer_patch;
		}

		public double getPituitary_gland() {
			return pituitary_gland;
		}

		public void setPituitary_gland(double pituitary_gland) {
			this.pituitary_gland = pituitary_gland;
		}

		public double getPopliteal_lymph_node() {
			return popliteal_lymph_node;
		}

		public void setPopliteal_lymph_node(double popliteal_lymph_node) {
			this.popliteal_lymph_node = popliteal_lymph_node;
		}

		public double getPrescapular_lymph_node() {
			return prescapular_lymph_node;
		}

		public void setPrescapular_lymph_node(double prescapular_lymph_node) {
			this.prescapular_lymph_node = prescapular_lymph_node;
		}

		public double getPylorus() {
			return pylorus;
		}

		public void setPylorus(double pylorus) {
			this.pylorus = pylorus;
		}

		public double getRectum() {
			return rectum;
		}

		public void setRectum(double rectum) {
			this.rectum = rectum;
		}

		public double getRenal_medulla() {
			return renal_medulla;
		}

		public void setRenal_medulla(double renal_medulla) {
			this.renal_medulla = renal_medulla;
		}

		public double getReticulum() {
			return reticulum;
		}

		public void setReticulum(double reticulum) {
			this.reticulum = reticulum;
		}

		public double getRumen() {
			return rumen;
		}

		public void setRumen(double rumen) {
			this.rumen = rumen;
		}

		public double getSaliva_secreting_gland() {
			return saliva_secreting_gland;
		}

		public void setSaliva_secreting_gland(double saliva_secreting_gland) {
			this.saliva_secreting_gland = saliva_secreting_gland;
		}

		public double getSkeletal_muscle() {
			return skeletal_muscle;
		}

		public void setSkeletal_muscle(double skeletal_muscle) {
			this.skeletal_muscle = skeletal_muscle;
		}

		public double getSkin() {
			return skin;
		}

		public void setSkin(double skin) {
			this.skin = skin;
		}

		public double getSpleen() {
			return spleen;
		}

		public void setSpleen(double spleen) {
			this.spleen = spleen;
		}

		public double getSubmandibular_lymph_node() {
			return submandibular_lymph_node;
		}

		public void setSubmandibular_lymph_node(double submandibular_lymph_node) {
			this.submandibular_lymph_node = submandibular_lymph_node;
		}

		public double getTestis() {
			return testis;
		}

		public void setTestis(double testis) {
			this.testis = testis;
		}

		public double getThymus() {
			return thymus;
		}

		public void setThymus(double thymus) {
			this.thymus = thymus;
		}

		public double getThyroid() {
			return thyroid;
		}

		public void setThyroid(double thyroid) {
			this.thyroid = thyroid;
		}

		public double getTongue() {
			return tongue;
		}

		public void setTongue(double tongue) {
			this.tongue = tongue;
		}

		@Override
		public String toString() {
			return "Mean_tissue_fpkm [id=" + id + ", geneId=" + geneId + ", abomasum=" + abomasum + ", adipose="
					+ adipose + ", adrenal_gland=" + adrenal_gland + ", ascending_colon=" + ascending_colon + ", blood="
					+ blood + ", brain=" + brain + ", brain_stem=" + brain_stem + ", caecum=" + caecum
					+ ", cardiac_atrium=" + cardiac_atrium + ", cerebellum=" + cerebellum + ", cerebral_cortex="
					+ cerebral_cortex + ", descending_colon=" + descending_colon + ", duodenum=" + duodenum
					+ ", ear_skin=" + ear_skin + ", epididymis=" + epididymis + ", thoracic_esophagus="
					+ thoracic_esophagus + ", fallopian_tube=" + fallopian_tube + ", female_gonad=" + female_gonad
					+ ", corpus_luteum=" + corpus_luteum + ", cotyledon=" + cotyledon + ", endometrium=" + endometrium
					+ ", fat=" + fat + ", hypophysis=" + hypophysis + ", intestine=" + intestine
					+ ", Medulla_oblongata=" + Medulla_oblongata + ", obex=" + obex + ", ovary_follicle="
					+ ovary_follicle + ", oviduct=" + oviduct + ", Pineal_gland=" + Pineal_gland + ", uterus=" + uterus
					+ ", white_blood_cells=" + white_blood_cells + ", granulosa_cell=" + granulosa_cell + ", heart="
					+ heart + ", Hepatic_lymph_nodes=" + Hepatic_lymph_nodes + ", hippocampus_layer="
					+ hippocampus_layer + ", hypothalamus=" + hypothalamus + ", ileum=" + ileum + ", iliac_lymph_node="
					+ iliac_lymph_node + ", intestinal_lymph_node=" + intestinal_lymph_node + ", jejunum=" + jejunum
					+ ", kidney_cortex=" + kidney_cortex + ", kidney=" + kidney + ", leg_muscle=" + leg_muscle
					+ ", liver=" + liver + ", longissimus_dorsi=" + longissimus_dorsi + ", longissimus_thoracis_muscle="
					+ longissimus_thoracis_muscle + ", lung=" + lung + ", lung_parenchyma=" + lung_parenchyma
					+ ", mammary_gland=" + mammary_gland + ", mesenteric_lymph_node=" + mesenteric_lymph_node
					+ ", Muscle=" + Muscle + ", occipital_cortex=" + occipital_cortex + ", omasum=" + omasum
					+ ", oocyte=" + oocyte + ", ovary=" + ovary + ", palatine_tonsil=" + palatine_tonsil + ", pancreas="
					+ pancreas + ", peripheral_blood_lymphocyte=" + peripheral_blood_lymphocyte + ", Peyer_patch="
					+ Peyer_patch + ", pituitary_gland=" + pituitary_gland + ", popliteal_lymph_node="
					+ popliteal_lymph_node + ", prescapular_lymph_node=" + prescapular_lymph_node + ", pylorus="
					+ pylorus + ", rectum=" + rectum + ", renal_medulla=" + renal_medulla + ", reticulum=" + reticulum
					+ ", rumen=" + rumen + ", saliva_secreting_gland=" + saliva_secreting_gland + ", skeletal_muscle="
					+ skeletal_muscle + ", skin=" + skin + ", spleen=" + spleen + ", submandibular_lymph_node="
					+ submandibular_lymph_node + ", testis=" + testis + ", thymus=" + thymus + ", thyroid=" + thyroid
					+ ", tongue=" + tongue + "]";
		}
		
		
}
