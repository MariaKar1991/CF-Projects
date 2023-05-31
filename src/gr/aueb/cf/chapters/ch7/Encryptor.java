package gr.aueb.cf.chapters.ch7;

import java.util.Scanner;

/**
 * Encryption program that replaces every character of the String(user's input),
 * with the next ASCII character.
 */
public class Encryptor {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter a string to encrypt: ");
            String input = scanner.nextLine();
            String output = encrypt(input);
            System.out.println("The Encrypted string is: " + output);
        }

     /** takes in a string as input and returns an encrypted version of the string.
     */
    public static String encrypt(String input) {
            char[] chars = input.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                chars[i] = (char)(chars[i] + 1);
            }
            return new String(chars);
        }
    }


