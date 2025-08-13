package br.com.dio.excepition;

public class UserNotFoundExcepition extends RuntimeException{
    public UserNotFoundExcepition(String mensage){
        super(mensage);
    }
}
