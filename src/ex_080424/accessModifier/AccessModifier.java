package ex_080424.accessModifier;

import ex_080424.HierrachialInheritance.Child1;
import ex_080424.HierrachialInheritance.Father;

public class AccessModifier extends Child1 {
    //public
     //private
     //protected-can be accessed different package subclass
     //default-nothing accessible in same package. cannot be accessed different package subclass

     public static void main(String[] args) {
          AccessModifier a = new AccessModifier();
          Father father = new Father();
          father.BHK2();//As it is public able to access outside the package
          a.BHK3(); // protected method

     }


}
