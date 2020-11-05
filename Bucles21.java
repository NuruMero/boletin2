package boletintema2;

import java.util.Scanner;

public class Bucles21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner texto=new Scanner(System.in);

		System.out.println("Introduce un valor mayor a 3: ");
		int maximo = texto.nextInt();
		
		if (maximo < 3) {
			System.out.println("El valor es menor a 3.");
			return;
		}
		
		int numero = 3;
		int suma = 0;
		int contador = 0;
		
		while (numero <= maximo) {
			System.out.println(numero);
			suma = suma + numero;
			numero = numero + 3;
			
			contador++;
		}
		System.out.println("Hay " +contador +" multiplos de 3 entre 1 y " +maximo);
		System.out.println("La suma de estos es: " +suma);
	}

}
