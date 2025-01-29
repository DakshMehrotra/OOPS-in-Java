class University {
    static String universityName = "Global University"; // Static variable shared among all instances
    String studentName; // Non-static variable unique to each instance

    // Constructor to initialize studentName
    public University(String studentName) {
        this.studentName = studentName;
    }

    // Static method to display the university name
    static void displayUniversityName() {
        System.out.println("University Name: " + universityName);
    }

    // Non-static method to display student details
    void displayStudentDetails() {
        System.out.println("Student Name: " + studentName + ", University: " + universityName);
    }

    public static void main(String[] args) {
        // Calling the static method (no object required)
        University.displayUniversityName(); // ✅ Allowed

        // Creating multiple student objects
        University student1 = new University("Nitanshu");
        University student2 = new University("Nit");
        University student3 = new University("Anshu");

        // Displaying student details
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        student3.displayStudentDetails();

        // Modifying the static variable
        University.universityName = "UPES";

        // Displaying university name again to see the change
        University.displayUniversityName();

        // Displaying student details again to see the effect of changing the static variable
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        student3.displayStudentDetails();
    }
}
