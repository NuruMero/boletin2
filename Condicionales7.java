package boletintema2;

import java.util.Scanner;

public class Condicionales7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner texto = new Scanner(System.in);

		System.out.println("Introduce las tres notas: ");
		float nota1 = texto.nextFloat();
		float nota2 = texto.nextFloat();
		float nota3 = texto.nextFloat();
		
		float media = (nota1 + nota2 + nota3)/3;
		System.out.println("Tu nota media es de " +media);
		
		if (media < 5) {
			System.out.println("INSUFICIENTE");}
			else if (media < 6) {
			System.out.println("SUFICIENTE");}
				else if (media < 7) {
				System.out.println("BIEN");}
					else if (media < 9) {
						System.out.println("NOTABLE");}
							else {
							System.out.println("SOBRESALIENTE");}
		}
}