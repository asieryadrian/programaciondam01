import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class TreintayOcho {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Cargar en una matriz las notas de los alumnos de un colegio en funci�n del n�mero de cursos (filas) 
		 *y del n�mero de alumnos por curso (columnas).
		 */
		Scanner teclado=new Scanner(System.in);
		int matriz[][]=new int[4][5];
		for (int clases = 0; clases < matriz.length; clases++) {
			for (int alumnos = 0; alumnos < matriz[0].length; alumnos++) {
//				matriz[clases][alumnos]=(int)(Math.random()*10+1);
				System.out.print("Introducir nota del alumno:");
				matriz[clases][alumnos]=teclado.nextInt();
				System.out.println();
				int comodin=matriz[clases][alumnos];
				while(comodin>10){	
					if (matriz[clases][alumnos]>10) {
						System.out.println("Introduce una nota menor que 10.");
						matriz[clases][alumnos]=teclado.nextInt();
						System.out.println();
					}else{
						comodin =11;
					}
				}
			}	
		}
		for (int clases = 0; clases < matriz.length; clases++) {
			for (int alumnos = 0; alumnos < matriz[0].length; alumnos++) {
				System.out.print(matriz[clases][alumnos]+"\t");
			}
			System.out.println();
		}
	}
}


