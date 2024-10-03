
public class T1EJ31 {

	public static void main(String[] args) {
		
		int n=5;
		
		if((n%3==0 || n%5==0) && !(n%3==0 && n%5==0)) {
			System.out.println("Es multiplo de 3 o 5, pero no de 15");
		}else {
			System.out.println("Condicion contraria");
		}
			

	}

}
