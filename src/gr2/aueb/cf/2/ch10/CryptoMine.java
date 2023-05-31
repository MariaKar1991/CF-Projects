package gr2.aueb.cf;

public class CryptoMine {

            public static void main(String[] args) {
                String message = "HELLO WORLD";
                int key = 3;

                // Encryption
                String encryptedMessage = encrypt(message, key);
                System.out.println("Encrypted message: " + encryptedMessage);

                // Decryption
                String decryptedMessage = encrypt(encryptedMessage, -key); // Decryption key is the negative of the encryption key
                System.out.println("Decrypted message: " + decryptedMessage);
            }



            public static String encrypt(String s, int key) {
                StringBuilder encrypted = new StringBuilder();
                char ch;

                for (int i = 0; i < s.length(); i++) {
                  ch = s.charAt(i);
                  if (Character.isUpperCase(ch)) encrypted.append(cipher(ch, key));
                  else encrypted.append(ch);
                }

                return encrypted.toString();
                }

            public static char cipher(char ch, int key) {
                int m, c;

                m = ch - 65;
                c = (m + key) % 26;

               return (char) (c + 65);

            }

            public static char decipher(char ch, int key) {
                int m, c;

                c = ch - 65;

                m = ((c - key) + 26) % 26;
                return (char) (m + 65);
            }
         }

