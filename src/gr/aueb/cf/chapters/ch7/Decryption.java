package gr.aueb.cf.chapters.ch7;

import java.util.Scanner;
/**
 * Decryption program that replaces every character of the String(user's input),
 * with the previous ASCII character, using the StringBuilder method.
 */
public class Decryption {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string to decrypt: ");
        String input = scanner.nextLine();
        String output = decrypt(input);
        System.out.println("The decrypted string is: " + output);
    }

    /** takes in a string as input and returns a decrypted version of the string.
     */
    public static String decrypt(String input) {
        StringBuilder decryptedString = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == 'a') {
                decryptedString.append('z');
            } else if (currentChar == 'A') {
                decryptedString.append('Z');
            } else if (currentChar == '0') {
                decryptedString.append('9');
            } else if (currentChar == '!') {
                decryptedString.append('~');
            } else if (currentChar == ' ') {
                decryptedString.append(' ');
            } else {
                decryptedString.append((char)(currentChar - 1));
            }
        }
        return decryptedString.toString();
    }
}
