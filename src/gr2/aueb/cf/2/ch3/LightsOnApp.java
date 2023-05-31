package gr2.aueb.cf;

import java.util.Scanner;

/** η εφαρμογη αποφασιζει αν πρεπει να αναψουν τα φωτα ενος αυτοκινητου με
 * βαση τρεις μεταβλητες:
 * αν βρεχει ΚΑΙ ταυτοχρονα ισχυει ενα τουλαχιστον
 * απο τα επομενα: ειναι σκοταδι Η' τρεχουμε (speed > 100)
 * Tις τιμες αυτες τις λαμβανουμε απο τον χρηστη.
 */

public class LightsOnApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int speed = 0;
        boolean lightsOn = false;

        System.out.println("Please insert if it is raining (true/false)");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it is dark (true/false)");
        isDark = in.nextBoolean();

        System.out.println("Please insert car speed (int)");
        speed = in.nextInt();

        isRunning = (speed > 100);
        lightsOn = isRaining && (isDark || isRunning);

        System.out.println("Lights On: " + lightsOn);
    }
}
