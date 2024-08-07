package org.example.Ex5;

public class Chambre {
    private int num;
    private Type type;
    private int prixParNuit;
    private Boolean disponibilite;

    public Chambre(String number, String suite, int prixParNuit) {
    }


    public enum Type{
        simple, doubleTYPE, suite;
    }

    public Chambre(int num, Type type, int prixParNuit, Boolean disponibilite) {
        this.num = num;
        this.type = type;
        this.prixParNuit = prixParNuit;
        this.disponibilite = true;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getPrixParNuit() {
        return prixParNuit;
    }

    public void setPrixParNuit(int prixParNuit) {
        this.prixParNuit = prixParNuit;
    }

    public Boolean getDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(Boolean disponibilite) {
        this.disponibilite = disponibilite;
    }
}
