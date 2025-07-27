public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    int run(int a, int b){
        return strategy.execute(a, b);
    }
}
