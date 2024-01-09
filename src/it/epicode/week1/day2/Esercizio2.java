package it.epicode.week1.day2;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dammi un numero intero compreso tra 0 e 3");
        int numero = scanner.nextInt();
        switch(numero) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("due");
                break;
            case 3:
                System.out.println("tre");
                break;
            default:
                System.out.println("Errore! hai inserito il numero " + numero + ", che non è compreso tra 0 e 3!");
        }

    }


}
