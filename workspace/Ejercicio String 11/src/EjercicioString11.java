import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjercicioString11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Hacer un programa para que pida una palabra de no m�s de 20 caracteres y efect�e todas 
		 *las rotaciones posibles de dicha palabra de forma que el �ltimo car�cter pase al primero 
		 *y los dem�s corran un espacio, es decir si la palabra fuera �HOLA� el resultado debe ser:
			HOLA
			AHOL
			LAHO
			OLAH
		 * Observar que una palabra de n caracteres tiene n rotaciones.
		 */
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce una palabra de no mas de 20 caracteres: ");
		String palabra=teclado.nextLine();
		while (palabra.length()>20) {
			System.out.println("Porfavor introduce una palabra de no mas de 20 caracteres.");
			palabra=teclado.nextLine();	
		}
		
		int posicion=0;
		while (posicion< palabra.length()) {
			palabra=(palabra.substring(palabra.length()-1)+palabra.substring(0,palabra.length()-1));
			posicion++;
			System.out.println(palabra);
		}
		
	}

}
