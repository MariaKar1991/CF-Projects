package gr2.aueb.cf;

import java.util.Scanner;

/**
 * An aircraft has two tanks.
 * If a tank has less than 1/4 fuel
 * then an orange flag lights up,
 * if both tanks have < 1/4 then a red flag lights up.
 * The pilot gives true/false depending on whether the tank is < 1/4 or not
 * respectively.
 */
public class OrangeRedSignalApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isTank1LTQuarter = false;
        boolean isTank2LTQuarter = false;
        boolean orangeOn = false;
        boolean redOn = false;

        System.out.println("Please insert if tank1, tank2 are less than 1/4");
        isTank1LTQuarter = in.nextBoolean();
        isTank2LTQuarter = in.nextBoolean();

        orangeOn = isTank1LTQuarter || isTank2LTQuarter;
        redOn = isTank1LTQuarter && isTank2LTQuarter;

        System.out.println("Orange on: " + orangeOn);
        System.out.println("Red on: " + redOn);
    }
}
