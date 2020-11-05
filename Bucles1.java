package boletintema2;

import java.util.Scanner;

public class Bucles1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner texto = new Scanner(System.in);

		System.out.println("Introduce un valor impar para cerrar bucle:");
		
		int numero = 2;
		while ((numero%2)==0) {
			numero = texto.nextInt();
		}
		System.out.println("Numero impar introducido, cerrando programa.");
	}

}
