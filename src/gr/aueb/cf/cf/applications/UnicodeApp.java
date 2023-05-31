package gr.aueb.cf.cf.applications;

public class UnicodeApp {
    public static void main(String[] args) {
        int codePoint = 0x1F600; // smiley

        // conversion of 0x1F600 to Surrogate Pairs
        System.out.println("Smiley: \uD83D\uDE00");

        // Java-based conversion with Character wrapper class
        // and toChars method that converts to UTF-16 code points

        System.out.print("Smiley: ");
        System.out.println(Character.toChars(codePoint));
    }
}
