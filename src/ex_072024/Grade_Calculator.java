package ex_072024;

import java.util.Scanner;

public class Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Score : ");
        int score = sc.nextInt();

        char grade = 'F';

        if (score >= 90 && score <= 100) {
            grade = 'A';
            System.out.println(grade);
        }
        else if (score >= 80 && score <= 89) {
            grade = 'B';
            System.out.println(grade);
        }
        else if (score >= 70 && score <= 79) {
            grade = 'C';
            System.out.println(grade);
                    }
        else if (score >= 60 && score <= 69) {
            grade = 'D';
            System.out.println(grade);
        }
        else if (score <= 0 || score > 100) {
            grade = 'O';
            System.out.println(grade);
        }
        else{
            System.out.println(grade);
        }

    }
}
