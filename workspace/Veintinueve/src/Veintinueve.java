/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Veintinueve {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Simular cien tiradas de dos dados y contar las veces que entre los dos suman 10
		 */
		int dado1=(int)(Math.random()*6)+1;
		int dado2=(int)(Math.random()*6)+1;
		int lanzamiento=1;
		int suma=0;
		int contador=0;
		while (lanzamiento<=100) {
			suma=dado1+dado2;
			if (suma==10) {
				contador++;
			}
			lanzamiento++;
			dado1=(int)(Math.random()*6)+1;
			dado2=(int)(Math.random()*6)+1;
		}
		System.out.println("Ha salido "+contador+" veces 10 al lanzar los dos dados.");
	}

}
