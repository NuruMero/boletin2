package boletintema2;

import java.util.Scanner;

public class Condicionales16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner texto=new Scanner (System.in);
		
		System.out.println("Introduce un solo caracter: ");
		String caracter = texto.nextLine();
		System.out.println("Introduce la direccion: ARRIBA, ABAJO, DERECHA o IZQUIERDA");
		String direccion = texto.nextLine();
		
		if (caracter.length()>1) {
			System.out.println("Se ha introducido mas de un caracter.");
			return;
		}
		else {
			switch (direccion) {
			
			case "ARRIBA":
				System.out.println("    *    ");
				System.out.println("   *" +caracter +"*   ");
				System.out.println("  *" +caracter +caracter +caracter +"*  ");
				System.out.println(" *" +caracter +caracter +caracter +caracter +caracter +"* ");
				System.out.println("*********");
				break;
				
			case "DERECHA":
				System.out.println("*");
				System.out.println("***");
				System.out.println("*" +caracter +caracter +"*");
				System.out.println("*" +caracter +caracter +caracter +"*");
				System.out.println("*" +caracter +caracter +"*");
				System.out.println("***");
				System.out.println("*");
				break;
				
			case "ABAJO":
				System.out.println("*********");
				System.out.println(" *" +caracter +caracter +caracter +caracter +caracter +"* ");
				System.out.println("  *" +caracter +caracter +caracter +"*  ");
				System.out.println("   *" +caracter +"*   ");
				System.out.println("    *    ");
				break;
				
			case "IZQUIERDA":
				System.out.println("    *");
				System.out.println("  ***");
				System.out.println(" *" +caracter +caracter +"*");
				System.out.println("*" +caracter +caracter +caracter +"*");
				System.out.println(" *" +caracter +caracter +"*");
				System.out.println("  ***");
				System.out.println("    *");
				break;
			}
		}
	}

}
