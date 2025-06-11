package oop.exceptions;

import java.io.*;

public class ResourceAutoClosing {
    public static void main(String[] args) {
        try (
                BufferedReader in = new BufferedReader(new FileReader("logs/test.txt"));
                PrintWriter out = new PrintWriter(new FileWriter("logs/copy.txt"))
        ) {
            String line;
            while((line = in.readLine()) != null) {
                out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
