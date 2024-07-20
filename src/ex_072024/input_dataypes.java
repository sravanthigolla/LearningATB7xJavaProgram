package ex_072024;

import java.util.Scanner;

public class input_dataypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.next();
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        System.out.println("Enter your salary : ");
        double salary = sc.nextDouble();
        System.out.println("your name is : "+name);
        System.out.println("your age is : "+age);
        System.out.println("your salary is : "+salary);

    }
}
