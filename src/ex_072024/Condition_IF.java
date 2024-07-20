package ex_072024;

import java.util.Scanner;

public class Condition_IF {
    public static void main(String[] args) {
        int num = 7;
        if(num%2==0) {
            System.out.println("even");
        }
        else{
                System.out.println("odd");
        }


        //age to vote
        int age =35;
        if(age>18){
            System.out.println("Allowed to vote");
        }
        else
        {
            System.out.println("Not allowed to vote");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = sc.nextInt();
        System.out.println(num1);
        if(num1%2==0) {
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

        boolean a = true;
        boolean b = !a;
        if(2+2<=4){
            System.out.println(a);
        }
        System.out.println("will always execute"+a);
        System.out.println("will always execute"+b);

        //max number in two inputs
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a number1");
        int num2 = sc1.nextInt();

        System.out.println("Enter a number2");
        int num3 = sc1.nextInt();

        if(num2 > num3){
            System.out.println(num2);
        }
        else if(num3 > num2){
            System.out.println(num3);
        }
        else {
            System.out.println("equal");
        }

            }
}
