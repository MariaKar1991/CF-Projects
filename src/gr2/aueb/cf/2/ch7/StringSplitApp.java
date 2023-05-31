package gr2.aueb.cf;

public class StringSplitApp {

    public static void main(String[] args) {
        String s = "Athens      Uni of Econ and Business";

        String[] tokens = s.split(" +");

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
