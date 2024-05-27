package es3;

public class BancaException extends Exception {
    public BancaException(String text) Exception {
        super("Il conto è in rosso"+ text);

    }
}
