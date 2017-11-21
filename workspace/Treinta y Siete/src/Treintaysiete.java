/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Treintaysiete {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Generar una matriz de 4 filas y 5 columnas con números aleatorios entre 1 y 100, y hacer su matriz transpuesta.
		 */
		int matriz[][]=new int[4][5];
		for (int co = 0; co < matriz[0].length; co++) {
			for (int fi = 0; fi < matriz.length; fi++) {
				matriz[fi][co]=(int)(Math.random()*100+1);
			}	
		}
		for (int co = 0; co < matriz[0].length; co++) {
			for (int fi = 0; fi < matriz.length; fi++) {
				System.out.print(matriz[fi][co]+"\t");
			}
			System.out.println();
		}
	}
}
