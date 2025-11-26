package practiceQ;

class Shape {
    void draw(){
        System.out.println("Draw a triangle ");
    }
    
}
class circle extends Shape{ 
    void calculateArea(){
        System.out.println("Draw a circle");
    }
}
public class iner1 {
    public static void main(String[] args) {
        circle c =new circle();
        c.draw();
        c.calculateArea();
    }

    
}
