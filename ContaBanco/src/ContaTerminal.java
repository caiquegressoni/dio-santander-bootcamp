
import java.util.Scanner;

public class ContaTerminal {

    public String agency;
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);

        System.out.println("=====#Conta do Banco#=====");

        System.out.println("Digite o número da conta: ");
        var number = sc.nextInt();

        String agency;
        do {
            System.out.println("Digite o número da agência (formato 000-1XX): ");
            agency = sc.next();

        }while(ValidateAgency(agency));

        System.out.println("Digite o nome do cliente: ");
        var client = sc.next();

        System.out.println("Digite o saldo da conta: ");
        var balance = sc.nextDouble();
        sc.nextLine();

        System.out.println("=====#Dados da Conta#=====");
        
        System.out.print("Olá " + client + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + number + " e seu saldo " + balance + " já está disponível para saque.");
    }

    public static boolean ValidateAgency(String agency){
        return agency.matches("\\d{3}-1\\d");
    }

}
