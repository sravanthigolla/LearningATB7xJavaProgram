package ex_081024.MethodOverriding_Bank;

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

    int Bankinterest()
    {
        return(super.getRateofInterest());//invoke parent class method
    }
}



public class Test2 {
    public static void main(String[] args) {
        SBI sbi = new SBI();

        System.out.println(sbi.getRateofInterest());
        System.out.println(sbi.Bankinterest());
    }
}
