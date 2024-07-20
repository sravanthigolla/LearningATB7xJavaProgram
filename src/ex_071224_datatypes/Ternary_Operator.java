package ex_071224_datatypes;

public class Ternary_Operator {
    public static void main(String[] args) {

        boolean result = 10>40?true:false;
        System.out.println(result);
        int result1 = 10>40?10:40;
        System.out.println(result1);

        int result2 = (10>40)?10:40;
        System.out.println(result2);

        String str = 10 > 20?"true":"false";
        System.out.println(str);

        String str1 = 10 > 20?"10":"TWENTY";
        System.out.println(str1);

        int a =10;
        int b =20;
        int max = a>b?a:b;
        System.out.println(max);
        int min = a<b?a:b;
        System.out.println(min);
    }
}
