package practiceQ;

class Device {
    void PowerOn(){
        System.out.println("Start a laptop");
    }
    
}
class  Laptop extends Device {
    void  boot(){
        System.out.println("Connicting a device ");
    }
}
class GamingLaptop extends Laptop{
    void startgame(){
        System.out.println("start gaming");
    }
}
public class iner2 {
    public static void main(String[] args) {
    GamingLaptop g = new GamingLaptop();
    g.PowerOn();
    g.boot();
    g.startgame();
    }
}
