package gr.aueb.cf.chapters.ch2;

/**
 *  Prints n to 1 lines of stars,
 *  in a decreasing order.
 *  if n will be for instance 10, the first line will be with 10 stars,
 *  the second line will be with 9 stars etc.,
 *  until the tenth and last line that will be with 1 star.
 */
public class StarsDesc {
    public static void main(String[] args) {

        for (int i = 1; i <=10; i++) {
            for (int j = 10; j >=i; j--) {
                System.out.print("*");
            }

        System.out.println();
        }
    }

}

