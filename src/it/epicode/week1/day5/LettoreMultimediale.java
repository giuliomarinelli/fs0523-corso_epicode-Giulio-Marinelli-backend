package it.epicode.week1.day5;

import java.util.Scanner;

public class LettoreMultimediale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];
        while (i < elementi.length) {
            System.out.println("Aggiunta elemento " + (i + 1));
            System.out.println("Scegli che tipo di elemento vuoi aggiungere: digita 1 per Immagine, 2 per Audio, 3 per Video");
            int scelta = scanner.nextInt();
            scanner.nextLine();
            if (scelta < 1 || scelta > 3) {
                System.out.println("Errore, devi digitare un numero compreso tra 1 e 3!");
                continue;
            }
            switch (scelta) {
                case 1:
                    System.out.println("IMMAGINE");
                    System.out.println("Inserisci un titolo");
                    String t1 = scanner.nextLine();
                    System.out.println("Inserisci una luminosità iniziale compresa tra 0 e 10 (per valori diversi la luminosità è di default 0)");
                    int l1 = scanner.nextInt();
                    elementi[i] = new Immagine(t1, l1);
                break;
                case 2:
                    System.out.println("AUDIO");
                    System.out.println("Inserisci un titolo");
                    String t2 = scanner.nextLine();
                    System.out.println("Inserisci la durata in secondi");
                    int d2 = scanner.nextInt();
                    System.out.println("Inserisci un volume iniziale compreso tra 0 e 10 (per valori diversi il volume è di default 0)");
                    int v2 = scanner.nextInt();
                    elementi[i] = new RegistrazioneAudio(t2, d2, v2);
                break;
                case 3:
                    System.out.println("VIDEO");
                    System.out.println("Inserisci un titolo");
                    String t3 = scanner.nextLine();
                    System.out.println("Inserisci la durata in secondi");
                    int d3 = scanner.nextInt();
                    System.out.println("Inserisci un volume iniziale compreso tra 0 e 10 (per valori diversi il volume è di default 0)");
                    int v3 = scanner.nextInt();
                    System.out.println("Inserisci una luminosità iniziale compresa tra 0 e 10 (per valori diversi la luminosità è di default 0)");
                    int l3 = scanner.nextInt();
                    elementi[i] = new Video(t3, d3, v3, l3);
                break;
            }

            i++;

        }

        while (true) {
            System.out.println("Digita un numero da 1 a 5 per eseguire l'elemento multimediale corrispondente. Inserisci 0 per terminare il programma.");
            int scelta = scanner.nextInt();
            if (scelta == 0) return;
            if (scelta < 1 || scelta > 5) {
                System.out.println("Errore: devi scegliere un elemento compreso tra 1 e 5!");
                continue;
            }
            elementi[scelta - 1].esegui();

        }
    }
}
