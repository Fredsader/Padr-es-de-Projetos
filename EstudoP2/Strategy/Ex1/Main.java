public class Main {
    public static void main(String[] args) {
        Context calcAdd = new Context(new Add());
        Context calcSubct = new Context(new Subtract());

        System.out.println(calcAdd.run(5, 6));
        System.out.println(calcSubct.run(6, 5));
    }
}
