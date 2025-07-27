package Ex2;

public class Main {
    public static void main(String[] args) {
        FabricaDeInimigos fabricaFacil = new FabricaFaseFacil();
        FabricaDeInimigos fabricaDificil = new FabricaFaseDificil();

        Soldado soldadoFacil = fabricaFacil.criarSoldado();
        Soldado soldadoDificil = fabricaDificil.criarSoldado();

        Chefe chefeDificil = fabricaDificil.CriarChefe();
        Chefe chefeFacil = fabricaFacil.CriarChefe();

        soldadoDificil.atacar();
        soldadoFacil.atacar();

        chefeDificil.mostrarVida();
        chefeFacil.mostrarVida();
    }
}
