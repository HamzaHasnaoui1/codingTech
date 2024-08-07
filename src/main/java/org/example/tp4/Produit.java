package org.example.tp4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Produit {
    private Long id;
    private String nom;
    private String description;
    private int prix;
    private int quantite;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Produit() {
    }

    public Produit(Long id, String nom, String description, int prix, int quantite, List<Produit> produits) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.quantite = quantite;
        this.produits = produits;
    }

    private List<Produit> produits = new ArrayList<Produit>();

    public void addProduit(Produit pdt) {
    produits.add(pdt);
    }

    public void removeProduit(Long id) {
        produits = produits.stream()
                .filter(produit -> !produit.getId().equals(id))
                .collect(Collectors.toList());
    }



    public void updateProduit(Long id, String nom, String description, int prix, int quantite) {
        for (Produit p : produits) {
            if (p.getId().equals(id)) {
                p.setNom(nom);
                p.setDescription(description);
                p.setPrix(prix);
                p.setQuantite(quantite);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                ", quantite=" + quantite +
                ", produits=" + produits +
                '}';
    }

    public List<Produit> getProduits() {
        return produits;
    }
}
