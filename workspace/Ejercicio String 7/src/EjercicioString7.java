import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjercicioString7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Leer una frase por teclado y escribir a continuaci�n cuantas may�sculas, min�sculas y n�meros 
		 * contiene.
		 */
		Scanner teclado=new Scanner(System.in);
		String frase=teclado.nextLine();
		int contadorMayus=0;
		int contadorMinus=0;
		int contadorNumeros=0;
		for (int i = 0; i < frase.length(); i++) {
			if ("ABCDEFGHIJKLMN�OPQRSTUVWXYZ".indexOf(frase.substring(i, i+1))!=-1) {
				contadorMayus++;
			}
			if ("abcdefghijklmn�opqrstuvwxyz".indexOf(frase.substring(i, i+1))!=-1) {
				contadorMinus++;
			}
			if ("1234567890".indexOf(frase.substring(i, i+1))!=-1) {
				contadorNumeros++;
			}
		}
		System.out.println("En la siguiente frase hay "+contadorMayus+" mayusculas "+contadorMinus+" minusculas y "+contadorNumeros+" numeros");
	}

}
