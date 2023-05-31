package gr.aueb.cf.chapters.review;

        import java.io.FileNotFoundException;
        import java.io.FileOutputStream;
        import java.io.IOException;
        import java.io.PrintStream;
        import java.nio.file.Path;
        import java.nio.file.Paths;
        import java.time.LocalDateTime;
        import java.util.Arrays;
        import java.util.Scanner;

/**
 *
 */
public class MobileApp {
    final static Scanner in = new Scanner(System.in);
    final static String[][] contacts = new String[500][3];
    static int pivot = -1;
    final static Path path = Paths.get("C:\\tmp\\contactsLogger.txt");

    public static void main(String[] args) {

        boolean quit = false;
        String s;
        int choice;
        String phoneNumber;

        do {
            printMenu();
            s = getChoice();
            if (s.matches("[qQ]")) quit = true;
            else {
                try {
                    choice = Integer.parseInt(s);
                    if (!isValid(choice)) throw new IllegalArgumentException("Error. Choice MUST be between 1-5.");

                    switch (choice) {
                        case 1:
                            printContactMenu();
                            insertController(getFirstname(), getLastname(), getPhoneNumber());
                            System.out.println("Επιτυχής εισαγωγή.");
                            break;
                        case 2:
                            phoneNumber = getPhoneNumber();
                            deleteController(phoneNumber);
                            System.out.println("Επιτυχής διαγραφή.");
                            break;
                        case 3:
                            phoneNumber = getPhoneNumber();
                            printContactMenu();
                            updateController(phoneNumber, getFirstname(), getLastname(), getPhoneNumber());
                            System.out.println("Επιτυχής ενημέρωση.");
                            break;
                        case 4:
                            phoneNumber = getPhoneNumber();
                            String[] contact = getOneController(phoneNumber);
                            printContact(contact);
                            break;
                        case 5:
                            String[][] allContacts = getAllContactsController();
                            printAllContacts(allContacts);
                            break;
                        default:
                            throw new IllegalArgumentException("Bad choice.");
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        } while (!quit);

        /*System.out.println(update("2102710095" , "Denis" , "Barko", "2121212121"));
        System.out.println(delete("2121212121"));
        System.out.println(getContactByPhoneNumber("2121212121"));;
        String[][] allContacts = getAllContacts();
        for (int i = 0; i < allContacts.length -1; i++) {
            System.out.println("Name: " + allContacts[0]);
            System.out.println("Name: " + allContacts[0]);
            System.out.println("Name: " + allContacts[0]);
        }*/
    }

    public static void printContact(String[] contact) {
        for (String s : contact) {
            System.out.print(s + " ");
        }System.out.println();
    }

    public static void printAllContacts(String[][] contacts) {
        for (String[] contact : contacts) {
            printContact(contact);
            //System.out.printf("%s\t%s\t%s\n", contact[0], contact[1], contact[2]);
        }
    }

    public static boolean isValid(int choice) {
        return (choice >= 1 && choice <= 5);
    }

    public static void printMenu() {
        System.out.println("Επιλέξτε ένα από τα παρακάτω:");
        System.out.println("1. Εισαγωγή επαφής.");
        System.out.println("2. Διαγραφή επαφής.");
        System.out.println("3. Ενημέρωση επαφής.");
        System.out.println("4. Αναζήτηση επαφής.");
        System.out.println("5. Εκτύπωση όλων των επαφών.");
        System.out.println("Q/q. Έξοδος.");
    }

    public static String getChoice() {
        System.out.println("Εισάγετε επιλογή:");
        return in.nextLine().trim();
    }

    public static void printContactMenu() {
        System.out.println("Εισάγετε Όνομα, Επώνυμο και Τηλέφωνο.");
    }

    public static String getFirstname() {
        System.out.println("Εισάγετε Όνομα:");
        return in.nextLine().trim();
    }

    public static String getLastname() {
        System.out.println("Εισάγετε Επώνυμο:");
        return in.nextLine().trim();
    }

    public static String getPhoneNumber() {
        System.out.println("Εισάγετε αριθμό τηλεφώνου:");
        return in.nextLine().trim();
    }

    /*
     *  Controllers
     */

    public static void insertController(String firstname, String lastname, String phoneNumber) {
        try {
            //  Validations
            if (firstname == null || lastname == null || phoneNumber == null) {
                throw new IllegalArgumentException("Nulls are not allowed.");
            }
            if (firstname.length() < 2 || firstname.length() > 50) {
                throw new IllegalArgumentException("Firstname is not valid.");
            }
            if (lastname.length() < 2 || lastname.length() > 50) {
                throw new IllegalArgumentException("Lastname is not valid.");
            }
            if (phoneNumber.length() < 2 || phoneNumber.length() > 14) {
                throw new IllegalArgumentException("Phone number is not valid.");
            }

            //  Service call
            insertContactService(firstname.trim(), lastname.trim(), phoneNumber.trim());

        } catch (IllegalArgumentException e) {
            //e.printStackTrace();
            throw e;
        }
    }

    public static void updateController(String oldPhoneNumber, String firstname, String lastname, String newPhoneNumber) {
        try {
            //  Validations
            if (oldPhoneNumber == null || firstname  == null || lastname == null || newPhoneNumber == null) {
                throw new IllegalArgumentException("Nulls are not allowed.");
            }

            if (oldPhoneNumber.length() < 2 || oldPhoneNumber.length() > 14) {
                throw new IllegalArgumentException("Old phone number is not valid.");
            }

            if (firstname.length() < 2 || firstname.length() > 50) {
                throw new IllegalArgumentException("Firstname is not valid.");
            }

            if (lastname.length() < 2 || lastname.length() > 50) {
                throw new IllegalArgumentException("Lastname is not valid.");
            }

            if (newPhoneNumber.length() < 2 || newPhoneNumber.length() > 14) {
                throw new IllegalArgumentException("New phone number is not valid.");
            }

            //  Service call
            updateContactService(oldPhoneNumber.trim(), firstname.trim(),
                    lastname.trim(), newPhoneNumber.trim());

        } catch (IllegalArgumentException e) {
            //e.printStackTrace();
            throw e;
        }
    }

    public static String[] deleteController(String phoneNumber) {
        try {
            if (phoneNumber.length() < 2 || phoneNumber.length() > 14) {
                throw  new IllegalArgumentException("Phone number is not valid.");
            }
            return deleteContactService(phoneNumber);
        } catch (IllegalArgumentException e) {
            //e.printStackTrace();
            throw e;
        }
    }

    public static String[] getOneController(String phoneNumber) {
        try {
            if (phoneNumber.length() < 2 || phoneNumber.length() > 14) {
                throw  new IllegalArgumentException("Phone number is not valid.");
            }
            return getOneContactService(phoneNumber);
        } catch (IllegalArgumentException e) {
            //e.printStackTrace();
            throw e;
        }
    }

    public static String[][] getAllContactsController() {
        try {
            return getAllContactsService();
        } catch (IllegalArgumentException e) {
            //e.printStackTrace();
            throw e;
        }
    }

    /*
     *  Service Layer
     */

    public static String[] getOneContactService(String phoneNumber) {
        try {
            String[] contact = getContactByPhoneNumber(phoneNumber);
            if (contact.length == 0) {
                throw new IllegalArgumentException("Contact not found");
            }

            return contact;
        }   catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }
    }

    public static String[][] getAllContactsService() {
        try {
            String[][] contactsList = getAllContacts();
            if (contactsList.length == 0){
                throw new IllegalArgumentException("List is empty");
            }
            return contactsList;
        } catch (IllegalArgumentException e) {
            log(e, "List was empty, nothing to display.");
            throw e;
        }
    }

    public static void insertContactService (String firstname, String lastname, String phoneNumber) {
        try {
            if (!insert(firstname, lastname, phoneNumber)) {
                throw new IllegalArgumentException("Error in insert.");

            }
        } catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }
    }

    public static void updateContactService(String oldPhoneNumber, String firstname, String lastname, String newPhoneNumber) {
        try {
            if (!update(oldPhoneNumber, firstname, lastname, newPhoneNumber)) {
                throw new IllegalArgumentException("Error in update.");
            }
        } catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }
    }

