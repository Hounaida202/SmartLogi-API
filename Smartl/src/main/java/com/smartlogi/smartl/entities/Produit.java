package com.smartlogi.smartl.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "produits")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;
    private String categorie;
    private double poids;
    private double prix;

    public Produit() {
    }

    public Produit(String nom, String categorie, double poids, double prix) {
        this.nom = nom;
        this.categorie = categorie;
        this.poids = poids;
        this.prix = prix;
    }

    // Getters et Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getCategorie() { return categorie; }
    public void setCategorie(String categorie) { this.categorie = categorie; }

    public double getPoids() { return poids; }
    public void setPoids(double poids) { this.poids = poids; }

    public double getPrix() { return prix; }
    public void setPrix(double prix) { this.prix = prix; }
}
