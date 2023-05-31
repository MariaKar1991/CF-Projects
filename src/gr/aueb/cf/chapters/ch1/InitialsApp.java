package gr.aueb.cf.chapters.ch1;

/**
 * Prints the initials of my name (capital letters)
 */

public class InitialsApp {

    public static void main(String[] args) {

        System.out.println("* " + "      *" +   "      *" + "              *");
        System.out.println("* " + "    *"   +   "        *"  + "  *" + "       *" + "   *");
        System.out.println("*" + "   *"    +   "          *" + "    *" + "   *" + "     *");
        System.out.println("*" + " *"   +   "            *"  + "      *" + "       *");
        System.out.println("*" +   "   *" +  "          *" + "              *");
        System.out.println("*" + "     *" +   "        *" + "              *");
        System.out.println("*" + "        *" + "     *" + "              *");

        System.out.println();

        // Variable declaration and initialization
        
        int num1 = 19;
        int num2 = 30;
        int sum = 0;

        // Commands

        sum = num1 + num2;

        // Prints results

        System.out.println("Το αποτέλεσμα της πρόσθεσης ειναι ίσο με " + sum);
        
    }

}
