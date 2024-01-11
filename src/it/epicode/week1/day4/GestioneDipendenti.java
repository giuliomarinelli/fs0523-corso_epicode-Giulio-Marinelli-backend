package it.epicode.week1.day4;
// Finito
public class GestioneDipendenti {

    public static void main(String[] args) {

        Dipendente d1 = new Dipendente("A123456", Dipartimento.PRODUZIONE);
        Dipendente d2 = new Dipendente("A098456", Dipartimento.PRODUZIONE);

        Dipendente d3 = new Dipendente("B134526", 1200, 30, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);

        Dipendente d4 = new Dipendente("B657231", 2000, 30, Livello.DIRIGENTE, Dipartimento.VENDITE);

        System.out.println(d1.getMatricola() + " promosso a " + d1.promuovi());
        System.out.println(d3.getMatricola() + " promosso a " + d3.promuovi());
        d1.stampaDatiDipendente();
        d2.stampaDatiDipendente();
        d3.stampaDatiDipendente();
        d4.stampaDatiDipendente();
        double s1 = Dipendente.calcolaPaga(d1, 5);
        double s2 = Dipendente.calcolaPaga(d2, 5);
        double s3 = Dipendente.calcolaPaga(d3, 5);
        double s4 = Dipendente.calcolaPaga(d4, 5);
        double somma = s1 + s2 + s3 + s4;
        System.out.println("Somma stipendi = " +somma);
    }

}
