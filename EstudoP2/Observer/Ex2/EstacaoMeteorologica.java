import java.util.ArrayList;
import java.util.List;

public class EstacaoMeteorologica implements Subject{
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void deleteObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(float temp) {
       for (Observer o : observers){
        o.update(temp);
       }
    }

    public void novaTemperatura(float temp){
        System.out.println("Temp (F):" + temp);
        notifyObservers(temp);
    }
}
