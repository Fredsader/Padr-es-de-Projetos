class FiltroBordas extends ImagemDecorator {
    public FiltroBordas(Imagem imagem) {
        super(imagem);
    }
    
    public void imprimir() {
        System.out.println("Aplicando filtro: Bordas");
        imagem.imprimir();
    }
} 