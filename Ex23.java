package exerciciosjava;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        int contadorentrezeroecem = 0;
		        int contadorentre101e200 = 0;
		        int contadormaioresqueduzentos = 0;

		        for (int i = 1; i <= 20; i++) {
		            System.out.print("Digite o n�mero " + i + ": ");
		            int numero = scanner.nextInt();

		            if (numero >= 0 && numero <= 100) {
		            	contadorentrezeroecem++;
		            } else if (numero >= 101 && numero <= 200) {
		            	contadorentre101e200++;
		            } else if (numero > 200) {
		            	contadormaioresqueduzentos++;
		            }
		        }

		        System.out.println("A quantidade de n�meros entre 0 e 100 �: " + contadorentrezeroecem);
		        System.out.println("A quantidade de n�meros entre 101 e 200 �: " + contadorentre101e200);
		        System.out.println("A quantidade de n�meros maiores que 200 �: " + contadormaioresqueduzentos);
	}

}
