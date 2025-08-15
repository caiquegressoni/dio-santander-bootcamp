import br.com.dio.dao.UserDao;
import br.com.dio.model.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class main {
    private final static UserDao dao = new UserDao();
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) { 
        System.out.println("Escolha uma das opcoes abaixo: ");

        System.out.println("1 - Cadastrar usuario.");
        System.out.println("2 - Atualizar.");
        System.out.println("3 - Excluir.");
        System.out.println("4 - Buscar por Id.");
        System.out.println("5 - Listar.");
        System.out.println("6 - Sair.");
        var userInput = sc.nextInt();
            var selectedOption = MenuOption.values()[userInput -1];
            switch(selectedOption){
                
                case SAVE -> {
                    var user = dao.save(requestToSave());
                    System.out.printf("Usuario %s salvo com sucesso.", user);
                }
                case UPDATE -> {
                    var user = dao.update(requestToUpdate()); 
                    System.out.printf("Usuario %s atualizado com sucesso.", user);
                }
                case DELETE -> {
                    dao.delete(requestId()); 
                    System.out.println("Usuario deletado com sucesso.");
            }
                case FIND_BY_ID -> {
                    var id = requestId();
                    var user = dao.findById(id);
                    System.out.printf("Usuario encontrado com id: %s", id);
                    System.out.println(user);
                }
                case FIND_ALL -> {
                    var users = dao.findAll();
                    System.out.println("Usuarios encontrados: ");
                    users.forEach(System.out::println);
                }
                case EXIT -> {System.exit(0);}
            }          
        }
    }

    private static long requestId(){
        System.out.println("Informe o id do usuario: ");
        return sc.nextLong();   
    }

    private static UserModel requestToSave(){
        System.out.println("Informe o nome do usuario: ");
        var name = sc.next();
        System.out.println("Informe o email do usuario: ");
        var email = sc.next();
        System.out.println("Informe o ano de nascimento do usuario (dd/mm/yyyy): ");
        var birthdayString = sc.next();
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var birthday = LocalDate.parse(birthdayString, formatter);

        return new UserModel(0, name, email, birthday);
    }

        private static UserModel requestToUpdate(){
        System.out.println("Informe o id do usuario: ");
        var id = sc.nextLong();
        System.out.println("Informe o nome do usuario: ");
        var name = sc.nextLine();
        System.out.println("Informe o email do usuario: ");
        var email = sc.nextLine();
        System.out.println("Informe o ano de nascimento do usuario (dd/mm/yyyy): ");
        var birthdayString = sc.next();
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var birthday = LocalDate.parse(birthdayString, formatter);

        return new UserModel(id, name, email, birthday);
    }
    
}
