package exerciciosjava;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner valor = new Scanner (System.in);
		
		System.out.println("Escolha qual destes pratos deseja:");
		
		System.out.println("1 - Vegetariano");
		System.out.println("2 - Peixe");
		System.out.println("3 - Frango");
		System.out.println("4 - Carne");
		int prato = valor.nextInt();
		
		System.out.println("Escolha qual dessas sobremesas deseja:");
		
		System.out.println("1 - Abacaxi");
		System.out.println("2 - Sorvete diet");
		System.out.println("3 - Mousse diet");
		System.out.println("4 - Mouse chocolate");
		int sobremesa = valor.nextInt();
		
		System.out.println("Escolha qual dessas bebidas deseja:");
		
		System.out.println("1 - Chá");
		System.out.println("2 - Suco de laranja");
		System.out.println("3 - Suco de melão");
		System.out.println("4 - Refrigerante diet");
		int bebida = valor.nextInt();
		
		int caloriasprato = 0;
		int caloriassobremesa = 0;
		int caloriasbebida = 0;
		
		  if (prato == 1) {
	            caloriasprato = 180;
	        } else if (prato == 2) {
	            caloriasprato = 230;
	        } else if (prato == 3) {
	            caloriasprato = 250;
	        } else if (prato == 4) {
	            caloriasprato = 350;
	        } else {
	        	System.out.println("Opção inválida!");
	        	return;
	        }
		  
		  if (sobremesa == 1) {
	            caloriassobremesa = 75;
	        } else if (sobremesa == 2) {
	            caloriassobremesa = 110;
	        } else if (sobremesa == 3) {
	            caloriassobremesa = 170;
	        } else if (sobremesa == 4) {
	            caloriassobremesa = 200;
	        } else {
	            System.out.println("Opção inválida!");
	            return;
	        }
		  
		  if (bebida == 1) {
	            caloriasbebida = 20;
	        } else if (bebida == 2) {
	            caloriasbebida = 70;
	        } else if (bebida == 3) {
	            caloriasbebida = 100;
	        } else if (bebida == 4) {
	            caloriasbebida = 65;
	        } else {
	            System.out.println("Opção inválida!");
	            return;
	        }
		  
		  int calculo = caloriasbebida + caloriassobremesa + caloriasprato;
		  
		  System.out.println("As calorias são de: " + calculo + "kcal");
	}

}
