package exerciciosjava;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);

		        int soma = 0;
		        System.out.println("Caso deseje encerrar, digite um número negativo");

		        while (true) {
		            System.out.print("Digite um número: ");
		            int numero = scanner.nextInt();

		            if (numero < 0) {
		                break;
		            }

		            soma += numero;
		        }

		        System.out.println("A soma dos números digitados é: " + soma);
	}

}
