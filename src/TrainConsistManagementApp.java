import java.util.ArrayList;
import java.util.List;

public class UC1_InitializeTrainConsist {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize empty train consist using ArrayList
        List<String> trainConsist = new ArrayList<>();

        // Display initial state
        System.out.println("Train consist initialized successfully.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        // Program continues
        System.out.println("System ready for further operations...");
    }
}