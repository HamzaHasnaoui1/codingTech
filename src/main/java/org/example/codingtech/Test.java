package org.example.codingtech;

import com.sun.source.util.SourcePositions;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.println("Hello\nworld " );

        System.out.println("------------------------------------ " );

        int a=74;
        int b =36;
        System.out.println(a+b);
        System.out.println("------------------------------------ " );

        int c=50;
        int d =3;
        System.out.println(c/d);

        System.out.println("------------------------------------ " );
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le premier nombre : ");
        int e=scanner.nextInt();
        System.out.print("Entrez le second nombre : ");
        int f =scanner.nextInt();
        int produit =e*f;
        System.out.println(e+"x"+f+"="+produit);


        System.out.println("------------------------------------ " );


        System.out.print("Entrez le premier nombre : ");
        int g=scanner.nextInt();
        System.out.print("Entrez le second nombre : ");
        int h =scanner.nextInt();
        int addition =g+h;
        System.out.println(g+"+"+h+"="+addition);


        int multiplication =g-h;
        System.out.println(g+"-"+h+"="+multiplication);


        int soustraction =g*h;
        System.out.println(g+"x"+h+"="+soustraction);

        int division  =g/h;
        System.out.println(g+"/"+h+"="+division );

        int modulo  =g%h;
        System.out.println(g+"%"+h+"="+modulo );

        System.out.println("------------------------------------ " );


        int[] resultats = new int[5];
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    resultats[i] = g + h;
                    break;
                case 1:
                    resultats[i] = g - h;
                    break;
                case 2:
                    resultats[i] = g * h;
                    break;
                case 3:
                    resultats[i] = g / h;
                    break;
                case 4:
                    resultats[i] = g % h;
                    break;

            }
        }

        System.out.println(g + " + " + h + " = " + resultats[0]);
        System.out.println(g + " - " + h + " = " + resultats[1]);
        System.out.println(g + " x " + h + " = " + resultats[2]);
        System.out.println(g + " / " + h + " = " + resultats[3]);
        System.out.println(g + " mod " + h + " = " + resultats[4]);
        scanner.close();
    }
}
