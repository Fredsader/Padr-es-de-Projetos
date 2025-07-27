import java.util.Iterator;

public class MinhaLista implements Iterable<String> {
    public String [] nomes = {"Fred","João","Pedro","Manuel"};


    @Override
    public Iterator<String> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<String>{
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < nomes.length;
        }

        @Override
        public String next() {
            return nomes[index++];
        }

    }

}
