import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Treintaytres {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crear un array unidimensional de 20 elementos con nombres de personas. Visualizar los elementos de 
		 * la lista debiendo ir cada uno en una fila distinta.
		 */
		Scanner teclado=new Scanner(System.in);
		String alumnos[]=new String[20];
		for (int i = 0; i < alumnos.length; i++) {
			alumnos[i]=teclado.nextLine();
		}
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println(alumnos[i]);
		}
		
	}

}
