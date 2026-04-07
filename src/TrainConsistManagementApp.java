import java.util.ArrayList;
import java.util.List;

// GoodsBogie class
class GoodsBogie {
    String type;   // Cylindrical / Rectangular / Open
    String cargo;  // Petroleum / Coal / Grain

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " - " + cargo;
    }
}

public class UC12_SafetyComplianceCheck {

    public static void main(String[] args) {

        // Step 1: Start Program
        System.out.println("=== Train Consist Management App - UC12 ===");

        // Step 2: Create list of goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Rectangular", "Coal"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        // Try changing to ("Cylindrical", "Coal") to test failure

        // Step 3: Safety validation using Stream
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") ||
                                b.cargo.equals("Petroleum")
                );

        // Step 4: Display result
        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT.");
        } else {
            System.out.println("Train is NOT SAFE! Rule violation detected.");
        }

        // Step 5: Continue Program
        System.out.println("Safety validation completed.");
    }
}