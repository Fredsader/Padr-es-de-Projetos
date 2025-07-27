public class DisplayCelsius implements Observer{

    @Override
    public void update(float temp) {
        System.out.println("Celsius: " + (temp - 32)/1.8);
    }

}
