package gr.aueb.cf.cf.applications;

import javax.jws.soap.SOAPBinding;

public class AgeCalculator {
    public static void main(String[] args) {
        int bornYear = 1981;
        int ageIn2025 = 2025 - bornYear;
        System.out.println("The age of the user will be " + ageIn2025 + " years old");

    }
}
