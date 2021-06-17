package com.balloon;

import java.util.Scanner;

public class Box {
    private int dropColumn;
    private String balloonColors;
    private static char[][] boxArray;
    private static int blastCount = 0;

    Box(int dropColumn, String balloonColors) {
        this.dropColumn = dropColumn;
        this.balloonColors = balloonColors;
    }

    public static void fillBalloon(int rows, int columns) {
        boxArray = new char[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                boxArray[i][j] = '-';
            }
        }

        boxContent(rows, columns);
    }

    public static void boxContent(int rows, int columns) {
        Scanner scanner = new Scanner(System.in);

        Box boxObject = boxDetails();
        int i = 0;
        int rowIndex = 0;
        int tempJIndex = 0;
        int balloonColumn = boxObject.dropColumn;
        String balloonColors = boxObject.balloonColors;

        for (int j = rows - 1; j >= 0; j--) {
            while (i < balloonColors.length() && balloonColumn - 1 < columns && boxArray[j][balloonColumn - 1] == '-') {
                rowIndex = j;
                tempJIndex = j + 1;

                while (tempJIndex < rows && boxArray[tempJIndex][balloonColumn - 1] == '-') {
                    rowIndex = tempJIndex;
                    tempJIndex++;
                }

                boxArray[rowIndex][balloonColumn - 1] = balloonColors.charAt(i);
                balloonColumn++;
                i++;

                if (balloonColumn - 1 >= columns) {
                    balloonColumn = 1;
                }
            }
        }

        System.out.println("Do you want to continue (Y/N)? ");
        char choice = scanner.next().charAt(0);

        if (choice == 'Y' || choice == 'y') {
            displayBox(rows, columns);
            blastBalloon(rows, columns);
            boxContent(rows, columns);
        } else if (choice == 'N' || choice == 'n') {
            displayBox(rows, columns);
            blastBalloon(rows, columns);
        }
    }

    public static void blastBalloon(int rows, int columns) {
        int flag = 0;
        for (int i = rows - 1; i >= 0; i--) {
            for (int l = 0; l < columns; l++) {
                int j = l;
                char element = boxArray[i][l];
                int startIndex = l;
                int endIndex;
                int count = 1;

                while (j < columns - 1 && element != '-' && element == boxArray[i][j + 1]) {
                    element = boxArray[i][j + 1];
                    count++;
                    j++;
                }

                endIndex = j + 1;

                if (count >= 3) {
                    for (int m = i; m > 0; m--) {
                        for (int k = startIndex; k < endIndex; k++) {
                            boxArray[m][k] = boxArray[m - 1][k];
                        }
                    }
                    flag = 1;
                }
                l = endIndex - 1;
            }
        }

        if (flag == 1) {
            blastCount = blastCount + 1;
            displayBlastBox(rows, columns, blastCount);
            blastBalloon(rows, columns);
        }
    }

    public static Box boxDetails() {
        Scanner scanner = new Scanner(System.in);
        int column;
        String balloonColors;

        System.out.println("\n");
        System.out.println("Drop column : ");
        column = scanner.nextInt();

        System.out.println("Color of the balloon : ");
        balloonColors = scanner.next();

        return new Box(column, balloonColors);
    }

    public static void displayBox(int rows, int columns) {
        System.out.println("Content of the box after the given inputs, \n");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(boxArray[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void displayBlastBox(int rows, int columns, int count) {
        System.out.println("\nContent of the box after the " + count + " blast, \n");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(boxArray[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
