public class FabricaDeMotos extends FabricaDeVeiculos {
    @Override
    public Veiculo criarVeiculo() {
        return new Moto();
    }
}
