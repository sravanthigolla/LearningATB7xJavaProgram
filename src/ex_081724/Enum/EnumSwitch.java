package ex_081724.Enum;

public class EnumSwitch {

    enum Day{
        SUNDAY,
        MONDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }

    public static void main(String[] args) {
        Day day = Day.MONDAY;
        switch(day){
            case SUNDAY:
                System.out.println("SUNDAY");
                break;
            case MONDAY:
                System.out.println("MONDAY");
                break;
            default:
                System.out.println("other day");
        }

    }
}
