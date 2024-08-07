package org.example.tp3;

public abstract class Personne {
    private String identifiant;
    private String nom;
    private int age;

    public Personne(String identifiant, String nom, int age) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.age = age;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "identifiant='" + identifiant + '\'' +
                ", nom='" + nom + '\'' +
                ", age=" + age +
                '}';
    }

    public abstract void afficherInfo();
}
