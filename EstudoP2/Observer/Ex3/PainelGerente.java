public class PainelGerente implements Observer{
    @Override
    public void update(int qntd) {
        System.out.println("Quantidade recebida pelo gerente: " + qntd);
    }
}
