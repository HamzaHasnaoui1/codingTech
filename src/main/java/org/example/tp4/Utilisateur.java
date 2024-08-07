package org.example.tp4;

public abstract class Utilisateur {
    private String nom;
    private String motDePasse;
    private String email;

    public Utilisateur(String nom, String motDePasse, String email) {
        this.nom = nom;
        this.motDePasse = motDePasse;
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract void connexion();

    public abstract void deconnexion();

    @Override
    public String toString() {
        return "Utilisateur{" +
                "nom='" + nom + '\'' +
                ", motDePasse='" + motDePasse + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
