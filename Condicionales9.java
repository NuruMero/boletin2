package boletintema2;

import java.util.Scanner;

public class Condicionales9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner texto = new Scanner(System.in);

		System.out.println("Escribe tres numeros enteros");
		int a = texto.nextInt();
		int b = texto.nextInt();
		int c = texto.nextInt();
		
		if (a>b && a>c) {
			System.out.println(a +" es el numero mas alto de los tres.");
		}
		else if (b>a && b>c) {
			System.out.println(b +" es el numero mas alto de los tres.");
		}
		else {
			System.out.println(c +" es el numero mas alto de los tres.");	
		}
	}

}
