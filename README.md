# Incubyte

# String Calculator - README

## Overview
This project is a **String Calculator** implemented in Java, adhering to the TDD (Test-Driven Development) Kata. It provides a method to calculate the sum of numbers given in a formatted string. The implementation supports advanced features like custom delimiters and exception handling for invalid inputs.

---

## Features
1. **Basic Addition**: Computes the sum of numbers in a comma-separated string.
2. **Unlimited Numbers**: Handles any number of inputs.
3. **Newline Support**: Accepts newlines (`\n`) as delimiters in addition to commas.
4. **Custom Delimiters**:
    - Format: `"//[delimiter]\n[numbers...]"`
    - Example: `"//;\n1;2"` results in `3`.
5. **Negative Number Handling**:
    - Throws an exception when negative numbers are included.
    - Lists all negative numbers in the exception message.

---

## Examples
| Input                     | Output                     |
|---------------------------|----------------------------|
| `""`                      | `0`                        |
| `"1"`                     | `1`                        |
| `"1,5"`                   | `6`                        |
| `"1\n2,3"`                | `6`                        |
| `"//;\n1;2"`              | `3`                        |
| `"1,-2,3,-4"`             | Exception: `[-2, -4]`      |

---

## Setup Instructions

### Prerequisites
- Java Development Kit (JDK) 8 or higher.
- A Java IDE or text editor (e.g., IntelliJ IDEA, Eclipse, VSCode).

### Running the Code
1. Clone or download the repository containing the `StringCalculator.java` file.
2. Navigate to the directory with the Java file.
3. Compile the code:
   ```bash
   javac StringCalculator.java
4.Run the program:
java StringCalculator


### How It Works
The program parses a string of numbers, handles delimiters (comma, newline, or custom), and calculates their sum. It:

1.Returns 0 for empty strings.
2.Sums numbers separated by commas or newlines.
3.Detects custom delimiters defined using the //[delimiter]\n syntax.
4.Throws an exception if negative numbers are present, listing all negative values.

### Testing

The main method in the StringCalculator class includes several test cases:

-Empty Input: Verifies that empty strings return 0.
-Single and Multiple Numbers: Ensures correct summation.
-Custom Delimiters: Tests for custom-defined delimiters.
-Negative Number Handling: Validates that negative numbers raise exceptions.

### Adding More Tests

To add additional test cases, edit the main method and include your test scenarios.

### Future Enhancements
1.Support multiple custom delimiters (e.g., "//[;][*]\n1;2*3").
2.Validate inputs to handle non-numeric values.
3.Automate testing using JUnit for better test coverage.



