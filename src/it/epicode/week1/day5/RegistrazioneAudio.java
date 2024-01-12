package it.epicode.week1.day5;

public class RegistrazioneAudio extends ElementoMultimedialeRiproducibile implements GestisceVolume {

    RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo, durata);
        if (volume >= 0 && volume <= 10) this.volume = volume;
    }

    private int volume = 1;

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
    @Override
    public void play() {
        stampaNStringhe(getTitolo() + concatenaNStringhe("!", getVolume()), getDurata());
    }

    @Override
    public void esegui() {
        play();
    }
}
