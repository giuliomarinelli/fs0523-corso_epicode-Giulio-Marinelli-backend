package it.epicode.week1.day5;

public class Video extends ElementoMultimedialeRiproducibile implements GestisceVolume, GestisceLuminosita {
    Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata);
        if (volume >= 0 && volume <= 10) this.volume = volume;
        if (luminosita >= 0 && volume <= 10) this.luminosita = luminosita;
    }

    private int luminosita;
    private int volume;

    @Override
    public void abbassaVolume() {
        if (volume > 0) volume--;
    }

    @Override
    public void alzaVolume() {
        if (volume < 10) volume++;
    }

    public int getVolume() {
        return volume;
    }

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
    public void play() {
        stampaNStringhe(getTitolo() + concatenaNStringhe("!", getVolume()) + concatenaNStringhe("*", getLuminosita()) , getDurata());
    }

    @Override
    public void esegui() {
        play();
    }
}
