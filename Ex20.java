package exerciciosjava;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);

		        int contadormaioresqueoito = 0;

		        for (int i = 1; i <= 20; i++) {
		            System.out.print("Digite o n�mero " + i + ": ");
		            int numero = scanner.nextInt();

		            if (numero > 8) {
		            	contadormaioresqueoito++;
		            }
		        }
		        System.out.println("A quantidade de n�meros maiores que 8 �: " + contadormaioresqueoito);
	}

}
