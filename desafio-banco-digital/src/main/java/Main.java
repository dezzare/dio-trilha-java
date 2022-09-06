import entities.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        List<Conta> contas = new ArrayList<>();
        HashMap<String, Cliente> clientes = new HashMap<>();
        
        int opcao;
        boolean sair = false;
        Scanner scannerInput = new Scanner(System.in);
        
        do {
           
            System.out.println("+----------------------------------------+");
            System.out.println("|    Bem vindo ao seu Banco Digital.     |");
            System.out.println("+----------------------------------------+");
            System.out.println("|***Uso restrito: somente funcionários***|");
            System.out.println("+----------------------------------------+");
            System.out.println("|        Escolha uma das opções          |");
            System.out.println("| 1 - Criar Conta                        |");
            System.out.println("| 2 - Listar todas as Contas             |");
            System.out.println("| 3 - Sacar                              |");
            System.out.println("| 4 - Depositar                          |");
            System.out.println("| 5 - Transferir                         |");
            System.out.println("| 0 - Sair                               |");
            System.out.println("+----------------------------------------+");
            
            opcao = scannerInput.nextInt();
    
            switch (opcao) {
                case 1 -> {
                    Conta novaConta;
                    System.out.println("Digite o nome do cliente: ");
                    String emptyCliente = scannerInput.nextLine();
                    String isCliente = scannerInput.nextLine();
                    if (isCliente.equals(String.valueOf(clientes.get(isCliente)))) {
                        novaConta = new ContaCorrente(clientes.get(isCliente));
                    } else {
                        Cliente novoCliente = new Cliente(isCliente);
                        clientes.put(isCliente, novoCliente);
                        novaConta = new ContaCorrente(novoCliente);
                    }
                    contas.add(novaConta);
                    System.out.println("Conta criada com sucesso!!");
                    System.out.println("Essas são as informações da nova conta:");
                    novaConta.imprimirInfosComuns();
                }
                case 2 -> {
                    System.out.println("Lista de todas as contas:");
                    System.out.println("");
                    for (Conta c : contas){
                        c.imprimirInfosComuns();
                        System.out.println("");
                    }
                }
                case 3 -> {
                    System.out.print("Digite o número da conta: ");
                    int isConta = scannerInput.nextInt();
                    for (Conta c : contas ){
                        if (c.getNumero() == isConta ){
                            System.out.print("Digite a quantia a ser sacada: ");
                            double valor = scannerInput.nextDouble();
                            c.sacar(valor);
                            break;
                        }
                    }
                    
                }
                case 4 -> {
                    System.out.print("Digite o número da conta: ");
                    int isConta = scannerInput.nextInt();
                    for (Conta c : contas ){
                        if (c.getNumero() == isConta ){
                            System.out.print("Digite a quantia a ser depositada: ");
                            double valor = scannerInput.nextDouble();
                            c.depositar(valor);
                            break;
                        }
                    }

                }
                case 5 -> {
                    System.out.print("Digite o número da conta: ");
                    int isConta = scannerInput.nextInt();
                    for (Conta c : contas ){
                        if (c.getNumero() == isConta ){
                            Conta contaDeposito = null;
                            System.out.print("Digite o número da conta para transferir: ");
                            int isContaDeposito = scannerInput.nextInt();
                            for (Conta d : contas ) {
                                if (d.getNumero() == isContaDeposito) {
                                    contaDeposito = d;
                                    break;
                                }
                            }
                            System.out.print("Digite a quantia a ser transferida: ");
                            double valor = scannerInput.nextDouble();
                            c.transferir(valor, contaDeposito);
                            break;
                        }
                    }
                }
                case 0 -> sair = true;
                case default -> System.out.println("Você não selecionou uma opção válida");


            }
            
            
        } while(!sair);
        
        scannerInput.close();
        System.out.println("Programa ENCERRADO");
        
    }
    
}
