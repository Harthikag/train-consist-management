import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Initialize Train Consist (Empty List)
        List<String> trainConsist = new ArrayList<>();

        // Step 3: Display Initialization Message
        System.out.println("Train consist initialized successfully.");

        // Step 4: Display Initial Bogie Count
        System.out.println("Initial number of bogies: " + trainConsist.size());

        // Step 5: Program continues
        System.out.println("Program is ready for further operations...");
    }
}