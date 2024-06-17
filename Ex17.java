package exerciciosjava;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        int contadormaioresdeidade = 0;

		        for (int i = 1; i <= 20; i++) {
		            System.out.print("Digite a idade da pessoa " + i + ": ");
		            int idade = scanner.nextInt();
		            
		            if (idade >= 18) {
		                contadormaioresdeidade++;
		            }
		        }

		        System.out.println("O número de pessoas maiores de idade é: " + contadormaioresdeidade);
	}

}
