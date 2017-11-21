import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjercicioString1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce una cadena de letras: ");
		String frase=teclado.nextLine();
		String abecedario="abcdefghijklmnñopqrstuvwxyz";
		frase=frase.toLowerCase();
		System.out.println(frase);
		System.out.println("A continuacion, que letras de las que ha escrito quiere convertir a MAYUSCULAS: ");
		String letra=teclado.nextLine();
		while (abecedario.indexOf(letra)==-1) {
			System.out.println("Los numeros no estan admitidos porfavor introduzca la letra que quiere convertir a MAYUSCULAS: ");
			letra=teclado.nextLine();
		}
		frase=frase.replaceAll(letra, letra.toUpperCase());
		System.out.println(frase);
		
		
	}

}
