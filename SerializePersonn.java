import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class SerializePerson {
    public static void main(String[] args) {
        Person p1 = new Person("Daksh Mehrotra", 20);

        // Serialization
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.txt"))) {
            out.writeObject(p1);
            System.out.println("Person object serialized.");
        } catch (IOException e) {
            System.out.println("Error serializing object.");
        }

        // Deserialization
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.txt"))) {
            Person p2 = (Person) in.readObject();
            System.out.println("Deserialized Person:");
            p2.display();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error deserializing object.");
        }
    }
}
