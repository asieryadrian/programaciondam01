import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjercicioString10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escribir un programa que lea una frase (m�ximo 60 caracteres) y diga cu�ntas letras 
		 * distintas tiene y la frecuencia de las mismas, para homogeneizar el conjunto de 
		 * letras debemos trabajar solo con may�sculas.
		 */
		System.out.println("Porfavor introduzca una frase para ver cuantas letras de cada tiene:");
		Scanner teclado=new Scanner(System.in);
		String frase=teclado.nextLine();
		int matriz[]=new int[27];
		String abecedario="ABCDEFGHIJKLMN�OPQRSTUVWXYZ";
		int contadorletras=0;
		int letra=0;
		int caracterespecial=0;
		int sumaletras=0;
		while (frase.length()>60) {
			System.out.println("Introduzca una frase de menos de 60 caracteres.");
			frase=teclado.nextLine();
		}
		frase=frase.toUpperCase();
		for (int i = 0; i < frase.length(); i++) {
			if (abecedario.indexOf(frase.substring(i, i+1))!=-1) {
				letra=abecedario.indexOf(frase.substring(i, i+1));
				matriz[letra]=matriz[letra]+1;
			}else{
				caracterespecial++;
			}
				
		}
		for (int i = 0; i < matriz.length; i++) {
			if (matriz[i]!=0) {
				System.out.println("Hay "+matriz[i]+" "+(abecedario.substring(i, i+1)));
			}
			sumaletras=sumaletras+matriz[i];
		}
		System.out.println("Hay "+sumaletras+" letras.");
		System.out.println("Hay "+caracterespecial+" caracteres especiales.(espacios,giones,comas,puntos, etc...)");
		
	}

}
