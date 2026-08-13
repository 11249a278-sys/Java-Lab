public class TrainCodeException {
    public static void main(String[] args) {

        String[] trainCodes = {"TN101", "TN202", "TN303", "TN404"};

        try {
            // Valid index: 0 to 3
            System.out.println("Train Code: " + trainCodes[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred!");
            System.out.println("Invalid array index.");
        }

        System.out.println("Program continues...");
    }
} 