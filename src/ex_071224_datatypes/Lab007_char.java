package ex_071224_datatypes;

public class Lab007_char {
    public static void main(String[] args) {

        char a1 = 'A';
        char a2 = 'B';
      //  char c1 = a1+a1; //incorrect
        int c1 = a1 + a2;
        System.out.println(c1);//(65+66)
        System.out.println('A' ==65);

        System.out.println('B' ==65);

        short s = 10;
        char c = 'A';
        int ss = s + c;
        System.out.println(ss);


    }
}
