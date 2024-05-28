package es3;

public class ContoCorrente {
    final int maxMovimenti = 50;
    double saldo;
    private String titolare;
    private int nMovimenti;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.nMovimenti = 0;
    }

    public void preleva(double x) throws BancaException {
        if (nMovimenti < maxMovimenti) {
            this.saldo = this.saldo - x;
        } else {

            this.saldo = this.saldo - x - 0.50;
            this.nMovimenti++;
            if (saldo < 0)
                throw new BancaException("il conto è in rosso");
            nMovimenti++;
        }
    }

    public double restiusciSaldo() {
        return this.saldo;
    }

    public String getTitolare() {
        return titolare;
    }

    public void setTitolare(String titolare) {
        this.titolare = titolare;
    }

    public int getnMovimenti() {
        return nMovimenti;
    }

    public void setnMovimenti(int nMovimenti) {
        this.nMovimenti = nMovimenti;
    }
}
