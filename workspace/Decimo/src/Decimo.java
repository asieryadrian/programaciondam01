import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Decimo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int numero;
		numero=teclado.nextInt();
		if (numero%2==0) {
			System.out.println("El "+numero+" es par.");
		}
		else{
			System.out.println("El "+numero+" es impar.");
		}
	}

}