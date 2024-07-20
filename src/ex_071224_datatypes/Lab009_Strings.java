package ex_071224_datatypes;

public class Lab009_Strings {
    public static void main(String[] args) {

 String password = "Pramod@123";
 String pass_u = password.toLowerCase();
 String pass_s = "Pramod@123";
 System.out.println(pass_u);

        System.out.println(pass_u == password); //reference
        System.out.println(pass_s == password);
        System.out.println(pass_u.equals(password));//content
        System.out.println(pass_u.equalsIgnoreCase(password));

        System.out.println(password.substring(0,3));
        System.out.println(password.indexOf('r'));
        System.out.println(password.length());


    }
}
