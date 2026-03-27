package calculator;
import java.util.Scanner;

public class Calculator {
    public static double add(double a, double b){return a+b;}
    public static double subtract(double a, double b){return a-b;}
    public static double multiply(double a, double b){return a*b;}
    public static double divide(double a, double b){if (b == 0) throw new ArithmeticException("cannot divide by zero");return a/b;}

    public static double squareRoot(double a){return Math.sqrt(a);}
    public static double power(double a, double b){return Math.pow(a,b);}
    public static double modulo(double a, double b){return a%b;}

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Java Calculator ===");
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.println("Enter operator (+, -, *, /, sqrt, pow, %): ");
        String operator = scanner.next();
        double result;

        if (operator.equals("squareRoot")){result = squareRoot(a);}
        else {
            System.out.print("Enter second number: ");
            double b = scanner.nextDouble();
            result = switch (operator) {
                case "+" -> add(a, b);
                case "-" -> subtract(a, b);
                case "*" -> multiply(a, b);
                case "/" -> divide(a, b);
                case "pow" -> power(a, b);
                case "modulo" -> modulo(a, b);
                default -> throw new IllegalArgumentException("Unknown operator: " + operator);
            };
        }
        System.out.println("Result: " + result);
        scanner.close();
    }
}