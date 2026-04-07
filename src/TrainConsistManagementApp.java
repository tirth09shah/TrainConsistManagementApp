import java.util.LinkedHashSet;
import java.util.Set;

public class UC5_PreserveInsertionOrderBogies {

    public static void main(String[] args) {

        // Step 1: Start Program
        System.out.println("=== Train Consist Management App - UC5 ===");

        // Step 2: Create LinkedHashSet for Train Formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Step 3: Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Step 4: Attempt to add duplicate
        trainFormation.add("Sleeper"); // duplicate (will be ignored)

        // Step 5: Display final formation
        System.out.println("Final Train Formation (in insertion order):");
        System.out.println(trainFormation);

        // Step 6: Continue Program
        System.out.println("Duplicates are automatically removed, order is preserved.");
    }
}