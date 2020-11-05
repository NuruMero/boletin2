package boletintema2;

import java.util.Scanner;

public class Condicionales18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner texto=new Scanner (System.in);
		
		System.out.println("Introduzca la base imponible:");
		double base = texto.nextDouble();
		
		System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido):");
		String claseiva = texto.next();
		
		System.out.println("Introduzca el codigo promocional (nopro, mitad, meno5 o 5porc):");
		String codigoprom = texto.next();
		
		
		System.out.println("Base imponible:");
		System.out.println(base);
		
		double iva;
		switch (claseiva) {
		case "general":
			iva = 21;
			break;
		case "reducido":
			iva = 10;
			break;
		case "superreducido":
			iva = 4;
			break;
		default:
			System.out.println("Introduce un tipo de iva valido.");
			return;
		}
		System.out.println("IVA (" +iva +"%)");
		double cantidadiva = (iva * base)/100;
		System.out.println(cantidadiva);
		
		double precioconiva = (base + cantidadiva);
		System.out.println("Precio con IVA");
		System.out.println(precioconiva);
		
		
		double promocion;
		switch (codigoprom) {
		case "nopro":
			promocion = 0;
			break;
		case "mitad":
			promocion = -(precioconiva /2);
			break;
		case "meno5":
			promocion = -5;
			break;
		case "5porc":
			double cincopor = (5 * precioconiva) /100;
			promocion = -cincopor;
			break;
		default:
			System.out.println("Introduce un tipo de promocion valida.");
			return;
		}
		System.out.println("Codigo promocional (" +codigoprom +"): " +promocion);
		
		System.out.println("TOTAL");
		double total = precioconiva + promocion;
		System.out.println(total);
		
	}

}
