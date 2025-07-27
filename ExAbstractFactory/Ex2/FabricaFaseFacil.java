package Ex2;

public class FabricaFaseFacil implements FabricaDeInimigos{

    @Override
    public Soldado criarSoldado() {
        return new SoldadoFacil(); 
    }

    @Override
    public Chefe CriarChefe() {
        return new ChefeFacil();
    }

}
