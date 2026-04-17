
import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashSet for bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs (including duplicates)
        bogieIds.add("B101");
        bogieIds.add("B102");
        bogieIds.add("B103");
        bogieIds.add("B102"); // duplicate
        bogieIds.add("B101"); // duplicate

        // Display unique bogie IDs
        System.out.println("Unique Bogie IDs in Train:");
        System.out.println(bogieIds);
    }
}