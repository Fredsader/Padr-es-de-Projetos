
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float temp;
        Scanner t = new Scanner(System.in);
        
        EstacaoMeteorologica canal = new EstacaoMeteorologica();
        DisplayCelsius celsius = new DisplayCelsius();
        DisplayNotificacao notificacao = new DisplayNotificacao();

        canal.registerObserver(celsius);
        canal.registerObserver(notificacao);

        System.out.println("Insira a temperatura (F):");
        temp = t.nextFloat();

        canal.notifyObservers(temp);
    }
}
