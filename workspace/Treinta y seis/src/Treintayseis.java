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
