public class Main {
    public static void main(String[] args) {
        FabricaDeVeiculos fabricaMotos = new FabricaDeMotos();
        FabricaDeVeiculos fabricaCarros = new FabricaDeCarros();

        fabricaMotos.testarVeiculo();
        fabricaCarros.testarVeiculo();

    }
}
