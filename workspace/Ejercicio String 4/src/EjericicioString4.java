import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjericicioString4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca una frase:");
		String frase=teclado.nextLine();
		
		while (frase.length()>80) {
			System.out.println("Introduzca una frase de menos de 80 caracteres.");
			frase=teclado.nextLine();
		}
		System.out.println("Si quieres el texto en MAYUSCULAS pulsa (M) si lo quieres en minusculas pulsa (m)");
		String opcion=teclado.nextLine();
		while (!(opcion.equals("M") || opcion.equals("M"))) {
		System.out.println("Introduzca M para MAYUSCULAS y m para minusculas");
		opcion=teclado.nextLine();
		}

		if (opcion.equals("M")) {
		System.out.println(frase.toUpperCase());
		}
		if(opcion.equals("m")){
		System.out.println(frase.toLowerCase());
		}
			}
}
