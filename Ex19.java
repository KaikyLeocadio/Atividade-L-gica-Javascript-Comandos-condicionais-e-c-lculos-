package exerciciosjava;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite a cotação do dólar em R$: ");
		        double cotacaodolar = scanner.nextDouble();

		        System.out.print("Digite a quantidade de dólares disponíveis: ");
		        double quantidadedolares = scanner.nextDouble();

		        double valoremreais = cotacaodolar * quantidadedolares;

		        System.out.println("O valor em reais é: " + valoremreais);
	}

}
