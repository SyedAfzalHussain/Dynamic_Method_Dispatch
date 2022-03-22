package com.coding.NewOne;

class Base{
    public void greeting(){
        System.out.println("Assala-mu-alaikum...");
    }
    public void funtion(){
        System.out.println("This is a function performed by Base class");
    }
}
class Derived extends Base {
    public void funtion(){
        System.out.println("This is a function performed by Derived class");
    }
}

public class Dynamic_Method_Dispatch {
    //it is also called runtime Polymorphism.
    public static void main(String[] args) {
        Base obj=new Derived();//Reference is SuperClass while object is of Subclass then we can do it
        /*This is not allowed ...
        Derived obj=new Base();
        since in this we have the referece is of subclass so we cann't use this as an object of Super class
         */
        obj.funtion();//This will call the function in the derived one.
    }
}
