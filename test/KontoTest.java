import org.junit.Test;

import static org.junit.Assert.*;

public class KontoTest {

    @Test
    public void testerTraekPengefoersel() throws Exception {
        Konto test = new Konto();
        test.setSaldo(100); //Sætter saldoen til 100
        test.traekPenge(10); //Sætter antallet af penge som skal trækkes fra saldoen
        assertEquals("Du har regnet forkert :(",90,test.getSaldo()); //Tester om mit forventede er det samme som den rigtige saldo.

    }
    @Test
    public void testerMaxSaldo() throws Exception {
        Konto test2 = new Konto();
        int nySaldo = test2.setSaldo(1000);
        boolean resultat;


        if(nySaldo > 1000){ resultat = false;}
        else {resultat = true;}
        assertTrue("Saldoen må desværre ikke være højere end 1000 kr",resultat);
    }



}