import java.util.Scanner;

public class T1EJ5 {

	public static void main(String[] args) {

		//entero edad
		int edad;
		int diferenciaEdad;
		
		//escribir("¿Cuántos años tienes?")
		System.out.println("¿Cuantos años tienes?");
		
		//leer(edad)
		Scanner sc = new Scanner(System.in);
		edad= sc.nextInt();
		
		//escribir(18-edad)
		diferenciaEdad = 18 - edad;
		System.out.println("Te quedan "+diferenciaEdad+" años para llegar a 18");
		
	}

}
