import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Treintaycinco {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Usando el segundo ejemplo, hacer un programa que busque una nota en el vector.
		 */
		System.out.println("Introduce las 10 notas");
		Scanner teclado=new Scanner(System.in);
		int asignatura[]=new int[10];
		for (int i = 0; i < asignatura.length; i++) {
			asignatura[i]=teclado.nextInt();
			while (asignatura[i]>10) {
				System.out.println("Nota no valida por encima de 10.");	
				asignatura[i]=teclado.nextInt();
			}
			
		}
		System.out.println("Introduce la nota que quiera que se muestre:");
		int nota=teclado.nextInt();
		int asignaturaMostrar=0;
		for (int i = 1; i < asignatura.length; i++) {
			if (nota==asignatura[i]) {
				asignaturaMostrar = i+1;
				System.out.println("Es la asignatura "+asignaturaMostrar);
				
			}
		}
	}
}
