package com.algaworks.excecoes;

public class BancoException extends RuntimeException {

    public BancoException(String message, Throwable cause) {
        super(message, cause);
    }

}
