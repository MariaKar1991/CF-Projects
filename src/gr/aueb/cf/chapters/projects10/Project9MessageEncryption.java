package gr.aueb.cf.chapters.projects10;

import java.util.Arrays;

/**
 * In this program, the encrypt method takes a message and a key as input and returns an array of integers representing the encrypted message.
 * The decrypt method takes the encrypted message and the key as input and returns the original message as a string.
 */
public class Project9MessageEncryption {

    public static void main(String[] args) {
        String message = "Hello, world!"; // The message to encrypt

        int[] encryptedMessage = encrypt(message, 5); // Encrypt the message
        System.out.println("Encrypted Message: " + Arrays.toString(encryptedMessage));

        String decryptedMessage = decrypt(encryptedMessage, 5); // Decrypt the message
        System.out.println("Decrypted Message: " + decryptedMessage);
    }

    public static int[] encrypt(String message, int key) {
        int[] encryptedMessage = new int[message.length() + 1]; // Add 1 for the terminating -1

        encryptedMessage[0] = message.charAt(0); // Encode the first character as is

        for (int i = 1; i < message.length(); i++) {
            int previousChar = encryptedMessage[i - 1]; // Get the code of the previous character
            int currentChar = message.charAt(i); // Get the code of the current character

            int encodedChar = (currentChar + previousChar) % key; // Perform the encoding
            encryptedMessage[i] = encodedChar;
        }

        encryptedMessage[message.length()] = -1; // Add the terminating -1
        return encryptedMessage;
    }

    public static String decrypt(int[] encryptedMessage, int key) {
        StringBuilder decryptedMessage = new StringBuilder();

        int previousChar = encryptedMessage[0]; // The first character remains the same
        decryptedMessage.append((char) previousChar);

        for (int i = 1; i < encryptedMessage.length; i++) {
            int encodedChar = encryptedMessage[i];
            if (encodedChar == -1) {
                break; // Reached the end of the message
            }

            int decodedChar = (encodedChar - previousChar + key) % key; // Perform the decoding
            decryptedMessage.append((char) decodedChar);

            previousChar = decodedChar; // Update the previous character
        }

        return decryptedMessage.toString();
    }
}
