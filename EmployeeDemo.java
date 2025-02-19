abstract class Employee {
    String name;
    String role;
    
    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    abstract void calculateSalary();
    abstract void displayDetails();
}

class Manager extends Employee {
    private double fixedSalary;

    Manager(String name, double fixedSalary) {
        super(name, "Manager");
        this.fixedSalary = fixedSalary;
    }

    @Override
    void calculateSalary() {
        System.out.println("Manager Salary: " + fixedSalary);
    }

    @Override
    void displayDetails() {
        System.out.println("Name: " + name + ", Role: " + role + ", Salary: " + fixedSalary);
    }
}

class Developer extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    Developer(String name, double hourlyRate, int hoursWorked) {
        super(name, "Developer");
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    void calculateSalary() {
        System.out.println("Developer Salary: " + (hourlyRate * hoursWorked));
    }

    @Override
    void displayDetails() {
        System.out.println("Name: " + name + ", Role: " + role + ", Salary: " + (hourlyRate * hoursWorked));
    }
}

// ✅ MAIN CLASS WITH MAIN METHOD
public class EmployeeDemo {
    public static void main(String[] args) {
        Manager mgr = new Manager("Daksh", 60000);
        Developer dev = new Developer("Ram", 50, 160);
        
        mgr.displayDetails();
        mgr.calculateSalary();
        
        dev.displayDetails();
        dev.calculateSalary();
    }
}
