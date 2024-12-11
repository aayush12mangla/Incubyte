import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    public static int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0; // Return 0 if an empty string we got
        }

        String delimiter = ",";
        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("\n");
            delimiter = numbers.substring(2, delimiterIndex); // Extract custom delimiter
            numbers = numbers.substring(delimiterIndex + 1); // Remaining numbers
        }

        // Replace new lines with the delimiter
        numbers = numbers.replace("\n", delimiter);

        // Split the numbers by the delimiter
        String[] tokens = numbers.split(delimiter);
        List<Integer> negatives = new ArrayList<>();

        int sum = 0;
        for (String token : tokens) {
            if (token.isEmpty()) {
                continue;
            }

            int num = Integer.parseInt(token.trim());
            if (num < 0) {
                negatives.add(num);
            }
            sum += num;
        }

        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException("Negative numbers not allowed: " + negatives);
        }

        return sum;
    }

    // Main method for testing
    public static void main(String[] args) {

        System.out.println(add(""));
        System.out.println(add("1"));
        System.out.println(add("1,5"));
        System.out.println(add("1\n2,3"));
        System.out.println(add("//;\n1;2"));

        try {
            System.out.println(add("1,-2,3,-4"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Output: Negative numbers not allowed: [-2, -4]
        }
    }
}

