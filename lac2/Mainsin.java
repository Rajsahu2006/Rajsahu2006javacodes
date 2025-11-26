package lac2;
import javax.sound.sampled.SourceDataLine;
//public class in {
class Employee{
    void Work(){
        System.out.println(" Working");
    }
}
class Manager extends Employee{
    void Metting(){
        System.out.println("Metting attend ");

    }
}
public class  Mainsin{
    public static void  main(String[]args){
        Manager m = new Manager();
        m.Work();
        m.Metting();


    }
}
    

