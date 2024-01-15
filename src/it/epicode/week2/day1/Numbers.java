package it.epicode.week2.day1;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Integer;
public class Numbers {
    private static int generateRandomNumber(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1)) + min;
    }

    private static void stampaStatoArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("numero " + (i + 1) + " = " + numbers[i]);
            if (i < numbers.length -1) System.out.print(", ");
        }
            System.out.println();
    }

    private static void verificaNumeriArray(int n) {
        Integer number = n;
        if (number < 0 || number > 10) throw new NumbersException("I numeri devono essere acompresi tra 0 e 10");
    }

        private final static Logger logger = LoggerFactory.getLogger("Numbers");
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = generateRandomNumber(1, 10);
        }
        stampaStatoArray(numbers);
        while (true) {
            int i, number;

            try {
                System.out.println("Inserisci un numero da 1 a 5 per cambiare il numero nella posizione corrispondente");
                i = s.nextInt();
                if (i == 0) return;
                i--;
                System.out.println("Inserisci un nuovo numero intero da inserire in questa posizione");

                numbers[i] = s.nextInt();
                stampaStatoArray(numbers);
            } catch (InputMismatchException e) {
                System.out.println(("Devi inserire un numero intero!"));
                s.next();
                logger.error(e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Hai inserito una posizione non valida, che doveva essere compresa tra 1 e 5!");
                logger.error(e.getMessage());
            }





        }
    }
}
