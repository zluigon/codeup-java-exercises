package shapes;

import java.util.Scanner;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Input test = new Input();

        boolean userCheck;
        do {
            System.out.print("Enter the radius of a circle: ");
            int userRadius = scanner.nextInt();

            Circle circle = new Circle(userRadius);

            System.out.printf("Area: %.2f%n", circle.getArea());
            System.out.println("~~~~~");
            System.out.printf("Circumference: %.2f%n", circle.getCircumference());

            userCheck = test.yesNo();
        } while (userCheck);
    }

}
