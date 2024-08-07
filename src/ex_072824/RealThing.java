package ex_072824;

public class RealThing {
    public static void main(String[] args) {
        blueprint DLF = new blueprint();
        DLF.name="DLF";
        DLF.rooms = 20;

        blueprint prestige = new blueprint();
        prestige.name="Prestige";
        prestige.rooms = 10;

        DLF.Lift();
        prestige.Lift();

    }
}
