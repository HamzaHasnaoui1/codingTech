package org.example.tp4;

import java.util.List;

public class Admin extends Utilisateur{
    private String niveauAcces;
    private List<Produit> produitList;

    public String getNiveauAcces() {
        return niveauAcces;
    }

    public void setNiveauAcces(String niveauAcces) {
        this.niveauAcces = niveauAcces;
    }

    public List<Produit> getProduitList() {
        return produitList;
    }

    public void setProduitList(List<Produit> produitList) {
        this.produitList = produitList;
    }

    public Admin(String nom, String motDePasse, String email, String niveauAcces, List<Produit> produitList) {
        super(nom, motDePasse, email);
        this.niveauAcces = niveauAcces;
        this.produitList = produitList;
    }

    @Override
    public void connexion() {

    }

    @Override
    public void deconnexion() {

    }
}
