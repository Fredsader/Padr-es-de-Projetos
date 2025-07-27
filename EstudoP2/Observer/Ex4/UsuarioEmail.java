public class UsuarioEmail implements Observer{
    private String nome;

    public UsuarioEmail(String nome){
        this.nome = nome;
    }

    @Override
    public void update(String Noticia) {
        System.out.println(nome + "recebeu:"+ Noticia);
    }

}
