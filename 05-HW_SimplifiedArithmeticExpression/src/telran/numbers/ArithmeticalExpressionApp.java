package telran.numbers;

import java.util.Scanner;
import static telran.numbers.ArithmeticExpression.*;

public class ArithmeticalExpressionApp {
	
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.println("Enter arithmetic expression");
				String arithmeticalExpression = scanner.nextLine();
				if (arithmeticalExpression.equals("exit")) {
					break;
				}
				double res = compute(arithmeticalExpression);
				System.out.println(res);
			}
		}
	}
}
