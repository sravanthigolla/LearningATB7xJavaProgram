package ex_072024;

public class Nestedif {
    public static void main(String[] args) {
        int i =3;
        if(i>1){
            System.out.println("Hello");
            if(i>0){
                System.out.println("Hi");
                if(i<5)
                {
                    System.out.println("Hehe");
                }
            }
        }
    }
}
