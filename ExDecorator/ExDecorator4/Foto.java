class Foto implements Imagem {
    private String nomeArquivo;
    
    public Foto(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }
    
    public void imprimir() {
        System.out.println("Imprimindo foto: " + nomeArquivo);
    }
} 