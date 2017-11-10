import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjercicioString5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String frase=teclado.nextLine();
		while (frase.length()>80) {
			System.out.println("Porfavor introduzca una frase que no sobrepase los 80 caracteres.");
			frase=teclado.nextLine();
		}
		String posicion;
		String FrasePar="";
		String FraseImpar="";
		
		for (int i = 0; i < frase.length(); i++) {
			if (i%2==0) {
				posicion=frase.substring(i, i+1);
				FrasePar=FrasePar.concat(posicion);
			} else {
				posicion=frase.substring(i, i+1);
				FraseImpar=FraseImpar.concat(posicion);
			}
		}
		System.out.println(FrasePar+" Son las letras en posiciones pares.");
		System.out.println(FraseImpar+" Son las letras en posiciones impares.");
	}

}
