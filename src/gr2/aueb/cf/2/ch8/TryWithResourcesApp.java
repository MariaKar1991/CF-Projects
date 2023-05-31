package gr2.aueb.cf;

import java.util.InputMismatchException;

import java.util.Scanner;

public class TryWithResourcesApp {

    public static void main(String[] args) {
  
    int num;

        try (Scanner in = new Scanner(System.in)) {
        num = in.nextInt();
        System.out.println(num);
    } catch (InputMismatchException e) {
        //e.printStackTrace();
            System.out.println("Oopsss error!");
    
}
}
}

