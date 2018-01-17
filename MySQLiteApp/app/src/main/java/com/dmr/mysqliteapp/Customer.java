package com.dmr.mysqliteapp;

/**
 * Created by fgaurat on 16/04/15.
 */
public class Customer {

    private int id;
    private String nom;
    private String prenom;

    public Customer() {
    }

    public Customer(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return this.nom+" "+this.prenom;
    }
}
