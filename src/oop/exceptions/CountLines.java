package oop.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountLines {
    public static void main(String[] args) {
        int counter = countLines("logs/test.txt");
        System.out.println("Total lines: " + counter);
    }

    public static int countLines(String fileName) {
        int counter = 0;
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException ex) {
            System.out.println("File not found: " + fileName);
            ex.printStackTrace();
        }
        String line;
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            System.out.println(line);
            counter++;
        }

        return counter;

    }
}
