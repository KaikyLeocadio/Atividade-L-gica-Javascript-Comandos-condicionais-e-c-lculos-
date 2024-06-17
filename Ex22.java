package exerciciosjava;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        int contador = 0;

		        for (int i = 1; i <= 20; i++) {
		            System.out.print("Digite o número " + i + ": ");
		            int numero = scanner.nextInt();

		            if (numero >= 0 && numero <= 100) {
		                contador++;
		            }
		        }
		        System.out.println("A quantidade de números entre 0 e 100 é: " + contador);
	}

}
