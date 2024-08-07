package org.example.Ex_streams;

import org.example.Ex5.Chambre;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String nom;
    private String prenom;
    private String identifiant;
    private List<Chambre> chambresReservees;

    // Constructeur
    public Client(String nom, String prenom, String identifiant) {
        this.nom = nom;
        this.prenom = prenom;
        this.identifiant = identifiant;
        this.chambresReservees = new ArrayList<>();
    }

    // Getters et Setters
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }
    public String getIdentifiant() { return identifiant; }
    public void setIdentifiant(String identifiant) { this.identifiant = identifiant; }
    public List<Chambre> getChambresReservees() { return chambresReservees; }
    public void setChambresReservees(List<Chambre> chambresReservees) { this.chambresReservees = chambresReservees; }

    // Méthode pour ajouter une chambre réservée
    public void ajouterChambreReservee(Chambre chambre) {
        chambresReservees.add(chambre);
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", identifiant='" + identifiant + '\'' +
                ", chambresReservees=" + chambresReservees +
                '}';
    }
}
