package Access_Modifiers;

class Cylinder{
    private int radius;
    private int hight;

    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getHight(){
        return hight;

    }
    public void setHight(int hight){
        this.hight = hight;
    }
    //Surface Area ::
    public double Surfacearea(){
        return 2*3.14 * radius*(radius + hight);
    }
    //Volume in Cylinder::
    public double Volume(){
        return Math.PI* radius * radius* hight; // 3.14 = Math.PI:
    }

}
public class AM2 {
    public static void main(String[] args) {
        Cylinder obj = new Cylinder();
        obj.setHight(44);
        int h = obj.getHight();
        System.out.println("Hight is :"+h);

        obj.setRadius(3);
        int R = obj.getRadius();
        System.out.println("Radius is :"+R);

        obj.Surfacearea();
        System.out.println(obj.Surfacearea());

        obj.Volume();
        System.out.println(obj.Volume());
    }
    
}
