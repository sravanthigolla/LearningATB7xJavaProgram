package ex_081724.InstanceInitializerBlock;
//Program of instance initializer block that is invoked after super()
public class IIB_Super {

    IIB_Super() {
        System.out.println("parent class constructor invoked");
    }
}
    class IIC extends IIB_Super {
        IIC() {
            super();
            System.out.println("child class constructor invoked");
        }

        IIC(int a)
        {
            super();
            System.out.println("child class constructor invoked" +a);
        }

        {
            System.out.println("Instance initializer invoked");
        }

        public static void main(String[] args) {
            IIC ic = new IIC();
            IIC ic1 = new IIC(10);

        }


    }
