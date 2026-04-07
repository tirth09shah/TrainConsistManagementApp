import java.util.HashMap;
import java.util.Map;

public class UC6_MapBogieToCapacity {

    public static void main(String[] args) {

        // Step 1: Start Program
        System.out.println("=== Train Consist Management App - UC6 ===");

        // Step 2: Create HashMap (Bogie → Capacity)
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // Step 3: Add bogie-capacity mappings
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 60);
        bogieCapacityMap.put("First Class", 24);

        // Step 4: Display all bogie capacities
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        // Step 5: Continue Program
        System.out.println("Capacity mapping completed successfully.");
    }
}