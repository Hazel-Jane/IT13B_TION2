package Midterms;

import java.util.Scanner;

public class Simple_Calculator_TION_IT13B {

    static double add(double x, double y) {
        return x + y;
    }

    static double subtract(double x, double y) {
        return x - y;
    }

    static double multiply(double x, double y) {
        return x * y;
    }

    static double divide(double x, double y) {
        if (y == 0) {
            System.out.println("Error! Division by zero is not allowed.");
            return 0;

        }
        return x / y;
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            double num1 = in.nextDouble();
            
            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = in.next().charAt(0);
            
            System.out.print("Enter second number: ");
            double num2 = in.nextDouble();
            
            double result;
            
            switch (operator) {
                case '+' -> result = add(num1, num2);
                case '-' -> result = subtract(num1, num2);
                case '*' -> result = multiply(num1, num2);
                case '/' -> result = divide(num1, num2);
                default -> {
                    System.out.println("Invalid operator!");
                    return;
                }
            }
            
            System.out.println("The result is: " + result);
        }
    }

}
