package gr.aueb.cf.chapters.projects10;

import java.util.Scanner;

/**
 * The Project2ContactApplication class represents a simple contact application that allows users to search,
 * add, update, and delete contacts. Contacts are stored in a two-dimensional array and are limited to a maximum
 * number defined by MAX_CONTACTS constant.
 */
public class Project2ContactApplication {
    private static final int MAX_CONTACTS = 500;
    private static String[][] contacts = new String[MAX_CONTACTS][3];
    private static int contactCount = 0;

/**
* The main method is the entry point of the contact application. It displays a menu to the user and
* performs operations based on the user's choice.
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nContact Application Menu:");
            System.out.println("1. Search Contact");
            System.out.println("2. Add Contact");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    searchContact(scanner);
                    break;
                case 2:
                    addContact(scanner);
                    break;
                case 3:
                    updateContact(scanner);
                    break;
                case 4:
                    deleteContact(scanner);
                    break;
                case 5:
                    System.out.println("Exiting Contact Application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }

/**
* Searches for a contact based on the provided phone number.
* If a contact is found, it displays the contact's details.
* Otherwise, it prints a message indicating that the contact was not found.
*/
    private static void searchContact(Scanner scanner) {
        System.out.print("Enter the phone number to search: ");
        String phoneNumber = scanner.next();

        boolean found = false;
        for (int i = 0; i < contactCount; i++) {
            if (contacts[i][2].equals(phoneNumber)) {
                System.out.println("Contact Found:");
                System.out.println("Last Name: " + contacts[i][0]);
                System.out.println("First Name: " + contacts[i][1]);
                System.out.println("Phone Number: " + contacts[i][2]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found with the provided phone number.");
        }
    }

/**
* Adds a new contact to the contact list. The user is prompted to enter the contact's last name,
* first name, and phone number. If the contact limit is reached or if a contact with the same phone
* number already exists, appropriate messages are displayed.
 */
    private static void addContact(Scanner scanner) {
        if (contactCount >= MAX_CONTACTS) {
            System.out.println("Contact limit reached. Cannot add more contacts.");
            return;
        }

        System.out.print("Enter the last name: ");
        String lastName = scanner.next();
        System.out.print("Enter the first name: ");
        String firstName = scanner.next();
        System.out.print("Enter the phone number: ");
        String phoneNumber = scanner.next();

        // Check if the contact already exists
        for (int i = 0; i < contactCount; i++) {
            if (contacts[i][2].equals(phoneNumber)) {
                System.out.println("Contact already exists with the provided phone number.");
                return;
            }
        }

        contacts[contactCount][0] = lastName;
        contacts[contactCount][1] = firstName;
        contacts[contactCount][2] = phoneNumber;
        contactCount++;

        System.out.println("Contact added successfully.");
    }

/**
* Updates the details of a contact based on the provided phone number. If a contact is found,
* the user is prompted to enter the new last name and first name.
* The contact's details are updated
* accordingly. If the contact is not found, a message is displayed.
*/
    private static void updateContact(Scanner scanner) {
        System.out.print("Enter the phone number to update: ");
        String phoneNumber = scanner.next();

        boolean found = false;
        for (int i = 0; i < contactCount; i++) {
            if (contacts[i][2].equals(phoneNumber)) {
                System.out.print("Enter the new last name: ");
                String lastName = scanner.next();
                System.out.print("Enter the new first name: ");
                String firstName = scanner.next();

                contacts[i][0] = lastName;
                contacts[i][1] = firstName;

                System.out.println("Contact updated successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found with the provided phone number.");
        }
    }

/**
* Deletes a contact based on the provided phone number. If a contact is found, it is removed from
* the contact list. The remaining contacts are shifted to fill the gap. If the contact is not found,
* a message is displayed.
*/
        private static void deleteContact(Scanner scanner) {
            System.out.print("Enter the phone number to delete: ");
            String phoneNumber = scanner.next();

            boolean found = false;
            for (int i = 0; i < contactCount; i++) {
                if (contacts[i][2].equals(phoneNumber)) {
                    // Shift the remaining contacts to fill the gap
                    for (int j = i; j < contactCount - 1; j++) {
                        contacts[j] = contacts[j + 1];
                    }
                    contactCount--;

                    System.out.println("Contact deleted successfully.");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Contact not found with the provided phone number.");
            }
        }
    }


