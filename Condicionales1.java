package boletintema2;

import java.util.Scanner;

public class Condicionales1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner texto = new Scanner(System.in);

		System.out.println("Introduce una hora de 0 a 23: ");
		int i = texto.nextInt();
		
		if (i>=6 && i<=12) {
			System.out.println("Buenos dias :D");
		}
			else if (i>=13 && i<=20) {
				System.out.println("Buenas tardes 8)");
			}
				else {
				System.out.println("Buenas noches ^^");
				}
	}

}
