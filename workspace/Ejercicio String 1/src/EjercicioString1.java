import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjercicioString1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Leer una frase de máximo 80 caracteres y escribirla progresivamente es decir si la frase es: “ciervo”,
		 * el programa debe imprimir.
			c
			ci
			cie
			cier
			cierv
			ciervo
		 */
		Scanner teclado=new Scanner(System.in);
		String frase=teclado.nextLine();
		System.out.println("Introduzca una frase:");
		while (frase.length()>80) {
			System.out.println("Escriba una frase que tenga menos de 80 caracteres.");
			frase=teclado.nextLine();
		}
		int posicion=1;
		while(posicion <=frase.length()){
		System.out.println(frase.substring(0,posicion));
		posicion++;
		}
	}
}
