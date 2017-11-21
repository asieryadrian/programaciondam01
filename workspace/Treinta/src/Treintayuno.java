import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Treintayuno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Introducir dos números por teclado y mediante un menú, calcule su suma, su resta, su 
		 * multiplicación o su división. 
		 */
		Scanner teclado=new Scanner(System.in);
		System.out.println("Suma, resta, multiplicacion y division de los numeros");
		int numero1=teclado.nextInt();
		int numero2=teclado.nextInt();
		int contador=0;
		int solucionsuma=0;
		int solucionresta=0;
		int solucionmult=0;
		int soluciondiv=0;
		while (contador<1) {
			if (numero2>numero1) {
				System.out.println("Porfavor el numero 1 sea mayor que el numero 2. ");
				numero1=teclado.nextInt();
				numero2=teclado.nextInt();
			}
			if (numero2<numero1) {
				contador++;
			}	
		}
		solucionsuma=numero1+numero2;
		System.out.println("La suma de "+numero1+" y "+numero2+" es "+solucionsuma);
		solucionresta=numero1-numero2;
		System.out.println("La resta de "+numero1+" menos "+numero2+" es "+solucionresta);
		solucionmult=numero1*numero2;
		System.out.println("La multiplicacion de "+numero1+" por "+numero2+" es "+solucionmult);
		soluciondiv=numero1/numero2;
		System.out.println("La division de "+numero1+" entre "+numero2+" es "+soluciondiv);
	}

}
