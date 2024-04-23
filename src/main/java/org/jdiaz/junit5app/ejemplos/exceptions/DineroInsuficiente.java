package org.jdiaz.junit5app.ejemplos.exceptions;

public class DineroInsuficiente extends RuntimeException{
    public DineroInsuficiente(String message) {
        super(message);
    }
}
