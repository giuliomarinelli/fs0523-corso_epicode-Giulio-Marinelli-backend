package it.epicode.week1.day5;
// E' la madre di tutte le altre classi (ad eccezione di LettoreMultimediale)
public abstract class ElementoMultimediale {
    private String titolo;
    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }
    public abstract void esegui();

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    protected static void stampaNStringhe(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }
    protected static String concatenaNStringhe(String str, int n) {
        String concatenamento = "";
        for (int i = 0; i < n; i++) {
            concatenamento += str;
        }
        return concatenamento;
    }
}
