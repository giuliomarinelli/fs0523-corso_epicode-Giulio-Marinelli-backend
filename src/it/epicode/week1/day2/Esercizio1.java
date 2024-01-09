package it.epicode.week1.day2;


import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dammi una stringa");
        String str = scanner.nextLine();
        boolean isOdd = stringaPariDispari(str);
        System.out.println(isOdd);
        System.out.println("Dammi un anno");
        int anno = scanner.nextInt();
        boolean bisestile = annoBisestile(anno);
        System.out.println(bisestile);
    }

    public static boolean stringaPariDispari(String str){
        return str.length() % 2 == 0;
    }

    public static boolean annoBisestile(int anno) {
        return anno % 100 == 0 ? anno % 400 == 0 : anno % 4 == 0;
    }

}
