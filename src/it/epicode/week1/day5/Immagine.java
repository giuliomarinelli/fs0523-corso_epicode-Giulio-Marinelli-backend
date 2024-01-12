package it.epicode.week1.day5;
// Non riproducibile quindi eradita direttamente da ElementoMultimediale
public class Immagine extends ElementoMultimediale implements GestisceLuminosita, GestisceShow {
    Immagine(String titolo, int luminosita) {
        super(titolo);
        if (luminosita >= 0 && luminosita <= 10) this.luminosita = luminosita;
    }

    private int luminosita;

    public int getLuminosita(){
        return luminosita;
    }

    @Override
    public void aumentaLuminosita() {
        if (luminosita < 10) luminosita++;
    }

    @Override
    public void diminuisciLuminosita() {
        if (luminosita > 0) luminosita--;
    }

    @Override
    public void show() {
        System.out.println(getTitolo() + concatenaNStringhe("*", getLuminosita()));
    }

    @Override
    public void esegui() {
        show();
    }
}
