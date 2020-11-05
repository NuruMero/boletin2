package boletintema2;

import java.util.Scanner;

public class Condicionales4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("ax+b=0");
		int a;
		int b;
		int x;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce la posible a:");
		a=teclado.nextInt();
		System.out.println("Introduce la posible b:");
		b=teclado.nextInt();
		
		if (a!=0) {
			x=-b/a;
			System.out.println("la ecuacion es "+x);
		}
		else {
			if (b!=0) {
				System.out.println("solucion imposible");
			}
			else {
				System.out.println("Solucion indeterminada");
			}
		}
	}

}
