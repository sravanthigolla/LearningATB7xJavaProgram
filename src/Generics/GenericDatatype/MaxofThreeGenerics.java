package Generics.GenericDatatype;



public class MaxofThreeGenerics {


    public static <DT extends Comparable<DT>> DT maximumNumberOf(DT a, DT b, DT c)
    {
        DT maxi =a;
        if(b.compareTo(maxi)>0)
        {
            maxi = b;
        }

        if(c.compareTo(maxi)>0)
        {
            maxi = c;
        }
      return maxi;

    }

//without comparable only int and double can be compared
//with comparable strings also can be compared
    public static void main(String[] args) {



        int max = maximumNumberOf(34, 47, 56);
        double maxdd = maximumNumberOf(4.3,7.8,9.8);

        System.out.println(max);
        System.out.println(maxdd);


    }
}


