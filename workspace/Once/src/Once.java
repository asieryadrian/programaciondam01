import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Once {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Imprimir y contar los múltiplos de 3 desde la unidad hasta un numero que introducimos por teclado.
		 */
		Scanner teclado=new Scanner(System.in);
		int numero=teclado.nextInt();
		int posicion=1;
		int contador=3;
		int multiplo=0;
		while (posicion<=numero) {
			contador--;
			if (contador==0) {
				System.out.println(posicion);
				contador=3;
				multiplo++;
			}
		posicion++;
		}
		System.out.println("Hay "+multiplo+" multiplos de 3 por detras de "+numero);
	}

}
