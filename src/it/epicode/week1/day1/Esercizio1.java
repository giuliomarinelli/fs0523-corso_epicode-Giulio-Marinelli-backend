package it.epicode.week1.day1;

public class Esercizio1 {
    public static int moltiplica(int a, int b) {
        return a * b;
    }

    public static String concatena(String str, int n) {
        return str + n;
    }

    public static String[] inserisciInArray(String[] strArr, String str) {
            String[] newStrArr = new String[6];
        if (strArr.length == 5) {
            newStrArr[2] = str;
           for (int i = 0; i < 2; i++) {
               newStrArr[i] = strArr[i];
           }
           for (int i = 3; i <= strArr.length; i++) {
               newStrArr[i] = strArr[i - 1];
           }
        }
    return newStrArr;
    }
    public static void main(String[] args){
        int x = 2, y = 3;
        System.out.println(moltiplica(x, y));
        String ciao = "ciao";
        int n = 1;
        System.out.println(concatena(ciao, n));
        String[] arrStr = {"A", "B", "C", "D", "E"};
        String str = "F";
        String[] res = inserisciInArray(arrStr, str);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
