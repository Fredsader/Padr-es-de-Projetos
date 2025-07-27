public class Main {
    public static void main(String[] args) {
        SistemaLegado sistemaLegado = new SistemaLegado();
        NovoSistema sistemaNovo = new Adaptador(sistemaLegado);

        sistemaNovo.insert("Fred");
        sistemaNovo.delete(7);
    }
}
