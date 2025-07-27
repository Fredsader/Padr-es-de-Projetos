class ArmaduraDeFerro extends PersonagemDecorator {
    public ArmaduraDeFerro(Personagem personagem) {
        super(personagem);
    }
    
    public String getDescricao() {
        return personagem.getDescricao() + " com Armadura de Ferro";
    }
    
    public int getDefesaTotal() {
        return personagem.getDefesaTotal() + 5;
    }
} 