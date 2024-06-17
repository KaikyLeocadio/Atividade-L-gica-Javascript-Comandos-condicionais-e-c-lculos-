package exerciciosjava;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);

		 double salariominimo = 1212.00;

		 System.out.print("Digite o valor do seu salário: ");
		 double salariousuario = scanner.nextDouble();

		 double quantidadesalariosminimos = salariousuario / salariominimo;

		 System.out.println("Você ganha aproximadamente " + quantidadesalariosminimos + " salários mínimos.");

	}
}