package ex_081724.Enum;

public class EnumValue {
//enum inside class
    public enum Season{Winter, Summer, Spring,Rainy}

    public static void main(String[] args) {

        for(Season s : Season.values())
        {
            System.out.println(s);
        }
        System.out.println("Value of winter is:"+Season.valueOf("Winter"));
        System.out.println("Index of Winter is:"+Season.valueOf("Winter").ordinal());


    }
}
