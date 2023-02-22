package es.studium.ejercicio3CA;

import java.util.Scanner;

public class Ejercicio3CA
{

	public static void main(String[] args)
	{
		String cad1, cad2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame una cadena:");
		cad1 = teclado.nextLine();
		System.out.println("Dame otra cadena:");
		cad2 = teclado.nextLine();
		teclado.close();
		if(cad1.length()==(cad2.length()))
		{
			System.out.println("Son iguales");
		}
		else if(cad1.length()>cad2.length())
		{
			System.out.println("Cadena 1 es más largo que Cadena 2");
		}
		else if(cad1.length()<cad2.length())
		{
			System.out.println("Cadena 2 es más largo que Cadena 1");
		}
	}

}
