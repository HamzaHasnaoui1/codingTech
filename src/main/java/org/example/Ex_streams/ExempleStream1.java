package org.example.Ex_streams;

import org.example.Ex5.Chambre;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExempleStream1 {
    public static void main(String[] args) {
        List<Client> clients = new ArrayList<>();
        clients.add(new Client("Dupont", "Jean", "C001"));
        clients.add(new Client("Martin", "Claire", "C002"));
        clients.add(new Client("Durand", "Jacques", "C003"));

        // Utilisation des streams pour filtrer et afficher les clients
        clients.stream()
                .filter(client -> client.getPrenom().startsWith("J"))
                .forEach(client -> System.out.println(client.getNom() + " " + client.getPrenom()));
    }

    public static class ExempleStream4 {
        public static void main(String[] args) {
            List<Client> clients = new ArrayList<>();
            Client client1 = new Client("Dupont", "Jean", "C001");
            Client client2 = new Client("Martin", "Claire", "C002");
            Client client3 = new Client("Durand", "Jacques", "C003");

            // Ajouter des chambres réservées à certains clients
            client1.ajouterChambreReservee(new Chambre("101", "simple", 50));
            client3.ajouterChambreReservee(new Chambre("103", "suite", 150));

            clients.add(client1);
            clients.add(client2);
            clients.add(client3);

            // Utilisation des streams pour obtenir les identifiants des clients ayant réservé au moins une chambre
            List<String> clientsAvecReservations = clients.stream()
                    .filter(client -> !client.getChambresReservees().isEmpty())
                    .map(Client::getIdentifiant)
                    .collect(Collectors.toList());

            System.out.println("Identifiants des clients avec des réservations : " + clientsAvecReservations);
        }
    }

}
