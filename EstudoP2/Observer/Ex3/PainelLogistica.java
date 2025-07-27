public class PainelLogistica implements Observer{
    @Override
    public void update(int qntd) {
        System.out.println("Quantidade recebida pela Logística: " + qntd);
    }
}

