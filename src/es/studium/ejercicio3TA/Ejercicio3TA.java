package es.studium.ejercicio3TA;

public class Ejercicio3TA
{
	public static void main(String[] args)
	{
		int pares[] = new int[20];
		for(int i = 0; i < pares.length; i++)
		{
			pares[i] = i*2;
		}
		for(int i = 19; i >= 0; i--)
		{
			System.out.println(pares[i]);
		}
	}
}
