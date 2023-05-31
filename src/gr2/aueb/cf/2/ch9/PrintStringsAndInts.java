package gr2.aueb.cf;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * App that reads firstname, lastname, and two grades from students.
 * Calculates the average grade for each student, and prints in the file primOut.txt
 * the firstname, lastname and average grade for each student.
 * If errors occur they will be printed in a separate file called log.txt.
 */
    public class PrintStringsAndInts {
        public static void main(String[] args) {
            String[] names = {"Αννα Λεωνιδου", "Γεωργιος Παυλου", "Νικολαος Παπαδοπουλος", "Μιχαλης Γεωργιου"};
            int[][] grades = {{9, 8}, {10, 9}, {7, 9}, {5, 11}};

            PrintWriter primOutWriter = null;
            PrintWriter logWriter = null;

            try {
                primOutWriter = new PrintWriter(new FileWriter("primOut.txt"));
                logWriter = new PrintWriter(new FileWriter("log.txt"));

                for (int i = 0; i < names.length; i++) {
                    String name = names[i];
                    int grade1 = grades[i][0];
                    int grade2 = grades[i][1];

                    if (grade1 < 0 || grade1 > 10 || grade2 < 0 || grade2 > 10) {
                        logWriter.println("Wrong grade for student " + name);
                    } else {
                        double average = (grade1 + grade2) / 2.0;
                        primOutWriter.println(name + " " + average);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (primOutWriter != null) {
                    primOutWriter.close();
                }
                if (logWriter != null) {
                    logWriter.close();
                }
            }
        }
    }


