package lact4;
//multiple inheritance using interfaces
//multiple inheretence = 1 child class li multiple parent class
interface A {
    abstract void Animal();
    void eat();
    default void data(){
        System.out.println("bread");
    }

    //System.out.println("eating...");

    
}
interface B {
    abstract void Dog();
    void eat();
   default void data(){
        System.out.println("milk");

   }
    //System.out.println("bread");

}
class C implements A,B  {
    public void Animal(){
        System.out.println("hello");
    }
    public void Dog(){
        System.out.println("hi");
    }
    public void eat(){
        System.out.println("eating...");

}
    public void data(){
        A.super.data();
        B.super.data();
    }
}
class Minheretence{
    public static void main(String[] args) {
        C obj = new C();
        obj.Dog();
        
    }
}
