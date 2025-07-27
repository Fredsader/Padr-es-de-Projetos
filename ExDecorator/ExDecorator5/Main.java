public class Main {
    public static void main(String[] args) {
        System.out.println("Teste 1 - Todos os critérios");
        Resposta resposta1 = new RespostaAluno("Resposta do aluno");
        resposta1 = new Clareza(resposta1);
        resposta1 = new ConteudoRelevante(resposta1);
        resposta1 = new Gramatica(resposta1);
        System.out.println("Nota final: " + resposta1.getNotaFinal());
        
        System.out.println("\nTeste 2 - Apenas Clareza e Gramática");
        Resposta resposta2 = new RespostaAluno("Resposta do aluno");
        resposta2 = new Clareza(resposta2);
        resposta2 = new Gramatica(resposta2);
        System.out.println("Nota final: " + resposta2.getNotaFinal());
        
        System.out.println("\nTeste 3 - Apenas Conteúdo Relevante");
        Resposta resposta3 = new RespostaAluno("Resposta do aluno");
        resposta3 = new ConteudoRelevante(resposta3);
        System.out.println("Nota final: " + resposta3.getNotaFinal());
    }
} 