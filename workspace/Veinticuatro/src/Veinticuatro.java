import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Veinticuatro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Comprobar si un número mayor o igual que la unidad es primo.
		 */
		Scanner teclado=new Scanner(System.in);
		int numero=teclado.nextInt();
		int contador=0;
		int posicion=2;
		while (posicion<numero) {
			if (numero%posicion==0) {
				contador++;
			}
			posicion++;
		}
		if (contador==0) {
			System.out.println("El "+numero+" es primo.");
		} else {
			System.out.println("Lo siento pero el "+numero+" no es primo.");
		}
	}

}
