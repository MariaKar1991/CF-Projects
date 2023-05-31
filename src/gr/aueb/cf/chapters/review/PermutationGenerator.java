package gr.aueb.cf.chapters.review;

import java.util.ArrayList;
import java.util.List;

public class PermutationGenerator {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int desiredCount = 49;
        List<List<Integer>> permutations = generatePermutations(numbers, desiredCount);

        // Print all permutations
        for (List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }
    }

    public static List<List<Integer>> generatePermutations(int[] numbers, int desiredCount) {
        List<List<Integer>> permutations = new ArrayList<>();
        generatePermutationsHelper(numbers, 0, permutations, desiredCount);
        return permutations;
    }

    private static void generatePermutationsHelper(int[] numbers, int index, List<List<Integer>> permutations, int desiredCount) {
        if (permutations.size() >= desiredCount) {
            // Reached the desired count, stop generating permutations
            return;
        }

        if (index == numbers.length - 1) {
            // Reached the last element, add the current order as a permutation
            List<Integer> permutation = new ArrayList<>();
            for (int num : numbers) {
                permutation.add(num);
            }
            permutations.add(permutation);
        } else {
            for (int i = index; i < numbers.length; i++) {
                // Swap the current element with the next element
                int temp = numbers[index];
                numbers[index] = numbers[i];
                numbers[i] = temp;

                // Recursively generate permutations for the remaining elements
                generatePermutationsHelper(numbers, index + 1, permutations, desiredCount);

                // Swap back the elements to restore the original order
                temp = numbers[index];
                numbers[index] = numbers[i];
                numbers[i] = temp;
            }
        }
    }
}

