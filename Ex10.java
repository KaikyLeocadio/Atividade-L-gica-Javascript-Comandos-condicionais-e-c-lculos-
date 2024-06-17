package exerciciosjava;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite o saldo atual: R$");
		        double saldo = scanner.nextDouble();
		        
		        double saldoReajustado = saldo * 1.015; 
		        
		        System.out.println("O saldo com reajuste de 1.5% é: R$" + saldoReajustado);
	}

}
