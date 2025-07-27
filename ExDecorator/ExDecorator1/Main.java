public class Main {

    public static void main(String[] args) {
        Texto texto = new TextoSimples("Olá, mundo!");
        texto = new Sublinhado(texto);
        texto = new Italico(texto);
        texto = new Negrito(texto);

        System.out.println(texto.formata());
        System.out.println("Total de caracteres: " + texto.getTotalCaracteres());

        System.out.println();

        Texto textoNovoEstilo = new TextoSimples("Novo Estilo Combinado");
        Texto tachado = new Tachado(textoNovoEstilo);
        Texto negritoTachado = new Negrito(tachado);
        Texto italicoNegritoTachado = new Italico(negritoTachado);

        System.out.println("Texto formatado: " + italicoNegritoTachado.getTexto());
        System.out.println("Contagem total de caracteres: " + italicoNegritoTachado.getContagemCaracteres());
    }
} 