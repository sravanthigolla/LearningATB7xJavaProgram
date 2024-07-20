package ex_071224_datatypes;

public class Lab008_TypeCasting {
    public static void main(String[] args) {
        //Type Casting
        //widening - converting low to high
        byte b =10;
        int i = b;//implicit casting
        int j = (int)b;//explicit casting
        System.out.println(i);
        System.out.println(j);


        //narrowing - converting high to low
        int val = 300;
       // byte b1 = val;  //invalid
        byte b1 = (byte)val;
        System.out.println(b1);
    }

}
