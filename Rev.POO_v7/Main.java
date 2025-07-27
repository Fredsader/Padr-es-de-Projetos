public class Main {
    public static void main(String[] args) {
        TrabalhadorPublico t1 = new Atendente();
        Desenvolvedor p1 = new Programador();

        System.out.println(t1.atenderCliente());
        System.out.println(p1.programar());

    }
}
