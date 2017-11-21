/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Doce {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Hacer un pseudocódigo que imprima los números del 1 al 100. Que calcule la suma de todos los números
		 *  pares por un lado, y por otro, la de todos los impares. 
		 */
		int contador=1;
		int par=0;
		int impar=0;
		while (contador<=100) {
			System.out.println(contador);
			contador++;
		if (contador%2==0) {
			par=par+contador;
		}
		else{
			impar=impar+contador;
		}
		}
		System.out.println("La suma de todos los numeros pares es "+par);
		System.out.println("La suma de todos los numeros impares es "+impar);
	}

}
