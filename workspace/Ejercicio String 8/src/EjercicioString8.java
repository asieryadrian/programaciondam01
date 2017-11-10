import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjercicioString8 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca el texto que desea codificar:");
		String frase=teclado.nextLine();
		System.out.println("Primero convierta el texto todo a MAYUSCULAS. Escriba m o M para hacerlo: ");
		String opcion=teclado.nextLine();
		while (!opcion.equals("m")|| opcion.equals("M")) {
			System.out.println("Porfavor introduzca una m o M.");
			opcion=teclado.nextLine();
		}
		if (opcion.equals("m")) {
			System.out.println(frase.toUpperCase());
			frase=frase.toUpperCase();
		}
		if (opcion.equals("M")) {
			System.out.println(frase.toUpperCase());
			frase=frase.toUpperCase();
		}
		System.out.println("Vuelva a pulsar enter para empezar la codificacion:");
		String comodin=teclado.nextLine();
		while (!comodin.equals("")) {
			System.out.println("Pulsa enter para empezar la codificacion:");
			comodin=teclado.nextLine();
		}
		int posicion=0;
		String codificado="";
		String abecedario=" XYZABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		for (int i = 0; i < frase.length(); i++) {
			posicion=abecedario.indexOf(frase.substring(i, i+1));
			if (posicion==0) {
				codificado=codificado+" ";
			}
			if (posicion>0) {
				codificado=codificado.concat(abecedario.substring(posicion+3, posicion+4));
			}
			
		}	
		Thread.sleep(1000);
		System.out.println("Espere, el texto se esta codificando...");
		Thread.sleep(1000);
		System.out.println(codificado);
			
	}
	
}
