public class Main {
    public static void main(String[] args) {
        FabricaDeComponentes fabrica = new FabricaClassica();

        Janela janelaClassica = fabrica.criarJanela();
        janelaClassica.mover();
    }
}
