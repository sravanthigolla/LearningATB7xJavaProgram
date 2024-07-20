package ex_072024;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        boolean isLeap = false;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
         isLeap = true;
        }
        if (isLeap) {
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
