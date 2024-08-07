package org.example.tp3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Etudiant extends Personne {
    private String specialite;
    private int annee;
    private List<Cours> coursList;

    public Etudiant(String identifiant, String nom, int age, String specialite, int annee, List<Cours> coursList) {
        super(identifiant, nom, age);
        this.specialite = specialite;
        this.annee = annee;
        this.coursList = coursList;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public List<Cours> getCoursList() {
        return coursList;
    }

    public void setCoursList(List<Cours> coursList) {
        this.coursList = coursList;
    }

    public void addCours(Cours cours) {
        coursList.add(cours);
        cours.addEtudiant(this);
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "specialite='" + specialite + '\'' +
                ", annee=" + annee +
                ", coursList=" + coursList +
                '}';
    }

    @Override
    public void afficherInfo() {
        System.out.println("Identifiant: " + getIdentifiant() + " Nom: " + getNom() + " Age: " + getAge() + " Specialite: " + getSpecialite());
        System.out.println("Cours suivis:");
        for (Cours cours : coursList) {
            System.out.println("cours" + cours.getCodeCours());
            System.out.println( "  Note: " + cours.getNoteEtudiant(this));

        }
    }


    public double moyennePonderee() {
        double totalPoints = 0.0;


        for (Cours cours : coursList) {
            double note = cours.getNoteEtudiant(this);


            totalPoints += note ;

        }
        return totalPoints / coursList.size();
    }

}
