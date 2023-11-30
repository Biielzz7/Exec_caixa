package view;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Caixaa caixa = new Caixaa();
		System.out.println("Digite o seu saldo atual: ");
		caixa.saldo = scan.nextDouble();
		
		System.out.println("Digite o valor do produto: ");
		double valorProd = scan.nextDouble();
		
			if(caixa.saldo < valorProd) {
				System.out.println("Saldo insuficiente, para realizar a compra do produto!");
				}else {
					double novoSaldo;
				    novoSaldo = caixa.venda(valorProd);
				     System.out.println("O novo saldo é: " + novoSaldo);
			    
		}

	}

}


