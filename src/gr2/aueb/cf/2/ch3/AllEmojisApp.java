package gr2.aueb.cf;

/**
 * Prints all emojis
 */
public class AllEmojisApp {

    public static void main(String[] args) {
        int emojiStart = 0x1F600;
        int emojiEnd = 0x1F64F;
        int i = 0;

        i = emojiStart;
        while (i <= emojiEnd) {
            System.out.print(Character.toChars(i));
            System.out.print(" ");
            i++;
            if (1 % 16 == 0) System.out.println();
        }
    }
}
