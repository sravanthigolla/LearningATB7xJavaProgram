package ex_072024;

public class multiple_case {
    public static void main(String[] args) {
        int itemcode =005;
      switch (itemcode)
    {
        case 001,002,003:
            System.out.println("electronic gadget");
            break;
        case 004,005:
            System.out.println("smart gadget");
            break;

            //if arrow is used break is used by default
        default:
            System.out.println("none");


    }
        int itemcode1 =005;
        switch (itemcode1)
        {
            case 001,002,003 -> System.out.println("electronic gadget");

            case 004,005 -> System.out.println("smart gadget");


            //if arrow is used break is used by default
            default-> System.out.println("none");



        }

        System.out.println((10-4)+3*4);

    }
}
