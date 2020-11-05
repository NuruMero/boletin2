package boletintema2;

import java.util.Scanner;

public class Bucles20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner texto=new Scanner(System.in);

		int numero = 0;
		int suma = 0;
		int contador = 0;
		
		System.out.println("Introduce numeros hasta llegar a 100:");
		while (suma < 100) {
			numero = texto.nextInt();
			suma = numero + suma;
			contador++;
		}
		
		int media = suma / contador;
		
		System.out.println("Suma total acumulada: " +suma);
		System.out.println("Numeros introducidos: " +contador);
		System.out.println("Media de los numeros: " +media);
	}

}
