package gr.aueb.cf.chapters.projects10;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


/**
* The Project3ReadsAndStatistics class reads a file, counts the frequency of each character, and
* displays character frequency statistics.
*/
public class Project3ReadsAndStatistics {
    private static final int ARRAY_SIZE = 256;
    private static int[][] characterArray = new int[ARRAY_SIZE][2];


/**
* The main method is the entry point of the program. It reads a file, updates the character frequency,
* and prints character statistics.
*/
    public static void main(String[] args) {
        File file = new File("input.txt"); // Replace with your input file path
        try (FileInputStream fis = new FileInputStream(file)) {
            int currentChar;
            while ((currentChar = fis.read()) != -1) {
                updateCharacterFrequency((char) currentChar);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        printCharacterStatistics();
    }


/**
* Updates the frequency of a character in the characterArray.
*/
    private static void updateCharacterFrequency(char ch) {
        if (ch < ARRAY_SIZE) {
            characterArray[ch][0] = ch;
            characterArray[ch][1]++;
        }
    }


/**
* Prints the character frequency statistics, both sorted by character and sorted by frequency.
*/
    private static void printCharacterStatistics() {
        System.out.println("Character Frequency Statistics:");

        // Sort by character (lexicographically)
        sortCharacterArrayByCharacter();

        System.out.println("Character\tFrequency");
        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (characterArray[i][1] > 0) {
                System.out.println(
                        (char) characterArray[i][0] + "\t\t" + characterArray[i][1]
                );
            }
        }

        // Sort by frequency (descending order)
        sortCharacterArrayByFrequency();

        System.out.println("\nCharacter Frequency Statistics (Sorted by Frequency):");
        System.out.println("Character\tFrequency");
        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (characterArray[i][1] > 0) {
                System.out.println(
                        (char) characterArray[i][0] + "\t\t" + characterArray[i][1]
                );
            }
        }
    }

/**
* Sorts the character array by character (lexicographically).
*/
    private static void sortCharacterArrayByCharacter() {
        for (int i = 0; i < ARRAY_SIZE - 1; i++) {
            for (int j = 0; j < ARRAY_SIZE - i - 1; j++) {
                if (characterArray[j][0] > characterArray[j + 1][0]) {
                    swapElements(j, j + 1);
                }
            }
        }
    }

/**
* Sorts the character array by frequency (descending order).
*/
    private static void sortCharacterArrayByFrequency() {
        for (int i = 0; i < ARRAY_SIZE - 1; i++) {
            for (int j = 0; j < ARRAY_SIZE - i - 1; j++) {
                if (characterArray[j][1] < characterArray[j + 1][1]) {
                    swapElements(j, j + 1);
                }
            }
        }
    }

/**
* Swaps two elements in the character array.
*/
    private static void swapElements(int index1, int index2) {
        int[] temp = characterArray[index1];
        characterArray[index1] = characterArray[index2];
        characterArray[index2] = temp;
    }
}
