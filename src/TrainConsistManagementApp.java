public class UC16_BubbleSortPassengerBogies {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App - UC16 ===");

        // Step 1: Passenger bogie capacities (unsorted)
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Before Sorting:");
        printArray(capacities);

        // Step 2: Bubble Sort Logic
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {

            System.out.println("\nPass " + (i + 1) + ":");

            // Inner loop for comparisons
            for (int j = 0; j < n - i - 1; j++) {

                System.out.println("Comparing " + capacities[j] + " and " + capacities[j + 1]);

                // Step 3: Swap if out of order
                if (capacities[j] > capacities[j + 1]) {

                    // Swapping
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;

                    System.out.println("Swapped → " + capacities[j] + " , " + capacities[j + 1]);
                }
            }

            // Print array after each pass
            System.out.print("After Pass " + (i + 1) + ": ");
            printArray(capacities);
        }

        // Step 4: Final Sorted Output
        System.out.println("\nFinal Sorted Capacities:");
        printArray(capacities);

        System.out.println("Program continues...");
    }

    // Helper Method to Print Array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}