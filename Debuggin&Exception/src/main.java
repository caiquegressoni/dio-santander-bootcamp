import br.com.dio.dao.UserDao;
import br.com.dio.model.*;
import java.util.Scanner;

public class main {
    private final static UserDao dao = new UserDao();

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("1 - Cadastrar: ");
        System.out.println("Escolha uma opcao: ");
        System.out.println("3 - Deletar: ");
        System.out.println("4 - Buscar por Id: ");
        System.out.println("5 - Listar: ");
        System.out.println("5 - Sair: ");
        System.out.println("2 - Atualizar: ");
        var userInput = sc.nextInt();

        while (true) { 
            var selectedOption = MenuOption.values()[userInput -1];
            
        }
    }
}
