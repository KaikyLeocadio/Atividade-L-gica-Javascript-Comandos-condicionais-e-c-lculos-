package exerciciosjava;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double media_numeros_1 = (8 + 9 + 7) / 3.0; 
		
		double media_numeros_2 = (4 + 5 + 6) / 3.0;
		
		double soma_medias = media_numeros_1 + media_numeros_2;
		
		double media_das_medias = soma_medias / 2;
		
		System.out.println("Média dos números 8, 9 e 7: " + media_numeros_1);
		System.out.println("Média dos números 4, 5 e 6: " + media_numeros_2);
		System.out.println("Soma das médias: " + soma_medias);
		System.out.println("Média das médias: " + media_das_medias);
	}
}