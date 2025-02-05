class SuperClass {
    private int privateData = 42; 

    // This is a public method to access private data
    public int getPrivateData() {
        return privateData;
    }
}

class SubClass extends SuperClass {
    void display() {
        // Accessing  the above privateData using the public method
        System.out.println("Accessing the private data through method and the answer is as followed: " + getPrivateData());
    }
}

public class PrivateMemberDemo {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.display();// object to display is being made
    }
}
