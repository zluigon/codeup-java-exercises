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

    public static void main(String[] args) {
//        System.out.println("Addition:" + addition(1, 2));
//        System.out.println("Subtraction:" + subtraction(5, 3));
//        System.out.println("Multiplication: " + multiplication(6, 6));
//        System.out.println("Division: " + division(100, 5));
//        System.out.println("Modulus: " + modulus(13, 3));
       int num =  getInteger(1, 10);
        factorial(num);
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int userInput = scanner.nextInt();
        if (userInput > max || userInput < min) {
            System.out.printf("I'm sorry, %d is not within range.%n", userInput);
            return getInteger(min, max);
        }
        System.out.printf("Nice! %d is within the range.%n", userInput);
        return userInput;
    }

    public static void factorial(int number) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter a number: ");
//        int userInput = scanner.nextInt();

        long result = 1;

        for (int i = number; i > 0; i--) {
            result *= i;
        }
        System.out.printf("%d! = %d%n", number, result);

        System.out.println("Would you like to continue? [Y/N]");
        boolean userConfirm = scanner.next().equalsIgnoreCase("y");

        if (userConfirm) {
            int num =  getInteger(1, 10);
            factorial(num);
        } else {
            System.out.println("End.");
        }
    }
}

