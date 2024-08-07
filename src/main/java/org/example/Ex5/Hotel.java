package org.example.Ex5;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Client> clients;
    private List<Chambre>chambres;

    public Hotel(List<Client> clients, List<Chambre> chambres) {
        this.clients = clients;
        this.chambres = chambres;
    }
    public void addChambre(Chambre chambre) {
        chambres.add(chambre);
    }

    public void addClient(Client client) {
        clients.add(client);
    }
}

