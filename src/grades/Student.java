package grades;

import java.util.ArrayList;

public class Student {

    private String name;

    ArrayList<Integer> grades;

    public Student(String name, Integer grade) {
        this.name = name;
        this.grades = new ArrayList<>();
        grades.add(grade);
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public int getGradeAverage() {
        int gradeAverage = 0;

        for (Integer grade : grades) {
            gradeAverage += grade;
        }
        return gradeAverage / grades.size();
    }

}
