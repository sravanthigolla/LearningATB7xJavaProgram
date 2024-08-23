//package ex_081724.Enum;
//The Enum in Java is a data type which contains a fixed set of constants.
//Enums are used to create our own data type like classes.
//enum in Java is more powerful. Here, we can define an enum either inside the class or outside the class.
//Java Enum internally inherits the Enum class, so it cannot inherit any other class, but it can implement many interfaces. We can have fields, constructors, methods, and main methods in Java enum.
//enum outside the class

public enum Enum1 {

    WINTER,
    SPRING,
    SUMMER,
    RAINY
}

public static void main(String[] args) {
    for(Enum1 s: Enum1.values())
        System.out.println(s);
}