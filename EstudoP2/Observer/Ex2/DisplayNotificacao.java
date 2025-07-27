public class DisplayNotificacao implements Observer {

    @Override
    public void update(float temp) {
        if (temp > 86){
            System.out.println("Alerta de calor!!");
        }
    }

}
