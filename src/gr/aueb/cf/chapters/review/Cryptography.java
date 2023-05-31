package gr.aueb.cf.chapters.review;


import java.util.ArrayList;

public class Cryptography {

    public static void main(String[] args) {
        final int KEY = 800;
        String s = "Apollo 17 was the final mission of NASA's Apollo program.#";
        String s1 = encrypt(s, KEY).toString();
        System.out.println(s1);

        String s2 = decrypt(encrypt(s, KEY), KEY).toString();
        System.out.println(s2);
}

    public static ArrayList<Integer> encrypt(String s, int key) {
        ArrayList<Integer> encrypted = new ArrayList<>();
        char ch;
        int i;

        int prev = cipher(s.charAt(0), -1, key);
        encrypted.add(prev);

        i = 1;
        while ((ch = s.charAt(i)) != '#') {
            encrypted.add(cipher(ch, prev, key));
            prev = cipher(ch, prev, key);
            i++;
        }

        encrypted.add(-1);
        return encrypted;
}

    public static ArrayList<Character> decrypt(ArrayList<Integer> encrypted, int key) {
        ArrayList<Character> decrypted = new ArrayList<>();
        int token;
        int i;
        int prevToken;

        prevToken = decipher(encrypted.get(0), -1, key);
        decrypted.add((char) prevToken);

        i = 1;
        while ((token =encrypted.get(i)) != -1) {
            decrypted.add(decipher(token, prevToken, key));
            prevToken = token;
            i++;
        }

        return decrypted;
}

    public static int cipher(char ch, int prev, int key) {
        if (prev == -1) return ch;
        else return (ch + prev) % key;
}

    public static char decipher(int cipher, int prev, int key) {
        int de;

        if (prev == -1) return (char) cipher;
        else {
            de = cipher + key - prev;
            if (de > key) de -= key;
            return (char) de;
        }
    }
}