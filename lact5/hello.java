package lact5;
//Comparable  interface Example

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.*;


    class Student1 implements Comparable<Student1>{ //Comparable class 
        String name;
        int Rollnum;
        public Student1(int Rollnum,String name){
            this.Rollnum =Rollnum;
            this.name= name;

        }
        public int compareTo(Student1 S1){
            return this.Rollnum-S1.Rollnum;

        }
        public String toString(){
            return Rollnum + "" + name;
        }

    }
    public class  hello {
        public static void main(String[] args) {
            ArrayList<Student1>list = new ArrayList<>();
            list.add(new Student1(10, "panda"));
            list.add(new Student1(1, "prabhu"));
            Collections.sort(list);
            System.out.println(list.toString());
        }
    
        
    }
    //public static void main(String[] args) {
        // A  list.add(1);
        // list.add(0);
        // list.add(5);
        // Collection.sort(List);
        // System.out.println(List);rrayList<Integer>list = new ArrayList<>();
      

    

    
//}
