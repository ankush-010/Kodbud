import java.util.Scanner;

public class Simplecalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("      Simple Calculator      ");
        System.out.println("=============================");

        System.out.print("Enter first number:  ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("\nSelect Operation:");
        System.out.println("  1. Addition       (+)");
        System.out.println("  2. Subtraction    (-)");
        System.out.println("  3. Multiplication (*)");
        System.out.println("  4. Division       (/)");
        System.out.print("Enter choice (1-4): ");
        int choice = scanner.nextInt();

        double result;
        String operation;

        switch (choice) {
            case 1:
                result = num1 + num2;
                operation = "+";
                break;
            case 2:
                result = num1 - num2;
                operation = "-";
                break;
            case 3:
                result = num1 * num2;
                operation = "*";
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("\nError: Cannot divide by zero!");
                    scanner.close();
                    return;
                }
                result = num1 / num2;
                operation = "/";
                break;
            default:
                System.out.println("\nInvalid choice! Please select 1-4.");
                scanner.close();
                return;
        }

        System.out.println("\n-----------------------------");
        System.out.printf("  %.2f %s %.2f = %.2f%n", num1, operation, num2, result);
        System.out.println("-----------------------------");

        scanner.close();
    }
}