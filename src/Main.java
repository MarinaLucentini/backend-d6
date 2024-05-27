import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.println("Per favore inserire un numero:");
        try {
            String input = scanner.nextLine();
            numero = Integer.parseInt(input);
        } catch (NumberFormatException ex) {
            System.err.println("Il valore che hai inserito non è un numero");
        } finally {
            scanner.close();
        }

    }
}