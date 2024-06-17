package exerciciosjava;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite a porcentagem do IPI a ser acrescido: ");
		        double ipi = scanner.nextDouble();

		        System.out.println("Informe os dados da peça 1:");
		        
		        System.out.print("Código da peça: ");
		        int codigo1 = scanner.nextInt();
		        
		        System.out.print("Valor unitário da peça: ");
		        double valor1 = scanner.nextDouble();
		        
		        System.out.print("Quantidade de peças: ");
		        int quantidade1 = scanner.nextInt();

		        System.out.println("Informe os dados da peça 2:");
		        
		        System.out.print("Código da peça: ");
		        int codigo2 = scanner.nextInt();
		        
		        System.out.print("Valor unitário da peça: ");
		        double valor2 = scanner.nextDouble();
		        
		        System.out.print("Quantidade de peças: ");
		        int quantidade2 = scanner.nextInt();

		        double valortotal = (valor1 * quantidade1 + valor2 * quantidade2) * (ipi / 100 + 1);

		        System.out.println("O valor total a ser pago é: R$" + valortotal);
		    }
		}
