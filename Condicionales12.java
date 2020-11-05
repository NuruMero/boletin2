package boletintema2;

import java.util.Scanner;

public class Condicionales12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner texto=new Scanner (System.in);
		
		System.out.println("Introduce las horas trabajadas:");
		int horas = texto.nextInt();
		
		int pago;
		
		if (horas < 41) {
			pago = horas*12;
		}
		else {
			pago = horas*16;
		}
		System.out.println("Le corresponden " +pago +" euros.");
		
	}

}
