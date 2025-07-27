class BencaoDivina extends PersonagemDecorator {
    public BencaoDivina(Personagem personagem) {
        super(personagem);
    }
    
    public String getDescricao() {
        return personagem.getDescricao() + " com Benção Divina";
    }
    
    public int getDefesaTotal() {
        return personagem.getDefesaTotal() + 2;
    }
} 