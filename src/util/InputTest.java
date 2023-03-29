package util;

public class InputTest {
    public static void main(String[] args) {
        Input test = new Input();

        System.out.print("Enter input: ");
        String userInput = test.getString();
        System.out.println(userInput);

        System.out.println("Continue? [Y/N]");
        boolean userBool = test.yesNo();
        System.out.println(userBool);

        System.out.print("Enter a number between 1-10: ");
        int userInt = test.getInt(1,10);
        System.out.println(userInt);

        System.out.print("Enter a number between 0-1: ");
        double userDbl = test.getDouble(0,1);
        System.out.println(userDbl);
    }
}
