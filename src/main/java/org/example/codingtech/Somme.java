package org.example.codingtech;

import java.util.Scanner;

public class Somme {
    private int n1;
    private int n2;

    public Somme(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int sum(){
        return n1 + n2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez la note1 : ");
        int n1 = sc.nextInt();
        System.out.print("Entrez la note2 : ");
        int n2 = sc.nextInt();
        Somme s = new Somme(n1, n2);
        System.out.println("la somme = " + s.sum());
        sc.close();
    }
}
