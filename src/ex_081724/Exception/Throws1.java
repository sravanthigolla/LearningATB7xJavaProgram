package ex_081724.Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws1 {

    public static void method() throws FileNotFoundException
    {
        FileReader file = new FileReader("C:\\abc.txt");
        BufferedReader FileInput = new BufferedReader(file);

        throw new FileNotFoundException();

    }

    public static void main(String[] args) {
        try
        {
            method();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("rest of code...");
    }
}
