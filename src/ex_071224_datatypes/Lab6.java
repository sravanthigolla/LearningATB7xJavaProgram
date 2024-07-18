package ex_071224_datatypes;

public class Lab6 {

    public static void main(String[] args) {

        boolean is_married = true;
        boolean are_you_a_dog = false;
        System.out.println(is_married);
        System.out.println(are_you_a_dog);

        byte b =100;
      //  byte b1 =128;  //-127 to 127
        byte b2 =127;  //-127 to 127
       // b2 = b2+1;
        short s = 101;
        int age = 130;
        long phone = 9000907073L;

        char grade ='A';

        float pi = 3.14f;
        double d = 117.84;

        //non primitive data types -combination of primitive data types

        String name ="Sravanthi";
        System.out.println(b);
        System.out.println(s);
        System.out.println(age);
        System.out.println(phone);
        System.out.println(grade);
        System.out.println(name);
        System.out.println(pi);
        System.out.println(d);

        char c = '\n';
        System.out.println(c);

        char c1 = '\u1F6A';
        System.out.println(c1);
        int _123 = 987;
        System.out.println(_123);
        //formatting
        int age1 = 98;
        System.out.println("Your age is -> " +age1);
        System.out.printf("Yur age is -> %d",age1);
        System.out.println("\n");
       //%d -> any integer -byte, short, int or long
        //%s -> String
        //%c -> Char
        //%f -> float
        int a =10;
        int b1 = 34;
        System.out.println(a+b1);
        System.out.println("\n");

        String s1 = "pramod";
        String s2 = "Dutta";
        System.out.println(s1+s2);
        System.out.println("\n");

        String s3 ="Amit";
        System.out.printf("Your name is -> %s",s3);
        System.out.println("\n");
        int x =100;
        int y = 99;
        System.out.println(x+y);
        System.out.println(x+s3);
        System.out.println(s3+y);
        System.out.println(x+y+s3);
        System.out.println(s3+x+y);
        System.out.println(x+s3+y+s3);
        System.out.println(x+y+s3+y+s3+x+y);

        //calc
        double a3 = 10;
        double b3 = 34;
        double sum = a3 + b3;
        double sub = a3 - b3;
        double mul = a3 * b3;
        double div = a3 / b3;
        System.out.printf("sum is %f\n",sum);
        System.out.printf("sub is %f\n",sub);
        System.out.printf("mul is %f\n",mul);
        System.out.printf("div is %f\n",div);

        final double PIE = 3.14;
        //PIE = 3.1453;
        double result = b3%a3; //modulus - operator -remainder
        System.out.println(result);

        //int enum =45;  enum is keyword

        int Enum =45; //valid
//Escape characters
        char t1 = '\t';
        char t2 = '\n';
        char t3 = '\r'; //Backslash, delete 1 word
        char t4 = '\b'; //Backslash, delete 1 char
        System.out.println("pramod" + t3 + "dutta");
        System.out.println("pramod" + t2 + "dutta");
        System.out.println("pramod" + t1 + "dutta");
        System.out.println("pramod" + t4 + "dutta");

        String str = null;
        System.out.println(str);
//Operators
        //= Assignment Operator
        //+ Arithmetic Operator
        //unary operator +65, -1
        //Binary Operator
        //compound operators +=, -=, /=, *=, %=

        int num = 10;
        num+= 10; //num =num+10
        System.out.println(num);

        num-=10;
        System.out.println(num);
        num/=10;
        System.out.println(num);
        num*=10;
        System.out.println(num);
        num%=10;
        System.out.println(num);

        //Relational Operators >, <, <=,>=,==,!=,

        int age_m=34;
        int age_d=34;
        boolean result4 = age_m > age_d;
        System.out.println(result4);
        boolean result1 = age_m < age_d;
        System.out.println(result1);
        boolean result2 = age_m == age_d;
        System.out.println(result2);
        boolean result3 = age_d >= age_m;
        System.out.println(result3);

        boolean flag= true;
        System.out.println(!flag);
        System.out.println(!!!!(30>90));

        //OR gate
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);


// AND gate

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

//multiple operators
        int g=12;
        boolean t = !(g>10 || g<5);
        System.out.println(t);


    }
}
