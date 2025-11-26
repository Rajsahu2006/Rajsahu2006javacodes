package lact4;
abstract class  shape{
    abstract void   area();

}
class circle extends shape{
    int r;
    public circle(int r) { 
        this.r =r;
    }
    void area(){ 
        double area = 3.14*r*r;
        System.out.println(area);

    }
}
    class Rectangle extends shape{
        int l;
        int b;
        public Rectangle(int l,int b){
            this.l = l;
            this.b = b;
        }
        void area (){
            int result = l*b;
            System.out.println(result);
        }
        

    }
    class hello{
        public static void main(String[] args) {
            circle s1 = new circle(4);
            s1.area();
            Rectangle s2 = new Rectangle(4, 7);
            s2.area();
        }
    }

    





