public class Main {
    public static void main(String[] args) {
        System.out.println("Teste 1 - Ordem: Preto e Branco -> Bordas -> Nitidez");
        Imagem foto1 = new Foto("foto.jpg");
        foto1 = new FiltroPretoBranco(foto1);
        foto1 = new FiltroBordas(foto1);
        foto1 = new FiltroNitidez(foto1);
        foto1.imprimir();
        
        System.out.println("\nTeste 2 - Ordem: Nitidez -> Preto e Branco -> Bordas");
        Imagem foto2 = new Foto("foto.jpg");
        foto2 = new FiltroNitidez(foto2);
        foto2 = new FiltroPretoBranco(foto2);
        foto2 = new FiltroBordas(foto2);
        foto2.imprimir();
        
        System.out.println("\nTeste 3 - Ordem: Bordas -> Nitidez -> Preto e Branco");
        Imagem foto3 = new Foto("foto.jpg");
        foto3 = new FiltroBordas(foto3);
        foto3 = new FiltroNitidez(foto3);
        foto3 = new FiltroPretoBranco(foto3);
        foto3.imprimir();
    }
} 