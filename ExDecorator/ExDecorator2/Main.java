public class Main {
    public static void main(String[] args) {
        Bebida bebida = new CafeSimples();
        bebida = new Leite(bebida);
        bebida = new Chocolate(bebida);
        bebida = new Canela(bebida);
        
        bebida = new Tamanho(bebida, Tamanho.TamanhoCafe.MEDIO);
        
        System.out.println("Pedido: " + bebida.getDescricao());
        System.out.printf("Preço: R$%.2f%n", bebida.getPreco());
        
        Bebida bebida2 = new CafeSimples();
        bebida2 = new Leite(bebida2);
        bebida2 = new Tamanho(bebida2, Tamanho.TamanhoCafe.GRANDE);
        
        System.out.println("\nPedido: " + bebida2.getDescricao());
        System.out.printf("Preço: R$%.2f%n", bebida2.getPreco());
    }
} 