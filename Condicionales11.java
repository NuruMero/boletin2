package boletintema2;

import java.util.Scanner;
import java.lang.Math;

public class Condicionales11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner texto=new Scanner (System.in);
		
		System.out.println("Ecuacion de segundo grado: (ax^2+bx+c=0)");
		System.out.println("Valor de a:");
		double a = texto.nextInt();
		System.out.println("Valor de b:");
		double b = texto.nextInt();
		System.out.println("Valor de c:");
		double c = texto.nextInt();
		
		double potencia = Math.pow(a, 2);
		System.out.println(potencia);
		
		double compsquare = (b*b-4*a*c);
		System.out.println(compsquare);
		
		double square = Math.sqrt(compsquare);
		System.out.println(square);
		
		double abs = Math.abs(square);
		System.out.println(abs);
		
		if (potencia > 0) {
			double positivo = (-b+square)/2*a;
			System.out.println("x = " +positivo);
		}
		else {
			double negativo = ((-b)/2*a + (abs/2*a));
			System.out.println("x = " +negativo);
		}
	}

}
