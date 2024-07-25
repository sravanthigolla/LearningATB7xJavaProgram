package ex_072124;

public class Continue {
    public static void main(String[] args) {
        for (int x = 0; x < 10; x++) {
            System.out.println(x);
            if(x==5)
            {
                continue; //line 11 will be skipped and iterate
            }
            System.out.println("After");
        }

        for(int y = 0; y <= 50; y++){
            if(y%2==0){
                System.out.println("Even: "+y);
                continue;
            }

                System.out.println("Odd: "+y);


        }
    }
}
