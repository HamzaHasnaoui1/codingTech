package org.example.Ex3;

public class Plat {
    private String nom;
    private int prix;
    public Type type;

    public enum Type{
        entree, platPrincipal, dessert;
    }

    public Plat(String nom, int prix, Type type) {
        this.nom = nom;
        this.prix = prix;
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}



