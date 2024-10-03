import java.util.Scanner;

public class T1EJ6 {

	public static void main(String[] args) {
		//entero anioActual
		//entero anioNacimiento
		//entero edad
		
		int anioActual;
		int anioNacimiento;
		int edad;
		
		//escribir("introduce anio actual")
		System.out.print("Introduce anio actual: ");
		
		//leer(anioActual)
		Scanner teclado = new Scanner(System.in);
		anioActual = teclado.nextInt();
		
		//escribir("introduce anio nacimiento")
		System.out.print("Introduce anio nacimiento: ");
		
		//leer(anioNacimiento)
		anioNacimiento = teclado.nextInt();
		
		//edad = anioActual - anioNacimiento
		edad = anioActual - anioNacimiento;
		
		//escribir(edad)
		System.out.println(edad);
		
	}

}
