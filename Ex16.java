package exerciciosjava;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);
		        
		        int somaidades = 0;

		        for (int i = 1; i <= 20; i++) {
		            System.out.print("Digite a idade da pessoa " + i + ": ");
		            int idade = scanner.nextInt();
		            somaidades += idade;
		        }

		        double mediaidades = somaidades / 20.0;

		        System.out.println("A média das idades das 20 pessoas é: " + mediaidades);
	}

}
