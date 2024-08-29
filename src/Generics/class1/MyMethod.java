package Generics.class1;

public class MyMethod {

    public static <E> void printArray(E[] elements)
    {
        for(E element: elements)
        {
            System.out.println(element);
        }

        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] intArray = {10, 20, 30};
        Character[] charArray = {'S','R','A','V','A','N'};
        System.out.println("printing Integer Array");
        printArray(intArray);

        System.out.println("printing Character Array");
        printArray(charArray);

    }
}
