public class Main {
    public static void main(String[] args) {
        Luz luz = new Luz();
        TV tv = new TV();

        Comando ligarLuz = new ComandoLigarLuz(luz);
        Comando desligarLuz = new ComandoDesligarLuz(luz);
        Comando ligarTV = new ComandoLigarTV(tv);

        Controle controle = new Controle();

        controle.getBotao(0).setComando(ligarLuz);
        controle.getBotao(1).setComando(desligarLuz);
        controle.getBotao(2).setComando(ligarTV);

        controle.getBotao(0).pressionar(); 
        controle.getBotao(2).pressionar(); 

        controle.desfazerUltimo();         
        controle.desfazerUltimo();         
        controle.desfazerUltimo();         
    }
}
