package exerciciosjava;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        int somaidades = 0;

		        for (int i = 1; i <= 20; i++) {
		            System.out.print("Digite a idade da pessoa " + i + ": ");
		            int idade = scanner.nextInt();
		            somaidades += idade;
		        }

		        System.out.println("A soma das idades das 20 pessoas é: " + somaidades);

	}

}
