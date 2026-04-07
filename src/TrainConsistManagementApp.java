public class UC18_LinearSearchBogie {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App - UC18 ===");

        // Step 1: Array of bogie IDs (unsorted)
        String[] bogieIDs = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        // Step 2: Search key (can be taken from user, hardcoded for now)
        String searchKey = "BG309";

        System.out.println("Searching for Bogie ID: " + searchKey);

        // Step 3: Linear Search Logic
        boolean found = false;

        for (int i = 0; i < bogieIDs.length; i++) {

            System.out.println("Checking index " + i + " → " + bogieIDs[i]);

            if (bogieIDs[i].equals(searchKey)) {
                found = true;

                System.out.println("Match Found at index " + i);
                break; // Early termination
            }
        }

        // Step 4: Result Display
        if (found) {
            System.out.println("Bogie ID " + searchKey + " exists in the train.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT found.");
        }

        System.out.println("Program continues...");
    }
}