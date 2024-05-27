package Esercizi;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Quanti litri hai messo di carburante:");
                double litri = Double.parseDouble(sc.nextLine());
                System.out.println("Quanti km hai percorso con l'auto?");
                int km = Integer.parseInt(sc.nextLine());
                System.out.println("Hai consumato " + km / litri + " l/km");
            } catch (ArithmeticException ex) {
                System.out.println("Non puoi dividere per zero, stronzo");
            }


        }
    }
}
