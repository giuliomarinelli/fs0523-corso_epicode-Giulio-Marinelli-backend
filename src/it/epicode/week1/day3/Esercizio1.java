package it.epicode.week1.day3;

import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Dammi la base del primo rettangolo");
        double b1 = s.nextDouble();
        System.out.println("Dammi l'altezza del primo rettangolo");
        double h1 = s.nextDouble();
        Rettangolo r1 = new Rettangolo(b1, h1);
        System.out.println("Dammi la base del secondo rettangolo");
        double b2 = s.nextDouble();
        System.out.println("Dammi l'altezza del secondo rettangolo");
        double h2 = s.nextDouble();
        Rettangolo r2 = new Rettangolo(b2, h2);
        Rettangolo.stampaRettangolo(r1);
        Rettangolo.stampaRettangolo(r2);
        Rettangolo.stampaDueRettangoli(r1, r2);
    }
}
