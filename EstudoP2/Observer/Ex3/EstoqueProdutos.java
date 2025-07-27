
import java.util.ArrayList;
import java.util.List;

public class EstoqueProdutos implements Subject {
    private List<Observer> observers = new ArrayList<>();
    int qntd = 5;

    @Override
    public void registerObserver(Observer o) {
       observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(int qntd) {
        for (Observer o : observers){
            o.update(qntd);
        }
    }

    public void atualizaçãoEstoque(int retirada){
        qntd = qntd - retirada;
        if (qntd <= 0){
            System.out.println("Estoque zerado!!");
            notifyObservers(0);
        }else{
            System.out.println("Estoque atual: " + qntd);
            notifyObservers(qntd);
        }
    }
}
