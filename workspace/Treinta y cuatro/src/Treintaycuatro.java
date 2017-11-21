import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Treintaycuatro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Hacer un programa que lea las calificaciones de un alumno en 10 asignaturas, las almacene en un 
		 * vector y calcule e imprima su media.
		 */
		Scanner teclado=new Scanner(System.in);
		System.out.println("Asignaturas:");
		int asignatura[]=new int[10];
		int suma=0;
		int media=0;
		for (int i = 0; i < asignatura.length; i++) {
			asignatura[i]=teclado.nextInt();
			while (asignatura[i]>10) {
				System.out.println("Nota no valida por encima de 10.");	
				asignatura[i]=teclado.nextInt();
				
			}
			suma=suma+asignatura[i];
		}
		media=suma/asignatura.length;
		System.out.println("La media de estas 10 asignaturas es "+media);
		
	}

}
