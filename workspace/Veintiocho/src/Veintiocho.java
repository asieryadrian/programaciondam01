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
		int lanzamiento=(int)(Math.random()*2);
		if (lanzamiento==0) {
			System.out.println("Ha salido Cara.");
		} else {
			System.out.println("Ha salido Cruz.");
		}
	}

}
