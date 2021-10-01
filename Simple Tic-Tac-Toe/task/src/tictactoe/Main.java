package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] grid = new char[3][3];
        int turn = 1;
        int end = 0;
        int countSpace = 9;
        initGrid(grid);
        printGrid(grid);

        while (end == 0) {
            nextTurn(grid, turn);
            countSpace--;
            printGrid(grid);
            end = checkMove(grid, turn);

            if (end==0&&countSpace==0){
                end=3;
            }
            turn++;
        }

        switch (end) {
            case 1:
                System.out.println("X wins");
                break;
            case 2:
                System.out.println("O wins");
                break;
            default:
                System.out.println("Draw");
                break;
        }
    }

    public static int checkMove(char[][] grid, int turn) {
        boolean row = false;
        char b = (turn % 2 == 0) ? 'O' : 'X';

        for (int i = 0; i < 3; i++) {
            if ((grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2] && grid[i][2] == b)||
                    (grid[0][i] == grid[1][i] && grid[1][i] == grid[2][i] && grid[2][i] == b)) {
                row = true;
                break;
            }
        }

        if ((grid[0][0] == b && grid[1][1] == b && grid[2][2] == b) || (grid[0][2] == b && grid[1][1] == b && grid[2][0] == b)) {
            row = true;
        }

        if (row && (turn % 2 == 0)) {
            return 2;
        }
        if (row && (turn % 2 == 1)) {
            return 1;
        }
        return 0;
    }

    public static void initGrid(char[][] grid) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = ' ';
            }
        }
    }

    public static void printGrid(char[][] grid) {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.println("| " + grid[i][0] + " " + grid[i][1] + " " + grid[i][2] + " |");
        }
        System.out.println("---------");
    }

    public static void nextTurn(char[][] grid, int turn) {
        Scanner s = new Scanner(System.in);

        boolean validInput = false;
        boolean validX = false;
        boolean validY = false;
        int userInputX = Integer.MIN_VALUE;
        int userInputY = Integer.MIN_VALUE;
        String temp;

        do {
            if (s.hasNextInt()) {
                userInputX = s.nextInt();
                validX = true;
            } else {
                System.out.println("You should enter numbers!");
                temp = s.nextLine();
            }
            if (s.hasNextInt()) {
                userInputY = s.nextInt();
                validY = true;
            } else {
                System.out.println("You should enter numbers!");
                temp = s.nextLine();
            }

            if (validX && validY) {
                if (userInputX < 1 || userInputX > 3 || userInputY < 1 || userInputY > 3) {
                    System.out.println("Coordinates should be from 1 to 3!");
                } else if (grid[userInputX - 1][userInputY - 1] != ' ') {
                    System.out.println("This cell is occupied! Choose another one!");
                } else {
                    validInput = true;
                }
            }

        } while (!validInput);

        switch (turn % 2) {
            case 0:
                grid[userInputX - 1][userInputY - 1] = 'O';
                break;
            case 1:
                grid[userInputX - 1][userInputY - 1] = 'X';
                break;
        }
    }
}
