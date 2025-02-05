class Worker {
    protected String name;
    protected double salaryRate;

    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }
    
    public double computePay(int hours) {
        return 0; // Default implementation
    }

    public void displayDetails() {
        System.out.println("Worker Name: " + name);
        System.out.println("Salary Rate: " + salaryRate);
    }
}

class DailyWorker extends Worker {
    public DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }
    @Override
    public double computePay(int hours) {
        int daysWorked = hours / 8; 
        return daysWorked * salaryRate;
    }
}

class SalariedWorker extends Worker {
    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }
    @Override
    public double computePay(int hours) {
        return 40 * salaryRate;
    }
}

public class WorkerDemo {
    public static void main(String[] args) {
        // Changed worker names: DailyWorker to Daksh and SalariedWorker to Ram
        DailyWorker dailyWorker = new DailyWorker("Daksh", 100);
        SalariedWorker salariedWorker = new SalariedWorker("Ram", 50);
        
        System.out.println("The Daily Worker Details:");
        dailyWorker.displayDetails();
        System.out.println("The Weekly Pay in rupees is as follows: " + dailyWorker.computePay(40));
        
        System.out.println("\nThe Worker getting salary, their details are:");
        salariedWorker.displayDetails();
        System.out.println("The Weekly Pay: " + salariedWorker.computePay(40));
    }
}
