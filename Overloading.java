package Methods;
//Method Overloading = same class but different perameter;
public class Overloading {
    static void Day(){
        System.out.println("Todays Monday");

    }
    static void Day(int a){
        System.out.println("todays the last Monday in this Month   "  + a  );

    }
    public static void main(String[] args) {
        Day();
        Day(12); //12 ia argument;
    }//Arguments are actual val.
    
}
