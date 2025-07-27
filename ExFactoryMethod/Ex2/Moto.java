public class Moto implements Veiculo{

    @Override
    public void acelerar() {
        System.out.println("Tração traseira");
    }

    @Override
    public void frear() {
        System.out.println("Freio à disco!");
    }
}
