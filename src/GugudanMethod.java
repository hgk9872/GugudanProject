
public class GugudanMethod {
	
	public static void calculate(int first, int second) {
		for(int i=2 ; i <= first ; i++) {
			System.out.println(i + "단");
			for(int j=1 ; j <= second ; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
	}
}
