public class Main {
    public static void main(String[] args) {
        CanalDeNoticias canal = new CanalDeNoticias();
        UsuarioApp userApp = new UsuarioApp("jhon");
        UsuarioEmail userEmail = new UsuarioEmail("Mary");

        canal.registerObserver(userApp);
        canal.registerObserver(userEmail);

        canal.novaNoticia("Cabou tudo!");    
    
    
    }
}
