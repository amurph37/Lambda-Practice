import java.util.function.BinaryOperator;

public class LambdaExpressions {

    public static void main(String[] args) {
        // Addition
        BinaryOperator<Integer> addition = (a, b) -> a + b;
        System.out.println("Addition: " + addition.apply(5, 3)); // Output: 8

        // Subtraction
        BinaryOperator<Integer> subtraction = (a, b) -> a - b;
        System.out.println("Subtraction: " + subtraction.apply(5, 3)); // Output: 2

        // Multiplication
        BinaryOperator<Integer> multiplication = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiplication.apply(5, 3)); // Output: 15

        // Division
        BinaryOperator<Integer> division = (a, b) -> a / b;
        System.out.println("Division: " + division.apply(6, 3)); // Output: 2
    }
}
