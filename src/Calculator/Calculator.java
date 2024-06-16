package Calculator;

import java.util.Scanner;

public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Sum: " + calculator.sum(num1, num2));
        System.out.println("Difference: " + calculator.subtract(num1, num2));
        System.out.println("Product: " + calculator.multiply(num1, num2));
    
        try {
            System.out.println("Quotient: " + calculator.divide(num1, num2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

	public Integer add(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}
}
