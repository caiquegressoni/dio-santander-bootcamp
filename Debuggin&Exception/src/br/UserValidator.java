package br;
import br.com.dio.excepition.ValidatorExcpition;
import br.com.dio.model.UserModel;

public class UserValidator {
    public static void verifyModel(final UserModel model) throws ValidatorExcpition {
        if(stringIsBlank(model.getName())){
                throw new ValidatorExcpition("O nome nao pode ser nulo ou vazio");
        }
        if(model.getName().length() <= 1){
            throw new ValidatorExcpition("O nome deve conter mais de 1 caracter");
        }
        if(stringIsBlank(model.getEmail())){
            throw new ValidatorExcpition("O email nao pode ser nulo ou vazio");
        }
        if((!model.getEmail().contains("@")) && (!model.getEmail().contains("."))){
            throw new ValidatorExcpition("Email invalido");
        }
    }

    private static boolean stringIsBlank(final String value){
        return value == null || value.isBlank();
    }
}
