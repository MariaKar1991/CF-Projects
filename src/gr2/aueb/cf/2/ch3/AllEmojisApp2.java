package gr2.aueb.cf;

public class AllEmojisApp2 {
    public static void main(String[] args) {
        char formattedChar = ' ';
        int emojiStart = 0x1F600;
        int emojiEnd = 0x1F64F;
        int i = 0;


        i = emojiStart;
        while (i <= emojiEnd) {
            System.out.print(Character.toChars(i));
            System.out.print(" ");
            i++;
            if (i % 16 == 0) System.out.println();
        }
    }
}
