class Course {
    String courseName;
    String courseCode;

    // Constructor using "this" keyword to differentiate between class attributes and parameters
    public Course(String courseName, String courseCode) {
        this.courseName = courseName; // "this.courseName" refers to the class attribute
        this.courseCode = courseCode; // "this.courseCode" refers to the class attribute
    }

    // Method to display course details
    void displayCourseDetails() {
        System.out.println("Course Name: " + this.courseName);
        System.out.println("Course Code: " + this.courseCode);
    }

    public static void main(String[] args) {
        // Creating an object of Course class
        Course course1 = new Course("OOPS", "OJ101");

        // Displaying course details
        course1.displayCourseDetails();
    }
}
