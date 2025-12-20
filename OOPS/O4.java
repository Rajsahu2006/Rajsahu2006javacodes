package OOPS;
class Rectangle{
    int length;
    int breath;

    //methods.
    public int AreaCalculate(){
        return length*breath;
    }
    public int perameter(){
        return 2*(length+ breath);
    }
}

public class O4 {
    public static void main(String[] args) {
        Rectangle Rc = new Rectangle();
        Rc.length = 8;
        Rc.breath = 9;
        System.out.println(Rc.AreaCalculate());
        System.out.println(Rc.perameter());
    }
    
}
