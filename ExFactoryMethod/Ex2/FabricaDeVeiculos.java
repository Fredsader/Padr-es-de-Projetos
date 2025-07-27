public abstract class FabricaDeVeiculos {
    public abstract Veiculo criarVeiculo();

    public void testarVeiculo(){
        Veiculo v = criarVeiculo();
        v.acelerar();
        v.frear();
    }
}
