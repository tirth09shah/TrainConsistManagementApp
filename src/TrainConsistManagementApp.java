import java.util.ArrayList;
import java.util.List;

public class UC2_AddPassengerBogies {

    public static void main(String[] args) {

        // Step 1: Start Program
        System.out.println("=== Train Consist Management App - UC2 ===");

        // Step 2: Create ArrayList for Passenger Bogies
        List<String> passengerBogies = new ArrayList<>();

        // Step 3: Add Passenger Bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Step 4: Display Bogies after Addition
        System.out.println("Passenger bogies after addition:");
        System.out.println(passengerBogies);

        // Step 5: Remove one bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        // Step 6: Display after Removal
        System.out.println("After removing AC Chair:");
        System.out.println(passengerBogies);

        // Step 7: Check if Sleeper exists
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists in the train.");
        } else {
            System.out.println("Sleeper bogie does NOT exist in the train.");
        }

        // Step 8: Final State
        System.out.println("Final passenger bogie list:");
        System.out.println(passengerBogies);

        // Step 9: Continue Program
        System.out.println("Operations completed successfully.");
    }
}