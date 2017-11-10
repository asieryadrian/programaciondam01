import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Veintiseis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce una frase:");
		String frase=teclado.nextLine();
		System.out.println("\n");
		for (int i = 0; i <(120-frase.length())/2; i++) {
			frase=" ".concat(frase);
		}
		System.out.println(frase);
		teclado.close();
	}

}
