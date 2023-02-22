package es.studium.ejercicio1CA;

import java.util.Scanner;

public class Ejercicio1CA 
{

	public static void main(String[] args) 
	{
		String nom1, nom2, nom3, nom4, nom5;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame el primer nombre:");
		nom1 = teclado.nextLine();
		System.out.println("Dame el segundo nombre:");
		nom2 = teclado.nextLine();
		System.out.println("Dame el tercer nombre:");
		nom3 = teclado.nextLine();
		System.out.println("Dame el cuarto nombre:");
		nom4 = teclado.nextLine();
		System.out.println("Dame el quinto nombre:");
		nom5 = teclado.nextLine();
		teclado.close();
		System.out.println("Aquí tienes tus cinco nombres: " + nom1 + ", " + nom2 + ", " + nom3 + ", " + nom4 + ", " + nom5);
		//Con el String.format quedaría así
		System.out.println(String.format("Aquí tienes tus cinco nombres: %s, %s, %s, %s, %s", nom1, nom2, nom3, nom4, nom5));
	}

}
