package exerciciosjava;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        String nomemaisnovo = "";
		        int idademaisnova = 0;

		        for (int pessoa = 1; pessoa <= 10; pessoa++) {
		            System.out.print("Digite o nome da pessoa " + pessoa + ": ");
		            String nome = scanner.nextLine();

		            System.out.print("Digite a idade de " + nome + ": ");
		            int idade = scanner.nextInt();
		            scanner.nextLine();

		            if (pessoa == 1) {
		            	idademaisnova = idade;
		                nomemaisnovo = nome;
		            }

		            if (idade < idademaisnova) {
		            	idademaisnova = idade;
		                nomemaisnovo = nome;
		            }
		        }
		        System.out.println("A pessoa mais nova é: " + nomemaisnovo);
	}

}
