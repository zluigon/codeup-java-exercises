package grades;

import util.Input;

import java.util.HashMap;

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
                System.out.printf("Name: %s - GitHub Username: %s\nGrades: %s\nCurrent Average: %.1f\n\n", student.getName(), userInput,student.getGrades(), student.getGradeAverage());
            }

            System.out.println("Would you like to see another student?");
            userBool = input.yesNo();

        } while (userBool);

        System.out.println("Goobye, and have a wonderful day!");


        // .entrySet() returns the set of key-value mappings
//        for (Map.Entry<String, Object> student : students.entrySet()) {
//            String userList = student.getKey();
//            Student student1 = (Student) student.getValue();
//            System.out.printf("%s, %s, %d\n",student1.getName(), userList, student1.getGradeAverage());
//        }
//        System.out.println();


    }
}
