package ex_072724;

public class StringFunctions {
    public static void main(String[] args) {
//String -bunch of chars

        String s = new String("Hello World"); //heap area
        String s2 = "Hello World"; //string constant pool
        s2 = "pramod"; //2 strings will be saved in string constant pool


        //immutable- can change the string and create new string
        System.out.println(s.length());
        System.out.println(s.toLowerCase());

        //StringBuilder, StringBuffer - mutuable sequence of characters
        //synchronized(onebyone), slow, thread safe, multiple thread
        StringBuffer sb = new StringBuffer("Hello World");
        sb.append("pramod");

        StringBuilder stringBuilder = new StringBuilder("Hello World");
        stringBuilder.append("pramod");
        //not synchronized, fast. This will be used as not thread safe. single thread
        System.out.println(stringBuilder.reverse());


    }
}
