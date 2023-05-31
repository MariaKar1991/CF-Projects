package gr2.aueb.cf;

public class RandomDieApp {

    public static void main(String[] args) {
        int die = (int) (Math.random() * 6) + 1;

        System.out.println(die);
    }
}
