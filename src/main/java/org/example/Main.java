package org.example;

import java.util.Scanner;
import org.example.tools.ShambeerMath;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print(ShambeerMath.Sum(6, 7) + "\n");
        scanner.nextLine();
        scanner.close();
    }
}