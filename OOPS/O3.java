package OOPS;
class Square{
    int side =3;
    int perameter;

    //Method .
    public int area(){
        return side*side;

    }
    public int perameter(){
        return 4*side;
    }
}
public class O3 {
    public static void main(String[] args) {
        Square sc = new Square();
        System.out.println(sc.perameter());
        System.out.println(sc.area());
        
    }
    
}
