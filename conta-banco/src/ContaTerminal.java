
/**
* <h1>Nova conta</h1>
* Adiciona uma nova conta
* <p>
*
* @author  Pedro de Mesquita Bittencourt
* @version 0.0.1
* @since   08/07/2022
*/
import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

  public static void main(String[] args) {
    Conta novaConta = new Conta();
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite os dados da nova conta");
    System.out.println();
    System.out.print("Número da conta: ");
    novaConta.adicionarNumero(scanner.nextInt());
    System.out.println();

    System.out.print("Agência: ");
    novaConta.adicionarAgencia(scanner.next());
    System.out.println();

    System.out.print("Nome: ");
    novaConta.adicionarNome(scanner.next());
    System.out.println();

    System.out.print("Saldo: ");
    novaConta.adicionarSaldo(scanner.nextDouble());
    System.out.println();
    System.out.println();

    System.out.printf(
        "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %2.2f já está disponível para saque\n",
        novaConta.nomeDoCliente, novaConta.agencia, novaConta.numero, novaConta.saldo);

  }

}
