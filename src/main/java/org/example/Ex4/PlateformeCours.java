package org.example.Ex4;

import java.util.List;

public class PlateformeCours {
    private List<Cours> coursList;
    private List<Etudiant> etudiantList;

    public PlateformeCours(List<Cours> coursList, List<Etudiant> etudiantList) {
        this.coursList = coursList;
        this.etudiantList = etudiantList;
    }

    public void addCours(Cours cours) {
        coursList.add(cours);
    }
    public void addEtudiant(Etudiant etudiant) {
        etudiantList.add(etudiant);
    }
}
