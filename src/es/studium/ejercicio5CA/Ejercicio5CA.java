package es.studium.ejercicio5CA;

import java.util.Scanner;

public class Ejercicio5CA
{

	public static void main(String[] args)
	{
		String cad;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame una cadena:");
		cad = teclado.nextLine();
		teclado.close();
		System.out.println("Tu cadena en mayúsculas: " + cad.toUpperCase());
		System.out.println("Tu cadena en minúsculas: " + cad.toLowerCase());
	}

}
