import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjercicioString2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Dada una frase de no m�s de 80 caracteres hacer un programa que busque cu�ntas may�sculas y 
		 * min�sculas tiene y lo imprima.
		 */
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca una frase:");
		String frase=teclado.nextLine();
		while (frase.length()>80) {
			System.out.println("Escriba una frase que tenga menos de 80 caracteres.");
			frase=teclado.nextLine();
		}
		int contadorMayus=0;
		int contadorMinus=0;
		for (int i = 0; i < frase.length(); i++) {
			if ("ABCDEFGHIJKLMN�OPQRSTUVWXYZ".indexOf(frase.substring(i, i+1))!=-1) {
			contadorMayus++;
			}
			if ("abcdefghijklmn�opqrstuvwxyz".indexOf(frase.substring(i, i+1))!=-1){
			contadorMinus++;
			}
		}
		System.out.println("En la frase hay "+contadorMayus+" mayusculas y "+contadorMinus+" minusculas.");
	}

}
