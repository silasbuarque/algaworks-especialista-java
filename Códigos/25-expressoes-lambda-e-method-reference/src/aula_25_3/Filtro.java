package aula_25_3;

public interface Filtro<T> {

    boolean avaliar(T objeto);

    default void test() {
        System.out.println("teste");
    }

}
