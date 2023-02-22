package es.studium.ejercicio5TA;

import java.util.Scanner;

public class Ejercicio5TA
{

	public static void main(String[] args)
	{
		int num1;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un número:");
		num1 = teclado.nextInt();
		teclado.close();
		int cuadrados[] = new int[10];
		for(int i = 0; i < cuadrados.length; i++)
		{
			cuadrados[i] = (num1+1) * (num1+1);
			num1 = num1+1;
		}
		for (int numero: cuadrados)
		{
			System.out.println(numero);
		}
	}

}
