package org.example.Ex2;

public class Participants {
    private String nom;
    private String prenom;
    private int age;
    private int numeroDossard;

    public Participants(String nom, String prenom, int age, int numeroDossard) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.numeroDossard = numeroDossard;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumeroDossard() {
        return numeroDossard;
    }

    public void setNumeroDossard(int numeroDossard) {
        this.numeroDossard = numeroDossard;
    }
}
