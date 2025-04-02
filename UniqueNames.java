import java.util.HashSet;

public class UniqueNames {
    public static void main(String[] args) {
        String[] names = {"Aman", "Varchasv", "Sourabh", "Varchasv", "Aman"};

        HashSet<String> uniqueNames = new HashSet<>();
        for (String name : names) {
            uniqueNames.add(name);
        }

        // Check if a specific name exists
        String checkName = "Aman";
        if (uniqueNames.contains(checkName)) {
            System.out.println(checkName + " is in the set.");
        } else {
            System.out.println(checkName + " is not in the set.");
        }

        // Print unique names
        System.out.println("Unique Names: " + uniqueNames);
    }
}
