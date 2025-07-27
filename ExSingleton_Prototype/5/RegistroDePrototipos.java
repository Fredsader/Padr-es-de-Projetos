import java.util.HashMap;
import java.util.Map;

public class RegistroDePrototipos {
    private final Map<String, Forma> prototipos = new HashMap<>();

    public void adicionarPrototipo(String nome, Forma forma) {
        prototipos.put(nome, forma);
    }

    public Forma clonar(String nome) {
        Forma prototipo = prototipos.get(nome);
        if (prototipo != null) {
            return prototipo.clonar();
        }
        return null;
    }
}
