import java.util.Arrays;

public class UC19_BinarySearchBogie {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App - UC19 ===");

        // Step 1: Unsorted bogie IDs
        String[] bogieIDs = {
                "BG309",
                "BG101",
                "BG550",
                "BG205",
                "BG412"
        };

        // Step 2: Sort before Binary Search (IMPORTANT)
        Arrays.sort(bogieIDs);

        System.out.println("Sorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIDs));

        // Step 3: Search key
        String searchKey = "BG309";
        System.out.println("\nSearching for: " + searchKey);

        // Step 4: Binary Search Logic
        int low = 0;
        int high = bogieIDs.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            System.out.println("Checking index " + mid + " → " + bogieIDs[mid]);

            int comparison = bogieIDs[mid].compareTo(searchKey);

            if (comparison == 0) {
                found = true;
                System.out.println("Match Found at index " + mid);
                break;
            } else if (comparison < 0) {
                low = mid + 1; // search right half
            } else {
                high = mid - 1; // search left half
            }
        }

        // Step 5: Result
        if (found) {
            System.out.println("Bogie ID " + searchKey + " exists in the train.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT found.");
        }

        System.out.println("Program continues...");
    }
}
