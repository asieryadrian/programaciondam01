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
		System.out.println("Introduce una cadena de letras: ");
		String frase=teclado.nextLine();
		String abecedario="abcdefghijklmn�opqrstuvwxyz";
		frase=frase.toLowerCase();
		System.out.println(frase);
		System.out.println("A continuacion escribe la letra de la cual quieras borrar las tres primeras escritas: ");
		String letra=teclado.nextLine();
		while (abecedario.indexOf(letra)==-1) {
			System.out.println("Los numeros no estan admitidos porfavor introduzca la letra de la cual quiera borrar las tres primeras escritas: ");
			letra=teclado.nextLine();
		}
		int contador=0;
		while (contador<3) {
			frase=frase.replaceFirst(letra,"");
			contador++;
		}
		System.out.println(frase);
		
	}

}
