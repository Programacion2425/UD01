import java.util.Scanner;

public class T1EJ8 {

	public static void main(String[] args) {
		double numero1;
		int numero2;
		double resultado;
		
		Scanner sc = new Scanner(System.in);
		numero1 = sc.nextDouble();
		
		numero2 = sc.nextInt();
		
		resultado = (numero1 + numero2) / 2;
		
		System.out.println(resultado);

	}

}
