import java.util.Arrays;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        Integer[] numeros1 = {1, 2};
        List<Integer> numeros2 = Arrays.asList(numeros1);
        numeros2.set(0, 4);

        System.out.println(Arrays.toString(numeros1));
        System.out.println(numeros2);

    }

}