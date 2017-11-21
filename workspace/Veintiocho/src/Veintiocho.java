/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Veintiocho {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Simular el lanzamiento de una moneda al aire e imprimir si ha salido cara o cruz.
		 */
		int lanzamiento=(int)(Math.random()*2);
		if (lanzamiento==0) {
			System.out.println("Ha salido Cara.");
		} else {
			System.out.println("Ha salido Cruz.");
		}
	}

}
