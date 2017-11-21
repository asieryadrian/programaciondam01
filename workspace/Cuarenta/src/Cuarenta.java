/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Cuarenta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crear una tabla de 3 páginas, 4 filas y 5 columnas donde el primer elemento valga 1, el segundo 2,
		 *el tercero 3 y así sucesivamente, e imprimirla.
		 */
		int matriz[][][]=new int[3][4][5];
		int contador=1;
		for (int pagina = 0; pagina < matriz.length; pagina++) {
			System.out.println("Pagina "+(pagina+1));
			for (int filas = 0; filas < matriz[0].length; filas++) {
				for (int columnas = 0; columnas < matriz[0][0].length; columnas++) {
					matriz[pagina][filas][columnas]=contador;
					contador++;
					System.out.print(matriz[pagina][filas][columnas]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
