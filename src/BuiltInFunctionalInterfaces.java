import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class BuiltInFunctionalInterfaces {

    public static void main(String[] args) {
        // Predicate
        Predicate<String> isLong = str -> str.length() > 5;
        System.out.println("Is 'HelloWorld' long? " + isLong.test("HelloWorld")); // Output: true

        // Function
        Function<Integer, Integer> square = x -> x * x;
        System.out.println("Square of 4: " + square.apply(4)); // Output: 16

        // Consumer
        Consumer<String> printMessage = message -> System.out.println("Message: " + message);
        printMessage.accept("Hello, Lambda!"); // Output: Hello, Lambda!

        // Supplier
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println("Random value: " + randomValue.get());
    }
}
