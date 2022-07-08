
public class Conta {
  int numero;
  String agencia;
  String nomeDoCliente;
  double saldo;

  /**
   * Este método é utilizado adicionar um número à conta
   * 
   * @param novoNumero este é o parâmetro do método
   */
  public void adicionarNumero(int novoNumero) {
    this.numero = novoNumero;
  }

  /**
   * Este método é utilizado adicionar uma Agência à conta
   * 
   * @param novaAgencia este é o parâmetro do método
   */
  public void adicionarAgencia(String novaAgencia) {
    this.agencia = novaAgencia;
  }

  /**
   * Este método é utilizado adicionar um Nome à conta
   * 
   * @param novoCliente este é o parâmetro do método
   */
  public void adicionarNome(String novoCliente) {
    this.nomeDoCliente = novoCliente;
  }

  /**
   * Este método é utilizado adicionar um Saldo à conta
   * 
   * @param novoSaldo este é o parâmetro do método
   */
  public void adicionarSaldo(double novoSaldo) {
    this.saldo = novoSaldo;
  }

}
