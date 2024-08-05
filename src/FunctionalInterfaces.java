@FunctionalInterface
interface Operation {
    int perform(int a, int b);
}

public class FunctionalInterfaces {

    public static void main(String[] args) {
        // Addition
        Operation add = (a, b) -> a + b;
        System.out.println("Addition: " + add.perform(5, 3)); // Output: 8

        // Subtraction
        Operation subtract = (a, b) -> a - b;
        System.out.println("Subtraction: " + subtract.perform(5, 3)); // Output: 2

        // Multiplication
        Operation multiply = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiply.perform(5, 3)); // Output: 15

        // Division
        Operation divide = (a, b) -> a / b;
        System.out.println("Division: " + divide.perform(6, 3)); // Output: 2
    }
}
