package gr2.aueb.cf;

public class FrogApp {
    public static void main(String[] args) {

        int jumps = 0;
        int Y = 85;
        int X = 10;
        int jmp = 30;


        jumps = (int) Math.ceil((Y - X) / (double) jmp);


        System.out.println("The number of jumps that frog needs are: " + jumps);
    }
}
