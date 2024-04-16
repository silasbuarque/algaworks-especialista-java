import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class SorteadorIterator implements Iterator<Integer> {

    private static final Random RANDOM = new Random();
    private int quantidadeSorteada = 0;

    @Override
    public boolean hasNext() {
        return quantidadeSorteada < 6;
    }

    @Override
    public Integer next() {

        if (!hasNext()) {
            throw new NoSuchElementException("Todos os elementos já foram sorteados");
        }

        quantidadeSorteada++;
        return RANDOM.nextInt(60);
    }

}
