package es.studium.ejemplostema3;

import java.util.Scanner;

public class EjercicioEjemplo3
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String cadena1, cadena2;
		System.out.println("Dame la primera cadena");
		cadena1 = teclado.nextLine();
		System.out.println("Dame la segunda cadena");
		cadena2 = teclado.nextLine();
		teclado.close();
		if(cadena1.equals(cadena2))
		{
			System.out.println("Son iguales");
		}
		else
		{
			System.out.println("Son distintas");
		}
	}

}
