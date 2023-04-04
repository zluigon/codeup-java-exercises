package grades;

public class StudentTest {


    public static void main(String[] args) {

        Student studentOne = new Student("Luis", 88);
        Student studentTwo = new Student("David", 93);
        Student studentThree = new Student("Austin", 96);

        studentOne.addGrade(72);
        studentOne.addGrade(98);
        studentTwo.addGrade(92);
        studentThree.addGrade(85);

        System.out.printf("Name: %s | Grades: %s | AVG: %d\n", studentOne.getName(), studentOne.grades, studentOne.getGradeAverage());

        System.out.printf("Name: %s | Grades: %s | AVG: %d\n", studentTwo.getName(), studentTwo.grades, studentTwo.getGradeAverage());

        System.out.printf("Name: %s | Grades: %s | AVG: %d\n", studentThree.getName(), studentThree.grades, studentThree.getGradeAverage());


    }
}

