import java.util.HashSet;
import java.util.Set;

public class UC3_TrackUniqueBogieIDs {

    public static void main(String[] args) {

        // Step 1: Start Program
        System.out.println("=== Train Consist Management App - UC3 ===");

        // Step 2: Create HashSet for Bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // Step 3: Add Bogie IDs (including duplicates intentionally)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        // Step 4: Display Unique Bogie IDs
        System.out.println("Bogie IDs after insertion (duplicates removed automatically):");
        System.out.println(bogieIDs);

        // Step 5: Continue Program
        System.out.println("Only unique bogie IDs are maintained.");
    }
}