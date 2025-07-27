public class Main {
    public static void main(String[] args) {
        ArquivoTxt arquivoTxt = new ArquivoTxt();
        ArquivoCsv arquivo = new Adaptador(arquivoTxt);

        arquivo.abrir();
    }
}
