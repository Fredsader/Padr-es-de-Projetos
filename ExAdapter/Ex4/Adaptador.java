public class Adaptador implements NovoSistema{
    private final SistemaLegado sistemaLegado;

    public Adaptador(SistemaLegado sistemaLegado) {
        this.sistemaLegado = sistemaLegado;
    }
    @Override
    public void insert(String dado) {
        String sql = ("INSERT INTO tabela VALUES" + dado);
        sistemaLegado.executar(sql);
    }
    @Override
    public void delete(int id) {
        String sql = ("DELETE FROM tabela WHERE id =" + id);
        sistemaLegado.executar(sql);
    }
}
