package exerciciosjava;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite a cota��o do d�lar em R$: ");
		        double cotacaodolar = scanner.nextDouble();

		        System.out.print("Digite a quantidade de d�lares dispon�veis: ");
		        double quantidadedolares = scanner.nextDouble();

		        double valoremreais = cotacaodolar * quantidadedolares;

		        System.out.println("O valor em reais �: " + valoremreais);
	}

}
