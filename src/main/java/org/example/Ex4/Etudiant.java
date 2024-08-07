package org.example.Ex4;

import java.util.List;

public class Etudiant {
    private String nom;
    private String prenom;
    private String identifiant;
    private List<Cours> coursSuivis;

    public Etudiant(String nom, String prenom, String identifiant, List<Cours> coursSuivis) {
        this.nom = nom;
        this.prenom = prenom;
        this.identifiant = identifiant;
        this.coursSuivis = coursSuivis;
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

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public List<Cours> getCoursSuivis() {
        return coursSuivis;
    }

    public void setCoursSuivis(List<Cours> coursSuivis) {
        this.coursSuivis = coursSuivis;
    }
}
