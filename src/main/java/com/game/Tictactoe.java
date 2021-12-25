package com.game;

import java.util.Scanner;

public class Tictactoe {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("---------------------------\n" +
                "Welcome to TIC-TAC-TOE Game\n---------------------------");
        System.out.print("Play 1 select your symbol X or O : ");

        String playerOne = input.nextLine();
        String playerTwo = "";

        //Assign symbol for player.
        if (playerOne.equals("x")) playerTwo = "o";
            else playerTwo = "x";

        //Create grid.
        String[][] grid = new String[3][3];
        CreateGrid(grid);

        //Game start.
        int row, column = 0;

            for (int turn = 1; turn <= 9; turn++) {
                if (turn % 2 != 0) {
                    System.out.print("Player 1 Select your space : ");
                    row = input.nextInt();
                    column = input.nextInt();
                    grid[row][column] = "-" + playerOne + "-  ";
                } else {
                    System.out.print("Player 2 Select your space : ");
                    row = input.nextInt();
                    column = input.nextInt();
                    grid[row][column] = "-" + playerTwo + "-  ";
                }

                //Show grid.
                ShowGrid(grid);

                //Check condition.
                if (grid[0][0].equals(grid[0][1]) && grid[0][1].equals(grid[0][2]) &&
                grid[0][0].equals("-" + playerOne + "-  ") ||
                        grid[1][0].equals(grid[1][1]) && grid[1][1].equals(grid[1][2]) &&
                                grid[1][0].equals("-" + playerOne + "-  ") ||
                        grid[2][0].equals(grid[2][1]) && grid[2][1].equals(grid[2][2]) &&
                                grid[2][0].equals("-" + playerOne + "-  ") ||
                        grid[0][0].equals(grid[1][1]) && grid[1][1].equals(grid[2][2]) &&
                                grid[0][0].equals("-" + playerOne + "-  ") ||
                        grid[0][0].equals(grid[1][0]) && grid[1][0].equals(grid[2][0]) &&
                                grid[0][0].equals("-" + playerOne + "-  ") ||
                        grid[0][1].equals(grid[1][1]) && grid[1][1].equals(grid[2][1]) &&
                                grid[0][1].equals("-" + playerOne + "-  ") ||
                        grid[0][2].equals(grid[1][2]) && grid[1][2].equals(grid[2][2]) &&
                                grid[0][2].equals("-" + playerOne + "-  ")) {
                    System.out.println("---------------------------\nPlayer 1 Win!");
                    break;
                } else if (grid[0][0].equals(grid[0][1]) && grid[0][1].equals(grid[0][2]) &&
                        grid[0][0].equals("-" + playerTwo + "-  ") ||
                        grid[1][0].equals(grid[1][1]) && grid[1][1].equals(grid[1][2]) &&
                                grid[1][0].equals("-" + playerTwo + "-  ") ||
                        grid[2][0].equals(grid[2][1]) && grid[2][1].equals(grid[2][2]) &&
                                grid[2][0].equals("-" + playerTwo + "-  ") ||
                        grid[0][0].equals(grid[1][1]) && grid[1][1].equals(grid[2][2]) &&
                                grid[0][0].equals("-" + playerTwo + "-  ") ||
                        grid[0][0].equals(grid[1][0]) && grid[1][0].equals(grid[2][0]) &&
                                grid[0][0].equals("-" + playerTwo + "-  ") ||
                        grid[0][1].equals(grid[1][1]) && grid[1][1].equals(grid[2][1]) &&
                                grid[0][1].equals("-" + playerTwo + "-  ") ||
                        grid[0][2].equals(grid[1][2]) && grid[1][2].equals(grid[2][2]) &&
                                grid[0][2].equals("-" + playerTwo + "-  ")) {
                    System.out.println("---------------------------\nPlayer 2 Win!");
                    break;
                } else if (turn == 9) {
                    System.out.println("---------------------------\nDraw!");
                }

            }

        }

        //Create grid.
        public static void CreateGrid(String[][] grid) {
            for (int i=0; i<3; i++) {
                for (int j=0; j<3; j++) {
                    grid[i][j] = ("---  ");
                    System.out.print(grid[i][j]);
                }
                System.out.print("\n");
            }
        }

        //Show Grid.
        public static void ShowGrid(String[][] grid) {
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid.length; j++) {
                    if (grid[i][j] == null) {
                        System.out.print("---  ");
                    } else {
                        System.out.print(grid[i][j]);
                    }
                }
                System.out.print("\n");
            }
        }

    }
