package org.example.tp4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Produit produit=new Produit();
        Produit produit1=new Produit();
        produit1.addProduit(new Produit(1L,"pdt1","Desc1",249,5,new ArrayList<>()));

        Produit produit2=new Produit();
        produit2.addProduit(new Produit(2L,"pdt2","Desc2",120,7,new ArrayList<>()));

        produit.addProduit(new Produit(3L,"pdt3","Desc3",499,2,new ArrayList<>()));

        System.out.println(produit.getProduits());

        produit.updateProduit(1L,"pdt1","Desc1",888,99);
        System.out.println(produit.getProduits());

        produit.removeProduit(3L);
        System.out.println(produit.getProduits());

        Client client1=new Client("Hamza","1234","mail","adresse","dd",new ArrayList<>());
        Client client2=new Client("Ali","1234","mail","adresse","cc",new ArrayList<>());

        Commande commande1 = new Commande(1L, new ArrayList<>(), 300.0, client1);
        commande1.getProduitsList().add(produit1);


        Commande commande2 = new Commande(2L, new ArrayList<>(), 200.0, client2);
        commande2.getProduitsList().add(produit2);

        Commande commande =new Commande();
        commande.addCommande(commande1);
        commande.addCommande(commande2);

        commande.afficherCommande(commande1);
        commande.afficherCommande(commande2);
        System.out.println("********************");

        commande.removeCommande(commande2);
        System.out.println(commande.getCommandes());
    }
}