    public static String[] deleteContactService(String phoneNumber) {
        String[] contact;
        try {
            contact = delete(phoneNumber);
            if (contact.length == 0) {
                throw new IllegalArgumentException("Error in delete.");
            }
            return contact;
        } catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }
    }

    /*
     * CRUD Services that are provided to
     * Service Layer
     */

    /**
     * Searches for the requested phone number in our Contacts.
     * @param phoneNumber
     *          the number to search for
     * @return
     *          returns the index of the phone if found,
     *          returns -1 if not found.
     */
    public static int getIndexByPhoneNumber(String phoneNumber) {
        for (int i = 0; i <= pivot; i++) {
            if (contacts[i][2].equals(phoneNumber)) {
                return i;
            }
        }

        return -1;  //if not found
    }

    public static boolean insert (String firstname, String lastname, String phoneNumber) {

        if (isFull(contacts)) {
            return false;
        }

        if (getIndexByPhoneNumber(phoneNumber) != -1) {
            return false;
        }

        pivot++;
        contacts[pivot][0] = firstname;
        contacts[pivot][1] = lastname;
        contacts[pivot][2] = phoneNumber;

        return true;
    }

    public static /*String[]*/ boolean update(String oldPhoneNumber, String firstname, String lastname, String newPhoneNumber) {
        int positionToUpdate = getIndexByPhoneNumber(oldPhoneNumber);
        String[] contact = new String[3];

        if (positionToUpdate == -1) {
//            return new String[] {};
            return false;
        }

//        contact[0] = contacts[positionToUpdate][0];
//        contact[1] = contacts[positionToUpdate][1];
//        contact[2] = contacts[positionToUpdate][2];

        contacts[positionToUpdate][0] = firstname;
        contacts[positionToUpdate][1] = lastname;
        contacts[positionToUpdate][2] = newPhoneNumber;
        return true;
    }

    public static String[] delete(String phoneNumber) {
        int positionToDelete = getIndexByPhoneNumber(phoneNumber);
        String[] contact = new String[3];

        if (positionToDelete == -1) {
            return new String[]{};
        }

        System.arraycopy(contacts[positionToDelete], 0, contact, 0, contact.length);//        for (int i = 0; i < contact.length; i++) {            contact[i] = contacts[positionToDelete][i];        }

        if (! (positionToDelete == contacts.length - 1)) {
            System.arraycopy(contacts, positionToDelete + 1, contacts, positionToDelete, pivot - positionToDelete);
        }

        pivot--;
        return contact;
    }

    public static String[] getContactByPhoneNumber(String phoneNumber) {
        int positionToReturn = getIndexByPhoneNumber(phoneNumber);

        if (positionToReturn == -1) {
            return new String[] {};
        }

        return contacts[positionToReturn];
    }

    public static String[][] getAllContacts() {
        return Arrays.copyOf(contacts, pivot +1);
    }

    public static boolean isFull (String[][] arr) {
        return pivot == arr.length - 1;
    }

    /*
     * Custom logger.
     * Varargs String[] message
     * log(Exception)
     */

    public static void log(Exception e, String... message) {
        try (PrintStream ps = new PrintStream(new FileOutputStream(path.toFile()))) {
            ps.println(LocalDateTime.now() + "\n" + e.toString());
            ps.printf("%s", (message.length == 1) ? message[0] : "");
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }
}
