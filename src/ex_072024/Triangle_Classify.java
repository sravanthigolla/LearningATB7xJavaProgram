package ex_072024;

import java.util.Scanner;

public class Triangle_Classify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter S1: ");
        double s1 = sc.nextDouble();
        System.out.println("Enter S2: ");
        double s2 = sc.nextDouble();
        System.out.println("Enter S3: ");
        double s3 = sc.nextDouble();

        if(s1 == s2 && s2==s3) {
            System.out.println("Equilateral");
        }
        else if(s1==s2 || s1==s3){
            System.out.println("Isosceles");
        }

        else {
            System.out.println("Scalene");
        }

    }
}
