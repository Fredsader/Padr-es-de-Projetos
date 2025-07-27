import java.util.Iterator;

public class MinhaLista implements Iterable<String>{
    private String[] nomes = {"João","Fred","Pedro"};

    @Override
    public Iterator<String> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<String>{
        int index = nomes.length - 1;

        @Override
        public boolean hasNext() {
            return index >=0;
        }

        @Override
        public String next() {
            return nomes[index--];
        }

    }

}
