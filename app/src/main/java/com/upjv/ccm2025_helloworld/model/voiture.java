package com.upjv.ccm2025_helloworld.model;

public class voiture {

    private String marque;
    private String modele;
    private int puissance;

    private boolean enVente;

    public voiture(String marque, String modele, int puissance, boolean enVente) {
        this.marque = marque;
        this.modele = modele;
        this.puissance = puissance;
        this.enVente = enVente;
    }

    public String getModele() {
        return modele;
    }

    public boolean isEnVente() {
        return enVente;
    }

    public int getPuissance() {
        return puissance;
    }

    public String getMarque() {
        return marque;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public void setEnVente(boolean enVente) {
        this.enVente = enVente;
    }

    @Override
    public String toString() {
        return "voiture{" +
                "marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", puissance=" + puissance +
                ", enVente=" + enVente +
                '}';
    }
}

