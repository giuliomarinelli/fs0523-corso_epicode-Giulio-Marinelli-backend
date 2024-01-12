package it.epicode.week1.day5;

public abstract class ElementoMultimediale {
    public abstract void esegui();
    private String titolo;

    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }


    public static void stampaNStringhe(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }
    public static String concatenaNStringhe(String str, int n) {
        String concatenamento = "";
        for (int i = 0; i < n; i++) {
            concatenamento += str;
        }
        return concatenamento;
    }
}
