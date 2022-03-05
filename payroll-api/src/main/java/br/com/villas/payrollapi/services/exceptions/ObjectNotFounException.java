package br.com.villas.payrollapi.services.exceptions;

public class ObjectNotFounException extends RuntimeException{

    public ObjectNotFounException(String message) {
        super(message);
    }
}
