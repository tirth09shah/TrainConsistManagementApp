import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Enhanced Bogie class (with type)
class Bogie {
    String name;
    int capacity;
    String type; // Passenger or Goods

    Bogie(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class UC9_GroupBogiesByType {

    public static void main(String[] args) {

        // Step 1: Start Program
        System.out.println("=== Train Consist Management App - UC9 ===");

        // Step 2: Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72, "Passenger"));
        bogies.add(new Bogie("AC Chair", 60, "Passenger"));
        bogies.add(new Bogie("First Class", 24, "Passenger"));
        bogies.add(new Bogie("Cargo Rectangular", 100, "Goods"));
        bogies.add(new Bogie("Cargo Cylindrical", 120, "Goods"));

        // Step 3: Group bogies by type
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.type));

        // Step 4: Display grouped result
        System.out.println("Bogies grouped by type:");
        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\nType: " + entry.getKey());
            for (Bogie b : entry.getValue()) {
                System.out.println("  " + b);
            }
        }

        // Step 5: Verify original list unchanged
        System.out.println("\nOriginal Bogie List Size: " + bogies.size());

        // Step 6: Continue Program
        System.out.println("\nGrouping completed successfully.");
    }
}