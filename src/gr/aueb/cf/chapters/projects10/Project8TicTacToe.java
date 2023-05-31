package gr.aueb.cf.chapters.projects10;

import java.util.Scanner;

/**
 * The Project8TicTacToe class represents the game.
 * It has a 2D array board to store the current state of the game,
 * where each element represents a cell on the grid.
 * The constants EMPTY, PLAYER_X, and PLAYER_O are used to represent the state of each cell (empty, player X, player O).
 * The play method handles the game loop.
 * It prompts the current player for their move, validates it, makes the move on the board, and checks for a win or draw condition.
 * If the move is valid, the current player is switched, and the loop continues until the game is finished.
 * The isValidMove method checks if a move is valid based on the given row and column.
 * It ensures the move is within the boundaries of the board and the cell it's empty.
 * The makeMove method updates the board with the current player's symbol (X or O) at the specified row and column.
 * The checkWin method checks if the current player has won the game by examining the row, column, and diagonal combinations on the board.
 * The checkDraw method checks if the game has resulted in a draw (all cells filled) with no winner.
 * The printBoard method displays the current state of the board in a graphical format.
 * The getPlayerSymbol method returns the symbol ('X' or 'O') corresponding to the player.
 * To run the game, execute the main method in the TicTacToe class.
 * Players can enter their moves by specifying the row and column numbers.
 * The game will continue until a player wins or the game ends in a draw.
 */
    public class Project8TicTacToe {
        private static final int SIZE = 3;
        private static final int EMPTY = 0;
        private static final int PLAYER_X = 1;
        private static final int PLAYER_O = 2;

        private int[][] board;
        private int currentPlayer;

        public Project8TicTacToe() {
            board = new int[SIZE][SIZE];
            currentPlayer = PLAYER_X;
        }

        public void play() {
            Scanner scanner = new Scanner(System.in);
            boolean gameFinished = false;

            System.out.println("Tic-Tac-Toe");
            System.out.println("Player X starts the game.\n");

            while (!gameFinished) {
                printBoard();

                System.out.print("Player " + getPlayerSymbol(currentPlayer) + ", enter your move (row column): ");
                int row = scanner.nextInt();
                int column = scanner.nextInt();

                if (isValidMove(row, column)) {
                    makeMove(row, column);
                    gameFinished = checkWin(row, column) || checkDraw();
                    currentPlayer = (currentPlayer == PLAYER_X) ? PLAYER_O : PLAYER_X;
                } else {
                    System.out.println("Invalid move! Try again.");
                }

                System.out.println();
            }

            printBoard();
            if (checkDraw()) {
                System.out.println("It's a draw!");
            } else {
                System.out.println("Player " + getPlayerSymbol(currentPlayer) + " wins!");
            }
        }

        private boolean isValidMove(int row, int column) {
            if (row < 0 || row >= SIZE || column < 0 || column >= SIZE) {
                return false;
            }
            return board[row][column] == EMPTY;
        }

        private void makeMove(int row, int column) {
            board[row][column] = currentPlayer;
        }

        private boolean checkWin(int row, int column) {
            // Check row
            if (board[row][0] == currentPlayer && board[row][1] == currentPlayer && board[row][2] == currentPlayer) {
                return true;
            }

            // Check column
            if (board[0][column] == currentPlayer && board[1][column] == currentPlayer && board[2][column] == currentPlayer) {
                return true;
            }

            // Check diagonals
            if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
                return true;
            }
            if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
                return true;
            }

            return false;
        }

        private boolean checkDraw() {
            for (int row = 0; row < SIZE; row++) {
                for (int column = 0; column < SIZE; column++) {
                    if (board[row][column] == EMPTY) {
                        return false;
                    }
                }
            }
            return true;
        }

        private void printBoard() {
            System.out.println("---------");
            for (int row = 0; row < SIZE; row++) {
                System.out.print("|");
                for (int column = 0; column < SIZE; column++) {
                    System.out.print(" " + getPlayerSymbol(board[row][column]) + " |");
                }
                System.out.println("\n---------");
            }
            System.out.println();
        }

        private String getPlayerSymbol(int player) {
            return (player == PLAYER_X) ? "X" : "O";
        }

        public static void main(String[] args) {
            Project8TicTacToe game = new Project8TicTacToe();
            game.play();
        }
    }




