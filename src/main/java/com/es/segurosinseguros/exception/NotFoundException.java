package com.es.segurosinseguros.exception;

public class NotFoundException extends RuntimeException {

    private static final String DESCRIPCION = "Not Found Exception (404)";

    public NotFoundException(String mensaje) {
        super(DESCRIPCION +". "+ mensaje);
    }
}
