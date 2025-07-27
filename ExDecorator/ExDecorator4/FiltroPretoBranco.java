class FiltroPretoBranco extends ImagemDecorator {
    public FiltroPretoBranco(Imagem imagem) {
        super(imagem);
    }
    
    public void imprimir() {
        System.out.println("Aplicando filtro: Preto e Branco");
        imagem.imprimir();
    }
} 