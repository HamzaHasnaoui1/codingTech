package org.example.Ex1;

import java.util.List;

public class Bibliotheque {
   private List<Livre> livres;
    private List<Membre> membres;

    public void ajouterLivre(Livre livre){
        livres.add(livre);
    }

    public void ajouterMembre(Membre membre){
        membres.add(membre);
    }

    public void emprunterLivre (Livre livre){

    }

    public void reournerLivre (Livre livre){

    }
}
