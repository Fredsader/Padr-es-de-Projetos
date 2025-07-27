class ConteudoRelevante extends RespostaDecorator {
    public ConteudoRelevante(Resposta resposta) {
        super(resposta);
    }
    
    public int getNotaFinal() {
        return resposta.getNotaFinal() + 4;
    }
} 