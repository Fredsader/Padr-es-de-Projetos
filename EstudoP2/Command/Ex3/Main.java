public class Main {
    public static void main(String[] args) {
        Luz luz = new Luz();
        Botao1 botao1 = new Botao1();
        Botao2 botao2 = new Botao2();
        Botao3 botao3 = new Botao3();

        ComandoLigarLuz comando1 = new ComandoLigarLuz(luz);
        ComandoDesligarLuz comando2 = new ComandoDesligarLuz(luz);
        ComandoTrocarCor comando3 = new ComandoTrocarCor(luz);

        botao1.setComando(comando1);
        botao2.setComando(comando2);
        botao3.setComando(comando3);

        botao1.pressionar();
        botao2.pressionar();
        botao3.pressionar();
        botao3.pressionar();
        botao3.pressionar();
        botao3.pressionar();

        System.out.println("Histórico: ");
        System.out.println("Botão 1:" + botao1.cont);
        System.out.println("Botão 2:" + botao2.cont);
        System.out.println("Botão 3:" + botao3.cont);

        
    }
}
