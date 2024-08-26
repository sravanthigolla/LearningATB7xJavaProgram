package ex_081724.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

// unchecked expections
public class Unchecked {

    public static void main(String[] args) {
        try {
            try {
                int data = 100 / 0;


            } catch (ArithmeticException e) {

                System.out.println(e);

            }

            try {
                int arr[] = {1, 3, 5};
                System.out.println(arr[10]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }

        }
        catch(Exception e)
        {
            System.out.println("handled the exception (outer catch)");
        }

      finally{
            System.out.println("Finally block is always executed");
        }

//        catch (FileNotFoundException e) {
//            System.out.println(e);
//        }
        System.out.println("rest of the code");


    }
}
