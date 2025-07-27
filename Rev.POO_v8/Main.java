public class Main {
    public static void main(String[] args) {
        Atendimento a1 = new Atendente();
        Producao p1 = new Barista();

        System.out.println(a1.atender());
        System.out.println(p1.produzirCafe());
    }
}
