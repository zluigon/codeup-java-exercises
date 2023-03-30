import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson (Person[] people, Person person){
        people = Arrays.copyOf(people, people.length + 1);
        people[people.length - 1] = person;
        return people;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];

        people[0] = new Person("Luis");
        people[1] = new Person("Sean");
        people[2] = new Person("Kaleb");

        Person kenneth = new Person("Kenneth");
        people = addPerson(people, kenneth);

        for (Person person : people){
            System.out.println(person.getName());
        }

    }
}
