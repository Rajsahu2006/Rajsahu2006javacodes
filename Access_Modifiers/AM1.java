package Access_Modifiers;

//GETTERS AND SETTERS;
class MyEmploy {
    private int id;
    private String name;
    //Constructor.
    public MyEmploy(){
        name = ("Rajjj");
        id = 322;
    }

    public String getname(){ // private class ka accessor;
        return name;
    }
    public void setname(String n){  // Modifier in private class;
        name = n;                   //void = Return ma kuch nhi;

    }
    public int getid(){
        return id;
    }
    // public void setid(){
    //     this.id = 8;
    // }
    public void setid(int i){
        this.id = i;
    }
    
}
public class AM1 {
    public static void main(String[] args) {
        MyEmploy R = new MyEmploy();
        //R.setid(8);
        System.out.println(R.getid());
        //R.setname("Raj");
        System.out.println(R.getname());
    }
    
    
}
