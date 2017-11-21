import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Diecinueve {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*Hacer un pseudocódigo que simule el funcionamiento de un reloj digital y que permita ponerlo en hora.
		 */
		Scanner teclado=new Scanner(System.in);
		System.out.println("Hora:");
		int horas=teclado.nextInt();
		System.out.println("Minutos:");
		int minutos=teclado.nextInt();
		System.out.println("Segundos:");
		int segundos=teclado.nextInt();
		while (horas<25) {
			if (segundos==60) {
				minutos++;
				segundos=0;
			}
			if (minutos==60) {
				horas++;
				minutos=0;
			}
			if (horas==24) {
				horas=0;
			}
		System.out.println(horas+"/"+minutos+"/"+segundos);
		segundos++;
		Thread.sleep(1000);
		}
		
	}

}
