package org.example.codingtech;

import java.util.Scanner;

public class Student {
    private String nom;
    private int note1;
    private int note2;

    public Student(String nom, int note1, int note2) {
        this.nom = nom;
        this.note1 = note1;
        this.note2 = note2;
    }

    public int cal_moy(){
        return (note1 + note2)/2;
    }

    public String show(){
        return nom + " " + cal_moy();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le nom : ");
        String nom = sc.nextLine();
        System.out.print("Entrez la note1 : ");
        int note1 = sc.nextInt();
        System.out.print("Entrez la note2 : ");
        int note2 = sc.nextInt();
        Student student = new Student(nom, note1, note2);
        System.out.println(student.show());
        sc.close();
    }
}
