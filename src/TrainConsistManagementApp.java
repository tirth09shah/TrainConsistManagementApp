// Step 1: Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Step 2: Goods Bogie Class
class GoodsBogie {
    String type;   // Cylindrical / Rectangular
    String cargo;

    GoodsBogie(String type) {
        this.type = type;
    }

    // Step 3: Cargo Assignment Method
    public void assignCargo(String cargo) {
        try {
            // Safety Rule: Rectangular cannot carry Petroleum
            if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe: Rectangular bogie cannot carry Petroleum");
            }

            // If safe → assign cargo
            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + type + " -> " + cargo);

        } catch (CargoSafetyException e) {
            // Handle exception gracefully
            System.out.println("Error: " + e.getMessage());

        } finally {
            // Always executes
            System.out.println("Cargo assignment attempt completed.\n");
        }
    }
}

// Step 4: Main Class
public class UC15_SafeCargoAssignment {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App - UC15 ===");

        // Step 5: Create bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // Step 6: Safe assignment
        b1.assignCargo("Petroleum");

        // Step 7: Unsafe assignment (will be handled)
        b2.assignCargo("Petroleum");

        // Step 8: Program continues
        System.out.println("Program continues safely after cargo assignments.");
    }
}