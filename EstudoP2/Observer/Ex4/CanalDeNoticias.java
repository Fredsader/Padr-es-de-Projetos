import java.util.ArrayList;
import java.util.List;

public class CanalDeNoticias implements Subject{
    private List<Observer> observers = new ArrayList<>();
    

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
       observers.remove(o);
    }

    @Override
    public void notifyObservers(String Noticia) {
        for (Observer o : observers){
            o.update(Noticia);
        }
    }

    public void novaNoticia(String noticia){
        System.out.println("Canal:" + noticia);
        notifyObservers(noticia);
    }
}
