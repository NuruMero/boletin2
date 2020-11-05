package boletintema2;

import java.util.Scanner;

public class Condicionales10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner (System.in);
		
		int a;
		int b;
		int c;
		int max;
		int min;
		
		System.out.println("Primer valor");
		a=s.nextInt();
		System.out.println("Segundo valor");
		b=s.nextInt();
		System.out.println("Tercer valor");
		c=s.nextInt();
		
		if (a>b) {
			if (a>c) {
				max = a;
			}
			else {
				max = c;
			}
		}
		else {
			if (b>c) {
				max = b;
			}
			else {
				max = c;
			}
		}
		
		if (a<b) {
			if (a<c) {
				min = a;
			}
			else {
				min = c;
			}
		}
		else {
			if (b<c) {
				min = b;
			}
			else {
				min = c;
			}
		}
		
		System.out.println("El mayor es " +max +" y el menor es " +min);
	}
}