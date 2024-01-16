package it.epicode.week2.day2;

import java.util.HashSet;
import java.util.Scanner;

public class Esercizio1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashSet<String> parole = new HashSet<>();
        HashSet<String> paroleDuplicate = new HashSet<>();
        System.out.println("Inserisci il numero di parole che vuoi aggiungere");
        int n = s.nextInt();
        s.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Inserisci una parola");
            String parola = s.nextLine();
            boolean parolaAggiunta = parole.add(parola);
            if (!parolaAggiunta) {
                paroleDuplicate.add(parola);
                parole.remove(parola);
            }
        }
        System.out.println("Parole duplicate: " + paroleDuplicate);
        System.out.println("Numero parole distinte: " + parole.size());
        System.out.println("Parole distinte: " + parole);
    }
}
