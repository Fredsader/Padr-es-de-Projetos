public class Main {
    public static void main(String[] args) {
        Personagem personagem = new Guerreiro();
        personagem = new ArmaduraDeFerro(personagem);
        personagem = new EscudoMagico(personagem);
        personagem = new BencaoDivina(personagem);
        
        System.out.println(personagem.getDescricao());
        System.out.println("Defesa total: " + personagem.getDefesaTotal());
    }
} 