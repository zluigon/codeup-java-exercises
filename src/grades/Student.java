package grades;

import java.util.ArrayList;

public class Student {

    private String name;

    private ArrayList<Integer> grades;

    public Student(String name, int grade) {
        this.name = name;
        this.grades = new ArrayList<>();
        grades.add(grade);
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double gradeTotal = 0;

        for (Integer grade : grades) {
            gradeTotal += grade;
        }
        return gradeTotal / grades.size();
    }

}
