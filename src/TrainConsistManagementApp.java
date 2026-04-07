import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UC11_ValidateTrainAndCargo {

    public static void main(String[] args) {

        // Step 1: Start Program
        System.out.println("=== Train Consist Management App - UC11 ===");

        Scanner scanner = new Scanner(System.in);

        // Step 2: Take user input
        System.out.print("Enter Train ID: ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = scanner.nextLine();

        // Step 3: Define regex patterns
        String trainIdRegex = "TRN-\\d{4}";
        String cargoCodeRegex = "PET-[A-Z]{2}";

        // Step 4: Compile patterns
        Pattern trainPattern = Pattern.compile(trainIdRegex);
        Pattern cargoPattern = Pattern.compile(cargoCodeRegex);

        // Step 5: Create matchers
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // Step 6: Validate using matches()
        if (trainMatcher.matches()) {
            System.out.println("Train ID is VALID.");
        } else {
            System.out.println("Train ID is INVALID.");
        }

        if (cargoMatcher.matches()) {
            System.out.println("Cargo Code is VALID.");
        } else {
            System.out.println("Cargo Code is INVALID.");
        }

        // Step 7: Continue Program
        System.out.println("Validation process completed.");

        scanner.close();
    }
}