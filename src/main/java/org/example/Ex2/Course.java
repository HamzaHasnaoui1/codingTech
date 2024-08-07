package org.example.Ex2;

import java.util.Date;
import java.util.List;

public class Course {
    private String nom;
    private Double distance;
    private Date date;
    private List<Participants> participants;

    public Course(String nom, Double distance, Date date, List<Participants> participants) {
        this.nom = nom;
        this.distance = distance;
        this.date = date;
        this.participants = participants;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Participants> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participants> participants) {
        this.participants = participants;
    }
}
