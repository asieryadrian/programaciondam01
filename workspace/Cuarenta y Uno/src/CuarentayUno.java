/**
 * 
 */

/**
 * @author usuario
 *
 */
public class CuarentayUno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Se dispone de una tabla de 5 p�ginas, 10 filas y 20 columnas, que se refieren al centro, al curso
		 *y al n�mero de alumnos de un colegio respectivamente. Imprimir la nota media por curso y la nota
		 *media m�xima y su centro de pertenencia.
		 */
		int matriz[][][]=new int[5][10][20];
		float sumalumnos=0;
		float sumacurso=0;
		float sumacentro=0;
		float mediacurso=0;
		float mediacentro=0;
		float media=0;
		float mediacursomax=0;
		int cursomax=0;
		int centromax=0;
		for (int centro = 0; centro < matriz.length; centro++) {
			System.out.println();
			System.out.println("Centro "+(centro+1));
			for (int curso = 0; curso < matriz[0].length; curso++) {
				System.out.println();
				System.out.println("Curso "+(curso+1));
				for (int alumno = 0; alumno < matriz[0][0].length; alumno++) {
					matriz[centro][curso][alumno]=(int)(Math.random()*10)+1;
					sumacurso=sumacurso + matriz[centro][curso][alumno];
					System.out.print(matriz[centro][curso][alumno]+" ");
				}
				media=sumacurso/matriz[0][0].length;
				if (media>mediacursomax) {
					mediacursomax=media;
					centromax=centro;
					cursomax=curso;	
				}
				sumacentro=sumacentro + media;
				System.out.println(" ");
				System.out.println("La media del curso "+(curso+1)+" es "+media);
				sumacurso=0;
				media=0;
			}
			mediacentro=sumacentro/matriz[0].length;
			System.out.println();
			System.out.println("La media del centro "+(centro+1)+" es "+mediacentro);
			System.out.println();
			
			mediacentro=0;
			sumacentro=0;
		}
		System.out.println("La media maxima es del centro "+(centromax+1)+" del curso "+ (cursomax+1)+" con un "+mediacursomax);
		
	}

}
