package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {

//        importing Input class by creating new Input obj
        Input input = new Input();

//        creating an array of movies with movie objs and giving them the value of the moviesArray class with the method .findAll that creates new movie objs
        Movie[] movies = MoviesArray.findAll();

        boolean userContinue;

        do {
            System.out.printf("What would you like to do? %n%n0 - exit %n1 - view all movies %n2 - view movies in the animated category %n3 - view all movies in the drama category %n4 - view movies in the horror category %n5 - view movies in the scifi category %n");
            System.out.println();

            System.out.print("Enter your choice: ");
            int userNumber = input.getInt(0, 5);
            System.out.println();
            if (userNumber == 1) {
                System.out.println("Listing all movies:");
                System.out.println();
                for (Movie movie : movies) {
                    System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
                }
            } else if (userNumber == 2) {
                System.out.println("Listing all animated movies:");
                System.out.println();
                for (Movie movie : movies) {
                    if (movie.getCategory().equals("animated")) {
                        System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
                    }
                }
            } else if (userNumber == 3) {
                System.out.println("Listing all drama movies:");
                System.out.println();
                for (Movie movie : movies) {
                    if (movie.getCategory().equals("drama")) {
                        System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
                    }
                }
            } else if (userNumber == 4) {
                System.out.println("Listing all horror movies:");
                System.out.println();
                for (Movie movie : movies) {
                    if (movie.getCategory().equals("horror")) {
                        System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
                    }
                }
            } else if (userNumber == 5) {
                System.out.println("Listing all scifi movies:");
                System.out.println();
                for (Movie movie : movies) {
                    if (movie.getCategory().equals("scifi")) {
                        System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
                    }
                }
            } else {
                System.out.println("ending app");
            }
            System.out.println();
            userContinue = input.yesNo();
        } while (userContinue);
    }
}
