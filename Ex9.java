package exerciciosjava;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);

		 double salariominimo = 1212.00;

		 System.out.print("Digite o valor do seu sal�rio: ");
		 double salariousuario = scanner.nextDouble();

		 double quantidadesalariosminimos = salariousuario / salariominimo;

		 System.out.println("Voc� ganha aproximadamente " + quantidadesalariosminimos + " sal�rios m�nimos.");

	}
}