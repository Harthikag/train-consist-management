import java.util.regex.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Sample inputs (you can later replace with user input)
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        // Define regex patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern p1 = Pattern.compile(trainPattern);
        Pattern p2 = Pattern.compile(cargoPattern);

        // Match inputs
        Matcher m1 = p1.matcher(trainId);
        Matcher m2 = p2.matcher(cargoCode);

        // Validate Train ID
        if (m1.matches()) {
            System.out.println("Valid Train ID: " + trainId);
        } else {
            System.out.println("Invalid Train ID");
        }

        // Validate Cargo Code
        if (m2.matches()) {
            System.out.println("Valid Cargo Code: " + cargoCode);
        } else {
            System.out.println("Invalid Cargo Code");
        }
    }
}