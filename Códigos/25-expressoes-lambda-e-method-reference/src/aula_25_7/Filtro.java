package aula_25_6;

@FunctionalInterface
public interface Filtro<T> {

    boolean avaliar(T objeto);

}
