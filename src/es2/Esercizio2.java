package es2;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("Dimmi quanti kilometri hai percorso. Per favore inserisci un valore numerico");
            int kilometri = Integer.parseInt(scanner.nextLine());
            System.out.println("Dimmi quanti litri hai consumato. Per favore inserisci un valore numerico");
            int litri = Integer.parseInt(scanner.nextLine());
            int calcolo = kilometri / litri;
            System.out.println("Il valore dei kilometri per litro è : " + calcolo);
        } catch (NumberFormatException ex) {
            System.err.println("Devi inserire un valore numerico");
        } catch (ArithmeticException ex) {
            System.err.println("Nessun numero è divisibile per 0");
        } finally {
            scanner.close();
        }

    }
}
