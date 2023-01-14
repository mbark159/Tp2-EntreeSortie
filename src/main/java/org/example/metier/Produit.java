package org.example.metier;

import java.io.Serializable;

public class Produit implements Serializable {

    private long id;
    private String  nom;
    private String marque;
    private double prix;
    private String description;
    private int nbEnStock;

    public Produit(long id, String nom, String marque, double prix, String description, int nbEnStock) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.description = description;
        this.nbEnStock = nbEnStock;
    }

    public Produit() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNbEnStock() {
        return nbEnStock;
    }

    public void setNbEnStock(int nbEnStock) {
        this.nbEnStock = nbEnStock;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", description='" + description + '\'' +
                ", nbEnStock=" + nbEnStock +
                '}';
    }
}
