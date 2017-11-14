import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjericicoString9B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int persona=1;
		int bucle1=0;
		String cerrar="00000000";
		
		System.out.println("Bienvenido al buscador de codigos.");
		System.out.println("Introduzca un codigo que contenga 8 digitos que cumplan los siguientes requisitos:");
		System.out.println("   -Los 4 primeros digitos deben ser un a�o comprendido entre 1990 y 1995.");
		System.out.println("   -El quinto digito debe ser H si es hombre o M si es mujer.");
		System.out.println("   -El sexto digito el curso al que pertenece, primero(1) o segundo(2).");
		System.out.println("   -Por ultimo los dos ultimos digitos deben ser aleatorios, ya sean numeros o letras.");
		System.out.println("   -Cuando quiera terminar el programa pulse 00000000");

		while (bucle1==0) {
			System.out.println("Introduzca el codigo de la persona "+persona+".");
			String codigo=teclado.next();
			while (codigo.length()!=8) {
				System.out.println("El codigo no tiene 8 digitos.");
				codigo=teclado.next();
			}
			if (codigo.equals(cerrar)) {
				System.out.println("Fin Programa.");
				break;
			}
			int a�o=Integer.parseInt(codigo.substring(0,4));
			while (!(a�o>1989 && a�o<1996)) {
				System.out.println("Asegurese de que el a�o introducido cumple los requisitos citado anteriormente.");
				a�o=teclado.nextInt();
			}
			String comodin = Integer.toString(a�o);
			codigo=codigo.replace(codigo.substring(0,4),comodin);
			
			String genero=codigo.substring(4,5);
			while (!(genero.equals("H") || genero.equals("M") || genero.equals("h") || genero.equals("m"))) {
				System.out.println("Asegurese de introducir hombre(H,h) o mujer(M,m) segun se ha especificado.");
				genero=teclado.next();
			}
			codigo=codigo.replace(codigo.substring(4,5),genero);
			int curso=Integer.parseInt(codigo.substring(5,6));
			while (!(curso==1||curso==2)) {
				System.out.println("Asegurese de introducir uno de los cursos disponibles. ");
				curso=teclado.nextInt();
			}
			comodin = Integer.toString(curso); 
			codigo=codigo.replace(codigo.substring(5,6),comodin);
			
			System.out.println("El codigo que ha introducido es "+codigo);
			persona++;
			
		}
	}
}
