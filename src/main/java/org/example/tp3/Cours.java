package org.example.tp3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Cours {
    private String codeCours;
    private String nomCours;
    private int credit;
    private List<Etudiant> etudiantsInscrit= new ArrayList<Etudiant>();
    private Professeur professeur;
    private Map<Etudiant, Double> notes = new HashMap<>();

    public Cours(String codeCours, String nomCours, int credit, List<Etudiant> etudiantsInscrit, Professeur professeur, Map<Etudiant, Double> notes) {
        this.codeCours = codeCours;
        this.nomCours = nomCours;
        this.credit = credit;
        this.etudiantsInscrit = etudiantsInscrit;
        this.professeur = professeur;
        this.notes = notes;
        professeur.addCoursEnsignes(this);
    }

    public Cours(String math101, String mathématiques, int credit, List<Etudiant> etudiantsInscrit) {
        this.codeCours = math101;
        this.nomCours = mathématiques;
        this.credit = credit;
        this.etudiantsInscrit = etudiantsInscrit;
    }

    public String getCodeCours() {
        return codeCours;
    }

    public void setCodeCours(String codeCours) {
        this.codeCours = codeCours;
    }

    public Map<Etudiant, Double> getNotes() {
        return notes;
    }

    public void setNotes(Map<Etudiant, Double> notes) {
        this.notes = notes;
    }

    public String getNomCours() {
        return nomCours;
    }

    public void setNomCours(String nomCours) {
        this.nomCours = nomCours;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public List<Etudiant> getEtudiantsInscrit() {
        return etudiantsInscrit;
    }

    public void setEtudiantsInscrit(List<Etudiant> etudiantsInscrit) {
        this.etudiantsInscrit = etudiantsInscrit;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }


    public void afficherCours() {
        System.out.println("codeCours = " + codeCours + "nomCours = " + nomCours+ "prixCours = " + credit + "etudiantsInscrit = " + etudiantsInscrit+ "professeur = " + professeur);
    }

    public void addEtudiant(Etudiant etudiant) {
        if (!etudiantsInscrit.contains(etudiant)) {
            etudiantsInscrit.add(etudiant);
            notes.put(etudiant, 0.0);
        } else {
            System.out.println("Etudiant est deja inscrit ");
        }
    }

    public void affecterNote(Etudiant etudiant, double note) {
        if(etudiantsInscrit.contains(etudiant)) {
            notes.put(etudiant, note);
        }
        else {
            System.out.println("Etudiant n'est pas inscrit ");
        }
    }

    public double getNoteEtudiant(Etudiant etudiant) {
        return notes.getOrDefault(etudiant, 0.0);
    }

}
