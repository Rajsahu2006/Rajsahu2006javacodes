package OOPS;
class Cellphone{
    String Ringing;
    String Vibrating;
    //Methods;
    public void printProperty(){
        System.out.println(  "TUUURUru..."+Ringing);
        System.out.println(   "HUUU>HUU..."+Vibrating);
    }

}

public class O2 {
    public static void main(String[] args) {
        Cellphone Mi = new Cellphone();
        Mi.printProperty();
        // Mi.Ringing =">>>>.";
        // Mi.Vibrating ="huuu,huuu";
        
    }
    
}
