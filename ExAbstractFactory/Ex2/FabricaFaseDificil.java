package Ex2;

public class FabricaFaseDificil implements FabricaDeInimigos{

    @Override
    public Soldado criarSoldado() {
        return new SoldadoDificil();
    }

    @Override
    public Chefe CriarChefe() {
        return new ChefeDificil();
    }

}
