public class Main {
    public static void main(String[] args) {
        // Criando os objetos
        ReservaVoo voo = new ReservaVoo();
        ReservaHotel hotel = new ReservaHotel();
        Transporte transporte = new Transporte();
        SeguroViagem seguro = new SeguroViagem();

        // Criando a fachada
        ViagemFacade viagem = new ViagemFacade(voo, hotel, transporte, seguro);

        // Usando a fachada
        viagem.planejarViagem();
    }
}
