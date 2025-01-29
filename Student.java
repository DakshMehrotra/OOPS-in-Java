class Student {
    String name;
    int age;

    // Default Constructor
    public Student() {
        this.name = "Default Name";
        this.age = 18;
    }

    // Parameterized Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating object using the default constructor
        Student student1 = new Student();
        student1.display();

        // Creating object using the parameterized constructor
        Student student2 = new Student("John Doe", 20);
        student2.display();
    }
}
