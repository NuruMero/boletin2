package boletintema2;

import java.util.Scanner;

public class Condicionales14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner texto=new Scanner (System.in);
		System.out.println("Introduce tu mes de nacimiento (En mayusculas):");
		String mes = texto.nextLine();
		
		System.out.println("Introduce tu dia de nacimiento:");
		int dia = texto.nextInt();

		System.out.println("Tu horoscopo es: ");
		switch (mes) {
		case "ENERO" :
			if (dia < 21) {
				System.out.println("CAPRICORNIO");
				break;
			}
			else {
				System.out.println("ACUARIO");
				break;
			}
		case "FEBRERO" :
			if (dia < 20) {
				System.out.println("ACUARIO");
				break;
			}
			else {
				System.out.println("PISCIS");
				break;
			}
		case "MARZO" :
			if (dia < 21) {
				System.out.println("PISCIS");
				break;
			}
			else {
				System.out.println("ARIES");
				break;
			}
		case "ABRIL" :
			if (dia < 21) {
				System.out.println("ARIES");
				break;
			}
			else {
				System.out.println("TAURO");
				break;
			}
		case "MAYO" :
			if (dia < 22) {
				System.out.println("TAURO");
				break;
			}
			else {
				System.out.println("GEMINI");
				break;
			}
		case "JUNIO" :
			if (dia < 22) {
				System.out.println("GEMINI");
				break;
			}
			else {
				System.out.println("CANCER");
				break;
			}
		case "JULIO" :
			if (dia < 24) {
				System.out.println("CANCER");
				break;
			}
			else {
				System.out.println("LEO");
				break;
			}
		case "AGOSTO" :
			if (dia < 24) {
				System.out.println("LEO");
				break;
			}
			else {
				System.out.println("VIRGO");
				break;
			}
		case "SEPTIEMBRE" :
			if (dia < 24) {
				System.out.println("VIRGO");
				break;
			}
			else {
				System.out.println("LIBRA");
				break;
			}
		case "OCTUBRE" :
			if (dia < 24) {
				System.out.println("LIBRA");
				break;
			}
			else {
				System.out.println("ESCORPIO");
				break;
			}
		case "NOVIEMBRE" :
			if (dia < 23) {
				System.out.println("ESCORPIO");
				break;
			}
			else {
				System.out.println("SAGITARIO");
				break;
			}
		case "DICIEMBRE" :
			if (dia < 22) {
				System.out.println("SAGITARIO");
				break;
			}
			else {
				System.out.println("CAPRICORNIO");
				break;
			}
		default :
			System.out.println("Escribe bien el mes.");
			break;
		}
	}

}
