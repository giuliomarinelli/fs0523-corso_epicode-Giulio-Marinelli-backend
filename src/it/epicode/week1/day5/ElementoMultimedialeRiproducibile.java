package it.epicode.week1.day5;

public abstract class ElementoMultimedialeRiproducibile extends ElementoMultimediale {
    public abstract void play();
    ElementoMultimedialeRiproducibile(String titolo, int durata) {
        super(titolo);
        this.durata = durata;
    }
    private int durata;

    public int getDurata() {
        return durata;
    }
}
