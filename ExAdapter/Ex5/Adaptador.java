public class Adaptador implements TempCelsius{
    TempFahrenheit tempFahrenheit = new TempFahrenheit();

    public Adaptador(TempFahrenheit tempFahrenheit){
        this.tempFahrenheit = tempFahrenheit;
    }

    @Override
    public void mostrarTemp(double  temp) {
        tempFahrenheit.exibirTemp((temp - 32) * (5.0/9.0));
    }
}
