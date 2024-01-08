package it.epicode.week1.day1;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrStr = new String[3];
        for (int i = 1; i <= 3; i ++) {
            System.out.println("Inserisci stringa " + i);
            arrStr[i - 1] = scanner.nextLine();
        }
        String concat = "";
        String revConcat = "";
        for (int i = 0; i < arrStr.length; i++) {
            concat += arrStr[i];
        }
        for (int i = arrStr.length - 1; i >= 0; i--) {
            revConcat += arrStr[i];
        }
        System.out.println(concat);
        System.out.println(revConcat);
    }
}
