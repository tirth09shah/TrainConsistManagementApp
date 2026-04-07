import java.util.Arrays;

public class UC17_SortBogieNames {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App - UC17 ===");

        // Step 1: Create array of bogie names (unsorted)
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Step 2: Display before sorting
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // Step 3: Sort using built-in method
        Arrays.sort(bogieNames);

        // Step 4: Display after sorting
        System.out.println("\nAfter Sorting (Alphabetical Order):");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("\nProgram continues...");
    }
}