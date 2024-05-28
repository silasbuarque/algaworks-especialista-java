package aula_25_9;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;

public class Principal2 {

    public static void main(String[] args) {

        IntPredicate intPredicate = num -> num > 10;
        IntFunction<String> intFunction = num -> "Numero: " + num;
        IntSupplier intSupplier = () -> 10;
        IntConsumer intConsumer = num -> System.out.println("Numero: " + num);

    }

}
