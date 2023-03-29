public class Person {
    private String name;

    public String getName() {
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name) {
//TODO: change the name field to the passed value
        this.name = name;
    }

    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.printf("Hello, %s!%n", this.name);
    }

    public Person(String personName) {
        this.name = personName;
    }

    public static void main(String[] args) {
        Person Luis = new Person("Luis");
        System.out.println("Person's name is: " + Luis.getName());
        Luis.sayHello();


//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//        System.out.println(person1);
//        System.out.println(person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
}
