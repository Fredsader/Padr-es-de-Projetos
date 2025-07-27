class EscudoMagico extends PersonagemDecorator {
    public EscudoMagico(Personagem personagem) {
        super(personagem);
    }
    
    public String getDescricao() {
        return personagem.getDescricao() + " com Escudo Mágico";
    }
    
    public int getDefesaTotal() {
        return personagem.getDefesaTotal() + 3;
    }
} 