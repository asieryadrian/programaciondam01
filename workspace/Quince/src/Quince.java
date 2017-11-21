import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Quince {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Introducir dos números por teclado. Imprimir los números naturales que hay entre ambos números 
		 * empezando por el m s pequeño, contar cuantos hay y cuántos de ellos son pares. Calcular la suma 
		 * de los impares.
		 */
		Scanner teclado=new Scanner(System.in);
		int numero1=teclado.nextInt();
		int numero2=teclado.nextInt();
		int posicion=1;
		int menor=0;
		int mayor=0;
		int contador=0;
		int nat=0;
		int par=0;
		int sumaimpares=0;
		if (numero1>numero2) {
			mayor=numero1;
			menor=numero2;
		}
		else{
			menor=numero1;
			mayor=numero2;
		}
		contador=menor+1;
		while (contador<mayor) {
			System.out.println(contador);
			nat++;
			if (contador%2==0) {
				par++;
			} else {
				sumaimpares=sumaimpares+contador;
			}
			contador++;
		}
		System.out.println("Hay "+nat+" numeros entre "+numero1+" y "+numero2);
		System.out.println("Hay "+par+" pares entre "+numero1+" y "+numero2);
		System.out.println("La suma de los impares es "+sumaimpares);
	}

}
