import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Diecisite {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Imprimir, contar y sumar los múltiplos de 2 que hay entre una serie de números, tal que el segundo
		 * sea mayor o igual que el primero. 
		 */
		Scanner teclado=new Scanner(System.in);
		int numero1=teclado.nextInt();
		int numero2=teclado.nextInt();
		int contador=0;
		int multiplos=0;
		int sumamultiplos=0;
		while (numero1>numero2) {
			System.out.println("Porfavor introduce un primer numero que sea menor que el segundo");
			numero1=teclado.nextInt();
			numero2=teclado.nextInt();
		}
		while (numero1<=numero2) {
			if (numero1%2==0) {
				System.out.println(numero1);
				contador++;
				sumamultiplos=sumamultiplos+numero1;
				
			}
			numero1++;
		}
		System.out.println("Hay "+contador+" numeros pares.");
		System.out.println(sumamultiplos+" es la suma de multiplos de 2.");
	}

}
