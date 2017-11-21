/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Trece {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Imprimir y contar los números que son múltiplos de 2 o de 3 que hay entre 1 y 100.
		 */
		int posicion= 1;
		int contadorm2=2;
		int contadorm3=3;
		int multiplos2=0;
		int multiplos3=0;
		while (posicion<=100) {
			contadorm2--;
			contadorm3--;
			if (contadorm2==0) {
				System.out.println(posicion);
				contadorm2=2;
				multiplos2++;
			}
			if (contadorm3==0) {
				System.out.println(posicion);
				contadorm3=3;
				multiplos3++;
		
			}
			posicion++;
		}
		System.out.println("Hay "+multiplos2+" multiplos de 2 y "+multiplos3+" multiplos de 3.");
	}

}
