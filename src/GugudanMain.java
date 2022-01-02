import java.util.Scanner;

public class GugudanMain {

	public static void main(String[] args) {
		//사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력
		//"8,7"과 같은 문자열을 입력해서 팔칠단을 구현
		
		System.out.println("값을 입력하시오 : ");
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		String splitedValue[] = inputValue.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		GugudanMethod.calculate(first, second);
		
	}
}
