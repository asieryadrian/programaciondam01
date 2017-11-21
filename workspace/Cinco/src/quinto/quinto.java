/**
 * 
 */
package quinto;

/**
 * @author usuario
 *
 */
public class quinto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		/* Hacer un pseudocódigo que imprima los números impares hasta el 100 y que imprima cuantos impares hay.
		 */
		int contador = 0;
		int posicion = 1;
		while (posicion <=100) {
			System.out.println(posicion);
			contador = contador + 1;
			posicion = posicion + 2;
		}
	System.out.println("Hay "+contador+" impares");
	}

}
