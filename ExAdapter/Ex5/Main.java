public class Main {
    public static void main(String[] args) {
        TempFahrenheit tempFahrenheit = new TempFahrenheit();
        TempCelsius tempCelsius = new Adaptador(tempFahrenheit);

        tempCelsius.mostrarTemp(61);
    }
}
