import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Veintisiete {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Realizar la tabla de multiplicar de un numero entre 0 y 10.
		 */
		Scanner teclado=new Scanner(System.in);
		int numero=teclado.nextInt();
		int contador=0; 
		int resultado=0;
		System.out.println("Tabla del numero "+numero+".");
		while (contador<=10) {
			resultado=numero*contador;
			System.out.println(numero+"*"+contador+"="+resultado);
			contador++;
		}
		
	}

}
