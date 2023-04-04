package grades;

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

        System.out.println(students);
    }
}
