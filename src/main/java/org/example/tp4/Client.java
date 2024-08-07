package org.example.tp4;

import java.util.List;

public class Client extends Utilisateur{
    @Override
    public void deconnexion() {

    }

    private String adresse ;
    private String detailPaiement;
    private List<Commande> commandesHistorique;

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getDetailPaiement() {
        return detailPaiement;
    }

    public void setDetailPaiement(String detailPaiement) {
        this.detailPaiement = detailPaiement;
    }

    public List<Commande> getCommandesHistorique() {
        return commandesHistorique;
    }

    public void setCommandesHistorique(List<Commande> commandesHistorique) {
        this.commandesHistorique = commandesHistorique;
    }

    public Client(String nom, String motDePasse, String email, String adresse, String detailPaiement, List<Commande> commandesHistorique) {
        super(nom, motDePasse, email);
        this.adresse = adresse;
        this.detailPaiement = detailPaiement;
        this.commandesHistorique = commandesHistorique;
    }

    @Override
    public void connexion() {

    }

    @Override
    public String toString() {
        return "Client{" +
                "adresse='" + adresse + '\'' +
                ", detailPaiement='" + detailPaiement + '\'' +
                ", commandesHistorique=" + commandesHistorique +
                '}';
    }
}
