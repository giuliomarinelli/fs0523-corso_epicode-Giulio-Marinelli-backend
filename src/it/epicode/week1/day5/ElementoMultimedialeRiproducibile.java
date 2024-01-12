package it.epicode.week1.day5;
// Per rendere riproducibile un elemento multimediale
public abstract class ElementoMultimedialeRiproducibile extends ElementoMultimediale {
    ElementoMultimedialeRiproducibile(String titolo, int durata) {
        super(titolo);
        if (durata > 0) this.durata = durata;
    }
    private int durata = 1;
    public abstract void play();

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }
}
