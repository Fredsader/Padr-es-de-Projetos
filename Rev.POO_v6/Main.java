public class Main {
    public static void main(String[] args) {
        VeÍculos carro = new Carro();
        VeÍculos bike = new Bike();

        carro.acelerar();
        System.out.println(carro.frear());
        System.out.println(bike.frear());
    }
}
