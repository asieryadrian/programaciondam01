/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Veintitres {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador=0;
		int filas=0;
		int columnas=0;
		while (contador< 101) {
			while (columnas<10) {
				System.out.print(contador +"  ");
				contador++;
				columnas++;
				if (contador>100) {
					columnas = 10;
				}
			}
			System.out.println();
			columnas=0;
			filas ++;
		}  
	}

}
