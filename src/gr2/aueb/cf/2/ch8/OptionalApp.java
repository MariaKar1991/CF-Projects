package gr2.aueb.cf;

import java.util.Optional;

public class OptionalApp {

    public static void main(String[] args) {
       String s = "AUEB";
       String copied = null;

       Optional<String> str = getStrCopy(s);

       if (str.isPresent()) {
           copied = str.get();
       }

        System.out.println(copied);

       str.ifPresent(System.out::println);


       /**
       String s = null;
       String str = getCopy(null);
       if ((str != null) && (str.equals("AUEB"))) {
          System.out.println(str);
       }
       */
    }

    public static String getCopy(String s) {
        return s;
    }

    public static Optional<String> getStrCopy(String s) {
        if (s == null) return Optional.empty();
        return Optional.of(s);

        //return Optional.ofNullable(s);
    }
}

