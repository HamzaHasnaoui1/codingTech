package org.example.Ex5;

import java.util.List;

public class Client {
    private String nom;
    private String prenom;
    private Long identifiant;
    private List<Chambre> chambresReservees;

    public Client(String nom, String prenom, Long identifiant, List<Chambre> chambresReservees) {
        this.nom = nom;
        this.prenom = prenom;
        this.identifiant = identifiant;
        this.chambresReservees = chambresReservees;
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

    public Long getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(Long identifiant) {
        this.identifiant = identifiant;
    }

    public List<Chambre> getChambresReservees() {
        return chambresReservees;
    }

    public void setChambresReservees(List<Chambre> chambresReservees) {
        this.chambresReservees = chambresReservees;
    }
}
