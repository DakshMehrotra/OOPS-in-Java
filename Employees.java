class Employee {
    private static int totalEmployees = 0; // variable to track total employees
    private int employeeID;
    private String name;
    private String department;
    private double salary; // variable to ensure encapsulation

    // constructor with default values
    public Employee() {
        this.employeeID = 0;
        this.name = "Unknown";
        this.department = "Not Assigned";
        this.salary = 0.0;
        totalEmployees++; // Increment total employees count
    }

    // Parameterized constructor
    public Employee(int employeeID, String name, String department, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.salary = salary;
        totalEmployees++; // Increment total employees count
    }

    // Getter method to access private salary variable
    public double getSalary() {
        return this.salary;
    }

    // Method to calculate salary
    public double calculateSalary() {
        return this.salary; // Returning the salary of the employee
    }

    // Method to display employee details
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + this.employeeID);
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.department);
        System.out.println("Salary: " + this.salary);
        System.out.println("------------------------------");
    }

    // Static method to display total employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public static void main(String[] args) {
        // Creating employees using default constructor
        Employee emp1 = new Employee();
        
        // Creating employees using parameterized constructor
        Employee emp2 = new Employee(101, "Ram", "HR", 50000);
        Employee emp3 = new Employee(102, "Daksh", "IT", 60000);
        Employee emp4 = new Employee(103, "Shiv", "Finance", 70000);

        // Displaying employee details
        emp1.displayEmployeeInfo();
        emp2.displayEmployeeInfo();
        emp3.displayEmployeeInfo();
        emp4.displayEmployeeInfo();

        // Displaying total number of employees
        Employee.displayTotalEmployees();

        // Displaying salary details using getter and calculateSalary method
        System.out.println("Salary of " + emp2.name + ": " + emp2.getSalary());
        System.out.println("Salary of " + emp3.name + ": " + emp3.calculateSalary());
    }
}
