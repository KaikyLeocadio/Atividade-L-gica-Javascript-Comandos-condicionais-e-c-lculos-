package exerciciosjava;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite o valor da compra: R$");
		        double valorcompra = scanner.nextDouble();

		        double valorprestacao = valorcompra / 5;

		        System.out.println("O valor de cada uma das 5 presta��es sem juros �: R$" + valorprestacao);
	}

}
