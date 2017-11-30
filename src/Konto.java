//En konto med en metode som trækker penge fra saldoen. Test følger i testmappe

public class Konto {

    private int saldo;

    public void traekPenge(int antalPenge) { //Metode som trækker penge fra saldoen
        saldo = saldo - antalPenge;
    }

    public void overfoerPenge (int antalPenge){
        saldo = saldo + antalPenge;
    }


    public int getSaldo() { //Henter saldoens nuværende beløb
        return saldo;
    }

    public int setSaldo(int saldo) { //Metode til at sætte saldoen til et bestemt beløb
        this.saldo = saldo;
        return saldo;


    }
}