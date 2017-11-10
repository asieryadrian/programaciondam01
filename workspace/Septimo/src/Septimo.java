import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Septimo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		String frase=" ";
		int contador= -1;
		while(!frase.equals("")){
			frase=teclado.nextLine();
			contador++;
		}
		System.out.println("Has escrito "+contador+ " lineas");		
	}

}
