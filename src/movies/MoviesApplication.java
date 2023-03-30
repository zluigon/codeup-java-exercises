package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {

    public static Movie[] addMovie(Movie[] movies, Movie movie) {
        movies = Arrays.copyOf(movies, movies.length + 1);
        movies[movies.length - 1] = movie;
        return movies;
    }

    public static void main(String[] args) {

//        importing Input class by creating new Input obj
        Input input = new Input();

//        creating an array of movies with movie objs and giving them the value of the moviesArray class with the method .findAll that creates new movie objs
        Movie[] movies = MoviesArray.findAll();

        boolean userContinue;
        int userNumber;
        System.out.println(movies.length);
        do {
            System.out.printf("What would you like to do? %n%n0 - exit %n1 - view all movies %n2 - view movies in the animated category %n3 - view all movies in the drama category %n4 - view movies in the horror category %n5 - view movies in the scifi category %n");
            System.out.println();

            System.out.print("Enter your choice: ");
            userNumber = input.getInt(0, 5);

            input.getString();
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
                System.out.println("Closing Application");
                break;
            }

            System.out.println();
            System.out.println("Didn't see your movie..");
            System.out.println("Would you like to add it? [Y/N]");
            boolean userAddMovie = input.yesNo();

            if (userAddMovie) {
                System.out.print("Enter movie title: ");

                String userMovieTitle = input.getString();

                System.out.print("Enter movie category: ");
                String userMovieCategory = input.getString();

                Movie newMovie = new Movie(userMovieTitle, userMovieCategory);
                movies = addMovie(movies, newMovie);
            }

            System.out.println();
            System.out.println("Would you like the options listed again? [Y/N]");
            userContinue = input.yesNo();
        } while (userContinue);
        System.out.println("Thank you for using our app.");
    }
}
