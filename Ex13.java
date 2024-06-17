package exerciciosjava;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite a temperatura em graus Celsius: ");
		        double celsius = scanner.nextDouble();

		        double fahrenheit = (9 * celsius + 160) / 5;

		        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit + "°F");
	}

}
