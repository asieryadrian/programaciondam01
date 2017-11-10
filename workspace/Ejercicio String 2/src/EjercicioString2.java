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
		Scanner teclado=new Scanner(System.in);
		String frase=teclado.nextLine();
		System.out.println("Introduzca una frase:");
		while (frase.length()>80) {
			System.out.println("Escriba una frase que tenga menos de 80 caracteres.");
			frase=teclado.nextLine();
		}
		int contadorMayus=0;
		int contadorMinus=0;
		for (int i = 0; i < frase.length(); i++) {
			if ("ABCDEFGHIJKLMNÑOPQRSTUVWXYZ".indexOf(frase.substring(i, i+1))!=-1) {
			contadorMayus++;
			}
			if ("abcdefghijklmnñopqrstuvwxyz".indexOf(frase.substring(i, i+1))!=-1){
			contadorMinus++;
			}
		}
		System.out.println("En la frase hay "+contadorMayus+" mayusculas y "+contadorMinus+" minusculas.");
	}

}
