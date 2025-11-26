package lac2;

class Person{
    void  displayname(){
        System.out.println("My name is PARAM");
    }
}
class Student extends Person{
    void displayclass(){
        System.out.println("I am in 12th class");
    }

}
class Monitor extends Student{
    void displaymonitor(){
        System.out.println("I am monitor of my class");
    }
    
}
public class MLI{
    public static void main(String[]args){
       Monitor moon  = new Monitor();
       moon . displayname();
       moon . displayclass();
       moon . displaymonitor();

        }
    }

