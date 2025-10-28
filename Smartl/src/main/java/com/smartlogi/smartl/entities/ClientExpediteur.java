/*
package com.smartlogi.smartl.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity

@Table(name="clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id_client;

    private String nom;
    private String prenom;
    private String email;
    private Long telephone;
    private String adresse;

    @OneToMany(mappedBy="client" , cascade = CascadeType.ALL)
    private List<Colis> colis = new ArrayList<>();





}
*/
package com.smartlogi.smartl.entities;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="clients")
public class ClientExpediteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_client;

    private String nom;
    private String prenom;
    private String email;
    private Long telephone;
    private String adresse;

    @OneToMany(mappedBy="client", cascade = CascadeType.ALL)
    private List<Colis> colis = new ArrayList<>();

    // Constructeur vide
    public ClientExpediteur() { }

    // Getters et Setters
    public int getId_client() { return id_client; }
    public void setId_client(int id_client) { this.id_client = id_client; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Long getTelephone() { return telephone; }
    public void setTelephone(Long telephone) { this.telephone = telephone; }

    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }

    public List<Colis> getColis() { return colis; }
    public void setColis(List<Colis> colis) { this.colis = colis; }
}

