package aula_25_7;

@FunctionalInterface
public interface Filtro<T> {

    boolean avaliar(T objeto);

}
