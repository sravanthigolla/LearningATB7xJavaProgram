package ex_081724.InnerClass;

class Showable1{

    interface Message{
        void msg();
    }
}


public class NestedInterfaceClass implements Showable1.Message {

        public void msg()
        {
            System.out.println("Hello nested interface in class");
        }

    public static void main(String[] args) {
        Showable.Message obj = new NestedInterface();
        obj.msg();
    }
}
