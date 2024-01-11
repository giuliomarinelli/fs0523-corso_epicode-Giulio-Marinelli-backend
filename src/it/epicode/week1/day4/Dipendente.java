package it.epicode.week1.day4;



public class Dipendente {
    private double stipendioBase = 1000;
    private String matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private Livello livello;
    private Dipartimento dipartimento;

    public Dipendente(String matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.dipartimento = dipartimento;
        stipendio = stipendioBase;
        importoOrarioStraordinario = 30;
        livello = Livello.OPERAIO;
    }

    public Dipendente(String matricola, double stipendio, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
        this.stipendioBase = stipendioBase;
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;
    }

    public void stampaDatiDipendente() {
        System.out.println("Matricola dipendente: " + matricola +
                ", Stipendio: " + stipendio +
                "€,\n Importo orario straordinario: " + importoOrarioStraordinario +
                "€, Livello: " + livello +
                ", Dipartimento: " + dipartimento
        );
    }

    public static double calcolaPaga(Dipendente dipendente) {
        return dipendente.getStipendio();
    }

    public static double calcolaPaga(Dipendente dipendente, int oreStraordinario) {
        return calcolaPaga(dipendente) + oreStraordinario * dipendente.getImportoOrarioStraordinario();
    }

    public Livello promuovi() {
        switch (livello) {
            case Livello.OPERAIO:
                livello = Livello.IMPIEGATO;
                stipendio = stipendioBase * 1.2;
                break;
            case Livello.IMPIEGATO:
                livello = Livello.QUADRO;
                stipendio = stipendioBase * 1.5;
                break;
            case Livello.QUADRO:
                livello = Livello.DIRIGENTE;
                stipendio = stipendioBase * 2;
                break;
            case Livello.DIRIGENTE:
                System.out.println("ERRORE: non è possibile promuovere un dirigente!");
        }
        return livello;

    }
    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public double getStipendioBase() {
        return stipendioBase;
    }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public Livello getLivello() {
        return livello;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }
}