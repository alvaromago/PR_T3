package es.studium.ejercicio4CA;

import java.util.Scanner;

public class Ejercicio4CA
{

	public static void main(String[] args)
	{
		String cad1, cad2, cad3;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame una cadena:");
		cad1 = teclado.nextLine();
		System.out.println("Dame otra cadena:");
		cad2 = teclado.nextLine();
		teclado.close();
		cad3 = cad1 + ", " + cad2;
		System.out.println("La cadena final es: " + cad3);
	}

}
