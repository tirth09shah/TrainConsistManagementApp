import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Reusing Bogie class
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " - Capacity: " + capacity;
    }
}

public class UC8_FilterBogiesUsingStreams {

    public static void main(String[] args) {

        // Step 1: Start Program
        System.out.println("=== Train Consist Management App - UC8 ===");

        // Step 2: Create List of Bogies (same as UC7)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));

        // Step 3: Apply Stream Filter (capacity > 60)
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Step 4: Display filtered bogies
        System.out.println("Bogies with capacity > 60:");
        for (Bogie b : filteredBogies) {
            System.out.println(b);
        }

        // Step 5: Verify original list unchanged
        System.out.println("\nOriginal Bogie List:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Step 6: Continue Program
        System.out.println("\nFiltering completed successfully.");
    }
}