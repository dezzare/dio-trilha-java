
public class Conta {
  int numero;
  String agencia;
  String nomeDoCliente;
  double saldo;

  public void adicionarNumero(int novoNumero) {
    this.numero = novoNumero;
  }

  public void adicionarAgencia(String novaAgencia) {
    this.agencia = novaAgencia;
  }

  public void adicionarNome(String novoCliente) {
    this.nomeDoCliente = novoCliente;
  }

  public void adicionarSaldo(double novoSaldo) {
    this.saldo = novoSaldo;
  }

}
