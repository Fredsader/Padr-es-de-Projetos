public class Main {
    public static void main(String[] args) {
        GeradorDeRelatorio geradorRelatorioPDF = new GeradorDeRelatorioPDF();
        GeradorDeRelatorio geradorRelatorioHTML = new GeradorDeRelatorioHTML();

        geradorRelatorioPDF.abrir();
        geradorRelatorioHTML.abrir();
    }
}
