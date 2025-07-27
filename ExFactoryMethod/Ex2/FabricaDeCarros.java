public class FabricaDeCarros extends FabricaDeVeiculos{
    @Override
    public Veiculo criarVeiculo() {
        return new Carro();
    }
    
}
