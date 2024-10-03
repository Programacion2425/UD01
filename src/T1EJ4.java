import java.util.Scanner;

public class T1EJ4{ 
	public static void main(String[] args) { 
		
		//entero edad
		int edad;

		//escribir("Introduce tu edad:")
		System.out.println("Introduce tu edad");

		//leer(edad)
		Scanner sc = new Scanner(System.in);
		edad= sc.nextInt();

		//escribir(edad+1)
		edad = edad+1;
		System.out.println("Tu edad el proximo año es: "+ edad);
	}
 }