package es1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            Random rdnm = new Random();
            int number = rdnm.nextInt(1, 10);
            array[i] = number;
            System.out.println(array[i]);
        }
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Dammi un numero da 1 a 5 per sostituire il valore corrispondente nell'array. Se non vuoi cambiare nulla premi 0");
                int numeroDaSostituire = Integer.parseInt(scanner.nextLine());
                array[numeroDaSostituire - 1] = numeroDaSostituire;
                System.out.println(Arrays.toString(array));

                if (numeroDaSostituire == 0) {
                    break;
                }
            } catch (ArrayIndexOutOfBoundsException ex) {

                System.err.println("Indice non valido");
            } catch (NumberFormatException ex) {
                System.err.println("Devi inserire un numero");
            }


        }
        scanner.close();


    }
}
