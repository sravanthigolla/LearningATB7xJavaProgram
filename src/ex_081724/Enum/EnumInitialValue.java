package ex_081724.Enum;

public class EnumInitialValue {
    enum Season
    {
        WINTER(5),
        SPRING(10),
        SUMMER(15),
        FALL(20);

        private int value;
        //Constructor
        private Season(int value)
        {
            this.value = value;

        }
    }

    public static void main(String[] args) {
        for(Season s : Season.values())
            System.out.println(s+""+s.value);
    }
}
