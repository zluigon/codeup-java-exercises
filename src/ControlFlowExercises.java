public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//
//        while ( i <= 15) {
//            System.out.println("i is: "+ i);
//            i++;
//        }

//        int i = 0;
//        do{
//            System.out.println(i);
//            i += 2;
//        }while (i <= 100);

        for (int i = 0; i <= 100; i+=2 ){
            System.out.println(i);
        }

//        int i = 100;
//        do{
//            System.out.println(i);
//            i -= 5;
//        }while (i >= -10);

        for(int i = 0; i >= -10; i -= 5){
            System.out.println(i);
        }

//        long i = 2; // why long vs int?
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);

        for (long i = 2; i < 1000000; i *= i){
            System.out.println(i);
        }
    }
}
