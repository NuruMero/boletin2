package boletintema2;

import java.util.Scanner;

public class Condicionales5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner texto = new Scanner(System.in);

		System.out.println("Introduce el dia del mes: ");
		System.out.println("(Este programa asume que el dia 1 es lunes)");
		
		int dia = texto.nextInt();
		int diadef = dia % 7;
		
		switch (diadef)
		{
			case 1:
				System.out.println("Es lunes.");
				break;
			case 2:
				System.out.println("Es martes.");
				break;
			case 3:
				System.out.println("Es miercoles.");
				break;
			case 4:
				System.out.println("Es jueves.");
				break;
			case 5:
				System.out.println("Es viernes.");
				break;
			case 6:
				System.out.println("Es sabado.");
				break;
			case 0:
				System.out.println("Es domingo.");
				break;
			
		}
		
	}

}
