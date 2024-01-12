package it.epicode.week1.day5;
// Riproducibile quindi eredita dalla sottoclasse di ElementoMultimediale arricchita appositamente
public class RegistrazioneAudio extends ElementoMultimedialeRiproducibile implements GestisceVolume {

    RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo, durata);
        if (volume >= 0 && volume <= 10) this.volume = volume;
    }

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
    @Override
    public void play() {
        stampaNStringhe(getTitolo() + concatenaNStringhe("!", getVolume()), getDurata());
    }

    @Override
    public void esegui() {
        play();
    }
}
