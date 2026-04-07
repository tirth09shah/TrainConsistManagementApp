package TrainConsist;

import java.util.Arrays;

public class UC20_ExceptionSearch {

    // Method to perform search with validation
    public static boolean searchBogie(String[] bogies, String key) {

        // ✅ Fail-fast validation
        if (bogies == null || bogies.length == 0) {
            throw new IllegalStateException("Train has no bogies. Cannot perform search.");
        }

        // ✅ Linear Search (can also replace with binary if sorted)
        for (String bogie : bogies) {
            if (bogie.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        // ✅ Test Case 1: Normal Search
        String[] bogies = {"BG101", "BG205", "BG309"};

        try {
            boolean found = searchBogie(bogies, "BG205");

            if (found) {
                System.out.println("✅ Bogie found in train.");
            } else {
                System.out.println("❌ Bogie not found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // ✅ Test Case 2: Empty Array (Exception Case)
        String[] emptyBogies = {};

        try {
            boolean found = searchBogie(emptyBogies, "BG101");
            System.out.println(found);
        } catch (IllegalStateException e) {
            System.out.println("⚠️ Exception Caught: " + e.getMessage());
        }
    }
}