public class ViagemFacade {
    private ReservaVoo voo;
    private ReservaHotel hotel;
    private Transporte transporte;
    private SeguroViagem seguro;

    public ViagemFacade(ReservaVoo voo, ReservaHotel hotel, Transporte transporte, SeguroViagem seguro) {
        this.voo = voo;
        this.hotel = hotel;
        this.transporte = transporte;
        this.seguro = seguro;
    }

    public void planejarViagem() {
        voo.reservar();
        hotel.reservar();
        transporte.agendar();
        seguro.comprar();
        System.out.println("Viagem planejada com sucesso!");
    }
}
