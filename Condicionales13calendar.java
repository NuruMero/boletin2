package boletintema2;

import java.util.Calendar;

public class Condicionales13calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar fecha = Calendar.getInstance();
		
		System.out.println("Hora: " +fecha.get(Calendar.HOUR_OF_DAY) + " : " +fecha.get(Calendar.MINUTE) +" : " +fecha.get(Calendar.SECOND));
		
		int totalminutos = (fecha.get(Calendar.HOUR_OF_DAY) *60) + fecha.get(Calendar.MINUTE);
		int totalsegundos = (totalminutos * 60) + fecha.get(Calendar.SECOND);
		
		System.out.println("Son los " +totalsegundos +" segundos.");

	}

}
