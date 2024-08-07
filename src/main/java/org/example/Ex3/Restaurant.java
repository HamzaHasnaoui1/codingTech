package org.example.Ex3;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Commande> commandeList;
    private List<Plat> platDisponibleList;

    public Restaurant() {
        this.commandeList = new ArrayList<>();
        this.platDisponibleList = new ArrayList<>();
    }

    public void addPlatDisponible(Plat plat) {
        platDisponibleList.add(plat);
    }

    public Commande addCommande(int numeroCommande, String table ) {
        Commande commande = new Commande(numeroCommande,table);
        commandeList.add(commande);
        return commande;
    }

    public void afficherCommande(){

    }
}
