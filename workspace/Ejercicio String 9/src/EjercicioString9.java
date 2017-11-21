import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjercicioString9 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*Escribir un programa que lea códigos de personas de 8 caracteres de modo que los cuatro primeros 
		 * sean numéricos y contenidos entre 1990-1995 (un año), el quinto carácter sea solo (H ó M) sexo, el 
		 * sexto un numero que representa el curso 1 ó 2 y los caracteres séptimo y octavo pueden tener 
		 * cualquier valor.Ddeben rechazarse los códigos que no cumplan estas condiciones, la finalización de 
		 * entrada de códigos se produce cuando se introduce el código “00000000”. Al final el programa debe 
		 * sacar un informe indicando cuántos hombres y mujeres hay matriculados en primero y segundo y 
		 * cuántos códigos correctos han sido leídos.
		 */
		Scanner teclado=new Scanner(System.in);
		System.out.println("Bienvenido al buscador de codigos.");
		System.out.println("Para empezar introduzca el año de la persona a la que pertenece el codigo (tiene que ser entre 1990 y 1995).");
		String genero="";
		int curso=0;
		int fin=0;
		int cerrar=00000000;
		int año=teclado.nextInt();
		while (!(año>1989 && año<1996)) {
			System.out.println("Asegurese de que el año introducido cumple los requisitos citado anteriormente.");
			año=teclado.nextInt();
		}
		if (año>1989 && año<1996) {
			System.out.println("A continuacion introduzca si la persona es hombre o mujer (H O M).");
			genero=teclado.next();
		}
		while (!(genero.equals("H") || genero.equals("M") || genero.equals("h") || genero.equals("m"))) {
			System.out.println("Asegurese de introducir hombre(H,h) o mujer(M,m) segun se ha especificado.");
			genero=teclado.next();
		}
		if (genero.equals("H") || genero.equals("M") || genero.equals("h") || genero.equals("m")){
			System.out.println("Ahora indice a que curso pertenece la persona (1 o 2).");
			genero=genero.toUpperCase();
			curso=teclado.nextInt();
		}
		while (!(curso==1||curso==2)) {
			System.out.println("Asegurese de introducir uno de los cursos disponibles. ");
			curso=teclado.nextInt();
		}
		if (curso==1||curso==2) {
			System.out.println("A continuacion se generaran los ultimos dos digitos segun el codigo ya introduzido, espere porfavor.");
		}
		Thread.sleep(2000);
		int digito=(int)(Math.random()*90)+9;
		System.out.println("Buscando digitos...");
		Thread.sleep(2000);
		System.out.println(digito);
		Thread.sleep(2000);
		System.out.println("El codigo que ha introducido es "+año+genero+curso+digito+" compruebe que es el correcto.");
		Thread.sleep(2000);
		System.out.println("Si desea finalizar la entrada de codigos marque 00000000.");
		fin=teclado.nextInt();
		if (fin==00000000) {
			System.out.println("Fin del Programa.");
			fin=teclado.nextInt();
		}
	}

}
