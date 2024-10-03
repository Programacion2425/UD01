
/*
T1EJ9 - Escribe un programa que calcule la longitud y el 
área de una circunferencia. 
Para ello, el usuario debe introducir el radio 
(puede haber decimales).
Longitud = 2*Pi*radio
Area = Pi*radio*radio
*/

import java.util.Scanner;

public class T1EJ9 {

	public static void main(String[] args) {
		final double PI = 3.1416;
		double radio;
		double longitud;
		double area;
		
		Scanner sc = new Scanner(System.in);
		radio = sc.nextDouble();
		
		 longitud = 2 * PI * radio;
		 area = PI * radio * radio;
		 
		 System.out.println(longitud);
		 System.out.println(area);

	}

}
