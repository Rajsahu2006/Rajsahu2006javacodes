package OOPS;
class BGMI{
    String Hitting;
    String Running;
    String Fireing;

    //Methods.
    public void Hitting(){
        System.out.println("Hitting the Enemy...");
    }
    public void Running(){
        System.out.println("Running enemy from stadium");
    }
    public void Fireing(){
        System.out.println("Fireinggg...");
    }
}
public class O5 {
    public static void main(String[] args) {
        BGMI pub = new BGMI();
        pub.Fireing();
        pub.Hitting();
        pub.Running();
    }
    
}
