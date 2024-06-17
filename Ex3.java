package exerciciosjava;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o saldo médio
        System.out.println("Digite o saldo médio do último ano:");
        double saldomedio = scanner.nextDouble();

        double valorcredito;

        // Calcula o valor do crédito com base no saldo médio
        if (saldomedio >= 0 && saldomedio <= 500) {
        	valorcredito = 0;
        } else if (saldomedio >= 501 && saldomedio <= 1000) {
        	valorcredito = saldomedio * 0.30;
        } else if (saldomedio >= 1001 && saldomedio <= 3000) {
        	valorcredito = saldomedio * 0.40;
        } else if (saldomedio >= 3001) {
        	valorcredito = saldomedio * 0.50;
        } else {
            System.out.println("Saldo médio inválido.");
            return;
        }

        // Imprime o saldo médio e o valor do crédito
        System.out.printf("Saldo médio: R$ %.2f%n", saldomedio);
        System.out.printf("Valor do crédito: R$ %.2f%n", valorcredito);
    }
}
