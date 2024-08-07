package org.example.Ex4;

import java.util.List;

public class Cours {
    private String titre;
    private String description;
    private  double duree;
    private List<Etudiant> etudiantsInscrits;

    public Cours(String titre, String description, double duree, List<Etudiant> etudiantsInscrits) {
        this.titre = titre;
        this.description = description;
        this.duree = duree;
        this.etudiantsInscrits = etudiantsInscrits;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDuree() {
        return duree;
    }

    public void setDuree(double duree) {
        this.duree = duree;
    }

    public List<Etudiant> getEtudiantsInscrits() {
        return etudiantsInscrits;
    }

    public void setEtudiantsInscrits(List<Etudiant> etudiantsInscrits) {
        this.etudiantsInscrits = etudiantsInscrits;
    }
}
