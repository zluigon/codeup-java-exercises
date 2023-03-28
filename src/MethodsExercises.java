import java.util.Scanner;

public class MethodsExercises {
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

//    public static void main(String[] args) {
//        System.out.println("Addition:" + addition(1, 2));
//        System.out.println("Subtraction:" + subtraction(5, 3));
//        System.out.println("Multiplication: " + multiplication(6, 6));
//        System.out.println("Division: " + division(100,5));
//        System.out.println("Modulus: " + modulus(13,3));
//    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int userInput = scanner.nextInt();
        if (userInput > max || userInput < min) {
            System.out.printf("I'm sorry, %d is not within range.%n", userInput);
            return getInteger(min, max);
        }
        System.out.printf("Nice! %d is within the range.", userInput);
        return userInput;
    }

    public static void main(String[] args) {
        getInteger(14, 25);
    }


}

