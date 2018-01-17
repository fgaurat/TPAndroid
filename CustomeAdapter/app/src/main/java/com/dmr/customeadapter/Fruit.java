package com.dmr.customeadapter;

/**
 * Created by fgaurat on 14/04/15.
 */
public class Fruit {

    private String nom;
    private String variete;


    public Fruit(String nom, String variete) {
        this.nom = nom;
        this.variete = variete;
    }

    public Fruit() {
        this.nom = "Pomme";
        this.variete = "Golden";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVariete() {
        return variete;
    }

    public void setVariete(String variete) {
        this.variete = variete;
    }
}
