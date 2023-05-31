package gr.aueb.cf.chapters.projects10;

/**
 * In this program, the theater is represented by a 2D array of booleans,
 * where true indicates that a seat is booked and false indicates that it's not booked.
 * Initially, all seats are set to false (non-booked).
 * The book method takes a column character and a row number as it's input and attempts to book the specified seat.
 * It checks if the seat is valid (within the theater boundaries) and if it's not already booked.
 * If the booking is successful, it updates the corresponding seat in the seats array to true.
 *
 * The cancel method takes a column character and a row number as it's input and attempts to cancel the booking of the specified seat.
 * It checks if the seat is valid and if it's already booked. If the cancellation is successful,
 * it updates the corresponding seat in the seats array to false.
 * The isValidSeat method is a helper method that checks if a seat is within the valid boundaries of the theater.
 *
 * In the main method, you can see an example usage of the Project10TheaterManager class where seats are booked and canceled.
 */
public class Project10TheaterManager {
    private boolean[][] seats; // The 2D array representing the theater seats

    public Project10TheaterManager() {
        seats = new boolean[30][12]; // Initialize the seats array
    }

    public void book(char column, int row) {
        int columnIndex = column - 'A'; // Convert the column character to index
        int rowIndex = row - 1; // Convert the row number to index

        if (isValidSeat(columnIndex, rowIndex) && !seats[rowIndex][columnIndex]) {
            seats[rowIndex][columnIndex] = true;
            System.out.println("Seat " + column + row + " booked successfully.");
        } else {
            System.out.println("Seat " + column + row + " is already booked or invalid.");
        }
    }

    public void cancel(char column, int row) {
        int columnIndex = column - 'A'; // Convert the column character to index
        int rowIndex = row - 1; // Convert the row number to index

        if (isValidSeat(columnIndex, rowIndex) && seats[rowIndex][columnIndex]) {
            seats[rowIndex][columnIndex] = false;
            System.out.println("Booking for seat " + column + row + " canceled successfully.");
        } else {
            System.out.println("Seat " + column + row + " is not booked or invalid.");
        }
    }

    private boolean isValidSeat(int column, int row) {
        return column >= 0 && column < 12 && row >= 0 && row < 30;
    }

    public static void main(String[] args) {
        Project10TheaterManager theaterManager = new Project10TheaterManager();

        // Example usage
        theaterManager.book('B', 5);
        theaterManager.book('D', 10);
        theaterManager.cancel('B', 5);
        theaterManager.cancel('E', 8);
    }
}

