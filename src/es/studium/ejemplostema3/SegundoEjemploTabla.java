package es.studium.ejemplostema3;

import java.util.Scanner;

public class SegundoEjemploTabla
{

	public static void main(String[] args)
	{
		int tablaEnteros[] = new int[10];
		Scanner teclado = new Scanner(System.in);
		for(int i = 0; i < tablaEnteros.length; i++)
		{
			System.out.println("Dame el número entero de la posición " + i + ":");
			tablaEnteros[i] = teclado.nextInt();
		}
		for(int i = 0; i < tablaEnteros.length; i++)
		{
			tablaEnteros[i] = tablaEnteros[i]*2;
		}
		teclado.close();
		for(int i = 0; i < tablaEnteros.length; i++)
		{
			System.out.println("Valor de " + i + ":" + tablaEnteros[i]);
		}
	}

}
