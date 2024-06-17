package exerciciosjava;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();
       
        if (idade < 16) {
            System.out.println("Classe Eleitoral: Não eleitor");
        } else if (idade >= 16 && idade < 18 || idade >= 65) {
            System.out.println("Classe Eleitoral: Eleitor facultativo");
        } else if (idade >= 18 && idade < 65) {
            System.out.println("Classe Eleitoral: Eleitor obrigatório");
        } else {
            System.out.println("Idade inválida.");
        }

    }
}

