abstract class ImagemDecorator implements Imagem {
    protected Imagem imagem;
    
    public ImagemDecorator(Imagem imagem) {
        this.imagem = imagem;
    }
} 