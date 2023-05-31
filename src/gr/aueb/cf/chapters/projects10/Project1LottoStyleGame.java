package gr.aueb.cf.chapters.projects10;

import java.io.*;
import java.util.*;
/**
 * This class represents a program to generate and filter combinations of lotto style numbers.
 * It reads input from a file, performs filtering based on specific criteria, and writes
 * the combinations that meet the criteria to an output file.
 */
public class Project1LottoStyleGame {
/**
* The main method is the entry point of the program. It reads input from a file, filters
* combinations based on specific criteria, and writes the filtered combinations to an output file.
* The input file is expected to contain a list of integers, and the output file will contain the
* generated combinations.
*/
    public static void main(String[] args) {
        Scanner scanner = null;
        FileWriter fileWriter = null;
        try {
            // Open file for reading
            File inputFile = new File("input.txt");
            scanner = new Scanner(inputFile);

            // Read integers from file until -1 is encountered
            List<Integer> numbers = new ArrayList<>();
            int number;
            while ((number = scanner.nextInt()) != -1) {
                numbers.add(number);
            }

            // Check the number of integers
            if (numbers.size() < 7 || numbers.size() > 49) {
                System.out.println("The number of integers should be at least 7 and at most 49.");
                return;
            }

            // Store numbers in an array
            int[] arr = new int[numbers.size()];
            for (int i = 0; i < numbers.size(); i++) {
                arr[i] = numbers.get(i);
            }

            // Sort the array
            Arrays.sort(arr);

            //  Open file for writing
            fileWriter = new FileWriter("output.txt");

            // Generate and filter combinations
            generateAndFilterCombinations(arr, fileWriter);

            System.out.println("The combinations have been written to the file output.txt.");

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error while writing to the file.");
        } finally {
            // Close the files
            if (scanner != null) {
                scanner.close();
            }
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    System.out.println("Error while closing the file.");
                }
            }
        }
    }

    // Method to generate and filter combinations
    private static void generateAndFilterCombinations(int[] arr, FileWriter fileWriter) throws IOException {
        int n = arr.length;
        int r = 6;

        // Generate combinations
        int[] data = new int[r];
        combinationUtil(arr, data, 0, n - 1, 0, r, fileWriter);
    }

    private static void combinationUtil(int[] arr, int[] data, int start, int end, int index, int r, FileWriter fileWriter) throws IOException {
        if (index == r) {
            // Check criteria and write combination to file
            if (isCriteriaMet(data)) {
                writeCombinationToFile(data, fileWriter);
            }
            return;
        }

        for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
            data[index] = arr[i];
            combinationUtil(arr, data, i + 1, end, index + 1, r, fileWriter);
        }
    }

    // Check criteria for a combination
    private static boolean isCriteriaMet(int[] arr) {
        return hasAtMost4EvenNumbers(arr) &&
                hasAtMost4OddNumbers(arr) &&
                hasAtMost2ConsecutiveNumbers(arr) &&
                hasAtMost3SameEndingNumbers(arr) &&
                hasAtMost3NumbersInSameTens(arr);
    }

    private static boolean hasAtMost4EvenNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
                if (count > 4) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean hasAtMost4OddNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 1) {
                count++;
                if (count > 4) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean hasAtMost2ConsecutiveNumbers(int[] arr) {
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == 1) {
                count++;
                if (count > 2) {
                    return false;
                }
            } else {
                count = 1;
            }
        }
        return true;
    }

    private static boolean hasAtMost3SameEndingNumbers(int[] arr) {
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % 10 == arr[i - 1] % 10) {
                count++;
                if (count > 3) {
                    return false;
                }
            } else {
                count = 1;
            }
        }
        return true;
    }

    private static boolean hasAtMost3NumbersInSameTens(int[] arr) {
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] / 10 == arr[i - 1] / 10) {
                count++;
                if (count > 3) {
                    return false;
                }
            } else {
                count = 1;
            }
        }
        return true;
    }

    // Write combination to file
    private static void writeCombinationToFile(int[] arr, FileWriter fileWriter) throws IOException {
        for (int num : arr) {
            fileWriter.write(num + " ");
        }
        fileWriter.write("\n");
    }
}
