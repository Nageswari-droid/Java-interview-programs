package com.balloon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;

        System.out.println("No of rows and columns of box : ");

        rows = scanner.nextInt();
        columns = scanner.nextInt();

        Box.fillBalloon(rows, columns);
    }
}
