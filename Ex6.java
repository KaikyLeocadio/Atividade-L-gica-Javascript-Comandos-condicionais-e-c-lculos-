package exerciciosjava;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um n�mero:");
        int numero = scanner.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;
      
        System.out.println("O antecessor de " + numero + " � " + antecessor);
        System.out.println("O sucessor de " + numero + " � " + sucessor);

    }
}
