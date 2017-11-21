/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Treintayseis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Generar una matriz de 4 filas y 5 columnas con números aleatorios entre 1 y 100, e imprimirla.
		 */
		int matriz[][]=new int[4][5];
		for (int f = 0; f < matriz.length; f++) {
			for (int c = 0; c < matriz[0].length; c++) {
				matriz[f][c]=(int)(Math.random()*100+1);
			}	
		}
		for (int f = 0; f < matriz.length; f++) {
			for (int c = 0; c < matriz[0].length; c++) {
				System.out.print(matriz[f][c]+"\t");
			}
			System.out.println();
		}
	}

}
