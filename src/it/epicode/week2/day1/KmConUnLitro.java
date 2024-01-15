package it.epicode.week2.day1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class KmConUnLitro {
    private final static Logger logger = LoggerFactory.getLogger("KmConUnLitro");
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Calcolo km/L");
        System.out.println("Inserisci i km percorsi");
        int km = s.nextInt();
        System.out.println("Inserisci i litri consumati");
        int l = s.nextInt();
        try {
            System.out.println("Consumo in km/L = " + km / l);
        } catch (ArithmeticException e) {
            System.out.println("Non è possibile effettuare una divisione per zero");
            logger.error(e.getMessage());
        }
    }
}
