class Clareza extends RespostaDecorator {
    public Clareza(Resposta resposta) {
        super(resposta);
    }
    
    public int getNotaFinal() {
        return resposta.getNotaFinal() + 2;
    }
} 