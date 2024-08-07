package org.example.Ex3;

import java.util.List;

public class Commande {
    private int numeroCommande;
    private String table;
    List<Plat> plats;

    public Commande(int numeroCommande, String table) {
        this.numeroCommande = numeroCommande;
        this.table = table;
        this.plats = plats;
    }


    public int getNumeroCommande() {
        return numeroCommande;
    }

    public void setNumeroCommande(int numeroCommande) {
        this.numeroCommande = numeroCommande;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public List<Plat> getPlats() {
        return plats;
    }

    public void setPlats(List<Plat> plats) {
        this.plats = plats;
    }
}
