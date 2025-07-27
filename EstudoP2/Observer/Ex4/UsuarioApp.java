public class UsuarioApp implements Observer{
    private String nome;

    public UsuarioApp(String nome){
        this.nome = nome;
    }

    @Override
    public void update(String Noticia) {
        System.out.println(nome + "recebeu:"+ Noticia);
    }

}
