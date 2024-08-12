package ex_081024.RuntimePolymorphism_Bank;

class Bank
{
    int getRateofInterest(){
        return 0;
    }

}

class SBI extends Bank
{
    int getRateofInterest(){
        return 8;
    }


}

class ICICI extends Bank
{
    int getRateofInterest(){
        return 9;
    }


}


public class UpCasting1 {
    public static void main(String[] args) {
        Bank b = new SBI(); //upcasting
        System.out.println(b.getRateofInterest());
         b = new ICICI();
         System.out.println(b.getRateofInterest());

    }
}
