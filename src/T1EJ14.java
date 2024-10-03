
/*
 Escribe un programa que pida al usuario un número y 
 devolverá true si es par y false si no es par. 
 No utilizar condicionales.
 */

import java.util.Scanner;

public class T1EJ14 {

	public static void main(String[] args) {

		// entero numero
		// booleano esPar
		int numero;
		boolean esPar;

		// leer(numero)
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();

		// esPar = (numero % 2 == 0)
		if(numero % 2 == 0){
			System.out.println("El número introducido es par");
		}else {
			System.out.println("El número introducido es impar");
		}
		
	}

}
