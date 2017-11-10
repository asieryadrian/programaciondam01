/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Veintiuno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int posicion=1;
		int pares=0;
		int impares=0;
		while (posicion<1000) {
			switch (posicion%2) {
			case 0:
				pares++;
				break;

			default:
				impares++;
				break;
			}
			
			posicion++;
		}
		System.out.println("La suma de pares del 1 al 1000 es "+pares);
		System.out.println("La suma de impares del 1 al 1000 es "+impares);
	}

}
