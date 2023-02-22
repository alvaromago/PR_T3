package es.studium.ejercicio6TA;

import java.util.Scanner;

public class Ejercicio6TA
{

	public static void main(String[] args)
	{
		int num, positivo = 0, negativo = 0; 
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un número");
		num = teclado.nextInt();
		while (num!=0)
			{
				if (num<0)
				{
					negativo = negativo + 1;
					System.out.println("Dame otro número");
				}
				if (num>0)
				{
					positivo = positivo + 1;
					System.out.println("Dame otro número");
				}
				num = teclado.nextInt();
				if (num==0)
				{
					System.out.println("Has metido " + positivo + " números positivos");
					System.out.println("Has metido " + negativo + " numeros negativos");
				}
				
			}
		teclado.close();
	}
	
}
