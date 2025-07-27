class Gramatica extends RespostaDecorator {
    public Gramatica(Resposta resposta) {
        super(resposta);
    }
    
    public int getNotaFinal() {
        return resposta.getNotaFinal() + 1;
    }
} 