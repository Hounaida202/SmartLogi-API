package com.smartlogi.smartl.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "historique_livraisons")
public class HistoriqueLivraison {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int idColis;
    private String statut;
    private LocalDateTime dateChangement;
    private String commentaire;

    public HistoriqueLivraison() {
    }

    public HistoriqueLivraison(int idColis, String statut, LocalDateTime dateChangement, String commentaire) {
        this.idColis = idColis;
        this.statut = statut;
        this.dateChangement = dateChangement;
        this.commentaire = commentaire;
    }

    // Getters et Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getIdColis() { return idColis; }
    public void setIdColis(int idColis) { this.idColis = idColis; }

    public String getStatut() { return statut; }
    public void setStatut(String statut) { this.statut = statut; }

    public LocalDateTime getDateChangement() { return dateChangement; }
    public void setDateChangement(LocalDateTime dateChangement) { this.dateChangement = dateChangement; }

    public String getCommentaire() { return commentaire; }
    public void setCommentaire(String commentaire) { this.commentaire = commentaire; }
}
