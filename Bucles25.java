package boletintema2;

import java.util.Scanner;

public class Bucles25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner texto=new Scanner(System.in);
		
		System.out.println("Introducir un numero largo: ");
		long numero = texto.nextLong();
		
		long suma = 0;
		
		System.out.print("Los digitos pares son: ");
		while (numero > 0) {
			if ((numero % 10)%2 == 0) {
			System.out.print((numero % 10) +" ");
			suma = suma + (numero % 10);
			}
			numero = numero / 10;
		}
		
		System.out.println(" ");
		System.out.print("La suma de los pares es: ");
		System.out.println(suma);
	}

}
