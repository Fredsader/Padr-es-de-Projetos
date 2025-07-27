public class Main {
    public static void main(String[] args) {
        Texto texto = new TextoSimples();
        
        texto = new Negrito(texto);
        texto = new Italico(texto);
        texto = new Sublinhado(texto);

        System.out.println(texto.getTexto());

    }
}
