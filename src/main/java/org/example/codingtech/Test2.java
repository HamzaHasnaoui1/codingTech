package org.example.codingtech;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        // 1. Calculer la somme des éléments du tableau
        int[] tableau = {2, 4, 6, 7, 9};
        int somme = 0;
        for (int i = 0; i < tableau.length; i++) {
            somme += tableau[i];
        }
        System.out.println(somme);
        System.out.println("--------------------------------");

        // 2. Trouver le plus grand élément dans un tableau
        int[] tableau1 = {7, 2, 5, 1, 4};
        int plusGrand = tableau1[0];
        for (int i = 1; i < tableau1.length; i++) {
            if (tableau1[i] > plusGrand) {
                plusGrand = tableau1[i];
            }
        }
        System.out.println(plusGrand);
        System.out.println("--------------------------------");

        // 3. Rotation du tableau
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int[] temp = new int[n];

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le nombre de positions pour la rotation : ");
        int d = sc.nextInt();

        d = d % n; // Assurer que d est dans les limites du tableau

        // Copier les premiers d éléments dans le tableau temporaire
        if (d > 0) System.arraycopy(arr, 0, temp, 0, d);

        // Déplacer les éléments restants du tableau vers la gauche
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        // Copier les éléments du tableau temporaire à la fin du tableau principal
        if (d > 0) System.arraycopy(temp, 0, arr, n - d, d);

        System.out.println("Tableau après rotation : " + Arrays.toString(arr));
        System.out.println("--------------------------------");

        // 4. Suppression des doublons
        int[] arr1 = {1, 2, 4, 3, 5, 3, 2, 5};
        int[] resultat = supprimerDoublons(arr1);
        System.out.println("Tableau après suppression des doublons : " + Arrays.toString(resultat));
        System.out.println("--------------------------------");

        // 5. Suppression des occurrences d'un élément
        int[] arr2 = {1, 2, 1, 3, 5, 1};
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Entrez la clé à supprimer : ");
        int n2 = sc2.nextInt();

        int[] resultat2 = supprimerOccurences(arr2, n2);
        System.out.println("Tableau après suppression des occurrences de " + n2 + " : " + Arrays.toString(resultat2));
        System.out.println("--------------------------------");

        Scanner sc3 = new Scanner(System.in);
        System.out.print("Entrez une chaîne pour vérifier si c'est un palindrome : ");
        String input = sc3.nextLine();

        if (palindrome(input)) {
            System.out.println("Oui");
        } else {
            System.out.println("Non");
        }
        System.out.println("--------------------------------");

        Scanner sc4 = new Scanner(System.in);
        System.out.print("Entrez la première chaîne : ");
        String str1 = sc4.nextLine();
        System.out.print("Entrez la seconde chaîne : ");
        String str2 = sc4.nextLine();


        if(anagramses(str1,str2)) {
            System.out.println("Oui");
        }else{
            System.out.println("Non");
        }
        System.out.println("--------------------------------");
        Scanner sc5 = new Scanner(System.in);
        System.out.print("Entrez le mot : ");
        String str3 = sc5.nextLine();
        sc5.close();
        String res= inversed(str3);
        System.out.println("Chaîne inversée : "+res);
        System.out.println("--------------------------------");
    }

    public static int[] supprimerDoublons(int[] arr1) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }
        int[] resultat = new int[set.size()];
        int i = 0;
        for (int num : set) {
            resultat[i++] = num;
        }
        return resultat;
    }

    public static int[] supprimerOccurences(int[] arr2, int key) {
        List<Integer> liste = new ArrayList<>();
        for (int num : arr2) {
            if (num != key) {
                liste.add(num);
            }
        }
        int[] resultat2 = new int[liste.size()];
        for (int i = 0; i < liste.size(); i++) {
            resultat2[i] = liste.get(i);
        }
        return resultat2;
    }

    public static boolean palindrome(String s) {
        s = s.toLowerCase();

        String reversed = new StringBuilder(s).reverse().toString();

        return s.equals(reversed);

    }

    public static boolean anagramses(String str1, String str2) {
        str1 = str1.toLowerCase().replaceAll("\\s", "");
        str2 = str2.toLowerCase().replaceAll("\\s", "");

        if (str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static String inversed(String str3){
        return new StringBuilder(str3).reverse().toString();

    }
}
