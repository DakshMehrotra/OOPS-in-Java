import java.util.ArrayList;
import java.util.Iterator;

class Employee2 { // Class name changed to Employee2
    private String name;
    private int id;
    private double salary;

    public Employee2(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Salary=" + salary + "]";
    }

    public static void main(String[] args) {
        ArrayList<Employee2> employees = new ArrayList<>();
        employees.add(new Employee2("Daksh", 1, 50000));
        employees.add(new Employee2("Ram", 2, 60000));
        employees.add(new Employee2("Shyam", 3, 70000));

        // Update salary of Bob (ID = 2)
        for (Employee2 emp : employees) {
            if (emp.getId() == 2) {
                emp.setSalary(65000);
                break;
            }
        }

        // Remove employee with ID = 1 (Alice)
        Iterator<Employee2> iterator = employees.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == 1) {
                iterator.remove();
            }
        }

        // Print remaining employees
        for (Employee2 emp : employees) {
            System.out.println(emp);
        }
    }
}
