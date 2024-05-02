package manipulandostringexpressaoregular;

import java.util.Arrays;

public class Split {

    public static void main(String[] args) {

        String html = "joao@algaworks.com";
        String[] parts = html.split("[@.]");

        System.out.println(Arrays.toString(parts));

    }

}
