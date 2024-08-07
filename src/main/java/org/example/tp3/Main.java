package org.example.tp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Professeur prof = new Professeur("P001", "Hamza", 26, "Informatique");
        Cours cours1 = new Cours("MATH101", "Mathématiques", 3, new ArrayList<>());
        Cours cours2 = new Cours("PHY101", "Physique", 4, new ArrayList<>());
        Cours cours3 = new Cours("CS101", "Informatique", 2, new ArrayList<>());


        List<Cours> coursList = new ArrayList<>();
        Etudiant etudiant = new Etudiant("123", "Hamza", 20, "Informatique", 2, coursList);


        etudiant.addCours(cours1);
        etudiant.addCours(cours2);
        etudiant.addCours(cours3);

        prof.addCoursEnsignes(cours1);
        prof.addCoursEnsignes(cours2);
        prof.addCoursEnsignes(cours3);

        cours1.affecterNote(etudiant, 15.0);
        cours2.affecterNote(etudiant, 18.0);
        cours3.affecterNote(etudiant, 12.0);

        etudiant.afficherInfo();


        String rapport = prof.rapport();
        System.out.println("rapportprof   =" + rapport);

        double moyennePonderee = etudiant.moyennePonderee();
        System.out.println("Moyenne pondérée de l'étudiant: " + moyennePonderee);

    }
}
