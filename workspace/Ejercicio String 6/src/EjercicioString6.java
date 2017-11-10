import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjercicioString6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String frase=teclado.nextLine();
		while (frase.length()>80) {
			System.out.println("Porfavor introduzca una frase de menos de 80 caracteres.");
			frase=teclado.nextLine();
		}
			int contadorvocales=0;
			int contadorconsonantes=0;
			int contadornumeros=0;
			for (int i = 0; i < frase.length(); i++) {
				if ("aeiouAEIOU".indexOf(frase.substring(i, i+1))!=-1) {
					contadorvocales++;
				}
				if ("bcdfghjklmnñpqrstvwxyzBCDFGHIJKLMNÑPQRSTVWXYZ".indexOf(frase.substring(i, i+1))!=-1) {
					contadorconsonantes++;
				}
				if ("1234567890".indexOf(frase.substring(i, i+1))!=-1) {
					contadornumeros++;
				}
			}
			System.out.println("En la siguiente frase hay "+contadorvocales+" vocales");
			System.out.println("En la siguiente frase hay "+contadorconsonantes+" consonantes");
			System.out.println("En la siguiente frase hay "+contadornumeros+" numeros");
		}
	}


