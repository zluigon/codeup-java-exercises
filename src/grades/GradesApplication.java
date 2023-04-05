package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GradesApplication {
    public static void main(String[] args) {

        HashMap<String, Object> students = new HashMap<>();

        Student studentOne = new Student("Luis", 87);
        studentOne.addGrade(94);
        studentOne.addGrade(91);

        Student studentTwo = new Student("David", 94);
        studentTwo.addGrade(98);
        studentTwo.addGrade(91);

        Student studentThree = new Student("Austin", 96);
        studentThree.addGrade(93);
        studentThree.addGrade(99);

        Student studentFour = new Student("Thomas", 98);
        studentFour.addGrade(92);
        studentFour.addGrade(94);

        students.put("zGon", studentOne);
        students.put("daviB", studentTwo);
        students.put("AusJin", studentThree);
        students.put("Mezcal", studentFour);

        Input input = new Input();

        System.out.println("Welcome!\n");

        boolean userBool2;

        do {
            System.out.println("Options: \n\t0 - exit\n\t1 - search for student\n\t2 - view all student grades\n\t3 - view class average\n\t4 - print student list in csv format\n");

            int userSelect = input.getInt(0, 4);


            input.getString();
            if (userSelect == 1) {

                boolean userBool;
                do {
                    System.out.println("Here are the GitHub usernames of our students:\n");

                    // .keySet() iterates once for every key in the data set, returning a set of keys
                    for (String student : students.keySet()) {
                        System.out.printf("|%s| ", student);
                    }

                    System.out.println("\n\nWhat student would you like to see more information on?");

                    String userInput = input.getString();

                    if (!students.containsKey(userInput)) {
                        System.out.printf("Sorry, no student found with the GitHub username of '%s'.\n\n", userInput);
                    } else {
                        Student student = (Student) students.get(userInput);
                        System.out.printf("\tName: %s - GitHub Username: %s\n\tGrades: %s\n\tCurrent Average: %.1f\n\n", student.getName(), userInput, student.getGrades(), student.getGradeAverage());
                    }

                    System.out.println("Would you like to see another student? [Y/N]");
                    userBool = input.yesNo();

                } while (userBool);

            } else if (userSelect == 2) {

                for (Map.Entry<String, Object> student : students.entrySet()) {
                    Student studentEntry = (Student) student.getValue();
                    System.out.printf("\tName: %s, Grades: %s\n", studentEntry.getName(), studentEntry.getGrades());
                }

            } else if (userSelect == 3) {

                ArrayList<Integer> classGrades = new ArrayList<>();

                for (Map.Entry<String, Object> student : students.entrySet()) {
                    Student studentEntry = (Student) student.getValue();
                    classGrades.addAll(studentEntry.getGrades());
                }

                double classSum = 0;

                for (Integer grade : classGrades) {
                    classSum += grade;
                }
                System.out.printf("\tClass Average: %.2f", classSum / classGrades.size());

            } else if (userSelect == 4) {

                System.out.println("\tname,github_username,average");
                // .entrySet() iterates over all entries, returns set of key-value mappings
                for (Map.Entry<String, Object> student : students.entrySet()) {
                    String userList = student.getKey();
                    Student studentEntry = (Student) student.getValue();
                    System.out.printf("\t%s,%s,%.1f\n", studentEntry.getName(), userList, studentEntry.getGradeAverage());
                }
            }

            System.out.println("\n\nWould you like to see menu options? [Y/N]");
            userBool2 = input.yesNo();

        } while (userBool2);

        System.out.println("\nGoodbye, and have a wonderful day!");
    }
}
