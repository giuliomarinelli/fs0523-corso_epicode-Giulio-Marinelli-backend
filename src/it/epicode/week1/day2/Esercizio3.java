package it.epicode.week1.day2;

import java.util.Objects;
import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Dammi una stringa");
            String str = scanner.nextLine();
            if (str.equals(":q")) return;
            String csv = "";
            for (int i = 0; i < str.length(); i++) {
                csv += str.charAt(i);
                if (i != str.length() - 1) csv += ',';
            }
            System.out.println(csv);
        }
    }
}
