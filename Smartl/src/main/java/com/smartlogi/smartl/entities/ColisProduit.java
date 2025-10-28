package com.smartlogi.smartl.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "colis_produits")
public class ColisProduit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int idColis;
    private int idProduit;
    private int quantite;
    private double prix;
    private LocalDateTime dateAjout;

    public ColisProduit() {
    }

    public ColisProduit(int idColis, int idProduit, int quantite, double prix, LocalDateTime dateAjout) {
        this.idColis = idColis;
        this.idProduit = idProduit;
        this.quantite = quantite;
        this.prix = prix;
        this.dateAjout = dateAjout;
    }

    // Getters et Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getIdColis() { return idColis; }
    public void setIdColis(int idColis) { this.idColis = idColis; }

    public int getIdProduit() { return idProduit; }
    public void setIdProduit(int idProduit) { this.idProduit = idProduit; }

    public int getQuantite() { return quantite; }
    public void setQuantite(int quantite) { this.quantite = quantite; }

    public double getPrix() { return prix; }
    public void setPrix(double prix) { this.prix = prix; }

    public LocalDateTime getDateAjout() { return dateAjout; }
    public void setDateAjout(LocalDateTime dateAjout) { this.dateAjout = dateAjout; }
}
