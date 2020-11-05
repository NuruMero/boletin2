package boletintema2;

import java.util.Scanner;

public class Condicionales17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner texto=new Scanner (System.in);
		
		System.out.println("Introduce el dia (LUNES, MARTES, MIERCOLES, JUEVES o VIERNES):");
		String dia = texto.nextLine();
		
		int dianum;
		
		switch (dia) {
		case "LUNES":
			dianum = 0;
			break;
		case "MARTES":
			dianum = 1440;
			break;
		case "MIERCOLES":
			dianum = 2880;
			break;
		case "JUEVES":
			dianum = 4320;
			break;
		case "VIERNES":
			dianum = 5760;
			break;
		default:
			System.out.println("Introduce un dia valido.");
			return;
		}
		
		System.out.println("Introduce la hora:");
		int hora = texto.nextInt();
		int horanum;
		if (hora>24) {
			System.out.println("Introduce una hora valida.");
			return;
		}
		else {
			horanum = (hora * 60);
		}
		
		
		System.out.println("Introduce el minuto:");
		int minuto = texto.nextInt();
		
		if (minuto>60) {
			System.out.println("Introduce un minuto valido.");
			return;
		}
		
		int total = (dianum + horanum + minuto);
		
		System.out.println("El minuto actual es: " +total);
		
		if (total > 6660) {
			System.out.println("Ya es el fin de semana.");
		}
		else {
		int hastafinde = 6660 - total;
		System.out.println("Quedan " +hastafinde +" minutos hasta el fin de semana.");
		}
	}
}
