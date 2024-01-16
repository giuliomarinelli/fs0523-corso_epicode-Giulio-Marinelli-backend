package it.epicode.week2.day2;

import java.util.*;

public class Esercizio2 {
    private static int generateRandomNumber(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1)) + min;
    }

    public static ArrayList<Integer> numeriCasuali(int n) {
        TreeSet<Integer> lista = new TreeSet<>();
        ArrayList<Integer> lista2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lista.add(generateRandomNumber(0, 100));
        }
        lista2.addAll(lista);
        return lista2;
    }

    public static List<Integer> reverse(List<Integer> lista) {
        return lista.reversed();
    }

    public static void stampaLista(List<Integer> lista, boolean pari) {

            for (int i = 0; i < lista.size(); i++) {
                if (pari && i % 2 == 0) {
                    System.out.println(lista.get(i));
                } else if (!pari && i % 2 != 0) {
                    System.out.println(lista.get(i));
                }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> l = numeriCasuali(50);
        System.out.println(l);
        System.out.println(reverse(l));
        System.out.println("Solo le posizioni pari");
        stampaLista(l, true);
        System.out.println("Solo le posizioni dispari");
        stampaLista(l, false);
    }

}
