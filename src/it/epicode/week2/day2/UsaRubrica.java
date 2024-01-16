package it.epicode.week2.day2;

public class UsaRubrica {
    public static void main(String[] args) {
        Rubrica r = new Rubrica();
        r.insert("Giulio", "+39 3792116580");
        r.insert("Mario", "+39 1233333434");
        r.insert("Giovanni", "+46 0992345678");
        r.insert("Giangiacomo", "+36 0334568899");
        r.insert("Giampiero", "+82 39997776");
        System.out.println(r.getRubrica());
        System.out.println("Cancello dalla rubrica Giovanni");
        r.delete("Giovanni");
        System.out.println(r.getRubrica());
        System.out.println("Cerco il numero di telefono +391233333434 per trovare il nome corrispondente");
        System.out.println(r.search("+39 1233333434"));
    }
}
