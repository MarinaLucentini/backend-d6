package es3;

public class ContoOnline extends ContoCorrente {
    private double maxPrelievo;

    public ContoOnline(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;

    }

    public void stampaSaldo() {
        System.out.println("Titolare: " + getTitolare() + "- Saldo: " + saldo + "-Num movimenti: " + getnMovimenti() + "- Massimo movimenti: " + maxMovimenti + "-Massimo prelievo: " + maxPrelievo);
    }

    public void preleva(double x) throws BancaException {
        if (x <= maxPrelievo) {
            super.preleva(x);
        }
        if (x > maxPrelievo)
            throw new BancaException("Il prelievo non è disponibile");
    }
}
