package ex_072124;

public class Loop_condition {
    public static void main(String[] args) {
        for (int x = 0; x < 10; x++) {
            if (x == 5) {
                System.out.println("Five");
            }
                else{
                    System.out.println("x");
                }

        }

        for(int y = 0; y <= 50; y++){
            if(y%2==0){
                System.out.println("Even: "+y);
            }
            else {
                System.out.println("Odd: "+y);
            }

        }
    }
}
