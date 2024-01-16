package it.epicode.week2.day2;

import java.util.HashMap;
import java.util.Set;

public class Rubrica {
    private HashMap<String, String> rubrica;

    public Rubrica() {
        rubrica = new HashMap<>();
    }

    public HashMap<String, String> getRubrica() {
        return rubrica;
    }

    public void insert(String nome, String numero) {
        rubrica.put(nome, numero);
    }

    public void delete(String nome) {
        rubrica.remove(nome);
    }

    public String search(String numero) {
        Set<String> chiavi = rubrica.keySet();
        for (String c: chiavi) {
            String num = rubrica.get(c);
            if (num.equals(numero)) return c;
        }
        return "";
    }

}
