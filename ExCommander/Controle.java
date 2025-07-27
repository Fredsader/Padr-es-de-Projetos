import java.util.Stack;

public class Controle {
    private Botao[] botoes = new Botao[3];
    private static Stack<Comando> historico = new Stack<>();

    public Controle() {
        for (int i = 0; i < 3; i++) {
            botoes[i] = new Botao();
        }
    }

    public Botao getBotao(int index) {
        return botoes[index];
    }

    public static void addHistorico(Comando comando) {
        historico.push(comando);
    }

    public void desfazerUltimo() {
        if (!historico.isEmpty()) {
            Comando ultimo = historico.pop();
            ultimo.desfazer();
        } else {
            System.out.println("Nada para desfazer.");
        }
    }
}
