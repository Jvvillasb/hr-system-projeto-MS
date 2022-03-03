package br.com.villas.userapi.services.exceptions;

public class ObjectNotFounException extends RuntimeException{

    public ObjectNotFounException(String message) {
        super(message);
    }
}
