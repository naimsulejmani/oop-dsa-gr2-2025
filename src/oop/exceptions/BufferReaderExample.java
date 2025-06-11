package oop.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExample {
    public static void main(String[] args) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("logs/test.txt"));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
