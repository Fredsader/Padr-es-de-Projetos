public class Carro implements Veiculo{

    @Override
    public void acelerar() {
        System.out.println("tração nas quadro rodas!!");
    }

    @Override
    public void frear() {
        System.out.println("Freio ABS!!");
    }

}
