import java.util.Scanner;


public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
		
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			String msg = exception.getMessage();
			System.out.println(msg);
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
				
		int contagem = parametroDois - parametroUm;

		if (contagem <= 0) {
			throw new ParametrosInvalidosException();
		} else {
			
			for (int i = 1; i <= contagem; i++){
				System.out.println("Imprimindo o número " + i);
			}
		}		
	}
}