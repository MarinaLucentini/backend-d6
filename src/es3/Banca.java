package es3;

public class Banca {
    public static void main(String[] args) {
        ContoCorrente conto1 = new ContoCorrente("Mario Rossi", 2000.0);
        System.out.println("Saldo conto:" + conto1.restiusciSaldo());
        try {
            conto1.preleva(1750.5);
            System.out.println("Saldo conto: " + conto1.restiusciSaldo());
        } catch (BancaException e) {

            System.out.println("Errore durante il prelievo" + e);
            e.printStackTrace();
        }
        ContoOnline conto2 = new ContoOnline("Rossi Luigi", 50350.0, 1500);
        conto2.stampaSaldo();
        try {
            conto2.preleva(2000);
            conto2.stampaSaldo();
        } catch (BancaException e) {
            System.out.println("Errore durante il prelievo" + e);
            e.printStackTrace();
        }
    }
}
