class FiltroNitidez extends ImagemDecorator {
    public FiltroNitidez(Imagem imagem) {
        super(imagem);
    }
    
    public void imprimir() {
        System.out.println("Aplicando filtro: Nitidez");
        imagem.imprimir();
    }
} 