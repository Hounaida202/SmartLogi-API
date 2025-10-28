package com.smartlogi.smartl.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "livreurs")
public class Livreur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;
    private String prenom;
    private String telephone;
    private String vehicule;
    private String zoneAssignee; // tu peux aussi le relier à la classe Zone plus tard

    // Constructeur par défaut
    public Livreur() {
    }

    // Constructeur avec tous les attributs sauf id
    public Livreur(String nom, String prenom, String telephone, String vehicule, String zoneAssignee) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.vehicule = vehicule;
        this.zoneAssignee = zoneAssignee;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getVehicule() {
        return vehicule;
    }

    public void setVehicule(String vehicule) {
        this.vehicule = vehicule;
    }

    public String getZoneAssignee() {
        return zoneAssignee;
    }

    public void setZoneAssignee(String zoneAssignee) {
        this.zoneAssignee = zoneAssignee;
    }
}
