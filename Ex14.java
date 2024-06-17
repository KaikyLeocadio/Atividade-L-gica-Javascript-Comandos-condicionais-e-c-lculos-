package exerciciosjava;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Insira o primeiro valor:");
		int num1 = valor.nextInt();
		
		System.out.println("Insira o segundo valor:");
		int num2 = valor.nextInt();
		
		System.out.println("Insira o terceiro valor:");
		int num3 = valor.nextInt();
		
		System.out.println("Insira o quarto valor:");
		int num4 = valor.nextInt();
		
		System.out.println("Insira o quinto valor:");
		int num5 = valor.nextInt();
		
		System.out.println("Insira o sexto valor:");
		int num6 = valor.nextInt();
		
		System.out.println("Insira o sétimo valor:");
		int num7 = valor.nextInt();
		
		System.out.println("Insira o oitavo valor:");
		int num8 = valor.nextInt();
		
		System.out.println("Insira o nono valor:");
		int num9 = valor.nextInt();
		
		System.out.println("Insira o décimo valor:");
		int num10 = valor.nextInt();
		
		int calculo = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
		System.out.println("A soma dos números é: " + calculo);
	}

}
