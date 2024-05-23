import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Seja bem findo ao sistema!");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da sua conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite sua agencia:");
        String agencia = scanner.next();

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("\nOla, " + nome + ", obrigado por criar sua conta conosco, sua agencia eh " + agencia + ", conta " + numeroConta + " e seu saldo disponivel ehe de " + saldo);

    }
}
