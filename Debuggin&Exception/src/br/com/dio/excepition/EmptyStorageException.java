package br.com.dio.excepition;

public class EmptyStorageException extends RuntimeException{
    
    public EmptyStorageException(final String message){
        super(message);
    }
}
