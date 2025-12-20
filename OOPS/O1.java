package OOPS;
//Create a CUSTUM CLASS;

import java.util.jar.Attributes.Name;

class Employe{  //Custum class.
        public int id;
        String name;
        int Salary;
        public  void printDetail(){  // Methods
            System.out.println("My id is "+id);
            System.out.println("My name is"+ name);

        }
        public void getSalary(){
            System.out.println("Salary is "+Salary);
        }
        public void getname(){
            System.out.println(name);
        }
        public void setname(String Sahu){
            System.out.println(name);
        }
}
    
public class O1 {
    public static void main(String[] args) {
        System.out.println("This is my custum class");
        Employe Raj = new Employe();           //Instantinting a new Employ object;
             // Sitting Attributes,
        Raj.id = 18;
        Raj.name = "Code with Raj";
        Raj.Salary = 50000;
        Raj.name ="sahu";
        
        // System.out.println(Raj.getname());
        // System.out.println(Raj.getSalary());
        Raj.getSalary();
        Raj.getname();

            
    }
}
