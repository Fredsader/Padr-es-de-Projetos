
public class Adaptador implements MediaPlayer {
    public Mp4Player mp4Player;

    public Adaptador(Mp4Player mp4Player){
        this.mp4Player = mp4Player;
    }

    @Override
    public void tocar(String audioTipo, String nomeArquivo) {
        mp4Player.reproduzirArquivoMp4(nomeArquivo);
    }

    
}
