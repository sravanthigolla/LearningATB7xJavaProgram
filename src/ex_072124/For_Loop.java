package ex_072124;

public class For_Loop {
    public static void main(String[] args) {
        for(int i=0; i<=10; i++)
        {
            System.out.println(i);
        }

        for(int j=0; j<=10; ++j)
        {
            System.out.println(j);
        }

      /*  final boolean b1 =true;
        for(int m=0; b1; m++)
        {
            System.out.println("m"); //infinite loop as b1 is always true
        }

        for (int k=0; k>=1; k++)
        {
            System.out.println("HI"); //nothing will be printed as condition not met
        }

        for(int n=0; ; ++n)
        {
            System.out.println("n"); //infinite loop

        }

        for(int s=0; ;)
        {
            System.out.println("s");//infinite loop
        }*/


        /*for(;;)
        {
            System.out.println("Hello World"); //infinite loop
        }*/

        for(float f=0;f<=10.67;f++)
        {
            System.out.println(f);
        }

        for(byte b=0; b<=10.67; b++)
        {
            System.out.println(b);//prints 1 to 10 it considers only integer part
        }

        //double, byte, short, int, float, long, char are supported in for loop

        for(char c='a'; c<='z'; c++)
        {
            System.out.println(c);
        }
//reverse numbers
        for(int r=10; r>0; r--)
        {
            System.out.println(r);
        }
    }
}
