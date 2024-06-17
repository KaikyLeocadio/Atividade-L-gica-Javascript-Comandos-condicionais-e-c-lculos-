package exerciciosjava;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usu�rio que insira o saldo m�dio
        System.out.println("Digite o saldo m�dio do �ltimo ano:");
        double saldomedio = scanner.nextDouble();

        double valorcredito;

        // Calcula o valor do cr�dito com base no saldo m�dio
        if (saldomedio >= 0 && saldomedio <= 500) {
        	valorcredito = 0;
        } else if (saldomedio >= 501 && saldomedio <= 1000) {
        	valorcredito = saldomedio * 0.30;
        } else if (saldomedio >= 1001 && saldomedio <= 3000) {
        	valorcredito = saldomedio * 0.40;
        } else if (saldomedio >= 3001) {
        	valorcredito = saldomedio * 0.50;
        } else {
            System.out.println("Saldo m�dio inv�lido.");
            return;
        }

        // Imprime o saldo m�dio e o valor do cr�dito
        System.out.printf("Saldo m�dio: R$ %.2f%n", saldomedio);
        System.out.printf("Valor do cr�dito: R$ %.2f%n", valorcredito);
    }
}
