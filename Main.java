// Name: Sugam Sharma
// PRN: 21070126129
// Batch: AIML(B-3)

import java.util.Scanner;
public class Main {
	static double[] numbers;
	static double[] array;
	static double[] result;
	public static void main(String[] args) throws Exception{
		int m = 1;
		while(m==1) {
			UserInput input = new UserInput();
			Calculator calc = new Calculator();
			//Let's user choose whether two numbers or more
			System.out.println("Operations on two numbers or more(2/m):");
			Scanner sc = new Scanner(System.in);
			char choice = sc.next().charAt(0);
			//If two numbers then lets user choose between addNum(), subtractNum(), multiplyNum(), divideNum() functions.
			if(choice == '2') {
				numbers = input.inputTwoNumbers();
				System.out.println("First number is " + numbers[0]);
				System.out.println("Second number is " + numbers[1]);
				System.out.println("\nMENU\n====");
				System.out.println("Type + for addition");
				System.out.println("Type - for subtraction");
				System.out.println("Type * for multiplication");
				System.out.println("Type / for division");
				char operator = sc.next().charAt(0);
				switch(operator){
					case '+':
						result = calc.addNum(numbers);
						System.out.println("Sum is " + result[0]);
						break;
					case '-':
						result = calc.subtractNum(numbers);
						System.out.println("Difference is " + result[0]);
						break;
					case '*':
						result = calc.multiplyNum(numbers);
						System.out.println("Product is " + result[0]);
						break;
					case '/':
						result = calc.divideNum(numbers);
						System.out.println("Fraction is " + result[0]);
						break;
					default:
						System.out.println("wrong input");
				}
			// If more than two numbers, lets the user choose between addArr(), vasrArr(), stdArr() functions.
			} else if(choice == 'm') {
				array = input.inputMultipleNumbers();
				System.out.println("Array Operations:");
				System.out.println("Type + for addition");
				System.out.println("Type v for variance");
				System.out.println("Type s for standard deviation");
				char newop = sc.next().charAt(0);
				switch(newop) {
					case '+':
						result = calc.addArr(array);
						System.out.println("Addidtion of the array is: " + result[0]);
						break;
					case 'v':
						result = calc.varArr(array);
						System.out.println("Variance of the array is: " + result[0]);
						break;
					case 's':
						result = calc.stdArr(array);
						System.out.println("Standard Deviation of the array is: " + result[0]);
						break;
					default:
						System.out.println("Not a valid array operation");
					}
			}
		// Asks user if to continue with the program or stop
		System.out.println("Do you want to continue?(1/0)");
		m = sc.nextInt();
		}
	}
}