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
