package it.epicode.week1.day1;

import java.util.Scanner;

public class Esercizio3 {
    public static double perimetroRettangolo(double l1, double l2) {
        return 2 * (l1 + l2);
    }
    public static int pariDispari(int n) {
        return n % 2 == 0 ? 0 : 1;
    }
    public static double areaTriangolo(double base, double altezza) {
        return base * altezza / 2;
    }

    public static void main(String[] args) {
        System.out.println("Perimetro del rettangolo");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il primo lato:");
        double lato1 = scanner.nextDouble();
        System.out.println("Inserisci il secondo lato:");
        double lato2 = scanner.nextDouble();
        System.out.println("Perimetro = " + perimetroRettangolo(lato1, lato2));
        System.out.println("Inserisci un numero e ti restituirò 0 se è pari, 1 se è dispari");
        int n = scanner.nextInt();
        System.out.println(pariDispari(n));
        System.out.println("Area del triangolo");
        System.out.println("Inserisci la base");
        double base = scanner.nextDouble();
        System.out.println("Inserisci l'altezza:");
        double altezza = scanner.nextDouble();
        System.out.println("AREA = " + areaTriangolo(base, altezza));

    }
}
