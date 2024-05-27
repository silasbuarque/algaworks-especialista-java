package aula_25_4;

@FunctionalInterface
public interface Filtro<T> {

    boolean avaliar(T objeto);

}
