public class Main {
    public static void main(String[] args) {
        RegistroDePrototipos registro = new RegistroDePrototipos();

        Retangulo r1 = new Retangulo();
        r1.x = 5;
        r1.y = 2;
        r1.cor = "vermelho";
        r1.largura = 7;
        r1.altura = 13;

        Circulo c1 = new Circulo();
        c1.x = 5;
        c1.y = 5;
        c1.cor = "azul";
        c1.raio = 50;

        registro.adicionarPrototipo("ret", r1);
        registro.adicionarPrototipo("circ", c1);

        Retangulo r2 = (Retangulo) registro.clonar("ret");
        Circulo c2 = (Circulo) registro.clonar("circ");

        r2.cor = "verde";
        r2.largura = 150;

        c2.cor = "amarelo";
        c2.raio = 80;

        System.out.println("Original:");
        r1.exibirInfo();
        c1.exibirInfo();

        System.out.println("Copias:");
        r2.exibirInfo();
        c2.exibirInfo();
    }
}
