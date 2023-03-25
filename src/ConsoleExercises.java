import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.%n", pi);

        Scanner scanner = new Scanner(System.in);
//        scanner.useDelimiter("\n");


        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();
        System.out.printf("You entered the number: %d%n", userInput);

//        scanner.nextLine();

        System.out.println("Enter three words: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        System.out.printf("The words you entered are:%n %s%n %s%n %s%n", word1, word2, word3);

        scanner.nextLine(); //needed to move on. why?

        System.out.println("Enter a sentence: ");
        String userSentence = scanner.nextLine();
        System.out.printf("The sentence you entered was: %s%n", userSentence);

        System.out.println("Enter room length:");
        String lInput = scanner.nextLine();
        System.out.println("Enter room width:");
        String wInput = scanner.nextLine();


        double length = Double.parseDouble(lInput);
        double width = Double.parseDouble(wInput);

        double area = length * width;
        double perimeter = (length + width) * 2;
        double volume;

        System.out.printf("Length: %.2f, Width: %.2f, Area: %.2f, Perimeter: %.2f", length, width, area, perimeter);

    }
}
