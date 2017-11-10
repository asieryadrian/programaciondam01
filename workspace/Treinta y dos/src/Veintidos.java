import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Veintidos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce un texto");
		String texto=teclado.nextLine();
		String tab="";
		int contador=1;
		while (contador<=5) {
			System.out.println(tab + texto);
			tab=tab+"\t";
			contador++;
		}
		
	}

}
