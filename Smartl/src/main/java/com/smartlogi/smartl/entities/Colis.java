/*
package com.smartlogi.smartl.entities;

import jakarta.persistence.*;

@Entity
@Table(name="colis")
public class Colis {
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String description;
    private double poids;
    private Status statut;
    private String priorite;
    private int idLivreur;
    private int id_client;
    private int idDestinataire;
    private int idZone;
    private String villeDestination;

    public  enum Status {
        CREE,
        COLLECTE,
        EN_STOCK,
        EN_TRANSIT,
        LIVRE
    }

    @ManyToOne
    @JoinColumn(name="id_client")
    private Client client;
    public Colis() {
    }

    public Colis( String description, double poids, Colis.Status statut, String priorite,
                 int idLivreur, int id_client, int idDestinataire, int idZone,
                 String villeDestination) {
        this.description = description;
        this.poids = poids;
        this.statut = statut;
        this.priorite = priorite;
        this.idLivreur = idLivreur;
        this.id_client = id_client;
        this.idDestinataire = idDestinataire;
        this.idZone = idZone;
        this.villeDestination = villeDestination;
    }

    // Getters et Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getPoids() { return poids; }
    public void setPoids(double poids) { this.poids = poids; }

    public Status getStatut() { return statut; }
    public void setStatut(Status statut) { this.statut = statut; }

    public String getPriorite() { return priorite; }
    public void setPriorite(String priorite) { this.priorite = priorite; }

    public int getIdLivreur() { return idLivreur; }
    public void setIdLivreur(int idLivreur) { this.idLivreur = idLivreur; }

    public int getIdClientExpediteur() { return id_client; }
    public void setIdClientExpediteur(int idClientExpediteur) { this.id_client = idClientExpediteur; }

    public int getIdDestinataire() { return idDestinataire; }
    public void setIdDestinataire(int idDestinataire) { this.idDestinataire = idDestinataire; }

    public int getIdZone() { return idZone; }
    public void setIdZone(int idZone) { this.idZone = idZone; }

    public String getVilleDestination() { return villeDestination; }
    public void setVilleDestination(String villeDestination) { this.villeDestination = villeDestination; }

}
*/

package com.smartlogi.smartl.entities;

import jakarta.persistence.*;

@Entity
@Table(name="colis")
public class Colis {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String description;
    private double poids;

    @Enumerated(EnumType.STRING)
    private Status statut;

    private String priorite;
    private int idLivreur;
    private int idDestinataire;
    private int idZone;
    private String villeDestination;

    @ManyToOne
    @JoinColumn(name="id_client")
    private Client client;

    // Constructeur vide
    public Colis() { }

    // Constructeur complet
    public Colis(String description, double poids, Status statut, String priorite,
                 int idLivreur, int idDestinataire, int idZone,
                 String villeDestination, Client client) {
        this.description = description;
        this.poids = poids;
        this.statut = statut;
        this.priorite = priorite;
        this.idLivreur = idLivreur;
        this.idDestinataire = idDestinataire;
        this.idZone = idZone;
        this.villeDestination = villeDestination;
        this.client = client;
    }

    // Getters et Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getPoids() { return poids; }
    public void setPoids(double poids) { this.poids = poids; }

    public Status getStatut() { return statut; }
    public void setStatut(Status statut) { this.statut = statut; }

    public String getPriorite() { return priorite; }
    public void setPriorite(String priorite) { this.priorite = priorite; }

    public int getIdLivreur() { return idLivreur; }
    public void setIdLivreur(int idLivreur) { this.idLivreur = idLivreur; }

    public int getIdDestinataire() { return idDestinataire; }
    public void setIdDestinataire(int idDestinataire) { this.idDestinataire = idDestinataire; }

    public int getIdZone() { return idZone; }
    public void setIdZone(int idZone) { this.idZone = idZone; }

    public String getVilleDestination() { return villeDestination; }
    public void setVilleDestination(String villeDestination) { this.villeDestination = villeDestination; }

    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }
}

