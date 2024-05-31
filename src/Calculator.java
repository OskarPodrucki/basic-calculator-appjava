import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculator");
        System.out.println("Please enter the first number:");
        double firstNumber = scanner.nextDouble();

        System.out.println("Choose your operation (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        System.out.println("Now, enter the second number:");
        double secondNumber = scanner.nextDouble();

        double result = 0;

        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                System.out.println("Adding...");
                break;
            case '-':
                result = firstNumber - secondNumber;
                System.out.println("Subtracting...");
                break;
            case '*':
                result = firstNumber * secondNumber;
                System.out.println("Multiplying...");
                break;
            case '/':
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                    System.out.println("Dividing...");
                } else {
                    System.out.println("Error: Division by zero");
                    return;
                }
                break;
            default:
                System.out.println("Error: Unknown operator!");
                return;
        }

        System.out.println("The result is: " + result);
    }
}
