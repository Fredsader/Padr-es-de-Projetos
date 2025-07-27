public class Main {
    public static void main(String[] args) {
        Luz luz = new Luz();
        TV tv = new TV();

        Comando comandoLigarLuz = new ComandoLigarLuz(luz);
        Comando comandoDesligarLuz = new ComandoDesligarLuz(luz);

        Comando comandoLigarTV = new ComandoLigarTv(tv);
        Comando comandoDesligarTV = new ComandoDesligarTv(tv);

        Botao1 botao = new Botao1();
        botao.setComando(comandoLigarLuz);
        botao.pressionar();

        Botao1 botao2 = new Botao1();
        botao.setComando(comandoDesligarLuz);
        botao.pressionar();
        
        Botao1 botao3 = new Botao1();
        botao.setComando(comandoLigarTV);
        botao.pressionar();
        
        Botao1 botao4 = new Botao1();
        botao.setComando(comandoDesligarTV);
        botao.pressionar();
    
    }
}
