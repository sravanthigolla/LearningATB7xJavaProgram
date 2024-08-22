package ex_081724.InnerClass;
//A class created within class and outside method.

public class MemberInnerClass {
    private int data=30;
    class Inner{
        void msg(){System.out.println("data is "+data);}
    }

    public static void main(String args[]){
        MemberInnerClass obj = new MemberInnerClass();
        MemberInnerClass.Inner in = obj.new Inner();
        in.msg();

    }
    }
