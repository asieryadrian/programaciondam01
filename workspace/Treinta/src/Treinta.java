/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Treinta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Simular una carrera de dos caballos si cada uno tiene igual probabilidad de ganar.
		 */
		int carrera=(int)(Math.random()*2);
		if (carrera==0) {
			System.out.println("Gana el caballo 1.¡ENHORABUENA CABALLO 1.!");
		} else {
			System.out.println("Gana el caballo 2.¡ENHORABUENA CABALLO 2.!");
		}
	}

}
