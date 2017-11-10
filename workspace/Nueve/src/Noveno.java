import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Noveno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		float numero;
		numero = teclado.nextFloat();
		if (numero<0) {
			System.out.println("El "+numero+" es negativo.");
		}
		else{
			System.out.println("El "+numero+" es positivo");
		}
	}

}
