package boletintema2;

import java.util.Scanner;

public class Bucles2 {
	
    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Leer números hasta que se introduzca N");
        String resp;
        int num=0;
        do {
            System.out.println("Introduce un número:");
            num=teclado.nextInt();
            System.out.println("Desea continuar? Escriba S/N");
            resp = teclado.next();
        }
        while(!resp.equals("N"));
        System.out.println("Cerrando programa.");
    }

}