package it.epicode.week2.day1;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Banca {
    private final static Logger logger = LoggerFactory.getLogger("Banca");
    public static void main(String[] args) {
        ContoCorrente conto1 = new ContoCorrente("Grossi Mario", 20000.0);

        System.out.println("Saldo conto: " + conto1.restituisciSaldo());

        try {
            conto1.preleva(221750.5);

            System.out.println("Saldo conto: " + conto1.restituisciSaldo());
        } catch (BancaException e) {
            System.out.println("Errore durante il prelievo: " + e);
            logger.error(e.getMessage());
        }

        ContoOnLine conto2 = new ContoOnLine("Rossi Luigi", 50350.0, 1500);

        conto2.stampaSaldo();

        try {
            conto2.preleva(2000);

            conto2.stampaSaldo();

        } catch (BancaException e) {
            System.out.println("Errore durante il prelievo: " + e);
            logger.error(e.getMessage());
        }
    }
}
