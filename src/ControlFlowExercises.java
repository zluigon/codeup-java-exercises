import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        exercise 1a:

//        int i = 5;
//        while ( i <= 15) {
//            System.out.println("i is: "+ i);
//            i++;
//        }

//        exercise 1b:

//        int i = 0;
//        do{
//            System.out.println(i);
//            i += 2;
//        }while (i <= 100);

//        int i = 100;
//        do{
//            System.out.println(i);
//            i -= 5;
//        }while (i >= -10);

//        long i = 2; // why long vs int?
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);

//        exercise 1c:
//
//        for (int i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        }

//        for (int i = 0; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        for (long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }

//        exercise 2:

//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz: " + i);
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz: " + i);
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz: " + i);
//            } else {
//                System.out.println(i);
//            }
//        }

//        exercise 3:

        Scanner scanner = new Scanner(System.in);

//        System.out.println("What number would you like to up to?");
//        int userInput = scanner.nextInt();

//        System.out.println("Would you like to continue? [Y/N]");
//        String userConfirm = scanner.next();

//        if (userConfirm.equalsIgnoreCase("Y")) {
//            System.out.println("Number entered: " + userInput);
//            System.out.println("number | squared | cubed");
//            System.out.println("----- | ----- | -----");
//            for (int i = 1; i <= userInput; i++) {
//                int squared = i * i;
//                int cubed = i * i * i;
//                System.out.printf("%d     | %d    | %d    %n", i, squared, cubed);
//            }
//        } else {
//            System.out.println("End");
//        }

//        exercise 4:

        System.out.println("Enter a numerical grade from 0 to 100");
        int userInput = scanner.nextInt();

        System.out.println("Would you like to continue? [Y/N]");
        String userConfirm = scanner.next();

        if (userConfirm.equalsIgnoreCase("Y")) {
            System.out.println("Grade entered: " + userInput);
            if (userInput >= 88) {
                if(userInput >= 99){
                    System.out.println("A+");
                } else {
                    System.out.println("A-");
                }
            } else if (userInput >= 80) {
                if (userInput >= 85) {
                    System.out.println("B+");
                } else {
                    System.out.println("B-");
                }
//                System.out.println("B");
            } else if (userInput >= 67) {
                if (userInput >= 75) {
                    System.out.println("C+");
                } else {
                    System.out.println("C-");
                }
//                System.out.println("C");
            } else if (userInput >= 60) {
//                System.out.println("D");
                if (userInput >= 64){
                    System.out.println("D+");
                } else {
                    System.out.println("D-");
                }
            } else if (userInput >= 0) {
                System.out.println("F");
            }
        } else {
            System.out.println("End");
        }
    }
}
