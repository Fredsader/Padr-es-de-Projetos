abstract class RespostaDecorator implements Resposta {
    protected Resposta resposta;
    
    public RespostaDecorator(Resposta resposta) {
        this.resposta = resposta;
    }
} 