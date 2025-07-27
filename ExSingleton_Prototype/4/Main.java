public class Main {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo();
        t1.altura = 5;
        t1.base = 2;
        t1.cor = "vermelho";
        t1.x = 5;
        t1.y = 2;

        Triangulo t2 = (Triangulo) t1.clonar();
        t2.cor = "verde";

        System.out.println(t1.cor + " " + t2.cor);

        Elipse e1 = new Elipse();
        e1.centro = 5;
        e1.cor = "verde";
        e1.x = 2;
        e1.y = 4;

        Elipse e2 = (Elipse) e1.clonar();
        e2.cor = "azul"; 

        System.out.println(e1.cor + " " + e2.cor);

        System.out.println(t1 == t2);
        System.out.println(e1 == e2);
    }
}
