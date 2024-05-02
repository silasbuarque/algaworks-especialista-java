import java.util.Iterator;

public class Principal {

    public static void main(String[] args) {

        Sorteador sorteador = new Sorteador();

        for (Integer iterable : sorteador) {
            System.out.println(iterable);
        }

//        Iterator<Integer> sorteadorIterator = sorteador.iterator();
//
//        while (sorteadorIterator.hasNext()) {
//            System.out.println(sorteadorIterator.next());
//        }

//        System.out.println(sorteadorIterator.next());

    }

}
