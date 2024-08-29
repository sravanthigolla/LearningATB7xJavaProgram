package Generics.GenericDatatype;
//In this case we need to write maximumNumberof method 3 times with different data types.
// To overcome this issue generics is introduced
public class MaxOfThree {
    public static void main(String[] args) {

        int max = maximumNumberOf(34, 47, 56);
        double maxdd = maximumNumberOf(4.3,7.8,9.8);

        System.out.println(max);
        System.out.println(maxdd);

    }

    public static int maximumNumberOf(int a, int b, int c)
    {
        int maxi =a;
        if(b>maxi)
        {
            maxi = b;
        }

        if(c>maxi)
        {
            maxi = c;
        }

        return maxi;
    }

    public static double maximumNumberOf(double a, double b, double c)
    {
        double maxd =a;
        if(b>maxd)
        {
            maxd= b;
        }

        if(c>maxd)
        {
            maxd = c;
        }

        return maxd;
    }
}
