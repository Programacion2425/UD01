
/*inicializa una variable con una letra, 
 * devolver su correspondiente mayúscula*/

public class T1EJ11 {
	
	public static void main(String[] args) {
		
		char letra = 'z';
		int diferencia = (int)'a' - (int)'A'; //diferencia entre una letra minuscula y una mayúscula en ASCII
		
		//alternativa con varias variables
		int letraAscii = (int)letra;
		int letraMayAscii = letraAscii - diferencia;
		char letraMay = (char)letraMayAscii;
		
		//alternativa una linea
		//char letraMay = (char)((int)letra - 32);
		
		System.out.println(letraMay);
		
	}

}
