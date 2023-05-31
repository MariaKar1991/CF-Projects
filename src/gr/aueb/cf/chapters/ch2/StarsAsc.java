package gr.aueb.cf.chapters.ch2;

/**
 *  Prints 1 to n lines of stars,
 *  in an increasing order.
 *  if n will be for instance 10, the first line will be with 1 star,
 *  the second line will be with 2 stars etc.,
 *  until the tenth and last line of 10 stars.
 */
public class StarsAsc {
    public static void main(String[] args) {

      for (int i = 1; i <=10; i++) {
        for (int j = 1; j <=i; j++) {
            System.out.print("*");
        }

      System.out.println();
    }
}

}
