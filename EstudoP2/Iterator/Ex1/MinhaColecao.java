import java.util.Iterator;

public class MinhaColecao implements Iterable<String>{
    private String []dados = {"Maçã", "Banana", "Pera"};


    @Override
    public Iterator<String> iterator() {
        return new MeuIterator();
    }

    private class MeuIterator implements Iterator<String>{
        private int index = 0;

        public boolean hasNext(){
            return index < dados.length;
        }

        public String next(){
            return dados[index++];
        }
    }
}
