package gr.aueb.cf.cf.applications;


import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 1;


        while (gradeCounter <= 10) {
            System.out.print("Enter grade: ");
            int grade = in.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter + 1;
        }

        int average = total / 10;

        System.out.printf("%nTotal of all 10 grades is %d%n", total);
        System.out.printf("Class average is %d%n", average);
    }

}
