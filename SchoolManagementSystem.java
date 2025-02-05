abstract class Person {
    abstract void performDuty();
}
class Student extends Person {
    @Override
    void performDuty() {
        System.out.println("Student is studying.");
    }
}
class Teacher extends Person {
    @Override
    void performDuty() {
        System.out.println("Teacher is teaching.");
    }
}

// -> Main class to demonstrate runtime polymorphism
public class SchoolManagementSystem {
    public static void main(String[] args) {
        Person[] persons = new Person[4];
        persons[0] = new Student();
        persons[1] = new Teacher();
        persons[2] = new Student();
        persons[3] = new Teacher();
        
        for (Person person : persons) {
            person.performDuty();
        }
    }
}
