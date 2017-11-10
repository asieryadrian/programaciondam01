import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Catorce {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int numero=teclado.nextInt();
		int mayor=numero;
		int menor=numero;
		int contador=0;
		while (contador<=3) {
			int numero2=teclado.nextInt();
			if (numero2>mayor) {
				mayor=numero2;
			} 
			if(numero2<menor) {
				menor=numero2;
			}
			contador++;
		}
		System.out.println("El mayor de estos 5 numeros es "+mayor+" y el menor es "+menor);
	}

}
