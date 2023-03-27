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
//
//        for (int i = 0; i >= -10; i -= 5) {
//            System.out.println(i);
//        }
//
//        for (long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }

//        exercise 2:

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz: " + i);
            } else if (i % 3 == 0) {
                System.out.println("Fizz: " + i);
            } else if (i % 5 == 0) {
                System.out.println("Buzz: " + i);
            } else {
                System.out.println(i);
            }
        }
    }
}
