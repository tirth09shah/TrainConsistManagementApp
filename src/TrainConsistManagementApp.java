import java.util.LinkedList;

public class UC4_MaintainOrderedTrainConsist {

    public static void main(String[] args) {

        // Step 1: Start Program
        System.out.println("=== Train Consist Management App - UC4 ===");

        // Step 2: Create LinkedList for Train Consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Step 3: Add bogies in order
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // Step 4: Insert Pantry Car at position 2 (index 2)
        trainConsist.add(2, "Pantry");

        System.out.println("\nAfter adding Pantry Car at position 2:");
        System.out.println(trainConsist);

        // Step 5: Remove first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // Step 6: Display final consist
        System.out.println("\nFinal Train Consist after removals:");
        System.out.println(trainConsist);

        // Step 7: Continue Program
        System.out.println("\nTrain sequence maintained successfully.");
    }
}