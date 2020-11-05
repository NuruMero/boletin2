package boletintema2;

import java.util.Scanner;

public class Condicionales6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner texto = new Scanner(System.in);

		System.out.println("¿Qué dia de la semana fue el día 1 del mes?: ");
		System.out.println("(LUNES - MARTES - MIERCOLES - JUEVES - VIERNES - SABADO - DOMINGO)");
		String diasem = texto.nextLine();
		
		int primerdia;
		
		switch (diasem)
		{
			case "LUNES":
				primerdia = 0;
				break;
			case "MARTES":
				primerdia = 1;
				break;
			case "MIERCOLES":
				primerdia = 2;
				break;
			case "JUEVES":
				primerdia = 3;
				break;
			case "VIERNES":
				primerdia = 4;
				break;
			case "SABADO":
				primerdia = 5;
				break;
			case "DOMINGO":
				primerdia = 6;
				break;
			default:
				System.out.println("Por favor introduce un dia valido y en mayusculas.");
				return;
		}
		
		System.out.println("¿Qué dia del mes es?");
		int dia = texto.nextInt();
		int diadef = (dia + primerdia) % 7;
		
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
