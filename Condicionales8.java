package boletintema2;

import java.util.Scanner;

public class Condicionales8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner texto = new Scanner(System.in);

		System.out.println("Introduce un número entre uno y diez: ");
		int numero = texto.nextInt();
		
		boolean comprobacion = ((numero % 2) == 0);
		
		if (comprobacion) {
			System.out.println("Es un numero par.");
		}
		else {
			System.out.println("Es un numero impar.");
		}
		
	}

}
