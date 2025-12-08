package lact5; 
// Comparator interface Example
import java.util.*;
class Student {
    String name;
    int Rollnum;
    public Student(int Rollnum, String name){
        this.Rollnum = Rollnum;
        this.name = name;
    }
}
class nameShorted implements Comparator<Student> //comparator class 
{
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}
public class L2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(10, "panda"));
        list.add(new Student(1, "prabhu"));
        Collections.sort(list, new nameShorted());
        for (Student s : list) {
            System.out.println(s.Rollnum + " " + s.name);
        }
    }
}
