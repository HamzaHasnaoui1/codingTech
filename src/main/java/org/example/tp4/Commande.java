package org.example.tp4;

import java.util.ArrayList;
import java.util.List;

public class Commande {
    private Long id;
    private List<Produit> produitsList;
    private Double prix;
    private Client client;

    public Commande(Long id, List<Produit> produitsList, Double prix, Client client) {
        this.id = id;
        this.produitsList = produitsList;
        this.prix = prix;
        this.client = client;
    }

    public Commande() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Produit> getProduitsList() {
        return produitsList;
    }

    public void setProduitsList(List<Produit> produitsList) {
        this.produitsList = produitsList;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    private List<Commande> commandes =new ArrayList<>();

    public void addCommande(Commande commande){
        commandes.add(commande);
    }

    public void removeCommande(Commande commande){
        commandes.remove(commande);
    }

    public void afficherCommande(Commande commande){
        System.out.println(commande);
    }

    public List<Commande> getCommandes() {
        return commandes;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "id=" + id +
                ", produitsList=" + produitsList +
                ", prix=" + prix +
                ", client=" + client +
                ", commandes=" + commandes +
                '}';
    }
}
