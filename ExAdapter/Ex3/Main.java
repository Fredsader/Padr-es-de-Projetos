public class Main {
    public static void main(String[] args) {
        Mp4Player playerMp4 = new Mp4Player();
        MediaPlayer mediaPlayer = new Adaptador(playerMp4);

        mediaPlayer.tocar("MP4", "Musica");
        
    }
}
