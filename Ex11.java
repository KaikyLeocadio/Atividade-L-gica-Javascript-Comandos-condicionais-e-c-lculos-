package exerciciosjava;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite o nome do vendedor: ");
		        String nomevendedor = scanner.nextLine();

		        System.out.print("Digite o salário fixo do vendedor: R$");
		        double salariofixo = scanner.nextDouble();

		        System.out.print("Digite o total de vendas efetuadas pelo vendedor no mês: R$");
		        double totalvendas = scanner.nextDouble();

		        double comissao = totalvendas * 0.15;

		        double salariofinal = salariofixo + comissao;

		        System.out.println("\nNome do vendedor: " + nomevendedor);
		        System.out.println("Salário fixo: R$" + salariofixo);
		        System.out.println("Comissão sobre vendas: R$" + comissao);
		        System.out.println("Salário no final do mês: R$" + salariofinal);

		}
}
