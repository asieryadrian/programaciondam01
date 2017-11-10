import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjercicioString3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Intruduzca una frase:");
		String frase=teclado.nextLine();
		System.out.println("Ahora introduzca la palabra de la frase que has escrito y que quieras mostrar");
		String palabra=teclado.nextLine();
		frase.indexOf(palabra);
		
		if (frase.indexOf(palabra)==-1) {
			System.out.println("Lo siento la palabra no se encuentra en el texto, intentelo con una que exista.");
		}else {
			System.out.println("La palabra que ha escrito se encuentra en la posicion "+(frase.indexOf(palabra)+1));
		}
	}

}
	

