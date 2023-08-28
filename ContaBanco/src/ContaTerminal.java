import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numeroConta;
        String agenciaBancaria;
        String nomeCliente;
        double saldoConta;
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o nome do cliente:");
        nomeCliente = scanner.nextLine();        
        
        System.out.println("Digite o número da agência:");
        agenciaBancaria = scanner.next();

        System.out.println("Digite o número da conta:");
        numeroConta = scanner.nextInt();

        System.out.println("Digite o saldo inicial para abertura da conta:");
        saldoConta = scanner.nextDouble();
        
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco.");
        System.out.println("sua agência é "+agenciaBancaria+", conta "+numeroConta+" e seu saldo "+saldoConta+" já está disponível para saque");
    }
}
