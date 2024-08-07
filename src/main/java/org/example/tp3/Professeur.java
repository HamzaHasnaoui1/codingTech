package org.example.tp3;

import java.util.ArrayList;
import java.util.List;

public class Professeur extends Personne{
    private String departement;
    private List<Cours> coursListEnseignes;

    public Professeur(String identifiant, String nom, int age, String departement) {
        super(identifiant, nom, age);
        this.departement = departement;
        this.coursListEnseignes = new ArrayList<>();
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public List<Cours> getCoursListEnseignes() {
        return coursListEnseignes;
    }

    public void setCoursListEnseignes(List<Cours> coursListEnseignes) {
        this.coursListEnseignes = coursListEnseignes;
    }

    public void addCoursEnsignes(Cours cours) {
        System.out.println("cours cours " + cours.getCodeCours());
        this.coursListEnseignes.add(cours);
    }

    public void removeCoursEnsignes(Cours cours) {
        this.coursListEnseignes.remove(cours);
    }

    @Override
    public String toString() {
        return "Professeur{" +
                "departement='" + departement + '\'' +
                ", coursListEnseignes=" + coursListEnseignes +
                '}';
    }

    @Override
    public void afficherInfo() {
    System.out.println("Identifiant: " + getIdentifiant()+"\nNom: " + getNom()+"\nAge: " + getAge()+"\nDepartement: " + getDepartement());
    }

    public String rapport(){
        StringBuilder rapport=new StringBuilder();
        rapport.append("Rapport des cours enseignés par ").append(getNom()).append(":\n");
        for (Cours cours : coursListEnseignes) {
            rapport.append("Code Cours :").append(cours.getCodeCours()).append("\n");
            rapport.append("Nom Cours :").append(cours.getNomCours()).append("\n");
            rapport.append("Nombre d'étudiants inscrits:").append(cours.getEtudiantsInscrit().size());
        }
        return rapport.toString();
    }
}
